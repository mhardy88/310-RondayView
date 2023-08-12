package com.example.a310_rondayview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private class ViewHolder {

        Button change_page;

        public ViewHolder() {
            change_page = findViewById(R.id.change_page);
        }
    }

    ViewHolder vh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vh = new ViewHolder();

        vh.change_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent changePageIntent = new Intent(getBaseContext(), CreateEventActivity.class);
                startActivity(changePageIntent);
            }
        });
    }


}