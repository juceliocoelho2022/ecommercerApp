package com.juceliodev.ecommercerapp.Acitivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.juceliodev.ecommercerapp.Adapter.PopularAdapter;
import com.juceliodev.ecommercerapp.R;
import com.juceliodev.ecommercerapp.databinding.ActivityMainBinding;
import com.juceliodev.ecommercerapp.domain.PopularDomain;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        initRecyclerView();

    }

    private void initRecyclerView() {
        ArrayList<PopularDomain> items = new ArrayList<>();
        items.add(new PopularDomain("T-shirt black", "item_1", 15, 4, 500, "Immerse yourself in a world of vibrant visuals and\n" +
                "immersive sound with the monitor.\n" +
                "Its cutting-edge monitor technology brings every\n" +
                "scene to life with striking clarity and rich colors.\n" +
                "with seamless integration and a sleek, modern\n +" +
                "design, the monitor Pro is not just a monitor, but a\n" +
                "centerpiece fot your entertainment space.\n" +
                "With its sleek, modern design, the monitor your\n" +
                "not just a TV, but a centerpiece for your\n" +
                "entertainment space. The ultra-slin bezel and\n" +
                "premium finish seamlessly with any decor"));
        items.add(new PopularDomain("Smart", "item_2", 10, 4.5, 450, "\"T-shirt black\", \"item_1\",15,4,500,\"Immerse yourself in a world of vibrant visuals and\\n\" +\n" +
                "        \"immersive sound with the monitor.\\n\"+\n" +
                "                \"Its cutting-edge monitor technology brings every\\n\"+\n" +
                "                \"scene to life with striking clarity and rich colors.\\n\" +\n" +
                "                \"with seamless integration and a sleek, modern\\n +\" +\n" +
                "                \"design, the monitor Pro is not just a monitor, but a\\n\" +\n" +
                "                \"centerpiece fot your entertainment space.\\n\" +\n" +
                "                \"With its sleek, modern design, the monitor your\\n\"+\n" +
                "                \"not just a TV, but a centerpiece for your\\n\"+\n" +
                "                \"entertainment space. The ultra-slin bezel and\\n\"+\n" +
                "                \"premium finish seamlessly with any decor\""));
        items.add(new PopularDomain("Phone", "item_3", 3, 4.9, 800, "\"T-shirt black\", \"item_1\",15,4,500,\"Immerse yourself in a world of vibrant visuals and\\n\" +\n" +
                "        \"immersive sound with the monitor.\\n\"+\n" +
                "                \"Its cutting-edge monitor technology brings every\\n\"+\n" +
                "                \"scene to life with striking clarity and rich colors.\\n\" +\n" +
                "                \"with seamless integration and a sleek, modern\\n +\" +\n" +
                "                \"design, the monitor Pro is not just a monitor, but a\\n\" +\n" +
                "                \"centerpiece fot your entertainment space.\\n\" +\n" +
                "                \"With its sleek, modern design, the monitor your\\n\"+\n" +
                "                \"not just a TV, but a centerpiece for your\\n\"+\n" +
                "                \"entertainment space. The ultra-slin bezel and\\n\"+\n" +
                "                \"premium finish seamlessly with any decor\""));

        binding.PopularView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        binding.PopularView.setAdapter(new PopularAdapter(items));
    }
}