package com.example.amb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class AddPostActivity extends AppCompatActivity {

    EditText  description_blog;
    EditText title_blog;
    Button upload;
    ImageView blog_image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_post);

        title_blog=findViewById(R.id.title_blog);
        description_blog=findViewById(R.id.description_blog);
        upload=findViewById(R.id.upload);
        blog_image=findViewById(R.id.post_image_blog);


    }
}