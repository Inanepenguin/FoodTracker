package edu.ucsb.cs.cs185.FoodTracker;

import android.app.Application;


public class GlobalsClass extends Application {

	private CreateMealClass[] mealsCreated = new CreateMealClass[10]; 
	private int mealCount = 0;
	
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
}
