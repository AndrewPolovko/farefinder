package com.belavia.fare.fare;

import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Inject;


public class CredentialsManager {

    private final static String ID_TOKEN = "id_token";
    private static final String PREFERENCES_NAME = "belavia";
    public PreferenceHelper mPreferenceHelper;
    public Context context;

    @Inject
    public CredentialsManager(PreferenceHelper preferenceHelper, Context context) {
        this.mPreferenceHelper = preferenceHelper;
        this.context = context;
    }

    public void saveToken(String token) {
        SharedPreferences sp = context.getSharedPreferences(
                PREFERENCES_NAME, Context.MODE_PRIVATE);

        sp.edit()
                .putString(ID_TOKEN, token)
                .apply();
    }

    public String getToken() {
        SharedPreferences sp = context.getSharedPreferences(
                PREFERENCES_NAME, Context.MODE_PRIVATE);

        return sp.getString(ID_TOKEN, "");
    }


}
