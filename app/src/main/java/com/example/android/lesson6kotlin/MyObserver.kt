package com.example.android.lesson6kotlin

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.OnLifecycleEvent
import java.security.CodeSource

class MyObserver: LifecycleObserver{

    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    fun myFun(source: LifecycleOwner, event: Lifecycle.Event) {
        Log.d("TAG", event.toString())
    }
}