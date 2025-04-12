package com.aldomar.earthquakesenati.apis;

import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class EarthquateApiClient {


    private static final EarthquateApiClient instanceApiClient = new EarthquateApiClient();

    private final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary")
            .addConverterFactory(ScalarsConverterFactory.create())
            .build();

    EarthquakeSevice earthquakeSevice;

    public EarthquateApiClient() {
    }

    public static EarthquateApiClient getInstance() {
        return instanceApiClient;
    }

    public EarthquakeSevice getService() {
        return earthquakeSevice == null ? retrofit.create(EarthquakeSevice.class) : earthquakeSevice;
    }
}
