package com.asxtecnologia.startup;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class StartService extends Service{	
	
	  /** Called when the activity is first created. */
    @Override
    public void onCreate() {
        super.onCreate();
        //Log.d("TAG", "Service created.");
        Toast.makeText(getApplicationContext(), "Service has ben started.",
		        Toast.LENGTH_LONG).show();
      
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        //Log.d("TAG", "Service started.");
        int start = super.onStartCommand(intent, flags, startId);
        
        
        
        //intent.addFlags(Intent.FLAG_FROM_BACKGROUND);
        
        Toast.makeText(getApplicationContext(), "Service has ben started.",
		        Toast.LENGTH_LONG).show();
        
       
        return start;
    }

    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
        Toast.makeText(getApplicationContext(), "Service has ben started.",
		        Toast.LENGTH_LONG).show();
      
        //Log.d("TAG", "Service started.");
    }
    @Override
    public IBinder onBind(Intent arg0) {
        return null;
    }
}