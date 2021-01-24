package adhanjas.com.example.recyclerview_retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    public static final String BASE_URL="https://gadsapi.herokuapp.com/";

    private static Retrofit retrofit;
    public static Retrofit getRetrofit(){
       if(retrofit==null){
           retrofit=new Retrofit.Builder()
                   .baseUrl(BASE_URL)
                   .addConverterFactory(GsonConverterFactory.create())
                   .build();
       }
       return retrofit;
    }
}
