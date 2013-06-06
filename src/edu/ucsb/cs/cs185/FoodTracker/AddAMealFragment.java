package edu.ucsb.cs.cs185.FoodTracker;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

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
        Spinner mealList = (Spinner)view.findViewById(R.id.meal_picker);
        meals.add("\nChocolate Ice Cream\n");
        meals.add("\nFruit Smoothie\n");
        meals.add("\nLasagna\n");
        meals.add("\nOatmeal and Fruit\n");
        meals.add("\nPancakes and Hashbrowns\n");
        meals.add("\nSalmon and Rice\n");
        meals.add("\nStirfry\n");
        meals.add("\nTurkey Sandwich with Chips\n");
        adapter = new ArrayAdapter<String>(getActivity(),R.layout.meal_row,meals);
//        mealList.setAdapter(adapter);
//        mealList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                FoodTrackerActivity activity = (FoodTrackerActivity)getActivity();
//                activity.addMealForToday(adapterView.getItemAtPosition(i).toString());
//            }
//        });
//        builder.setTitle("Choose a Meal")
//               .setSingleChoiceItems(adapter,1,new DialogInterface.OnClickListener() {
//                   @Override
//                   public void onClick(DialogInterface dialogInterface, int i) {
//                       FoodTrackerActivity activity = (FoodTrackerActivity)getActivity();
//                       activity.addMealForToday(adapter.getItem(i));
//                       dialogInterface.dismiss();
//                   }
//               });
//        list = (ListView)view.findViewById(R.id.addMealList);
        return builder.create();
    }

}