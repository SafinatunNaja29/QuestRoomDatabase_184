package com.example.p10_.repository

import com.example.p10_.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

interface RepositoryMhs {
    suspend fun insertMhs(mahasiswa: Mahasiswa)
    fun getAllMhs() : Flow<List<Mahasiswa>> //methode untuk memanggil fungsi untuk mendapatkan semua data

}