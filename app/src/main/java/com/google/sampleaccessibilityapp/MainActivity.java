package com.google.sampleaccessibilityapp;

import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.verticalRV);
        recyclerView.setAdapter(new MainAdapter());
        BottomNavigationView bottomNavigationView = findViewById(R.id.navigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(menuItem -> {
            switch (menuItem.getItemId()) {
                case R.id.action1:
                    Toast.makeText(this, "tab 1", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.action2:
                    Toast.makeText(this, "tab 2", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.action3:
                    Toast.makeText(this, "tab 3", Toast.LENGTH_SHORT).show();
                    break;
            }
            return true;
        });
    }
}
