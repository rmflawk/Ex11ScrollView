package com.youngstudio.ex11scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickbtn(View view) {

        ScrollView sv= findViewById(R.id.sv);
        sv.fullScroll(ScrollView.FOCUS_DOWN);

    }
}
