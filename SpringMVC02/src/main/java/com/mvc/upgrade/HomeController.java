package com.mvc.upgrade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.upgrade.model.biz.BoardBiz;
import com.mvc.upgrade.model.dto.BoardDto;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	//biz를 상속받는 bizImpl의 객체를 따로 생성하지 않아도 어노테이션을 사용하여 처리
	@Autowired
	private BoardBiz biz;
	
	@RequestMapping("/list.do")
	public String list(Model model) {
		logger.info("SELECT LIST");
		model.addAttribute("list",biz.selectList());
		return "mvcList";
	}
	
	
	@RequestMapping("/detail.do")
	public String detail(Model model, int myno) {
		logger.info("SELECT ONE");
		model.addAttribute("dto", biz.selectOne(myno));
		
		
		return "mvcdetail";
		}
	
	@RequestMapping("/insertform.do")
	public String insertForm(Model model) {
		logger.info("INSERT");
		
		return "mvcinsert";
	}
	
	@RequestMapping(value="/insertres.do")
	public String insertRes(BoardDto dto) {
		logger.info("INSERT RES");
		int res = biz.insert(dto);
		if(res>0) {
			return "redirect:list.do";
		}else {
			//redirect: 핸들러맵핑을 통하여 views를 찾는게아닌 어느 컨트롤러를 맵핑할지 선택할 수 있다.
			return "redirect:list.do";
		}
		
		
	}
	
}
