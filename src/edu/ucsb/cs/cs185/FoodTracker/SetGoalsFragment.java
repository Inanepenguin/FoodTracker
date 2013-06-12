package edu.ucsb.cs.cs185.FoodTracker;

import android.os.Bundle;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;



@SuppressLint("NewApi")
public class SetGoalsFragment extends DialogFragment{
	
	View view;
	Button btnDone;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		view = inflater.inflate(R.layout.set_goals_fragment, container, false);
		this.getDialog().setTitle("Set New Goals");
		btnDone = (Button) view.findViewById(R.id.btnSetG);
		btnDone.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				dismiss();
			}
		});
		
		return view;
	}
		
}
