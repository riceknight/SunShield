package com.riceknight.sunshield;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;

/**
 * Created by riceknight on 21/12/2014.
 * Check device's network connectivity and speed
 * @author email http://stackoverflow.com/user/220710/emil
 */
public class ConnectionDetector {

    /**
     * Get network info
     * @param context
     * @return
     */
    public static NetworkInfo getNetworkInfo(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        return cm.getActiveNetworkInfo();
    }

    /**
     * Check if there is a network connection
     * @param context
     * @return
     */
    public static boolean isConnected(Context context) {
       NetworkInfo info = ConnectionDetector.getNetworkInfo(context);
       return (info != null && info.isConnected());
    }

    /**
     * Check if there is a Wifi network connection
     * @param context
     * @return
     */
    public static boolean isConnectedWifi(Context context) {
        NetworkInfo info = ConnectionDetector.getNetworkInfo(context);
        return (info != null && info.isConnected() && info.getType() == ConnectivityManager.TYPE_WIFI);
    }

    /**
     * Check if there is a Mobile network connection
     * @param context
     * @return
     */

    public static boolean isConnectedMobile(Context context) {
        NetworkInfo info = ConnectionDetector.getNetworkInfo(context);
        return (info != null && info.isConnected() && info.getType() == ConnectivityManager.TYPE_MOBILE);
    }
}
