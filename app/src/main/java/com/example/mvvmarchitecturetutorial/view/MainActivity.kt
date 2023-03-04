package com.example.mvvmarchitecturetutorial.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmarchitecturetutorial.R
import com.example.mvvmarchitecturetutorial.databinding.ActivityMainBinding
import com.example.mvvmarchitecturetutorial.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Initializing viewmodel instance
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        //initializing data binding instance
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        //if student variable in viewmodel is not null, assign it to binding instance of student
        if (viewModel.student != null){
            binding.student = viewModel.student
        }
        binding.searchBtn.setOnClickListener {
            if (binding.editTextRollNo.text.toString().isBlank()){
                Toast.makeText(this, "Please Enter Roll No.", Toast.LENGTH_SHORT).show()
            } else {
                viewModel.getStudentData(binding.editTextRollNo.text.toString().toInt())
                binding.student = viewModel.student
            }
        }
    }
}