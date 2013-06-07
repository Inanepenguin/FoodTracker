package edu.ucsb.cs.cs185.FoodTracker;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends Activity {
	
	private Button btnAddM;
	private Button btnCreateM;
	private Button btnSetG;
	private Button btnViewH;
	private Button btnViewS;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		
		btnAddM = (Button) findViewById(R.id.home_addMeal);
		btnCreateM = (Button) findViewById(R.id.home_createMeal);
		btnSetG = (Button) findViewById(R.id.home_setGoal);
		btnViewH = (Button) findViewById(R.id.home_viewHis);
		btnViewS = (Button) findViewById(R.id.home_viewSum);
		
		btnAddM.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent myIntent = new Intent(HomeActivity.this, FoodTrackerActivity.class);
				startActivity(myIntent);
			}
		});
		
		
		btnCreateM.setOnClickListener(new OnClickListener(){
			public void onClick(View v)
			{
				Intent myInt = new Intent(HomeActivity.this, CreateAMealActivity.class);
	    		startActivity(myInt);
			}
		});
		
		btnSetG.setOnClickListener(new OnClickListener(){
			public void onClick(View v)
			{
				Toast.makeText(HomeActivity.this, "Set Goals Screen Coming Soon!!", Toast.LENGTH_SHORT).show();
			}
		});
		
		btnViewH.setOnClickListener(new OnClickListener(){
			public void onClick(View v)
			{
				Toast.makeText(HomeActivity.this, "View History Screen Coming Soon!", Toast.LENGTH_SHORT).show();
			}
		});
		
		btnViewS.setOnClickListener(new OnClickListener(){
			public void onClick(View v)
			{
				Intent myI = new Intent(HomeActivity.this, SummaryActivity.class);
				startActivity(myI);	
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}

}
