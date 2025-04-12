package com.aldomar.earthquakesenati.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

import com.aldomar.earthquakesenati.R;
import com.aldomar.earthquakesenati.databinding.ListItemBinding;
import com.aldomar.earthquakesenati.models.Earthquake;
import com.aldomar.earthquakesenati.viewholders.EarthquakeViewHolder;

public class EarthquakeAdapter extends ListAdapter<Earthquake, EarthquakeViewHolder> {


    public static final DiffUtil.ItemCallback<Earthquake> DIFF_CALLBACK = new DiffUtil.ItemCallback<Earthquake>() {
        @Override
        public boolean areItemsTheSame(@NonNull Earthquake oldItem, @NonNull Earthquake newItem) {
            return oldItem.getId().equals(newItem.getId());
        }

        @Override
        public boolean areContentsTheSame(@NonNull Earthquake oldItem, @NonNull Earthquake newItem) {
            return oldItem.equals(newItem);
        }
    };

    public EarthquakeAdapter() {
        super(DIFF_CALLBACK);
    }

    @NonNull
    @Override
    public EarthquakeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ListItemBinding binding = ListItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new EarthquakeViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull EarthquakeViewHolder holder, int position) {
        Earthquake earthquake = getItem(position);
        holder.bind(earthquake);

    }
}
