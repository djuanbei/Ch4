package com.example.dp.ch4;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;
import android.widget.Button;
import android.widget.Toast;

import java.util.List;

/**
 * Created by dp on 2018/10/11.
 */

public class PreferenceAcitivityTest extends PreferenceActivity {

    @Override
    public void onCreate(Bundle saveInstance) {
        super.onCreate(saveInstance);
        if (hasHeaders()) {
            Button button = new Button(this);
            button.setText("设置操作");
            setListFooter(button);
        }
    }

    @Override
    public void onBuildHeaders(List<Header> target) {
        loadHeadersFromResource(R.xml.preference_headers, target);
    }

    @Override
    public boolean isValidFragment(String fragmentName) {
        return true;
    }

    public static class Prefs1Fragment extends PreferenceFragment {

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.xml.preferences);
        }
    }

    public static class Prefs2Fragment extends PreferenceFragment {

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.xml.display_prefs);
            //获取传入该Fragment 的参数
            String website = getArguments().getString("website");
            Toast.makeText(getActivity(), "网站域名是: " + website, Toast.LENGTH_LONG).show();
        }
    }


}
