package org.aquaquente.aguaquentecontroller;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class MainActivity extends Activity {

    boolean    status = false;
    double teampertur =0.0;
    double volume = 0.0;
    String token="";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View button = findViewById(R.id.radioButton);
        Log.i("AGUA", "OILA");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "OLA MUNDO", Toast.LENGTH_LONG).show();
            }
        });
        button.performClick();
    }
}
