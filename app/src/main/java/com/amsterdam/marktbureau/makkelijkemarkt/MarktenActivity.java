/*
 * Copyright (C) 2016 Gemeente Amsterdam, Marktbureau
 */
package com.amsterdam.marktbureau.makkelijkemarkt;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;

/**
 *
 * @author marcolangebeeke
 */
public class MarktenActivity extends BaseActivity {

    // use classname when logging
    private static final String LOG_TAG = MarktenActivity.class.getSimpleName();

    /**
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // set the title in the toolbar
        setToolbarTitle(getString(R.string.markten));

        // add the markten fragment to the container
        if (savedInstanceState == null) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.container, new MarktenFragment());
            transaction.commit();
        }
    }
}