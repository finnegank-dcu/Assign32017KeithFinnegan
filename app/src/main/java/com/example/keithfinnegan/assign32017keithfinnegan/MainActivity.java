package com.example.keithfinnegan.assign32017keithfinnegan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);}

    /**
     * @return Creates and intent to launch Chemist List activity.
     * @param view TextView open list for the Chemist List onClick.
     */

    public void openList(View view)
    {
        Intent myIntent = new Intent(this, ChemistListActivity.class);
        startActivity(myIntent);}

    /**
     * @return Creates and intent to launch Order Prescription linked to the spinner activity.
     * @param view TextView open list for the openSpinner onClick.
     */


    public void openSpinner(View view)
    {
        Intent myIntent = new Intent(this, SpinnerActivity.class);
        startActivity(myIntent);}

}
