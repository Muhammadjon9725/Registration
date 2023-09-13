package com.example.registration.Models

class MyModels {
    var id:Int? = 0
    var imageUri:String? = null
    var name:String? = null
    var number:String? = null
    var country:String? = null
    var adress:String? = null
    var password:String? = null

    constructor(
        id: Int?,
        imageUri: String?,
        name: String?,
        number: String?,
        country: String?,
        adress: String?,
        password: String?
    ) {
        this.id = id
        this.imageUri = imageUri
        this.name = name
        this.number = number
        this.country = country
        this.adress = adress
        this.password = password
    }

    constructor(
        imageUri: String?,
        name: String?,
        number: String?,
        country: String?,
        adress: String?,
        password: String?
    ) {
        this.imageUri = imageUri
        this.name = name
        this.number = number
        this.country = country
        this.adress = adress
        this.password = password
    }

    constructor(
        name: String?,
        number: String?,
        country: String?,
        adress: String?,
        password: String?
    ) {
        this.name = name
        this.number = number
        this.country = country
        this.adress = adress
        this.password = password
    }

}