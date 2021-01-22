package com.example.slim_toshiba.udacitytuto;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends Activity {
// Begin Class
    
    private TextView textView;
    
    public void go3 () {
    // Begin go3()
        
        textView = (TextView)findViewById(R.id.m);
        Bundle b = getIntent().getExtras();
        textView.setText(b.getString("friend"));
        
    // End go()3
    }
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        this.go3();
    }
    
// End Class
}
