package au.gov.nsw.trident.data.room

import au.gov.nsw.trident.data.IRoomRepository
import au.gov.nsw.trident.data.entity.AdbBookOfWin
import au.gov.nsw.trident.data.entity.UrlBookOfWin
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RoomRepository @Inject constructor(
    private val bookOfWinDao: BookOfWinDao
) : IRoomRepository {

    override suspend fun getUrlBookOfWin(): UrlBookOfWin {
        return bookOfWinDao.getUrlBookOfWin()
    }

    override suspend fun getAdbBookOfWin(): AdbBookOfWin {
        return bookOfWinDao.getAdbBookOfWin()
    }

    override suspend fun putUrlBookOfWin(urlBookOfWin: UrlBookOfWin) {
        bookOfWinDao.putUrlBookOfWin(urlBookOfWin)
    }

    override suspend fun putAdbBookOfWin(adbBookOfWin: AdbBookOfWin) {
        bookOfWinDao.putAdbBookOfWin(adbBookOfWin)
    }
}