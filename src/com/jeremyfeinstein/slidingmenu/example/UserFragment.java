package com.jeremyfeinstein.slidingmenu.example;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class UserFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		
			View view = inflater.inflate(R.layout.profile_update, container, false);
			
			return view;
	}
}
