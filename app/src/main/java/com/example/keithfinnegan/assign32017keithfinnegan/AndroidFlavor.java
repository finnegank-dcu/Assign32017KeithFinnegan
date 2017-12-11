package com.example.keithfinnegan.assign32017keithfinnegan;

/**
 * Created by keithfinnegan on 01/11/2017.
 * Class contains code from
 * @param url https://github.com/udacity/ud839_CustomAdapter_Example
 * Retrieved: 1st November 2017
 * @return returns the android version of product
 */

public class AndroidFlavor {

    // Name of the Android version (e.g. Parfum, Shampoo, Pampers)
    private String mVersionName;

    // Android version number (e.g. 2.3-2.7, 3.0-3.2.6, 4.0-4.0.4)
    private String mVersionNumber;

    // Drawable resource ID
    private int mImageResourceId;

    /*
    * Create a new AndroidFlavor object.
    *
    * @param vName is the name of the Android version (e.g. Gingerbread)
    * @param image is image reference ID that corresponds to the Android version
    * */
    public AndroidFlavor(String vName, String vNumber, int imageResourceId)
    {
        mVersionName = vName;
        mVersionNumber = vNumber;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the name of the Android version
     */
    public String getVersionName() {
        return mVersionName;
    }

    /**
     * Get the Android version number
     */
    public String getVersionNumber() {
        return mVersionNumber;
    }

    /**
     * Get the image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }


}
