package com.aldomar.earthquakesenati.apis;

import retrofit2.Call;
import retrofit2.http.GET;

public interface EarthquakeSevice {

    @GET("/all_hour.geojson")
    Call<String> getEarthquakes();

}
