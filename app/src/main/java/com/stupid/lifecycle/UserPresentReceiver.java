package com.stupid.lifecycle;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by vincent on 16/5/5.
 */
public class UserPresentReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("vincent", String.format("+++ %s onReceive", this.getClass().getSimpleName()));
    }

}
