package com.example.miriam.demoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    public void logInClicked(View view){

        EditText userTextField = (EditText) findViewById(R.id.userTextField);

        EditText passTextField = (EditText) findViewById(R.id.passTextField);

        Log.i("Username", userTextField.getText().toString());
        Log.i("Password", passTextField.getText().toString());
        Toast.makeText(MainActivity.this, "Username: "+ userTextField.getText().toString()+" Password: "+passTextField.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    public void sayHi(View view){
        EditText userTextField = (EditText) findViewById(R.id.userTextField);
        Toast.makeText(MainActivity.this, "Hi there, " + userTextField.getText().toString(), Toast.LENGTH_SHORT).show();
    }
    public void newLion(View view) {

        ImageView image = (ImageView) findViewById(R.id.lionImage);
        image.setImageResource(R.drawable.lion1);

        Log.i("Test", "Button clicked");
    }
    public void toSecondActivity(View view) {
        Intent intent=new Intent(getApplicationContext(),SecondActivity.class);
        startActivity(intent);
    }
    public void buttonVideo(View view) {
        Intent intent=new Intent(getApplicationContext(),video.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
