package com.example.slim_toshiba.udacitytuto;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends Activity {
// Begin Class
    
    public void toMain (View view) {
    // Begin toMain()
    
        EditText editText1 = (EditText)findViewById(R.id.ed1);
        EditText editText2 = (EditText)findViewById(R.id.ed2);
        
        String email = editText1.getText().toString().trim();
        String password = editText2.getText().toString();
        
        if ( (email.isEmpty()) && (password.isEmpty()) )
            Toast.makeText(this,"Type Something!!",Toast.LENGTH_SHORT).show();
        else {
            
            if (email.isEmpty())
                Toast.makeText(this,"Type Email!!",Toast.LENGTH_SHORT).show();
            else {
    
                if (password.isEmpty())
                    Toast.makeText(this,"Type Password!!",Toast.LENGTH_SHORT).show();
                else {
                    
                    if ( (email.equalsIgnoreCase("slim__Horri@hotmail.com")) && (password.equals("0123")) ) {
    
                        Intent intent = new Intent(this,Main4Activity.class);
    
                        Bundle b = new Bundle();
                        b.putString("email",editText1.getText().toString());
                        b.putString("pass",editText2.getText().toString());
                        intent.putExtras(b);
    
                        startActivity(intent);
                        
                    }
                    else
                        Toast.makeText(this,"wrong, try again",Toast.LENGTH_SHORT).show();
                    
                }
                
            }
            
        }
    
    // End toMain()
    }
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    
// End Class
}
