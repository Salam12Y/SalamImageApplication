package yassen.salam.salamimageapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.os.Bundle;

public class SearchFileActivity extends AppCompatActivity {
    private SearchView searchVie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_file);
        searchVie=findViewById(R.id.searchVie);
    }

}