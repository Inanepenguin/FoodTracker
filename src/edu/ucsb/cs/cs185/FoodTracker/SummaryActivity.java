package edu.ucsb.cs.cs185.FoodTracker;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.RatingBar;

public class SummaryActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.summary);
		setupSummaryOverview();
	}

    public void setupSummaryOverview() {
    	
      
        TextView bfast = (TextView)findViewById(R.id.BreakfastTotals);
        TextView lunch = (TextView)findViewById(R.id.LunchTotals);
        TextView dinner = (TextView)findViewById(R.id.DinnerTotals);
        StringBuilder builder = new StringBuilder();
       
        	  builder.append("\tCalories:\t2200\n\r")
              .append("\tCarbs:\t\t\t500 g\t\n\r")
              .append("\tProtein:\t\t577.5 g\t\n\r")
              .append("\tFat:\t\t\t\t28 g\t\n\r");
        	  
      bfast.setText(builder.toString());
      lunch.setText(builder.toString());
      dinner.setText(builder.toString());
      
      RatingBar rate1 = (RatingBar)findViewById(R.id.ratingBar1);
      rate1.setRating(2.0f);
        
    	
     
    	}
    
    
    
    
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.summenu, menu);
        return true;
    }
    
    public boolean onOptionsItemSelected(MenuItem item){
    	switch(item.getItemId()){
    	case R.id.sum_info:
    		Toast.makeText(this, "Currently viewing a summary of your Breakfast, Lunch and Dinner Totals.", Toast.LENGTH_SHORT).show();
    		break;
    	case R.id.sum_create:
    		Intent myIntent = new Intent(this, CreateAMealActivity.class);
    		startActivity(myIntent);
    		break;
    	case R.id.sum_add:
    		/*Intent addIntent = new Intent(this, CreateAMealActivity.class);
    		startActivity(addIntent);*/
    		break;
    	default:
    		break;
    	}
    	
    	return true;
    	
    }
    
	public void OnClickDone(View v)
	{
		finish();
	}

}
