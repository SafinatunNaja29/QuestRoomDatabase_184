package com.example.p10_.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.p10_.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

@Dao
interface MahasiswaDao {

    //fungsi get all Mahasiswa
    @Query("SELECT * FROM mahasiswa ORDER BY nama ASC")
    fun getAllMahasiswa() : Flow<List<Mahasiswa>>

    // get Mahasiswa
    @Query("SELECT * FROM mahasiswa WHERE nim = :nim")  //mengambil data mahasiswa berdasarkan NIM
    fun getMahasiswa(nim: String) : Flow<Mahasiswa>



    @Insert
    suspend fun insertMahasiswa(mahasiswa: Mahasiswa) //mahasiswa diambil dari dataclass Mahasiswa
}