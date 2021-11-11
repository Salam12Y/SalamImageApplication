package yassen.salam.salamimageapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.os.Bundle;
import android.widget.ImageButton;

public class MainActivity2 extends AppCompatActivity {
    private SearchView SrchVSearch;
    private ImageButton imgbtn,imgBtn6,imageBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        SrchVSearch=findViewById(R.id.SrchVSearch);
        imgbtn=findViewById(R.id. imgbtn);
        imgBtn6=findViewById(R.id.imgBtn6);
        imageBtn=findViewById(R.id.imageBtn);


    }
}