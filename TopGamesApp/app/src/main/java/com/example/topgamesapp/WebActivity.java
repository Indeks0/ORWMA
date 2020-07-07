package com.example.topgamesapp;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class WebActivity extends AppCompatActivity {

    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        Intent intent = getIntent();
        int myNum = intent.getIntExtra("Pokusaj", 0);
        webView = (WebView) findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());

        if(myNum == 1) {
            webView.loadUrl("https://www.epicgames.com/fortnite/en-US/home");
        }
         else if(myNum == 2) {
            webView.loadUrl("https://playhearthstone.com/en-us/");
        }
        else if(myNum == 3) {
            webView.loadUrl("https://www.pubg.com/");
        }
        else if(myNum == 4) {
            webView.loadUrl("https://eune.leagueoflegends.com/en-pl/");
        }
        else if(myNum == 5) {
            webView.loadUrl("https://www.nintendo.com/games/detail/splatoon-2-switch/");
        }else{
            webView.loadUrl("https://www.google.com");}

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
    @Override
    public void onBackPressed(){
        if(webView.canGoBack()){
            webView.goBack();
        } else{
             super.onBackPressed();
            }
    }
}
