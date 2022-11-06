package au.gov.nsw.trident.data.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import au.gov.nsw.trident.data.entity.AdbBookOfWin
import au.gov.nsw.trident.data.entity.UrlBookOfWin

@Dao
interface BookOfWinDao {

    @Query("SELECT * FROM url_book_of_win LIMIT 1")
    suspend fun getUrlBookOfWin(): UrlBookOfWin

    @Query("SELECT * FROM adb_book_of_win LIMIT 1")
    suspend fun getAdbBookOfWin(): AdbBookOfWin

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun putUrlBookOfWin(urlBookOfWin: UrlBookOfWin)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun putAdbBookOfWin(adbBookOfWin: AdbBookOfWin)
}