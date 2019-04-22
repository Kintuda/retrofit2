package interfaces;

import java.util.List;

import models.BaseResponse;
import models.post.Boleto;
import models.post.Cedente;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface Routes {

	@POST("cedentes")
	Call<BaseResponse> createCedente(@Body Cedente body);
	
	@POST("boletos")
	Call<BaseResponse> createBoleto(@Body List<Boleto> body);
}
