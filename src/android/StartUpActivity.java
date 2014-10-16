package com.asxtecnologia.startup;

import android.os.Bundle;
import android.text.method.MovementMethod;

import org.apache.cordova.*;
public class StartUpActivity extends CordovaActivity 
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        moveTaskToBack(true); 
        //setTheme(android.R.style.Theme_NoDisplay);
        super.init();
        // Set by <content src="index.html" /> in config.xml
        super.loadUrl(Config.getStartUrl());       
        //moveTaskToBack(true); 
       
        //super.loadUrl("file:///android_asset/www/index.html");
    }
}


