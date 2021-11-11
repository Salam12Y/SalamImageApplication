package yassen.salam.salamimageapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class SignInActivity extends AppCompatActivity {
    private TextInputEditText etEmail, etPassword,etRepassword,etPhone,etFullName;
    private Button btnSave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        etEmail=findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        etRepassword = findViewById(R.id.etRePassword);
        etPhone=findViewById(R.id.etPhone);
        btnSave=findViewById(R.id. btnSave);
        etFullName=findViewById(R.id.etFullName);


    }
}