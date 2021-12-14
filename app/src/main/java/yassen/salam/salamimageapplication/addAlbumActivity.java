package yassen.salam.salamimageapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class addAlbumActivity extends AppCompatActivity {
      private TextView tvAlbum;
      private TextInputEditText etName;
      private Button btnSave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_album);
        tvAlbum=findViewById(R.id. tvAlbum);
        etName=findViewById(R.id. etName);
        btnSave=findViewById(R.id. btnSave);
    }
}