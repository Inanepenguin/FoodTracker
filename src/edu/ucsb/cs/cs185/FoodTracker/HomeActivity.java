package edu.ucsb.cs.cs185.FoodTracker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class HomeActivity extends Activity {

	private Button btnCreateM;
	private Button btnSetG;
	private Button btnViewH;
	private Button btnViewS;
    private Button btnToday;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);

		btnCreateM = (Button) findViewById(R.id.home_createMeal);
		btnSetG = (Button) findViewById(R.id.home_setGoal);
		btnViewH = (Button) findViewById(R.id.home_viewHis);
		btnViewS = (Button) findViewById(R.id.home_viewSum);
        btnToday = (Button) findViewById(R.id.home_todays);


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
				Intent myInt = new Intent(HomeActivity.this, SetGoals.class);
				startActivity(myInt);
			}
		});

		btnViewH.setOnClickListener(new OnClickListener(){
			public void onClick(View v)
			{
                Intent myInt = new Intent(HomeActivity.this, HistoryActivity.class);
                startActivity(myInt);
			}
		});

		btnViewS.setOnClickListener(new OnClickListener(){
			public void onClick(View v)
			{
				Intent myI = new Intent(HomeActivity.this, SummaryActivity.class);
				startActivity(myI);
			}
		});

        btnToday.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myInt = new Intent(HomeActivity.this, FoodTrackerActivity.class);
                startActivity(myInt);
            }
        });

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}

}
