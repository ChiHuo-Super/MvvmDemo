package com.demo.mvvmdemo.viewmodel;

import android.content.Context;

import com.demo.mvvmdemo.model.ShgoldEntity;

/**
 * @projectName：MvvmDemo
 * @createTime：2020/6/2 21:53
 * @author：chihuo
 * @company：
 * @e-mail：
 * @description：
 */
public class GoldListViewModel {
    private Context mContext;
    private ShgoldEntity entity;

    public GoldListViewModel(Context mContext, ShgoldEntity entity) {
        this.mContext = mContext;
        this.entity = entity;
    }

    public void setShgoldEntity(ShgoldEntity entity) {
        this.entity = entity;
    }

    public ShgoldEntity getEntity() {
        return entity;
    }
}
