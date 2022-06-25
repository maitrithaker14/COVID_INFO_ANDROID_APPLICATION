package com.nopalyer.covidapp

import android.app.Application
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.provider.Telephony
import android.telephony.TelephonyManager
import android.widget.Toast

class CallReceiver:BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if(intent!!.getStringExtra(TelephonyManager.EXTRA_STATE) == TelephonyManager.EXTRA_STATE_OFFHOOK){
            showToastMsg(context!!,"Phone Call is started...")
        }
        else if(intent.getStringExtra(TelephonyManager.EXTRA_STATE)
            == TelephonyManager.EXTRA_STATE_IDLE){
            showToastMsg(context!!,"Phone call is ended...")
        }
        else if(intent.getStringExtra(TelephonyManager.EXTRA_STATE)
            == TelephonyManager.EXTRA_STATE_RINGING) {
            showToastMsg(context!!, "Incoming Call...")
        }
    }
    fun showToastMsg(c:Context,msg:String){
        Toast.makeText(c,msg,Toast.LENGTH_LONG).show()

    }
}