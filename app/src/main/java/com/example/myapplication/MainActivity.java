package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    TextView tv_textview1, textview2;
    String url="https://jsonplaceholder.typicode.com/";
//    String url="https://chunavparchar.online/apiad/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_textview1 = findViewById(R.id.textview1);
        tv_textview1.setText("");


        Retrofit retrofit = new Retrofit.Builder().baseUrl(url).addConverterFactory(GsonConverterFactory.create()).build();

        myApi myApi = retrofit.create(myApi.class);

        Call<List<Model>> call = myApi.getmodels();


        call.enqueue(new Callback<List<Model>>() {
            @Override
            public void onResponse(Call<List<Model>> call, Response<List<Model>> response) {
                List<Model> data = response.body();
                for(int i=0; i<data.size(); i++)
                    tv_textview1.append("Sl NO" + data.get(i).getId() + "\n Title " + data.get(i).getTitle() + "\n\n\n");
            }

            @Override
            public void onFailure(Call<List<Model>> call, Throwable t) {

            }
        });
    }
}