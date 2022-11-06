package au.gov.nsw.trident.di

import au.gov.nsw.trident.data.IRoomRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RoomModule {

    @Binds
    abstract fun bindRoomRepository(
        roomRepository: au.gov.nsw.trident.data.room.RoomRepository
    ): IRoomRepository
}