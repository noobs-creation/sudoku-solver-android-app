package com.noobscreation.sudokusolverv1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseActivity extends AppCompatActivity {

    Button upload_image, enter_manually;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);

        upload_image = findViewById(R.id.button_image_upload);
        enter_manually = findViewById(R.id.button_enter_manually);

        upload_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChooseActivity.this, MainActivity.class));

            }
        });

        enter_manually.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChooseActivity.this, ManualActivity.class));

            }
        });
    }
}