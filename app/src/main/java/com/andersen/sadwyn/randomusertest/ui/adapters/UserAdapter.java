package com.andersen.sadwyn.randomusertest.ui.adapters;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.andersen.sadwyn.randomusertest.R;
import com.andersen.sadwyn.randomusertest.databinding.ProgressItemBinding;
import com.andersen.sadwyn.randomusertest.databinding.UserListItemBinding;
import com.andersen.sadwyn.randomusertest.model.pojos.User;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class UserAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int ITEM = 0;
    public static final int PROGRESS = 1;
    private List<User> users;
    private OnUserClickListener onUserClickListener;
    private Context context;

    public UserAdapter(Context context, OnUserClickListener clickListener) {
        users = new ArrayList<>();
        onUserClickListener = clickListener;
        this.context = context;
    }

    @BindingAdapter("bind:src")
    public static void bindThumbnail(CircleImageView imageView, String src) {
        Picasso.with(imageView.getContext().getApplicationContext())
                .load(src)
                .placeholder(R.drawable.user_placeholder)
                .into(imageView);
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
            setDifferentColorEachSecondUser(userViewHolder);
        } else if (holder instanceof ProgressViewHolder) {
            ProgressViewHolder progressViewHolder = (ProgressViewHolder) holder;
            progressViewHolder.binding.progressBar.setVisibility(View.VISIBLE);
        }
    }

    private void setDifferentColorEachSecondUser(UserViewHolder holder) {
        if (holder.getAdapterPosition() % 2 == 0)
            holder.binding.userHolder.setBackgroundColor(ContextCompat.getColor(context, R.color.itemSecondarybackground));
        else holder.binding.userHolder.setBackgroundColor(ContextCompat.getColor(context, android.R.color.white));
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    @Override
    public int getItemViewType(int position) {
        return position != getItemCount() - 1 ? ITEM : PROGRESS;
    }

    public interface OnUserClickListener {
        void onUserClick(User user);
    }

    private class UserViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        UserListItemBinding binding;

        public UserViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            binding = DataBindingUtil.bind(itemView);
        }

        @Override
        public void onClick(View v) {
            onUserClickListener.onUserClick(users.get(getAdapterPosition()));
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
