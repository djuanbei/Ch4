package com.example.dp.ch4;

import android.app.LauncherActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MainActivity extends LauncherActivity {

    String[] names = {"设置程序参数", "查看星际兵种"};

    Class<?>[] clazzs = {PreferenceAcitivityTest.class, ExpandableListActivityTest.class};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //  setContentView(R.layout.main); //界面中必须有List
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);
        setListAdapter(adapter);
    }

    @Override
    public Intent intentForPosition(int position) {
        return new Intent(MainActivity.this, clazzs[position]);
    }
}
