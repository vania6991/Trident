package au.gov.nsw.trident.di

import android.content.Context
import androidx.room.Room
import au.gov.nsw.trident.data.room.BookOfWinDao
import au.gov.nsw.trident.data.room.BookOfWinDb
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppDatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext appContext: Context): BookOfWinDb {
        return Room.databaseBuilder(
            appContext,
            BookOfWinDb::class.java,
            "db_book_of_win.db"
        )
            .createFromAsset("initial.db")
            .build()
    }

    @Provides
    @Singleton
    fun provideBookOfWinDao(db: BookOfWinDb): BookOfWinDao {
        return db.bookOfWinDao()
    }
}

