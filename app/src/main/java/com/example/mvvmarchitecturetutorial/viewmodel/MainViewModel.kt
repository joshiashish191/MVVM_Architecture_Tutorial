package com.example.mvvmarchitecturetutorial.viewmodel

import androidx.lifecycle.ViewModel
import com.example.mvvmarchitecturetutorial.model.RepositoryInstance
import com.example.mvvmarchitecturetutorial.model.Student

class MainViewModel : ViewModel() {
    var student : Student? = null

    //Creating repository instance
    val repository = RepositoryInstance.getRepoInstance()

    //function to get student data from repository
    fun getStudentData(rollno : Int) {
        student = repository.getStudentData(rollno)
    }
}