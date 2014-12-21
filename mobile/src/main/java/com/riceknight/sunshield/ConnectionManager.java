package com.riceknight.sunshield;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;

/**
 * Created by ricelocal on 21/12/2014.
 */
public class ConnectionManager {
    ConnectivityManager cm;
    NetworkInfo activeNetwork, wifiInfo, mobileInfo;

    public Boolean isConnected(Context context) {
        boolean isConnected = false;
        cm = null;
        try {
            cm = (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);
            activeNetwork = cm.getActiveNetworkInfo();
            if (activeNetwork != null) {
                isConnected = activeNetwork.isConnected();
            }
        } catch(Exception e) {
            System.out.println("CheckConnectivity Exception: " + e.getMessage());
        }
        return isConnected;
    }
}
