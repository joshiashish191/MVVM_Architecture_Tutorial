package com.example.mvvmarchitecturetutorial.model

object RepositoryInstance {
    fun getRepoInstance() : Repository {
        val instance : Repository by lazy {
            Repository()
        }
        return instance
    }
}