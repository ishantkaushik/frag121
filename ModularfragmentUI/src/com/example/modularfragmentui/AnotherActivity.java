package com.example.modularfragmentui;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;

public class AnotherActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.anotheractivity);

		Intent intent = getIntent();
		int index = intent.getIntExtra("index", 0);
		FragmentB f2 = (FragmentB) getFragmentManager().findFragmentById(
				R.id.fragment2);
		if (f2 != null) {
			f2.changeData(index);
		}
	}
}
