package edu.ucsb.cs.cs185.FoodTracker;

import android.app.Application;


public class GlobalsClass extends Application {

	private CreateMealClass[] mealsCreated = new CreateMealClass[10]; 
	private int mealCount = 0;
	private int totalCal = 0;
	private int totalCarb = 0;
	private int totalProt = 0;
	private int totalFat = 0;
	private int totalMeals = 0;
	private int goalCal = 0;
	private int goalCarb = 0;
	private int goalProt = 0;
	private int goalFat = 0;
	private int goalMeals = 0;
	
	public CreateMealClass getMealC(int i)
	{
		return this.mealsCreated[i-1];
	}

	public void setMealC(CreateMealClass baj, int mealCount)
	{
		this.mealsCreated[mealCount] = baj;
	}
	
	public int getCount()
	{
		return this.mealCount;
	}
	
	public void setCount()
	{
		mealCount = mealCount + 1;
	}
	
	public int getTCal()
	{
		return this.totalCal;
	}
	
	public int getTCarb()
	{
		return this.totalCarb;
	}
	
	public int getTProt()
	{
		return this.totalProt;
	}
	
	public int getTFat()
	{
		return this.totalFat;
	}
	
	public int getTMeals()
	{
		return this.totalMeals;
	}
	
	
	public void setTCal(int cal)
	{
		totalCal = cal;
	}
	
	public void setTCarb(int carb)
	{
		totalCarb = carb;
	}
	
	public void setTProt(int prot)
	{
		totalProt = prot;
	}
	
	public void setTFat(int fat)
	{
		totalFat = fat;
	}
	
	public void setTMeals(int meals)
	{
		totalMeals = meals + totalMeals;
	}
	
	
	
	public int getGCal()
	{
		return this.goalCal;
	}
	
	public int getGCarb()
	{
		return this.goalCarb;
	}
	
	public int getGProt()
	{
		return this.goalProt;
	}
	
	public int getGFat()
	{
		return this.goalFat;
	}
	
	public int getGMeals()
	{
		return this.goalMeals;
	}
	
	
	public void setGCal(int cal)
	{
		goalCal = cal;
	}
	
	public void setGCarb(int carb)
	{
		goalCarb = carb;
	}
	
	public void setGProt(int prot)
	{
		goalProt = prot;
	}
	
	public void setGFat(int fat)
	{
		goalFat = fat;
	}
	
	public void setGMeals(int meals)
	{
		goalMeals = meals + goalMeals;
	}
}
