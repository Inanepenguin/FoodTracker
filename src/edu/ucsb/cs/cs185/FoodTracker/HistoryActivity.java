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

public class HistoryActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.history);
		setupHistoryOverview();
	}

    public void setupHistoryOverview() {
    	
      
        TextView hist = (TextView)findViewById(R.id.history_list);
        StringBuilder builder = new StringBuilder();
       
        	  builder.append("January 1, 2012--\n")
        	  .append("\tMeat and Rice:\n\r")
        	  .append("\tCalories:\t2200\n\r")
              .append("\tCarbs:\t\t\t500 g\t\n\r")
              .append("\tProtein:\t\t577.5 g\t\n\r")
              .append("\tFat:\t\t\t\t28 g\t\n\n\n\r")
        	  .append("January 2, 2012--\n")
        	  .append("\tPizza:\n\r")
        	  .append("\tCalories:\t2200\n\r")
              .append("\tCarbs:\t\t\t500 g\t\n\r")
              .append("\tProtein:\t\t577.5 g\t\n\r")
              .append("\tFat:\t\t\t\t28 g\t\n\n\n\r")
        	  .append("January 3, 2012--\n")
        	  .append("\tChili:\n\r")
        	  .append("\tCalories:\t2200\n\r")
              .append("\tCarbs:\t\t\t500 g\t\n\r")
              .append("\tProtein:\t\t577.5 g\t\n\r")
              .append("\tFat:\t\t\t\t28 g\t\n\n\n\r")
        	  .append("January 4, 2012--\n")
        	  .append("\tYogurt and Granola:\n\r")
        	  .append("\tCalories:\t2200\n\r")
              .append("\tCarbs:\t\t\t500 g\t\n\r")
              .append("\tProtein:\t\t577.5 g\t\n\r")
              .append("\tFat:\t\t\t\t28 g\t\n\n\n\r")
        	  .append("January 5, 2012--\n")
        	  .append("\tSteak and Lobster:\n\r")
        	  .append("\tCalories:\t2200\n\r")
              .append("\tCarbs:\t\t\t500 g\t\n\r")
              .append("\tProtein:\t\t577.5 g\t\n\r")
              .append("\tFat:\t\t\t\t28 g\t\n\n\n\r")
        	  .append("January 6, 2012--\n")
        	  .append("\tSuper Cucas Burrito:\n\r")
        	  .append("\tCalories:\t2200\n\r")
              .append("\tCarbs:\t\t\t500 g\t\n\r")
              .append("\tProtein:\t\t577.5 g\t\n\r")
              .append("\tFat:\t\t\t\t28 g\t\n\n\n\r")
        	  .append("January 7, 2012--\n")
        	  .append("\tFried Rice and Sausage:\n\r")
        	  .append("\tCalories:\t2200\n\r")
              .append("\tCarbs:\t\t\t500 g\t\n\r")
              .append("\tProtein:\t\t577.5 g\t\n\r")
              .append("\tFat:\t\t\t\t28 g\t\n\n\n\r");
        	  
      hist.setText(builder.toString());
   
        
    	
     
    	}
    
    
    
    
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.histmenu, menu);
        return true;
    }
    
    
    public boolean onOptionsItemSelected(MenuItem item){
    	switch(item.getItemId()){
    	case R.id.hist_info:
    		Toast.makeText(this, "Currently viewing a summary of your Breakfast, Lunch and Dinner Totals.", Toast.LENGTH_SHORT).show();
    		break;
    	case R.id.hist_create:
    		Intent myIntent = new Intent(this, CreateAMealActivity.class);
    		startActivity(myIntent);
    		break;
    	case R.id.hist_add:
    		/*Intent addIntent = new Intent(this, CreateAMealActivity.class);
    		startActivity(addIntent);*/
    		break;
    	case R.id.hist_sum:
    		Intent summaryIntent = new Intent(this, SummaryActivity.class);
    		startActivity(summaryIntent);
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
