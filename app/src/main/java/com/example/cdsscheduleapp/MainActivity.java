package com.example.cdsscheduleapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.example.cdsscheduleapp.fragment1todo.Fragment1ToDo;
import com.example.cdsscheduleapp.fragment4memo.Fragment4Memo;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements FragmentCallback, BottomNavigationView.OnNavigationItemSelectedListener {
    Fragment1ToDo fragment1;
    Fragment4Memo fragment4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment1 = new Fragment1ToDo();
        fragment4 = new Fragment4Memo();

        getSupportFragmentManager().beginTransaction().add(R.id.container, fragment1).commit();
        // 추후 설정에서 앱 시작시 프래그먼트 변경하는 기능 추가 고려

        BottomNavigationView bottomNavigationView = findViewById(R.id.navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.tab1:
                onFragementSelected(0, null);
                return true;
            case R.id.tab2:
                onFragementSelected(1, null);
                return true;
            case R.id.tab3:
                onFragementSelected(2, null);
                return true;
            case R.id.tab4:
                onFragementSelected(3, null);
                return true;
            case R.id.tab5:
                onFragementSelected(4, null);
                return true;
        }

        return false;
    }

    @Override
    public void onFragementSelected(int position, Bundle bundle) {
        Fragment curFragment = null;

        switch (position) {
            case 0:
                curFragment = fragment1;
                getSupportFragmentManager().beginTransaction().replace(R.id.container, curFragment).commit();
                break;
            case 1:
                Log.d("test", "test1");
                // getSupportFragmentManager().beginTransaction().replace(R.id.container, curFragment).commit();
                break;
            case 2:
                Log.d("test", "test2");
                // getSupportFragmentManager().beginTransaction().replace(R.id.container, curFragment).commit();
                break;
            case 3:
                curFragment = fragment4;
                getSupportFragmentManager().beginTransaction().replace(R.id.container, curFragment).commit();
                break;
            case 4:
                Log.d("test", "test4");
                // getSupportFragmentManager().beginTransaction().replace(R.id.container, curFragment).commit();

        }


    }


}
