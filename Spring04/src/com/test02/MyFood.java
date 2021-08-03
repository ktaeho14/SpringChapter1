package com.test02;

public class MyFood {
	private Food favoriteFood;
	private Food unFavoriteFood;
	public MyFood() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	
	public MyFood(Food favoriteFood, Food unFavoriteFood) {
		super();
		this.favoriteFood = favoriteFood;
		this.unFavoriteFood = unFavoriteFood;
	}




	public Food getFavoriteFood() {
		return favoriteFood;
	}




	public void setFavoriteFood(Food favoriteFood) {
		this.favoriteFood = favoriteFood;
	}




	public Food getUnFavoriteFood() {
		return unFavoriteFood;
	}




	public void setUnFavoriteFood(Food unFavoriteFood) {
		this.unFavoriteFood = unFavoriteFood;
	}




	@Override
	public String toString() {
		return "favorite: " + favoriteFood + "\nunfacorite: " + unFavoriteFood;
	}
}
