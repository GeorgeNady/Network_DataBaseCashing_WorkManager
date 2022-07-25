package com.example.android.devbyteviewer.database

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface VideoDao {

    @Query("SELECT * FROM video_table")
    fun getAllVideos() : LiveData<List<DatabaseVideo>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun upsertVideo(vararg videos: DatabaseVideo)

}