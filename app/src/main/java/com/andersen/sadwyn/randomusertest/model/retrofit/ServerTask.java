package com.andersen.sadwyn.randomusertest.model.retrofit;

import com.andersen.sadwyn.randomusertest.model.pojos.Response;
import com.andersen.sadwyn.randomusertest.model.pojos.User;

import java.util.List;

import io.reactivex.Observable;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;


public class ServerTask {
    public static final String BASE_URL = "https://randomuser.me/";
    private static ServerTask mInstance;
    private Services services;

    private ServerTask() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        services = retrofit.create(Services.class);
    }

    public static ServerTask getInstance() {
        if (mInstance == null) {
            mInstance = new ServerTask();
        }

        return mInstance;
    }


    public interface Services {
        @GET("/api/")
        Observable<Response> getUsers(@Query("results") int usersCount);
    }

    public Services getServices() {
        return services;
    }
}
