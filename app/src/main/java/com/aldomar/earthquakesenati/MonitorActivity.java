package com.aldomar.earthquakesenati;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.aldomar.earthquakesenati.adapters.EarthquakeAdapter;
import com.aldomar.earthquakesenati.databinding.ActivityMonitorBinding;
import com.aldomar.earthquakesenati.models.Earthquake;

import java.util.ArrayList;
import java.util.List;

public class MonitorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        ActivityMonitorBinding binding = ActivityMonitorBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Earthquake> earthquakes = new ArrayList<>();
        earthquakes.add(new Earthquake("1", "California", 4.5, 1633036800000L, 34.0522, -118.2437));
        earthquakes.add(new Earthquake("2", "Nevada", 3.8, 1633123200000L, 38.8026, -116.4194));
        earthquakes.add(new Earthquake("3", "Alaska", 5.0, 1633209600000L, 61.3707, -152.4044));
        earthquakes.add(new Earthquake("4", "Hawaii", 4.2, 1633296000000L, 20.7967, -156.3319));
        earthquakes.add(new Earthquake("5", "Oregon", 3.5, 1633382400000L, 43.8041, -120.5542));

        EarthquakeAdapter adapter = new EarthquakeAdapter();
        adapter.setOnItemClickListener(earthquake -> Toast.makeText(MonitorActivity.this, "Clicked: " + earthquake.getPlace(), Toast.LENGTH_SHORT).show());
        binding.recyclerView.setAdapter(adapter);
        adapter.submitList(earthquakes);

        if(earthquakes.isEmpty()){
            binding.emptyView.setVisibility(View.VISIBLE);
            Toast.makeText(this, "No existen datos", Toast.LENGTH_SHORT).show();
        } else {
            binding.emptyView.setVisibility(View.GONE);
            Toast.makeText(this, "Existen datos", Toast.LENGTH_SHORT).show();
        }

    }
}