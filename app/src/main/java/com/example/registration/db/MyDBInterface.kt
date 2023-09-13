package com.example.registration.db

import com.example.registration.Models.MyModels

interface MyDBInterface {
    fun addRecyAll(myModels: MyModels)
    fun getAllRecy():ArrayList<MyModels>
}