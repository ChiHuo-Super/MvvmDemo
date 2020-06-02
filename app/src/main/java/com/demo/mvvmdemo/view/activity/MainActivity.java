package com.demo.mvvmdemo.view.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.demo.mvvmdemo.R;
import com.demo.mvvmdemo.databinding.ActivityMainBinding;
import com.demo.mvvmdemo.model.ShgoldEntity;
import com.demo.mvvmdemo.view.adapter.GoldListAdapter;
import com.demo.mvvmdemo.viewmodel.MainViewModel;

import java.util.List;

/**
 * @projectName：MvvmDemo
 * @createTime：2020/6/2 20:57
 * @author：chihuo
 * @company：
 * @e-mail：
 * @description：
 */
public class MainActivity extends AppCompatActivity implements MainViewModel.DataListener {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    }

    @Override
    public void repoDataChange(List<ShgoldEntity> entityList) {
        GoldListAdapter adapter = new GoldListAdapter(this, entityList);
        binding.recycler.setAdapter(adapter);
        binding.recycler.setLayoutManager(new LinearLayoutManager(this));
    }
}