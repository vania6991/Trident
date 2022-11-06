package au.gov.nsw.trident.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "url_book_of_win")
data class UrlBookOfWin(
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "id")
    val id: Int = 0,
    @ColumnInfo(name = "url")
    val url: String = "",
    @ColumnInfo(name = "saved_checker")
    val savedChecker: Boolean = false
)

