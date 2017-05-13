package com.example.slantedtextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);



    /**
     *
     * 也可以用代码来改变位置
     *
     *  SlantedTextView stv = (SlantedTextView) findViewById(R.id.test);

     stv.setText("PHP")
     .setTextColor(Color.WHITE)
     .setSlantedBackgroundColor(Color.BLACK)
     .setTextSize(18)
     .setSlantedLength(50)
     .setMode(SlantedTextView.MODE_LEFT);//在这里改变位置，看drawable的图片
     */

  }
}
