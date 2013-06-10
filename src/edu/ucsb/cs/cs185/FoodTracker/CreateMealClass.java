package edu.ucsb.cs.cs185.FoodTracker;

public class CreateMealClass {

	//for radio button look up how to store value!
	private String radioAnswer;
	private String mealName;
	private String meal_item1;
	private String meal_item2;
	private String meal_item3;
	private String meal_cal;
	private String meal_prot;
	private String meal_carb;
	private String meal_fat;
	private String meal_rating;
	
	public CreateMealClass()
	{
		
	}
	
	public void setSpinner(String ans)
	{
		radioAnswer = ans;
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
	
	public void setCal(String cal)
	{
		meal_cal = cal;
	}
	
	public void setProt(String prot)
	{
		meal_prot = prot;
	}
	
	public void setCarb(String carb)
	{
		meal_carb = carb;
	}
	
	public void setFat(String fat)
	{
		meal_fat = fat;
	}
	
	public void setRating(String rating)
	{
		meal_rating = rating;
	}
}
