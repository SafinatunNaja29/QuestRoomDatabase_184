package com.example.p10_

import android.app.Application
import com.example.p10_.dependenciesinjection.ContainerApp

class KrsApp : Application() {
    lateinit var containerApp: ContainerApp //fungsinya untuk menyimpan

    override fun onCreate() {
        super.onCreate()
        containerApp = ContainerApp(this) //membuat instance
        //instance adalah object yang dibuat dari class
    }
}