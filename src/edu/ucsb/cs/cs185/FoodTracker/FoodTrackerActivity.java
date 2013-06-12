package edu.ucsb.cs.cs185.FoodTracker;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.*;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class FoodTrackerActivity extends FragmentActivity {
    @SuppressWarnings("unused")
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
        findViewById(R.id.mainAddMealButton).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                DialogFragment dialogFragment = new AddAMealFragment();
                dialogFragment.show(getSupportFragmentManager(),"addAMeal");
            }
        });
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
    	case R.id.menu_summ:
    		Intent summaryInt = new Intent(this, SummaryActivity.class);
    		startActivity(summaryInt);
    		break;
    	case R.id.menu_history:
    		Intent historyInt = new Intent(this, HistoryActivity.class);
    		startActivity(historyInt);
    		break;
    	case R.id.menu_home:
    		Intent homeInt = new Intent(this, HomeActivity.class);
    		startActivity(homeInt);
    		break;
    	case R.id.menu_setG:
    		Intent setInt = new Intent(this, SetGoals.class);
    		startActivity(setInt);
    		break;
    	default:
    		break;
    	}

    	return true;
    }

    public void addMealForToday(String choice) {
        StringBuilder builder = new StringBuilder();
        int i = getChoice(choice);
        switch(i){
            case 1:
                builder.append(" Oatmeal and Fruit\n\r");
                builder.append("\tItems: Cooked oatmeal, fruit, milk\n\r");
                builder.append("\tCalories:\t\t550\tCarbs:\t\t25g\n\r");
                builder.append("\tProtein:\t\t\t5g\t\tFat:\t\t\t\t10g");
                list.add(builder.toString());
                adapter.notifyDataSetChanged();
                count++;
                break;
            case 3:
                builder.append(" Turkey Sandwich with Chips\n\r");
                builder.append("\tItems: Turkey sandwich, potato chips, coke\n\r");
                builder.append("\tCalories:\t\t890\tCarbs:\t\t45g\n\r");
                builder.append("\tProtein:\t\t\t32g\tFat:\t\t\t\t30g");
                list.add(builder.toString());
                adapter.notifyDataSetChanged();
                count++;
                break;
            case 2:
                builder.append(" Stirfry\n\r");
                builder.append("\tItems: Chicken vegetable stirfry, lemonade\n\r");
                builder.append("\tCalories:\t\t860\tCarbs:\t\t33g\n\r");
                builder.append("\tProtein:\t\t\t30g\tFat:\t\t\t\t27g");
                list.add(builder.toString());
                adapter.notifyDataSetChanged();
                count++;
                break;
            case 0:
                builder.append(" Chocolate Ice Cream\n\r");
                builder.append("\tItems: Chocolate ice cream\n\r");
                builder.append("\tCalories:\t\t300\tCarbs:\t\t25g\n\r");
                builder.append("\tProtein:\t\t\t5g\t\tFat:\t\t\t\t15g");
                list.add(builder.toString());
                adapter.notifyDataSetChanged();
                count++;
                break;
            case 4:
            	builder.append(" Fruit Smoothie\n\r");
            	builder.append("\tItems: Strawberries, bananas, kiwi\n\r");
            	builder.append("\tCalories:\t\t160\tCarbs:\t\t14g\n\r");
            	builder.append("\tProtein:\t\t\t3g\t\tFat:\t\t\t\t1g");
            	list.add(builder.toString());
            	adapter.notifyDataSetChanged();
            	count++;
            	break;
            case 5:
            	builder.append(" Lasagna\n\r");
            	builder.append("\tItems: Sauce, Beef, Pasta\n\r");
            	builder.append("\tCalories:\t\t127\tCarbs:\t\t12.9g\n\r");
            	builder.append("\tProtein:\t\t\t8.3g\t\tFat:\t\t\t\t4.7g");
            	list.add(builder.toString());
            	adapter.notifyDataSetChanged();
            	count++;
                break;
            case 6:
            	builder.append(" Pancakes and Hashbrowns\n\r");
            	builder.append("\tItems: Pancakes and hashbrown\n\r");
            	builder.append("\tCalories:\t\t141.3\tCarbs:\t\t22.1g\n\r");
            	builder.append("\tProtein:\t\t\t4g\t\tFat:\t\t\t\4.2t4g");
            	list.add(builder.toString());
            	adapter.notifyDataSetChanged();
            	count++;
            	break;
            case 7:
            	builder.append(" Salmon and Rice\n\r");
            	builder.append("\tItems: Salmon and Rice\n\r");
            	builder.append("\tCalories:\t\t540\tCarbs:\t\t71g\n\r");
            	builder.append("\tProtein:\t\t\t28g\t\tFat:\t\t\t\t17g");
            	list.add(builder.toString());
            	adapter.notifyDataSetChanged();
            	count++;
        }
    }

    private int getChoice(String choice){
        if(choice.equals("Chocolate Ice Cream"))
            return 0;
        if(choice.equals("Oatmeal and Fruit"))
            return 1;
        if(choice.equals("Stirfry"))
            return 2;
        if(choice.equals("Turkey Sandwich with Chips"))
            return 3;
        if(choice.equals("Fruit Smoothie"))
        	return 4;
        if(choice.equals("Lasagna"))
        	return 5;
        if(choice.equals("Pancakes and Hashbrowns"))
        	return 6;
        if(choice.equals("Salmon and Rice"))
        	return 7;
        else
            return -1;
    }

}
