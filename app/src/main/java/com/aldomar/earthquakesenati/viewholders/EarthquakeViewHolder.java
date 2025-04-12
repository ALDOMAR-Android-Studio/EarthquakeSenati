package com.aldomar.earthquakesenati.viewholders;

import androidx.recyclerview.widget.RecyclerView;

import com.aldomar.earthquakesenati.databinding.ListItemBinding;
import com.aldomar.earthquakesenati.models.Earthquake;

public class EarthquakeViewHolder extends RecyclerView.ViewHolder {

    private final ListItemBinding binding;

    public EarthquakeViewHolder(ListItemBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind(Earthquake earthquake, OnItemClickListener onItemClickListener) {
        binding.textViewMagnitude.setText(String.valueOf(earthquake.getMagnitude()));
        binding.textViewPlace.setText(earthquake.getPlace());
        binding.getRoot().setOnClickListener(v -> {
            onItemClickListener.onItemClick(earthquake);
        });
        binding.executePendingBindings();
    }
}
