package com.example.phanminhnhat_22115053122127;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);

        getSupportFragmentManager().beginTransaction().replace(R.id.container, new HomeFragment()).commit();

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener(){
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selecttedFragment = null;

                    switch(item.getItemId()){
                        case R.id.nav_home:
                            selecttedFragment = new HomeFragment();
                            break;
                        case R.id.nav_profile:
                            selecttedFragment = new ProfileFragment();
                            break;
                    }
                    if (selecttedFragment != null){
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, selecttedFragment).commit();
                    }
                    return true;
        }


        });
    }
}