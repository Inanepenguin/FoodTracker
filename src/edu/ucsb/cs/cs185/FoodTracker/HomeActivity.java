package edu.ucsb.cs.cs185.FoodTracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends FragmentActivity {

	private Button btnAddM;
	private Button btnCreateM;
	private Button btnSetG;
	private Button btnViewH;
	private Button btnViewS;
    private Button btnToday;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);

		btnAddM = (Button) findViewById(R.id.home_addMeal);
		btnCreateM = (Button) findViewById(R.id.home_createMeal);
		btnSetG = (Button) findViewById(R.id.home_setGoal);
		btnViewH = (Button) findViewById(R.id.home_viewHis);
		btnViewS = (Button) findViewById(R.id.home_viewSum);
        btnToday = (Button) findViewById(R.id.home_todays);

		btnAddM.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
                DialogFragment dialogFragment = new AddAMealFragment();
                dialogFragment.show(getSupportFragmentManager(), "addAMeal");
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
				Intent myInt = new Intent(HomeActivity.this, SetGoals.class);
				startActivity(myInt);
			}
		});

		btnViewH.setOnClickListener(new OnClickListener(){
			public void onClick(View v)
			{
				//Toast.makeText(HomeActivity.this, "View History Screen Coming Soon!", Toast.LENGTH_SHORT).show();
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
