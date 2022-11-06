package au.gov.nsw.trident.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "adb_book_of_win")
data class AdbBookOfWin(
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "id")
    val id: Int = 0,
    @ColumnInfo(name = "saved_checker")
    val savedChecker: Boolean = false
)