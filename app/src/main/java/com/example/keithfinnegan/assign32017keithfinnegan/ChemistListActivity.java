package com.example.keithfinnegan.assign32017keithfinnegan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by keithfinnegan on 01/11/2017.
 * Class contains code from
 * @param URL:https://github.com/udacity/ud839_CustomAdapter_Example
 * Retrieved: 1st November 2017
 * @return chemistListActivity
 */

/**
 * Images taken from
 * @parm url https://motherandbaby.blob.core.windows.net/web/1/root/nappies-silver-pampers.jpg
 * @parm url https://cdn.thewirecutter.com/wp-content/uploads/2017/08/06razors.jpg
 * @parm url https://www.ocado.com/productImages/171/17144011_0_640x640.jpg?identifier=212417a43433d63b088f2007f0943c08
 * @parm url https://images-na.ssl-images-amazon.com/images/G/02/aplusautomation/vendorimages/ddf2157d-6fc5-4767-9f8c-f9ee829f0a70.jpg._CB269228686_.jpg
 * @parm url https://www.amara.com/static/uploads/images-0/products/1000/scented-glass-candle-in-gift-box-mim.jpg
 * @parm url https://i.pinimg.com/originals/71/3e/a5/713ea5bf9ac8868d3e31472cb375737c.jpg
 * @parm url http://www.donegaldaily.com/wp-content/uploads/2015/11/pharmacy-sign-300x226.gif
 * Retrieved on the 4th November 2017
 *
 */


/**
 * {@link MainActivity} shows a list of Android platform releases.
 * For each release, display the name, version number, and image.
 */
public class ChemistListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chemist_list);

        // Create an ArrayList of AndroidFlavor objects
        ArrayList<AndroidFlavor> androidFlavors = new ArrayList<AndroidFlavor>();
        androidFlavors.add(new AndroidFlavor("parfum", "", R.drawable.parfum));
        androidFlavors.add(new AndroidFlavor("shampoo", "", R.drawable.shampoo));
        androidFlavors.add(new AndroidFlavor("panadol", "", R.drawable.panadol));
        androidFlavors.add(new AndroidFlavor("Vitamins", "", R.drawable.vitamins));
        androidFlavors.add(new AndroidFlavor("Teeth Whitening", "", R.drawable.teethwhitening));
        androidFlavors.add(new AndroidFlavor("Scented Candles", "", R.drawable.scentedcandles));
        androidFlavors.add(new AndroidFlavor("Razors", "", R.drawable.razors));
        androidFlavors.add(new AndroidFlavor("parfum","",R.drawable.parfum));
        androidFlavors.add(new AndroidFlavor("Seven Seas", "", R.drawable.vitamins));
        androidFlavors.add(new AndroidFlavor("Panadol", "", R.drawable.panadolextra));

        // Create an {@link AndroidFlavorAdapter}, whose data source is a list of
        // {@link AndroidFlavor}s. The adapter knows how to create list item views for each item
        // in the list.
        AndroidFlavorAdapter flavorAdapter = new AndroidFlavorAdapter(this, androidFlavors);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listview_flavor);
        listView.setAdapter(flavorAdapter);
    }


}



