package au.gov.nsw.trident.data

import au.gov.nsw.trident.data.entity.AdbBookOfWin
import au.gov.nsw.trident.data.entity.UrlBookOfWin

interface IRoomRepository {

    suspend fun getUrlBookOfWin(): UrlBookOfWin

    suspend fun getAdbBookOfWin(): AdbBookOfWin

    suspend fun putUrlBookOfWin(urlBookOfWin: UrlBookOfWin)

    suspend fun putAdbBookOfWin(adbBookOfWin: AdbBookOfWin)
}