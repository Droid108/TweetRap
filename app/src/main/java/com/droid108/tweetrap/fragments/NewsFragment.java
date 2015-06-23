package com.droid108.tweetrap.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.actionbarsherlock.app.SherlockFragment;
import com.droid108.tweetrap.R;

/**
 * Created by SupportPedia on 07-04-2015.
 */
public class NewsFragment extends SherlockFragment {

    public NewsFragment(){}

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_news, container, false);
        return rootView;
    }

}