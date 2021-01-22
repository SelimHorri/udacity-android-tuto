package com.example.slim_toshiba.udacitytuto;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
// Begin Class
    
    private Button btn;
    private TextView txtHap;
    
    public void go (View view) {
    // Begin go()
        
        String btn_txt = ((Button)view).getText().toString();
        
        if (btn_txt.equalsIgnoreCase("toMain2")) {
    
            btn = (Button)findViewById(R.id.btn);
            txtHap = (TextView)findViewById(R.id.hap);
            
            Intent intent = new Intent(this,Main2Activity.class);
            
            Bundle b = new Bundle();
            b.putString("hap_textView",txtHap.getText().toString());
            intent.putExtras(b);
            
            startActivity(intent);
            
        }
        
        if (btn_txt.equalsIgnoreCase("toMain3")) {
        
            btn = (Button)findViewById(R.id.btn2);
            txtHap = (TextView)findViewById(R.id.fr);
            
            Intent intent = new Intent(this,Main3Activity.class);
            
            Bundle b = new Bundle();
            b.putString("friend",txtHap.getText().toString());
            intent.putExtras(b);
            
            startActivity(intent);
        
        }
        
    // End go()
    }
    
    public void go2 () {
    // Begin go2()
        
        final Button button = (Button)findViewById(R.id.btn5);
        button.setText("hi".toLowerCase());
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                button.setText("You Clicked Me");
                
            }
        });
        
    // End go2()
    }
    
    public void go3 (View view) {
    
        Intent intent = new Intent(this,Login.class);
        startActivity(intent);
    
    }
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.go2();
    }
    
    public void toRamzi(View view) {
        
        Intent intent = new Intent(this,Ramzi.class);
        startActivity(intent);
        
    }

// End Class
}
