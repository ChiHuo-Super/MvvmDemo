package com.demo.mvvmdemo.viewmodel;

import android.view.View;

import androidx.databinding.ObservableInt;

import com.demo.mvvmdemo.model.ShgoldEntity;

import java.util.List;

/**
 * @projectName：MvvmDemo
 * @createTime：2020/6/2 20:57
 * @author：chihuo
 * @company：
 * @e-mail：
 * @description：
 */
public class MainViewModel {

    public ObservableInt getGoldData_Btn = new ObservableInt();
    public ObservableInt GoldInfo_List = new ObservableInt(View.GONE);

    public MainViewModel() {

    }


    public void BtnViewOnClick(View view) {
        getGoldData_Btn.set(View.GONE);
        GoldInfo_List.set(View.VISIBLE);


    }

    public interface DataListener {
        void repoDataChange(List<ShgoldEntity> entityList);
    }
}
