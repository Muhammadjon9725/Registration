package com.example.registration.db

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.registration.Models.MyModels

class MyDBHelper(context: Context):SQLiteOpenHelper(context,DB_NAME,null, VERSION),MyDBInterface{
    lateinit var myModels:MyModels
    companion object{

        const val DB_NAME = "my_images_db"
        const val TABLE_NAME = "register_table"
        const val VERSION = 1
        const val ID = "id"
        const val NAME = "name"
        const val IMAGE = "imageUri"
        const val NUMBER = "number"
        const val ADRESS = "address"
        const val PASSWORD = "password"
        const val COUNTRY = "country"
        
    }

    override fun onCreate(db: SQLiteDatabase?) {
        var query =
            "create table $TABLE_NAME($ID integer not null primary key autoincrement unique,$IMAGE text not null, $NAME text not null , $COUNTRY text not null, $ADRESS text not null, $NUMBER text not null, $PASSWORD text not null  )"
        db?.execSQL(query)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

    }

    override fun addRecyAll(myModels: MyModels) {
        val database = writableDatabase
        val contentValues = ContentValues()
        contentValues.put(NAME,myModels.name)
        contentValues.put(NUMBER,myModels.number)
        contentValues.put(COUNTRY,myModels.country)
        contentValues.put(ADRESS,myModels.adress)
        contentValues.put(PASSWORD,myModels.password)
        database.insert(TABLE_NAME,null,contentValues)
        database.close()
    }

    override fun getAllRecy(): ArrayList<MyModels> {
        val list = ArrayList<MyModels>()
        val database = readableDatabase
        val cursor = database.rawQuery("select * from $TABLE_NAME",null)

        if (cursor.moveToFirst()){
            do {
                list.add(MyModels(cursor.getInt(1),
                    cursor.getString(2),
                    cursor.getString(3),
                    cursor.getString(4),
                    cursor.getString(5),
                    cursor.getString(6),
                    cursor.getString(7))
                )
            }while (cursor.moveToNext())
        }
        return list
    }
}