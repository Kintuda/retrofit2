package application;

import java.io.IOException;

import config.Client;
import interfaces.Routes;
import models.BaseResponse;
import models.MockData;
import models.post.Boleto;
import models.post.Cedente;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class App {
	public static void main(String args[]) {
		cadastrarCedente();
	}
//	public void createBoleto() {
//		Boleto boleto = new Boleto()
//	}

	public static void cadastrarCedente() {
		Cedente cedente1 = new Cedente("teste", "teste", "87121842000180", "teste", "155", "teste", "bairro",
				"87045420", "Maringa", "4410908", "teste@gmail.com");
		Routes route = Client.createService(Routes.class);
		Call<BaseResponse> call = route.createCedente(cedente1);
		call.enqueue(new Callback<BaseResponse>() {

			@Override
			public void onResponse(Call<BaseResponse> call, Response<BaseResponse> response) {
				if (response.isSuccessful()) {
					System.out.println(response.body());
					System.out.println(response.toString());
				} else {
					try {
						String errorBody = response.errorBody().toString();
						System.out.println(errorBody);
					} catch (Exception e) {
						System.out.println(e.toString());
					}
				}	
			}

			@Override
			public void onFailure(Call<BaseResponse> call, Throwable t) {
				// TODO Auto-generated method stub
				
			}
			
		});
	}
}
