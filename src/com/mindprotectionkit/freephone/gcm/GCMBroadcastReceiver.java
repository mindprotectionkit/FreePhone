package com.mindprotectionkit.freephone.gcm;

import android.content.Context;

public class GCMBroadcastReceiver extends com.google.android.gcm.GCMBroadcastReceiver {

  @Override
  protected String getGCMIntentServiceClassName(Context context) {
    return "com.mindprotectionkit.freephone.gcm.GCMIntentService";
  }

}
