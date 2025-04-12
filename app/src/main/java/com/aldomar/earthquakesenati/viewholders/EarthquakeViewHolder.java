package com.aldomar.earthquakesenati.viewholders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aldomar.earthquakesenati.R;
import com.aldomar.earthquakesenati.models.Earthquake;

public class EarthquakeViewHolder extends RecyclerView.ViewHolder {

    private TextView magnitudeTextView;
    private TextView placeTextView;

    public EarthquakeViewHolder(@NonNull View itemView) {
        super(itemView);
        this.magnitudeTextView = itemView.findViewById(R.id.textViewMagnitude);
        this.placeTextView = itemView.findViewById(R.id.textViewPlace);
    }

    public void bind(Earthquake earthquake) {
        magnitudeTextView.setText(String.valueOf(earthquake.getMagnitude()));
        placeTextView.setText(earthquake.getPlace());
    }
}
