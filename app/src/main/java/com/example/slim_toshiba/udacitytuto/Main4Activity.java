package com.example.slim_toshiba.udacitytuto;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Main4Activity extends Activity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    
        TextView textView = (TextView)findViewById(R.id.txt);
        Bundle b = getIntent().getExtras();
        textView.setText("Email:\n"+ b.getString("email") +"\nPassword:\n "+ b.getString("pass"));
    }
}
