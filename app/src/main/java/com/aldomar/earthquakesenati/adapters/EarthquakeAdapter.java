package com.aldomar.earthquakesenati.adapters;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

import com.aldomar.earthquakesenati.models.Earthquake;
import com.aldomar.earthquakesenati.viewholders.EarthquakeViewHolder;

public class EarthquakeAdapter extends ListAdapter<Earthquake, EarthquakeViewHolder> {


    protected EarthquakeAdapter(@NonNull DiffUtil.ItemCallback<Earthquake> diffCallback) {
        super(diffCallback);
    }

    protected EarthquakeAdapter(@NonNull AsyncDifferConfig<Earthquake> config) {
        super(config);
    }

    @NonNull
    @Override
    public EarthquakeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull EarthquakeViewHolder holder, int position) {

    }
}
