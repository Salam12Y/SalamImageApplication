package yassen.salam.salamimageapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class LogInActivity extends AppCompatActivity {
   private TextInputEditText etEmail,etpassword;
   private Button btnLogIn,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        etEmail=findViewById(R.id. etEmail);
        etpassword=findViewById(R.id. etpassword);
        btnLogIn=findViewById(R.id. btnLogIn);
        button2=findViewById(R.id. button2);

    }
}