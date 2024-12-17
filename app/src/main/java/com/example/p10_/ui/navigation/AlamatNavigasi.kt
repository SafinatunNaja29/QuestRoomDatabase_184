package com.example.p10_.ui.navigation

interface AlamatNavigasi {
    val route: String
}

object DestinasiInsert : AlamatNavigasi{
    override val route: String = "insert_mhs"
}

object DestinasiHome : AlamatNavigasi{
    override val route = "home"
}
