package models;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BaseResponse {
	@SerializedName("_status")
	@Expose
	private String status;
	@SerializedName("_mensagem")
	@Expose
	private String mensagem;
	@SerializedName("_dados")
	@Expose
	private List<String> dados = null;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public List<String> getDados() {
		return dados;
	}

	public void setDados(List<String> dados) {
		this.dados = dados;
	}
}
