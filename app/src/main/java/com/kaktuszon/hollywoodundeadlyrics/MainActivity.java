package com.kaktuszon.hollywoodundeadlyrics;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSs = (Button) findViewById(R.id.btnSs);
        btnSs.setOnClickListener(this);
        Button btnAt = (Button) findViewById(R.id.btnAt);
        btnAt.setOnClickListener(this);
        Button btnNftu = (Button) findViewById(R.id.btnNftu);
        btnNftu.setOnClickListener(this);
        Button btnDotd = (Button) findViewById(R.id.btnDotd);
        btnDotd.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.btnSs:
                intent = new Intent(MainActivity.this, SwanSongsActivity.class);
                startActivity(intent );
                break;

            case R.id.btnAt:
                intent  = new Intent(MainActivity.this, AmericanTragedyActivity.class);
                startActivity(intent);
                break;

            case R.id.btnNftu:
                intent = new Intent(MainActivity.this, NotuActivity.class);
                startActivity(intent);
                break;

            case R.id.btnDotd:
                intent = new Intent(MainActivity.this, DotdActivity.class);
                startActivity(intent);
                break;

            default:
                break;
        }
    }
}
