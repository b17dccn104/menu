package com.example.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tv);
        registerForContextMenu(tv);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.mFile:
                Toast.makeText(this,"Selected File",
                        Toast.LENGTH_LONG).show();
                break;
            case R.id.mExit:
                System.exit(0);
                break;
            case R.id.mEmail:
                Toast.makeText(this,"Seelected Email",
                        Toast.LENGTH_LONG).show();
                break;
            case R.id.mPhone:
                Toast.makeText(this,"Selected phone",
                        Toast.LENGTH_LONG).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.mycontextmenu,menu);

    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.mRed:
                tv.setTextColor(Color.RED);
                break;
            case R.id.mGreen:
                tv.setTextColor(Color.GREEN);
                break;
            case R.id.mBlue:
                tv.setTextColor(Color.BLUE);
                break;
        }
        return super.onContextItemSelected(item);
    }
}