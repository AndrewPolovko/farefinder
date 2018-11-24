package com.belavia.fare.fare;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;

import javax.inject.Inject;


public class PreferenceHelper {

    private SharedPreferences mPrefs;
    private Context mContext;
    public static final String PREFS = "PREFS";

    @Inject
    public PreferenceHelper(Context context) {
        mPrefs = context.getSharedPreferences(PREFS, Context.MODE_PRIVATE);
        mContext = context;
    }

}
