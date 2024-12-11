package com.example.p10_.dependenciesinjection

import android.content.Context
import com.example.p10_.data.database.KrsDatabase
import com.example.p10_.repository.LocalRepositoryMhs
import com.example.p10_.repository.RepositoryMhs

interface InterfaceContainerApp {
    val repositoryMhs: RepositoryMhs
}

class ContainerApp(private val context: Context) : InterfaceContainerApp {
    override val repositoryMhs : RepositoryMhs by lazy {
        LocalRepositoryMhs(KrsDatabase.getDatabase(context).mahasiswaDao())
    }
}