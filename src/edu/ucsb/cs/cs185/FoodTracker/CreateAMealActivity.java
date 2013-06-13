package edu.ucsb.cs.cs185.FoodTracker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.Spinner;
import android.widget.Toast;



public class CreateAMealActivity extends Activity{

	private Spinner  mealSpin;
	private String[] meal_spin;
	private String spin_val;
	private RatingBar ratingBar;
	private Button btnDone;
	private EditText eName;
	private EditText eItem1;
	private EditText eItem2;
	private EditText eItem3;
	private EditText eCal;
	private EditText eCarb;
	private EditText eFat;
	private EditText eProt;
	private CreateMealClass myMeal;
	private boolean caseM;
	GlobalsClass glob;
	private int gCnt;
	private int cCal;
	private int cCarb;
	private int cProt;
	private int cFat;



	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.create_meal);
		addListenerOnButton();
		addListenerOnRatingBar();
		addListenerOnSpinner();

		myMeal = new CreateMealClass();
		glob = (GlobalsClass)getApplication();
		gCnt = glob.getCount();
		caseM = false;
	}


	public void OnClickDone(View v)
	{
	}

	public void addListenerOnRatingBar()
	{
		ratingBar = (RatingBar) findViewById(R.id.ratingBar1);

		ratingBar.setOnRatingBarChangeListener(new OnRatingBarChangeListener(){
			public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser)
			{
				myMeal.setRating(String.valueOf(ratingBar.getRating()));
			}
		});
	}

	public void addListenerOnSpinner()
	{
		mealSpin = (Spinner) findViewById (R.id.spinner_meal);
		meal_spin = getResources().getStringArray(R.array.meal_array);
	
		ArrayAdapter<String> adpt = new ArrayAdapter<String>(CreateAMealActivity.this, android.R.layout.simple_spinner_item, meal_spin);
		adpt.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
		mealSpin.setAdapter(adpt);
		
		mealSpin.setOnItemSelectedListener(new OnItemSelectedListener()
		{
			public void onItemSelected(AdapterView<?> arg0, View arg1, int pos, long id)
			{
				spin_val = meal_spin[pos];
				myMeal.setSpinner(spin_val);
			}
			
			public void onNothingSelected(AdapterView<?> arg0)
			{
				spin_val = meal_spin[5];
				myMeal.setSpinner(spin_val);
			}
		});
	}
	
	
	public void addListenerOnButton()
	{
		btnDone = (Button) findViewById (R.id.done_button);

		btnDone.setOnClickListener(new OnClickListener() {

			public void onClick(View v)
			{
				
				eName = (EditText) findViewById(R.id.edit_name);
				eItem1 = (EditText) findViewById(R.id.edit_item1);
				eItem2 = (EditText) findViewById(R.id.edit_item2);
				eItem3 = (EditText) findViewById(R.id.edit_item3);
				eCal = (EditText) findViewById(R.id.edit_cal);
				eCarb = (EditText) findViewById(R.id.edit_carbs);
				eFat = (EditText) findViewById(R.id.edit_fat);
				eProt = (EditText) findViewById(R.id.edit_protein);

				//this is where I will get my class stuff! use
				//.getText() to get radioButton stuff

				myMeal.setMealName(eName.getText().toString());
				myMeal.set_item1(eItem1.getText().toString());
				myMeal.set_item2(eItem2.getText().toString());
				myMeal.set_item3(eItem3.getText().toString());
				myMeal.setCal(Integer.parseInt(eCal.getText().toString()));
				myMeal.setCarb(Integer.parseInt(eCarb.getText().toString()));
				myMeal.setFat(Integer.parseInt(eFat.getText().toString()));
				myMeal.setProt(Integer.parseInt(eProt.getText().toString()));

				cCal = myMeal.getCal();
				cCarb = myMeal.getCarb();
				cProt = myMeal.getProt();
				cFat = myMeal.getFat();
				
				glob.setMealC(myMeal, gCnt);
				glob.setCount();
				glob.setTMeals(gCnt);
				glob.setTCal(cCal);
				glob.setTCarb(cCarb);
				glob.setTFat(cFat);
				glob.setTProt(cProt);
				
				caseM = true;
				Intent results = new Intent();
				results.putExtra("meal", caseM);
				setResult(RESULT_OK, results);
				finish();
			}
		});



	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cmealmenu, menu);
		return true;
	}

	 public boolean onOptionsItemSelected(MenuItem item){
		 switch(item.getItemId()){
		 case R.id.create_info:
			 Toast.makeText(this, "Create a new meal here! It will be saved to you list of meals and can be used later.", Toast.LENGTH_SHORT).show();
			 break;
		 case R.id.menu_add:
			 Intent addInt = new Intent(this, FoodTrackerActivity.class);
			 startActivity(addInt);
			 break;
		 case R.id.menu_summary:
			Intent summaryInt = new Intent(this, SummaryActivity.class);
	    	startActivity(summaryInt);
	    	break;
		 case R.id.menu_home:
			 Intent homeInt = new Intent(this, HomeActivity.class);
			 startActivity(homeInt);
			 break;
		 case R.id.menu_history:
			 Intent histInt = new Intent(this, HistoryActivity.class);
			 startActivity(histInt);
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
}
