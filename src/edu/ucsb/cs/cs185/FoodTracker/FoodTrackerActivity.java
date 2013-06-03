package edu.ucsb.cs.cs185.FoodTracker;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

import java.util.ArrayList;

public class FoodTrackerActivity extends Activity {
    private int count = 0;
    ListView homeList;
    ArrayList<String> list = new ArrayList<String>();
    ArrayAdapter<String> adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        @SuppressWarnings("unused")
		Display display = ((WindowManager)getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();
        setContentView(R.layout.main);
        homeList = (ListView)findViewById(R.id.homeList);
        adapter = new ArrayAdapter<String>(this,R.layout.meal_row,list);
        homeList.setAdapter(adapter);

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
                    .append("\tFat:\t\t\t\t\t630 g\t\t(90 g/day)\n\r");
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
    		break;
    	default:
    		break;
    	}

    	return true;
    }

    public void addMealForToday(View view) {
        StringBuilder builder = new StringBuilder();
        switch(count){
            case 0:
                builder.append(" Oatmeal and Fruit\n\r");
                builder.append("\tItems: Cooked oatmeal, fruit, milk\n\r");
                builder.append("\tCalories:\t\t550\tCarbs:\t25g\n\r");
                builder.append("\tProtein:\t\t\t5g\t\tFat:\t\t\t\t10g");
                list.add(builder.toString());
                adapter.notifyDataSetChanged();
                count++;
                break;
            case 1:
                builder.append(" Turkey Sandwich with Chips\n\r");
                builder.append("\tItems: Turkey sandwich, potato chips, coke\n\r");
                builder.append("\tCalories:\t\t890\tCarbs:\t45g\n\r");
                builder.append("\tProtein:\t\t\t32g\tFat:\t\t\t\t30g");
                list.add(builder.toString());
                adapter.notifyDataSetChanged();
                count++;
                break;
            case 2:
                builder.append(" Stirfry\n\r");
                builder.append("\tItems: Chicken vegetable stirfry, lemonade\n\r");
                builder.append("\tCalories:\t\t860\tCarbs:\t33g\n\r");
                builder.append("\tProtein:\t\t\t30g\tFat:\t\t\t\t27g");
                list.add(builder.toString());
                adapter.notifyDataSetChanged();
                count++;
                break;
            case 3:
                builder.append(" Chocolate Ice Cream\n\r");
                builder.append("\tItems: Chocolate ice cream\n\r");
                builder.append("\tCalories:\t\t300\tCarbs:\t25g\n\r");
                builder.append("\tProtein:\t\t\t5g\t\tFat:\t\t\t\t15g");
                list.add(builder.toString());
                adapter.notifyDataSetChanged();
                count++;
                break;
        }
    }

}
