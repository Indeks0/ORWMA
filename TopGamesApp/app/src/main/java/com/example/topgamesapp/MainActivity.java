package com.example.topgamesapp;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView=findViewById(R.id.bottomNav);

        bottomNavigationView.setOnNavigationItemSelectedListener(bottomNavMethod);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new FortniteFragment()).commit();

    }

    private BottomNavigationView.OnNavigationItemSelectedListener bottomNavMethod = new
            BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

            Fragment fragment = null;
            Fragment fragmentFortn = new FortniteFragment();
            Fragment fragmentHeart = new HearthstoneFragment();
            Fragment fragmentLol = new LolFragment();
            Fragment fragmentPubg = new PubgFragment();
            Fragment fragmentSplato = new Splatoon2Fragment();

            switch (menuItem.getItemId())
            {
                case R.id.fortnite:
                    fragment=fragmentFortn;
                    break;

                case R.id.hearthstone:
                    fragment=fragmentHeart;
                    break;

                case R.id.lol:
                    fragment=fragmentLol;
                    break;

                case R.id.pubg:
                    fragment=fragmentPubg;
                    break;

                case R.id.splatoon2:
                    fragment=fragmentSplato;
                    break;

            }

            getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();

            return true;
        }
    };
}
