package com.manuelduarte077.newsapp.di

import com.manuelduarte077.newsapp.provider.NewsProvider
import com.manuelduarte077.newsapp.repository.NewsRepository
import com.manuelduarte077.newsapp.repository.NewsRepositoryImp
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








