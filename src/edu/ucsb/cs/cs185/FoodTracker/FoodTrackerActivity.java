package edu.ucsb.cs.cs185.FoodTracker;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Display;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

public class FoodTrackerActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        @SuppressWarnings("unused")
		Display display = ((WindowManager)getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();
        setContentView(R.layout.main);
        //findViewById(R.id.homeListContainer).getLayoutParams().height = display.getHeight()/2;
        setupWeekOverview();
    }

    public void setupWeekOverview() {

        TextView overview = (TextView)findViewById(R.id.SevenDayTotals);
        StringBuilder builder = new StringBuilder();
        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT)
        {
            builder.append("\tCalories:\t15764\t\t(2252/day)\n\r")
                    .append("\tCarbs:\t\t\t910 g\t\t(130 g/day)\n\r")
                    .append("\tProtein:\t\t577.5 g\t(82.5 g/day)\n\r")
                    .append("\tFat:\t\t\t\t630 g\t\t(90 g/day)\n\r");
            overview.setText(builder.toString());
        }
        else
        {
            builder.append("\tCalories:\t15764\t\t(2252/day)\t")
                    .append("\tCarbs:\t\t910 g\t\t(130 g/day)\n\r")
                    .append("\tProtein:\t\t577.5 g\t(82.5 g/day)\t")
                    .append("\tFat:\t\t\t630 g\t\t(90 g/day)\n\r");
            overview.setText(builder.toString());
        }
    }
    
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }
    
    public boolean onOptionsItemSelected(MenuItem item){
    	switch(item.getItemId()){
    	case R.id.menu_info:
    		Toast.makeText(this, "This is the home page and where your daily meals will go.", Toast.LENGTH_SHORT).show();
    		break;
    	case R.id.menu_Create:
    		Intent myIntent = new Intent(this, CreateAMealActivity.class);
    		startActivity(myIntent);
    	case R.id.menu_summ:
    		Intent summaryInt = new Intent(this, SummaryActivity.class);
    		startActivity(summaryInt);
    		break;
    	case R.id.menu_history:
    		Intent historyInt = new Intent(this, HistoryActivity.class);
    		startActivity(historyInt);
    		break;
    	default:
    		break;
    	}
    	
    	return true;
    	
    }

}
