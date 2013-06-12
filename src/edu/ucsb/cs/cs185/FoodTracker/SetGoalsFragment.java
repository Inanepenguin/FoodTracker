package edu.ucsb.cs.cs185.FoodTracker;

import android.os.Bundle;


import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.support.v4.app.DialogFragment;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;




public class SetGoalsFragment extends DialogFragment{
	
	View view;
	Button btnDone;
	GlobalsClass glob;
	EditText editNM;
	EditText editCal;
	EditText editCarb;
	EditText editFat;
	EditText editProt;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		view = inflater.inflate(R.layout.set_goals_fragment, container, false);
		this.getDialog().setTitle("Set New Goals");
		glob = ((FoodTrackerActivity) getActivity()).getGlobal();
		btnDone = (Button) view.findViewById(R.id.btnSetG);
		btnDone.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				editNM = (EditText) v.findViewById(R.id.edit_sMn);
				editCal = (EditText) v.findViewById(R.id.edit_Setcal);
				editCarb = (EditText) v.findViewById(R.id.edit_Setcarbs);
				editFat = (EditText) v.findViewById(R.id.edit_setFat);
				editProt = (EditText) v.findViewById(R.id.edit_setProt);
				
				glob.setGMeals(Integer.parseInt(editNM.getText().toString()));
				glob.setGCal(Integer.parseInt(editCal.getText().toString()));
				glob.setGCarb(Integer.parseInt(editCarb.getText().toString()));
				glob.setGFat(Integer.parseInt(editFat.getText().toString()));
				glob.setGProt(Integer.parseInt(editProt.getText().toString()));

				dismiss();
			}
		});
		
		return view;
	}
		
}
