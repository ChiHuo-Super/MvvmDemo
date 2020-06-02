package com.demo.mvvmdemo.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.demo.mvvmdemo.R;
import com.demo.mvvmdemo.databinding.ItemGoldBinding;
import com.demo.mvvmdemo.model.ShgoldEntity;
import com.demo.mvvmdemo.viewmodel.GoldListViewModel;

import java.util.List;

/**
 * @projectName：MvvmDemo
 * @createTime：2020/6/2 21:37
 * @author：chihuo
 * @company：
 * @e-mail：
 * @description：
 */
public class GoldListAdapter extends RecyclerView.Adapter<GoldListAdapter.ViewHolder> {
    private Context mContext;
    private List<ShgoldEntity> entityList;

    public GoldListAdapter(Context mContext, List<ShgoldEntity> entityList) {
        this.mContext = mContext;
        this.entityList = entityList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemGoldBinding binding = DataBindingUtil.inflate(LayoutInflater.from(mContext), R.layout.item_gold, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ShgoldEntity entity = entityList.get(position);
        holder.bindData(entity);
    }

    @Override
    public int getItemCount() {
        return entityList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ItemGoldBinding binding;

        public ViewHolder(ItemGoldBinding binding) {
            super(binding.linView);
            this.binding = binding;
        }

        public void bindData(ShgoldEntity entity) {
            if (binding.getViewmodel() == null) {
                binding.setViewmodel(new GoldListViewModel(mContext, entity));
            } else {
                binding.getViewmodel().setShgoldEntity(entity);
            }
        }
    }
}
