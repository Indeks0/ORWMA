package com.example.topgamesapp;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerConfigs extends AppCompatActivity {
    private RecyclerView recycler;
    private RecyclerAdapter adapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recyclerconfigs);
        setuprecycler();
        setuprecyclerdata();
    }

    private void setuprecycler() {
        this.recycler=findViewById(R.id.recycleView);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RecyclerAdapter();
        recycler.setAdapter(adapter);
    }

    private void setuprecyclerdata() {
        List<String> lista = new ArrayList<>();
        lista.add("MINIMAL CONFIGURATIONS");
        lista.add("");
        lista.add("Fortnite");
        lista.add("CPU: Core i3 2.4 Ghz");
        lista.add("GPU: Intel HD 4000");
        lista.add("RAM: 4 GB");
        lista.add("OS: Windows 7/8/10 64-bit");
        lista.add("");
        lista.add("PUBG");
        lista.add("CPU: Intel Core i5-4430/AMD FX-6300");
        lista.add("GPU: GTX 960 2GB/Radeon R7 370 2GB");
        lista.add("RAM: 8 GB");
        lista.add("OS: Windows 7/8/10 64-bit");
        lista.add("");
        lista.add("League of Legends");
        lista.add("CPU: 3 GHz processor");
        lista.add("GPU: Shader version 2.0 capable");
        lista.add("RAM: 2 GB");
        lista.add("OS: Windows 7/8/10 64-bit");
        lista.add("");
        lista.add("Hearthstone");
        lista.add("CPU: Intel Pentium D or AMD Athlon 64 X2");
        lista.add("GPU: 8600 GT/ATI Radeon HD 2600XT");
        lista.add("RAM: 3 GB");
        lista.add("OS: 64-bit Windows 10");
        lista.add("");
        lista.add("");
        lista.add("RECOMMENDED CONFIGURATIONS");
        lista.add("");
        lista.add("Fortnite");
        lista.add("CPU: Core i5 2.8GHz");
        lista.add("GPU: GTX 660/AMD Radeon HD 7870");
        lista.add("RAM: 8GB RAM");
        lista.add("OS: 64-bit Windows 10");
        lista.add("");
        lista.add("PUBG");
        lista.add("CPU: Ryzen 5-1600/Intel Core i5-7600K");
        lista.add("GPU: Nvidia GTX 1060 6GB or better");
        lista.add("RAM: 8 GB");
        lista.add("OS: 64-bit Windows 10");
        lista.add("");
        lista.add("League of Legends");
        lista.add("CPU: 3 GHz processor");
        lista.add("GPU: Nvidia GeForce 8800/Radeon HD 5670");
        lista.add("RAM: 4GB");
        lista.add("OS: Windows 10 64-bit");
        lista.add("");
        lista.add("Hearthstone");
        lista.add("CPU: Intel Pentium D or AMD Athlon 64 X2");
        lista.add("GPU: GeForce® 240 GT/ATI Radeon HD 4850");
        lista.add("RAM: 4 GB");
        lista.add("OS: 64-bit Windows 10");

        adapter.setData(lista);
    }
}
