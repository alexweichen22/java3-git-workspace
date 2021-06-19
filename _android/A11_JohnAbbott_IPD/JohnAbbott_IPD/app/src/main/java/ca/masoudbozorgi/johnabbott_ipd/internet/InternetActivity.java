package ca.masoudbozorgi.johnabbott_ipd.internet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import ca.masoudbozorgi.johnabbott_ipd.R;

public class InternetActivity extends AppCompatActivity
        implements View.OnClickListener{

    // Request for permission in manifest
    // <uses-permission android:name="android.permission.INTERNET" />

    WebView webView;
    Button btnLoad;
    String url="https://www.yahoo.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internet);

        initialize();
    }

    private void initialize() {
        btnLoad = findViewById(R.id.btnLoad);
        btnLoad.setOnClickListener(this);

        webView = findViewById(R.id.webView);
    }

    @Override
    public void onClick(View v) {
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);

        //Set webView element as our browser or WebViewClient,
        //so web pages will be display in the same layout instead of a browser
        webView.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if(webView.canGoBack()){
            webView.goBack();
        }else{
            super.onBackPressed();
        }
    }
}