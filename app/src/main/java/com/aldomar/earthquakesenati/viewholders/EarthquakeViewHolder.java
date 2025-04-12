package com.aldomar.earthquakesenati.viewholders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aldomar.earthquakesenati.R;
import com.aldomar.earthquakesenati.databinding.ListItemBinding;
import com.aldomar.earthquakesenati.models.Earthquake;

public class EarthquakeViewHolder extends RecyclerView.ViewHolder {

    private final ListItemBinding binding;

    public EarthquakeViewHolder(ListItemBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind(Earthquake earthquake) {
        binding.textViewMagnitude.setText(String.valueOf(earthquake.getMagnitude()));
        binding.textViewPlace.setText(earthquake.getPlace());
        binding.executePendingBindings();
    }
}
