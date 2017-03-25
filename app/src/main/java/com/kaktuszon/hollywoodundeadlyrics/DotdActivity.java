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

public class DotdActivity extends Activity implements View.OnClickListener {
    Button btnArray[] = new Button[15];
    WebView browser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dotd);

        browser = (WebView) findViewById(R.id.wvBrowser);

        String temp;
        for(int i=0; i<btnArray.length; i++) {
            temp = "btn" + i;
            int resID = getResources().getIdentifier(temp, "id", getPackageName());
            btnArray[i] = (Button) findViewById(resID);
            btnArray[i].setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        String URL;
        for(int i=0; i<btnArray.length; i++) {
            if(v == btnArray[i]) {
                URL = "http://www.azlyrics.com/lyrics/hollywoodundead/" + btnArray[i].getText().toString().toLowerCase().replaceAll("\\s", "") + ".html";
                browser.loadUrl(URL);
                Log.i("Content", URL);
            }
        }
    }
}
