package com.example.modularfragmentui;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentB extends Fragment{
	TextView text;
@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,
		Bundle savedInstanceState) {
  View view= inflater.inflate(R.layout.fragment_b,container,false);
  text=(TextView) view.findViewById(R.id.textView1);
   return view;
}

public void changeData(int i) {
	String[] description=getResources().getStringArray(R.array.description);
	text.setText(description[i]);
}
}
