package com.appspot.eyllamafoundation.buttonexperiment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

public class One extends Activity {
    TextView hint, notYet;
    ToggleButton b1, b2, b3 ,b4, b5, b6, b7, b8, b9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.down);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);

        hint = findViewById(R.id.hint);
        hint.setVisibility(View.INVISIBLE);

        notYet = findViewById(R.id.notYet);
        notYet.setVisibility(View.INVISIBLE);
    }

    public void back(View view) {
        finish();
    }

    public void go2(View view) {
        if(isOn(b1) && isOn(b2) && !isOn(b3) && !isOn(b4) && isOn(b5) && !isOn(b6) && isOn(b7) && isOn(b8) && isOn(b9))
            startActivity(new Intent(One.this, Two.class));
        else
            notYet.setVisibility(View.VISIBLE);
    }

    public boolean isOn(View view) {
        return ((ToggleButton)view).isChecked();
    }

    public void showHint(View view) {
        if(((ToggleButton)view).isChecked())
            hint.setVisibility(View.VISIBLE);
        else
            hint.setVisibility(View.INVISIBLE);
    }

}
