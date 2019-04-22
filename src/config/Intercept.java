package config;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class Intercept implements Interceptor {
	@Override
	public Response intercept(Chain chain) throws IOException {

		Request.Builder builder = chain.request().newBuilder();
	

		return chain.proceed(builder.build());
	}
}
