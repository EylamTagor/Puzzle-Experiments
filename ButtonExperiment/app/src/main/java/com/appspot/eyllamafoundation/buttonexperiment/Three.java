package com.appspot.eyllamafoundation.buttonexperiment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class Three extends Activity {
    TextView hint, notYet;
    EditText answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        hint = findViewById(R.id.hint);
        hint.setVisibility(View.INVISIBLE);

        notYet = findViewById(R.id.notYet);
        notYet.setVisibility(View.INVISIBLE);

        answer =findViewById(R.id.answer);
    }

    public void back(View view) {
        finish();
    }

    public void end(View view) {
        if(answer.getText().toString().equals("THIS-IS-THE-PASSWORD"))
            startActivity(new Intent(Three.this, End.class));
        else
            notYet.setVisibility(View.VISIBLE);
    }

    public void showHint(View view) {
        if(((ToggleButton)view).isChecked())
            hint.setVisibility(View.VISIBLE);
        else
            hint.setVisibility(View.INVISIBLE);
    }

}
