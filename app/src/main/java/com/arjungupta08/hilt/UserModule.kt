package com.arjungupta08.hilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.FragmentComponent
import javax.inject.Singleton

//@InstallIn(Singleton::class)
//@InstallIn(ActivityComponent::class)
@InstallIn(FragmentComponent::class)
@Module
class UserModule {
    @Provides
    fun providesUserRepo() : UserRepository {
        return FirebaseRepository()
    }
}