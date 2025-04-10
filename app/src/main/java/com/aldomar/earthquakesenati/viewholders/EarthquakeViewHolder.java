package com.aldomar.earthquakesenati.viewholders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aldomar.earthquakesenati.models.Earthquake;

public class EarthquakeViewHolder extends RecyclerView.ViewHolder {

    private TextView magnitudeTextView;
    private TextView placeTextView;

    public EarthquakeViewHolder(@NonNull View itemView, TextView magnitudeTextView, TextView placeTextView) {
        super(itemView);
        this.magnitudeTextView = magnitudeTextView;
        this.placeTextView = placeTextView;
    }

    public void bind(Earthquake earthquake) {
        magnitudeTextView.setText(String.valueOf(earthquake.getMagnitude()));
        placeTextView.setText(earthquake.getPlace());
    }
}
