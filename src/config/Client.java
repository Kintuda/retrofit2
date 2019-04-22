package config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Client {
    public static <T> T createService(Class<T> serviceClass){
		final String BASE_URL = "http://homologacao.plugboleto.com.br/api/v1/";
		Gson gson = new GsonBuilder()
		        .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
		        .create();
		OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
	    httpClient.addNetworkInterceptor(new Intercept());

		Retrofit retrofit = new Retrofit.Builder()
		    .baseUrl(BASE_URL)
		    .addConverterFactory(GsonConverterFactory.create(gson))
            .client(httpClient.build())
		    .build();
		return retrofit.create(serviceClass);
	}
}
