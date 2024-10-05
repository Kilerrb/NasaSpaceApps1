package com.example.nasa;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.core.view.GravityCompat;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private ImageView iconOpenDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawer_layout);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        iconOpenDrawer = findViewById(R.id.icon_open_drawer);

        bottomNavigationView.setSelectedItemId(R.id.navigation_home);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();

                if (itemId == R.id.navigation_home) {
                    return true;
                } else if (itemId == R.id.navigation_risks) {
                    Intent intentRisks = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(intentRisks);
                    overridePendingTransition(0, 0);
                    return true;
                } else if (itemId == R.id.navigation_dashboard) {
                    Intent intentDashboard = new Intent(MainActivity.this, MainActivity3.class);
                    startActivity(intentDashboard);
                    overridePendingTransition(0, 0);
                    return true;
                }
                return false;
            }
        });

        iconOpenDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
                    drawerLayout.closeDrawer(GravityCompat.START);
                } else {
                    drawerLayout.openDrawer(GravityCompat.START);
                }
            }
        });



    }
}
