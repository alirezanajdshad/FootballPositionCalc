package iri.alirezanajd28.overallcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    TextView textView;
    protected ArrayList<Integer> attributes;
    EditText pace, shoot, passing, dribbling, defence, physical, diving, handling, kicking, reflections, speed, positioning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.resultTest);
        attributes = new ArrayList<>(12);
        pace = (EditText) findViewById(R.id.pace);
        shoot = (EditText) findViewById(R.id.shoot);
        passing = (EditText) findViewById(R.id.pass);
        dribbling = (EditText) findViewById(R.id.dribble);
        defence = (EditText) findViewById(R.id.defence);
        physical = (EditText) findViewById(R.id.physical);
        diving = (EditText) findViewById(R.id.diving);
        handling = (EditText) findViewById(R.id.handling);
        kicking = (EditText) findViewById(R.id.kicking);
        reflections = (EditText) findViewById(R.id.reflections);
        speed = (EditText) findViewById(R.id.speed);
        positioning = (EditText) findViewById(R.id.positioning);
        intent = new Intent(this, result.class);
    }

    public void calculate(View view) {
        try {
            attributes.add(Integer.parseInt(pace.getText().toString()));
            attributes.add(Integer.parseInt(shoot.getText().toString()));
            attributes.add(Integer.parseInt(passing.getText().toString()));
            attributes.add(Integer.parseInt(dribbling.getText().toString()));
            attributes.add(Integer.parseInt(defence.getText().toString()));
            attributes.add(Integer.parseInt(physical.getText().toString()));
            attributes.add(Integer.parseInt(diving.getText().toString()));
            attributes.add(Integer.parseInt(handling.getText().toString()));
            attributes.add(Integer.parseInt(kicking.getText().toString()));
            attributes.add(Integer.parseInt(reflections.getText().toString()));
            attributes.add(Integer.parseInt(speed.getText().toString()));
            attributes.add(Integer.parseInt(positioning.getText().toString()));


            intent.putExtra("pace", attributes.get(0));
            intent.putExtra("shooting", attributes.get(1));
            intent.putExtra("passing", attributes.get(2));
            intent.putExtra("dribbling", attributes.get(3));
            intent.putExtra("defence", attributes.get(4));
            intent.putExtra("physical", attributes.get(5));
            intent.putExtra("diving", attributes.get(6));
            intent.putExtra("handling", attributes.get(7));
            intent.putExtra("kicking", attributes.get(8));
            intent.putExtra("reflections", attributes.get(9));
            intent.putExtra("speed", attributes.get(10));
            intent.putExtra("positioning", attributes.get(11));

            startActivity(intent);
        }catch (Exception nul){
            textView.setText("Please fill All the forms");
        }
        }
    }