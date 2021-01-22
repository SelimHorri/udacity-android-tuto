package com.example.slim_toshiba.udacitytuto;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends Activity {
// Begin Class
    
    private TextView textView;
    
    public void ad () {
    // Begin ad()
    
        textView = (TextView)findViewById(R.id.m);
        Bundle b = getIntent().getExtras();
        textView.setText(b.getString("hap_textView"));
        
    // End ad()
    }
    
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        this.ad();
    }
    
// End Class
}
