package com.thecodemonters.newapp.di

import com.thecodemonters.newapp.provider.NewsProvider
import com.thecodemonters.newapp.repository.NewsRepository
import com.thecodemonters.newapp.repository.NewsRepositoryImp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    @Singleton
    fun providerNewsRepository(provider: NewsProvider): NewsRepository =
        NewsRepositoryImp(provider)
}