package com.appspot.eyllamafoundation.buttonexperiment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

public class Two extends Activity {
    TextView hint, notYet;
    ToggleButton up, down, left, right;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        hint = findViewById(R.id.hint);
        notYet = findViewById(R.id.notYet);

        up = findViewById(R.id.up);
        down = findViewById(R.id.down);
        left = findViewById(R.id.left);
        right = findViewById(R.id.right);

        hint.setVisibility(View.INVISIBLE);
        notYet.setVisibility(View.INVISIBLE);
    }

    public void back(View view) {
        finish();
    }

    public void go3(View view) {
        if(isOn(up) && isOn(left) && isOn(down) && !isOn(right))
            startActivity(new Intent(Two.this, Three.class));
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
