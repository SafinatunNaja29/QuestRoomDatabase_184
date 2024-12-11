package com.example.p10_.repository

import com.example.p10_.data.dao.MahasiswaDao
import com.example.p10_.data.entity.Mahasiswa

class LocalRepositoryMhs (
    private val  mahasiswaDao: MahasiswaDao
) : RepositoryMhs {
    override suspend fun insertMhs(mahasiswa: Mahasiswa) {
        mahasiswaDao.insertMahasiswa(mahasiswa)
    }

}