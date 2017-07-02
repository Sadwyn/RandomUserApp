package com.andersen.sadwyn.randomusertest.ui.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.andersen.sadwyn.randomusertest.R;
import com.andersen.sadwyn.randomusertest.databinding.ActivityDetailBinding;
import com.andersen.sadwyn.randomusertest.model.pojos.User;
import com.andersen.sadwyn.randomusertest.presentation.presenter.DetailPresenter;
import com.andersen.sadwyn.randomusertest.presentation.view.DetailView;
import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.squareup.picasso.Picasso;

import org.parceler.Parcels;

import java.util.Locale;

public class DetailActivity extends MvpAppCompatActivity implements DetailView {
    public static final String TAG = "DetailActivity";
    @InjectPresenter
    DetailPresenter mDetailPresenter;
    private ActivityDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_detail);
        initDetails();
        initToolbar();
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    private void initToolbar(){
        setSupportActionBar(binding.myToolbarDetail);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void initDetails() {
        User user = Parcels.unwrap(getIntent().getParcelableExtra(MainActivity.USER_EXTRA));
        if (user != null)
            fillFields(user);
    }

    private void fillFields(User user) {
        binding.setUser(user);
        Picasso.with(this)
                .load(user.getPicture().getLarge())
                .placeholder(R.drawable.user_placeholder)
                .fit()
                .into(binding.bigUserPhoto);

        binding.city.setText(String.format(getString(R.string.city),user.getLocation().getCity()));
        binding.street.setText(String.format(getString(R.string.street),user.getLocation().getStreet()));
        binding.state.setText(String.format(getString(R.string.state),user.getLocation().getState()));
        binding.postcode.setText(String.format(getString(R.string.postcode),user.getLocation().getPostcode()));
        binding.phoneText.setText(user.getPhone());
        binding.phoneTextMobile.setText(user.getCell());
        binding.countryText.setText(getFullCountry(user.getNat()));
        binding.email.setText(user.getEmail());
    }

    private String getFullCountry(String sub){
        Locale locale = new Locale(Locale.US.getLanguage(), sub);
        return locale.getDisplayCountry(locale);
    }
}
