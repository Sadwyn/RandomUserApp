package com.andersen.sadwyn.randomusertest.ui.adapters;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.andersen.sadwyn.randomusertest.databinding.ProgressItemBinding;
import com.andersen.sadwyn.randomusertest.databinding.UserListItemBinding;
import com.andersen.sadwyn.randomusertest.model.pojos.User;
import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class UserAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int ITEM = 0;
    public static final int PROGRESS = 1;
    private List<User> users;

    public UserAdapter() {
        users = new ArrayList<>();
    }

    @BindingAdapter("bind:src")
    public static void bindThumbnail(CircleImageView imageView, String src) {
        Glide.with(imageView.getContext()).load(src).into(imageView);
    }

    public void addUsers(List<User> users) {
        this.users.addAll(users);
        notifyItemRangeInserted(this.users.size() - 1, users.size());
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == ITEM) {
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            UserListItemBinding binding = UserListItemBinding.inflate(inflater, parent, false);
            return new UserViewHolder(binding.getRoot());
        } else {
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            ProgressItemBinding binding = ProgressItemBinding.inflate(inflater, parent, false);
            return new ProgressViewHolder(binding.getRoot());
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof UserViewHolder) {
            UserViewHolder userViewHolder = (UserViewHolder) holder;
            userViewHolder.binding.setUser(users.get(holder.getAdapterPosition()));
        } else if (holder instanceof ProgressViewHolder) {
            ProgressViewHolder progressViewHolder = (ProgressViewHolder) holder;
            progressViewHolder.binding.progressBar.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    @Override
    public int getItemViewType(int position) {
        return position != getItemCount() - 1 ? ITEM : PROGRESS;
    }

    private class UserViewHolder extends RecyclerView.ViewHolder {
        UserListItemBinding binding;

        public UserViewHolder(View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
        }
    }

    private class ProgressViewHolder extends RecyclerView.ViewHolder {
        ProgressItemBinding binding;

        public ProgressViewHolder(View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
        }
    }
}
