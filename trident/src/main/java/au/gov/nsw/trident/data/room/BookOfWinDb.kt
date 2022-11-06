package au.gov.nsw.trident.data.room

import androidx.room.Database
import androidx.room.RoomDatabase
import au.gov.nsw.trident.data.entity.AdbBookOfWin
import au.gov.nsw.trident.data.entity.UrlBookOfWin

@Database(
    version = 1,
    entities = [
        UrlBookOfWin::class,
        AdbBookOfWin::class
    ]
)
abstract class BookOfWinDb : RoomDatabase() {
    abstract fun bookOfWinDao(): BookOfWinDao
}