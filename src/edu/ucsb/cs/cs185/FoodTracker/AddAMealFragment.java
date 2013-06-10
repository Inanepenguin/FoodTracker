package edu.ucsb.cs.cs185.FoodTracker;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.ListView;
import android.widget.Spinner;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class AddAMealFragment extends DialogFragment {
    ArrayAdapter<String> adapter;
    ArrayList<String> meals = new ArrayList<String>();
    ListView list;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        // Dialog builder
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        // Inflated view to insert into the dialog
        final View view = getActivity().getLayoutInflater().inflate(R.layout.add_meal,null);
        builder.setView(view)
               .setTitle("Add a Meal");
        final Spinner mealList = (Spinner)view.findViewById(R.id.meal_picker);
        Calendar cal = Calendar.getInstance(Locale.US);
        cal.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        DatePicker datePicker = (DatePicker)view.findViewById(R.id.date_picker);
        datePicker.updateDate(cal.get(Calendar.YEAR),cal.get(Calendar.MONTH),cal.get(Calendar.DAY_OF_MONTH));
        int currentapiVersion = android.os.Build.VERSION.SDK_INT;
        if (currentapiVersion >= 11) {
            try {
                Method m = datePicker.getClass().getMethod("setCalendarViewShown", boolean.class);
                m.invoke(datePicker, false);
            }
            catch (Exception e) {} // eat exception in our case
        }
        meals.add("Chocolate Ice Cream");
        meals.add("Fruit Smoothie");
        meals.add("Lasagna");
        meals.add("Oatmeal and Fruit");
        meals.add("Pancakes and Hashbrowns");
        meals.add("Salmon and Rice");
        meals.add("Stirfry");
        meals.add("Turkey Sandwich with Chips");
        adapter = new ArrayAdapter<String>(getActivity(),R.layout.meal_row,meals);
        mealList.setAdapter(adapter);
        builder.setPositiveButton("Add", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
            	
                FoodTrackerActivity activity = (FoodTrackerActivity) getActivity();
                activity.addMealForToday(mealList.getSelectedItem().toString());
            }
        });
        builder.setNegativeButton("Cancel",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });

        return builder.create();
    }

}