package edu.ucsb.cs.cs185.FoodTracker;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class CreateAMealActivity extends Activity{
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.create_meal);
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cmealmenu, menu);
		return true;
	}
	
	 public boolean onOptionsItemSelected(MenuItem item){
		 switch(item.getItemId()){
		 case R.id.create_info:
			 Toast.makeText(this, "Create a new meal here! It will be saved to you list of meals and can be used later.", Toast.LENGTH_SHORT).show();
			 break;
		 case R.id.menu_add:
			 Toast.makeText(this, "Go back to Add Meal Fragment", Toast.LENGTH_SHORT).show();
			 break;
		default:
			break;
		 }
		 return true;
	 }

}
