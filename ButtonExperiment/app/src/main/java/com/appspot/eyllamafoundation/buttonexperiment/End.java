package com.appspot.eyllamafoundation.buttonexperiment;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class End extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
    }

    public void back(View view) {
        finish();
    }

}
