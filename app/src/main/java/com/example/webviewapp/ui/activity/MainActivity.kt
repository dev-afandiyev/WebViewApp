package com.example.webviewapp.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.webviewapp.util.OneSignalUtil
import com.example.webviewapp.R
import com.example.webviewapp.ui.fragments.FacebookFragment

import com.onesignal.OneSignal

class MainActivity : AppCompatActivity() {

    private var oneSignalModel = OneSignalUtil()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE,
                              OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        OneSignal.setAppId(oneSignalModel.oneSignalId)

    }

}