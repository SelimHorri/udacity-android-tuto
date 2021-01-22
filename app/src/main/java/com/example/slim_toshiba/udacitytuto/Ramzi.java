package com.example.slim_toshiba.udacitytuto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Ramzi extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ramzi);
    }
    
    Button btn;
    EditText editText;
    
    public void ajouterAge(View view) {
        
        btn = findViewById(R.id.btnId);
        editText = findViewById(R.id.editText);
        
        editText.setText("23");
        
    }
}
