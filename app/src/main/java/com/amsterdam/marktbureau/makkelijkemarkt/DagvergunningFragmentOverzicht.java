/*
 * Copyright (C) 2016 Gemeente Amsterdam, Marktbureau
 */
package com.amsterdam.marktbureau.makkelijkemarkt;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 *
 * @author marcolangebeeke
 */
public class DagvergunningFragmentOverzicht extends Fragment {

    /**
     * Constructor
     */
    public DagvergunningFragmentOverzicht() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dagvergunning_fragment_overzicht, container, false);

        return view;
    }
}