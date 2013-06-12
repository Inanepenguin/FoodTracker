package edu.ucsb.cs.cs185.FoodTracker;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class SetGoals extends FragmentActivity {
	
	Button btnsetG;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_set_goals);
	}
	
	@SuppressLint("NewApi")
	public void FragmentStart(View v)
	{
		if(v == findViewById(R.id.setGoals))
		{
			DialogFragment newF = new SetGoalsFragment();
			newF.show(getFragmentManager(), "setGoalsFrag");
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.set_goals, menu);
		return true;
	}
	
	 public boolean onOptionsItemSelected(MenuItem item){
		 switch(item.getItemId()){
		 case R.id.menu_home:
			 Intent homeInt = new Intent(this, HomeActivity.class);
			 startActivity(homeInt);
			 break;
		 case R.id.menu_info:
			 Toast.makeText(this, "Use this page to set your goals.", Toast.LENGTH_SHORT).show();
			 break;
		 case R.id.menu_add:
			 Intent addInt = new Intent(this, FoodTrackerActivity.class);
			 startActivity(addInt);
			 break;
		 case R.id.sum_create:
			 Intent myIntent = new Intent(this, CreateAMealActivity.class);
	    	 startActivity(myIntent);
	    	 break;
		 case R.id.menu_history:
			 Intent histInt = new Intent(this, HistoryActivity.class);
	    	 startActivity(histInt);
	    	 break;
		 case R.id.menu_summary:
			 Intent summaryInt = new Intent(this, SummaryActivity.class);
		     startActivity(summaryInt);
		     break;
		 default:
	    		break;
	    	 
		 }
		return true;
	 }
}
