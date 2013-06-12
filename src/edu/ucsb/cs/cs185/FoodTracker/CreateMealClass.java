package edu.ucsb.cs.cs185.FoodTracker;

public class CreateMealClass {

	//for radio button look up how to store value!
	private String spinAnswer;
	private String mealName;
	private String meal_item1;
	private String meal_item2;
	private String meal_item3;
	private int meal_cal;
	private int meal_prot;
	private int meal_carb;
	private int meal_fat;
	private String meal_rating;
	
	public CreateMealClass()
	{
		
	}
	
	public void setSpinner(String ans)
	{
		spinAnswer = ans;
	}
	
	public void setMealName(String name)
	{
		mealName = name;
	}
	
	public void set_item1(String i1)
	{
		meal_item1 = i1;
	}
	
	public void set_item2(String i2)
	{
		meal_item2 = i2;
	}
	
	public void set_item3(String i3)
	{
		meal_item3 = i3;
	}
	
	public void setCal(int cal)
	{
		meal_cal = cal;
	}
	
	public void setProt(int prot)
	{
		meal_prot = prot;
	}
	
	public void setCarb(int carb)
	{
		meal_carb = carb;
	}
	
	public void setFat(int fat)
	{
		meal_fat = fat;
	}
	
	public void setRating(String rating)
	{
		meal_rating = rating;
	}
	
	public String getSpinner()
	{
		return this.spinAnswer;
	}
	
	public String getMealName()
	{
		return this.mealName;
	}
	
	public String getItem1()
	{
		return this.meal_item1;
	}
	
	public String getItem2()
	{
		return this.meal_item2;
	}
	
	public String getItem3()
	{
		return this.meal_item3;
	}
	
	public int getCal()
	{
		return this.meal_cal;
	}
	
	public int getCarb()
	{
		return this.meal_carb;
	}
	
	public int getProt()
	{
		return this.meal_prot;
	}
	
	public int getFat()
	{
		return this.meal_fat;
	}
	
	public String getRating()
	{
		return this.meal_rating;
	}
}
