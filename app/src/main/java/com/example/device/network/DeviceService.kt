package com.example.device.network

import com.example.device.data.Constants
import com.example.device.data.Device
import retrofit2.http.GET

interface DeviceService {

    //List of all objects
    @GET(Constants.OBJECTS_PATH) //Tipo de metodo para consumir el servicio WEB
    suspend fun getAllDevices(): List<Device>
}