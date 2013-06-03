package edu.ucsb.cs.cs185.FoodTracker;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.View;

public class AddAMealFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        // Dialog builder
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        // Inflated view to insert into the dialog
        final View view = getActivity().getLayoutInflater().inflate(R.layout.add_meal,null);
        return builder.create();
    }

}