package com.example.mvvmarchitecturetutorial.model

class Repository {
    fun getStudentData(rollno: Int): Student {
        when (rollno) {
            1 -> {
                return student1
            }
            2 -> {
                return student2
            }
            3 -> {
                return student3
            }
            4 -> {
                return student4
            }
            5 -> {
                return student5
            }
        }
        return student1
    }

    private val student1 = Student(
        "John Doe",
        1,
        5,
        "Preparatory School",
        "New York"
    )

    private val student2 = Student(
        "Will Brown",
        2,
        8,
        "Mentoring the Future",
        "Houston"
    )

    private val student3 = Student(
        "Miles Thomas",
        3,
        6,
        "School of Happy Valley",
        "San Antonio"
    )

    private val student4 = Student(
        "Brian Taylor",
        4,
        7,
        "HighImpact Institute",
        "Philadelphia"
    )

    private val student5 = Student(
        "Dan Evans",
        5,
        5,
        "Wisdom Elementary School",
        "San Diego"
    )
}