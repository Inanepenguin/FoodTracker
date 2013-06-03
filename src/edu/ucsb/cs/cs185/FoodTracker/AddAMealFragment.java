package edu.ucsb.cs.cs185.FoodTracker;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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
//        final View view = getActivity().getLayoutInflater().inflate(R.layout.add_meal,null);
        meals.add("\n\rChocolate Ice Cream\n\r");
        meals.add("\n\rOatmeal and Fruit\n\r");
        meals.add("\n\rStirfry\n\r");
        meals.add("\n\rTurkey Sandwich with Chips\n\r");
        adapter = new ArrayAdapter<String>(getActivity(),R.layout.meal_row,meals);
        builder.setTitle("Choose a Meal")
               .setSingleChoiceItems(adapter,1,new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialogInterface, int i) {
                       FoodTrackerActivity activity = (FoodTrackerActivity)getActivity();
                       activity.addMealForToday(i);
                       dialogInterface.dismiss();
                   }
               });
        AlertDialog dialog = builder.create();
//        list = (ListView)view.findViewById(R.id.addMealList);
        return dialog;
    }

}