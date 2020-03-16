package com.example.cdsscheduleapp.fragment5settings;

import android.os.Bundle;

import androidx.fragment.app.FragmentManager;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;

import com.example.cdsscheduleapp.R;



public class Fragment5Settings extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.fragment5_settings);

        Preference sync = (Preference) findPreference("synchronization");
        sync.setLayoutResource(R.layout.sync_detail);
        sync.setSelectable(true);


    }
}
