package com.example.acadgild.vijiassignments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView Violet, Indigo, Blue, Green, Yellow, Orange, Red;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Violet = (TextView)findViewById(R.id.Violet);
        Indigo = (TextView)findViewById(R.id.Indigo);
        Blue = (TextView)findViewById(R.id.Blue);
        Green = (TextView)findViewById(R.id.Green);
        Yellow = (TextView)findViewById(R.id.Yellow);
        Orange = (TextView)findViewById(R.id.Orange);
        Red = (TextView)findViewById(R.id.Red);

        Violet.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          Toast.makeText(MainActivity.this, "Its Violet", Toast.LENGTH_SHORT).show();
                                      }
                                  });


        Orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Its Orange", Toast.LENGTH_SHORT).show();
            }
        });


        Indigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Its Indigo", Toast.LENGTH_SHORT).show();
            }
        });

        Blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Its Blue", Toast.LENGTH_SHORT).show();
            }
        });

        Green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Its Green", Toast.LENGTH_SHORT).show();
            }
        });

        Yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Its Yellow", Toast.LENGTH_SHORT).show();
            }
        });


        Red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Its Red", Toast.LENGTH_SHORT).show();
            }
        });


        };




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
