package com.example.p10_.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "mahasiswa")
data class Mahasiswa(
    @PrimaryKey
    val nim: String, //yang menjadi PK adalah nim karena terletak di bawah @PirmaryKey
    val nama: String,
    val alamat: String,
    val jenisKelamin: String,
    val kelas: String,
    val angkatan: String
)

//note
//apabila ingin menambahkan FK, maka letakan diatas variable yang akan dijadikan FK
