package com.example.p10_.repository

import com.example.p10_.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

interface RepositoryMhs {
    suspend fun insertMhs(mahasiswa: Mahasiswa)
    fun getAllMhs() : Flow<List<Mahasiswa>> //methode untuk memanggil fungsi untuk mendapatkan semua data

    fun getMhs(nim: String) : Flow<Mahasiswa> //mengambil data mahasiswa berdasarkan Nim

    suspend fun deleteMhs(mahasiswa: Mahasiswa) // menghapus data mahasiswa

    suspend fun updateMhs(mahasiswa: Mahasiswa) //memperbarui data mahasiswa di dalam database
}