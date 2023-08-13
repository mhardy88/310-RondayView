package com.example.a310_rondayview;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.CursorJoiner;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class CreateEventActivity extends AppCompatActivity {

    ActivityResultLauncher<String> selectPhoto;

    private class ViewHolder {
        Button choose_image_btn;
        ImageView event_image_img;

        public ViewHolder() {
            choose_image_btn = findViewById(R.id.choose_image_btn);
            event_image_img = findViewById(R.id.event_image_img);
        }
    }

    ViewHolder vh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_event);

        vh = new ViewHolder();

        selectPhoto = registerForActivityResult(
                new ActivityResultContracts.GetContent(),
                new ActivityResultCallback<Uri>() {
                    @Override
                    public void onActivityResult(Uri result) {
                        vh.event_image_img.setImageURI(result);
                    }
                }
        );

        //select image onClickListener set up this way instead of StartActivityForResult as the method
        //has been deprecated
        vh.choose_image_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectPhoto.launch("image/*");
            }
        });
    }

}