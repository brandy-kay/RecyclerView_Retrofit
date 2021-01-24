package adhanjas.com.example.recyclerview_retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("/api/hours")
    Call<List<Retrofit_model>> getResults();
}
