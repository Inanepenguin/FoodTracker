package edu.ucsb.cs.cs185.FoodTracker;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SetGoals extends FragmentActivity {
	
	Button btnsetG;
	TextView currNM;
	TextView goalNM;
	TextView currCal;
	TextView goalCal;
	TextView currCarb;
	TextView goalCarb;
	TextView currFat;
	TextView goalFat;
	TextView currProt;
	TextView goalProt;
	GlobalsClass glob;
	int gNM; int cNM;
	int gCal; int cCal;
	int gCarb; int cCarb;
	int gProt; int cProt;
	int gFat; int cFat;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_set_goals);
		glob = (GlobalsClass) getApplication();
		updateValues();
		
	}
	
	@SuppressLint("NewApi")
	public void FragmentStart(View v)
	{
		if(v == findViewById(R.id.setGoals))
		{
			DialogFragment newF = new SetGoalsFragment();
			newF.show(getSupportFragmentManager(), "setGoalsFrag");
		}
	}

	public void updateValues()
	{
		currNM = (TextView) findViewById(R.id.currNumMeal);
		goalNM = (TextView) findViewById(R.id.setNumMealG);
		
		currCal = (TextView) findViewById(R.id.currCal);
		goalCal = (TextView) findViewById(R.id.setCalG);
		
		currCarb = (TextView) findViewById(R.id.currCarb);
		goalCarb = (TextView) findViewById(R.id.setCarbG);
		
		currFat = (TextView) findViewById(R.id.currFat);
		goalFat = (TextView) findViewById(R.id.setFatG);
		
		currProt = (TextView) findViewById(R.id.currProt);
		goalProt = (TextView) findViewById(R.id.setProtG);
		
		gNM = glob.getGMeals();
		gCal = glob.getGCal();
		gCarb = glob.getGCarb();
		gProt = glob.getGProt();
		gFat = glob.getGFat();
		cNM = glob.getTMeals();
		cCal = glob.getTCal();
		cCarb = glob.getTCarb();
		cProt = glob.getTProt();
		cFat = glob.getTFat();
		
		currNM.setText(Integer.toString(cNM));
		currCal.setText(Integer.toString(cCal));
		currCarb.setText(Integer.toString(cCarb));
		currFat.setText(Integer.toString(cFat));
		currProt.setText(Integer.toString(cProt));
		goalNM.setText(Integer.toString(gNM));
		goalCal.setText(Integer.toString(gCal));
		goalCarb.setText(Integer.toString(gCarb));
		goalFat.setText(Integer.toString(gFat));
		goalProt.setText(Integer.toString(gProt));
	
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
