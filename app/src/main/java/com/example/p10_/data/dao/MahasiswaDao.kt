package com.example.p10_.data.dao

import androidx.room.Dao
import androidx.room.Insert
import com.example.p10_.data.entity.Mahasiswa

@Dao
interface MahasiswaDao {
    @Insert
    suspend fun insertMahasiswa(mahasiswa: Mahasiswa) //mahasiswa diambil dari dataclass Mahasiswa
}