package adhanjas.com.example.recyclerview_retrofit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RetrofitAdaptor adaptor;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ApiService apiService=RetrofitClient.getRetrofit().create(ApiService.class);
        Call<List<Retrofit_model>> call=apiService.getResults();
        call.enqueue(new Callback<List<Retrofit_model>>() {
            @Override
            public void onResponse(Call<List<Retrofit_model>> call, Response<List<Retrofit_model>> response) {
                addData(response.body());
                Log.d(TAG, "onResponse: "+response.message());
            }

            @Override
            public void onFailure(Call<List<Retrofit_model>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "failed to load data", Toast.LENGTH_SHORT).show();

                Log.d(TAG, "onFailure: "+t.getMessage());
                Log.d(TAG, "onFailure: brandy");
            }
        });
    }
    public void addData(List<Retrofit_model> list)
    {
        recyclerView=findViewById(R.id.recycler);
        adaptor=new RetrofitAdaptor(list);
        recyclerView.setAdapter(adaptor);

    }
}