package com.asxtecnologia.startup;
 
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.view.Gravity;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.widget.Toast;

public class StartOnBoot extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
    	 Toast.makeText(context, "Help.Me has ben started.",
    		        Toast.LENGTH_LONG).show();
    		    // Vibrate the mobile phone
    		    //Vibrator vibrator = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
    		    //vibrator.vibrate(2000);
    		    
             intent = new Intent(context, com.asxtecnologia.helpme.HelpMe.class);
            //serviceIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent);
                }
}