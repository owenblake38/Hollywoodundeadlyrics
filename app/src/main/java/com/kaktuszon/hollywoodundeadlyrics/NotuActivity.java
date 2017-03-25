package com.kaktuszon.hollywoodundeadlyrics;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

/**
 * Created by Kaktus on 2017-03-24.
 */

public class NotuActivity extends Activity implements View.OnClickListener {
    Button btnArray[] = new Button[14]; //Create an array of all buttons for the songs
    WebView browser; //A webview to display the right songlyrics

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notu);

        browser = (WebView) findViewById(R.id.wvBrowser); //Define the browser

        String temp; //Temp string for holding information needed for the buttons to go to right URL
        for(int i=0; i<btnArray.length; i++) { //Loop all buttons
            temp = "btn" + i;
            int resID = getResources().getIdentifier(temp, "id", getPackageName()); //Find the right ID for the button
            btnArray[i] = (Button) findViewById(resID); //Define the button
            btnArray[i].setOnClickListener(this); //Make it clickable
        }
    }

    @Override
    public void onClick(View v) {
        String URL; //A string for holding the URL
        for(int i=0; i<btnArray.length; i++) { //Loop all buttons
            if(v == btnArray[i]) { //Check if button is clicked
                URL = "http://www.azlyrics.com/lyrics/hollywoodundead/" + btnArray[i].getText().toString().toLowerCase().replaceAll("\\s", "") + ".html"; //Set URL
                browser.loadUrl(URL); //Load the URL to the browser for displaying
                Log.i("Content", URL); //Debugging to see if the URL is right
            }
        }
    }
}
