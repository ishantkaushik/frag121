package com.example.modularfragmentui;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView;

public class FragmentA extends Fragment implements AdapterView.OnItemClickListener{
	
	Communicator comm;
	ListView list;
@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,
		Bundle savedInstanceState) {
	comm=(Communicator) getActivity();
	
	View view=inflater.inflate(R.layout.fragment_a, container,false);
	list=(ListView) view.findViewById(R.id.listview);
	ArrayAdapter adapter=ArrayAdapter.createFromResource(getActivity(), R.array.chapter,android.R.layout.simple_list_item_1);
	list.setAdapter(adapter);
	list.setOnItemClickListener(this);
	
return view;
}
@Override
public void onItemClick(AdapterView<?> arg0, View arg1, int id, long arg3) {
	comm.respond(id);
	
}
}
