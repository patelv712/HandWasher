package hand.washer.covidwasher;

import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;

import hand.washer.covidwasher.R;

public class SettingsActivityFragment extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.preferences);
    }
}