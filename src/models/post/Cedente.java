package models.post;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Cedente {

	@SerializedName("CedenteRazaoSocial")
	@Expose
	private String cedenteRazaoSocial;
	@SerializedName("CedenteNomeFantasia")
	@Expose
	private String cedenteNomeFantasia;
	@SerializedName("CedenteCPFCNPJ")
	@Expose
	private String cedenteCPFCNPJ;
	@SerializedName("CedenteEnderecoLogradouro")
	@Expose
	private String cedenteEnderecoLogradouro;
	@SerializedName("CedenteEnderecoNumero")
	@Expose
	private String cedenteEnderecoNumero;
	@SerializedName("CedenteEnderecoComplemento")
	@Expose
	private String cedenteEnderecoComplemento;
	@SerializedName("CedenteEnderecoBairro")
	@Expose
	private String cedenteEnderecoBairro;
	@SerializedName("CedenteEnderecoCEP")
	@Expose
	private String cedenteEnderecoCEP;
	@SerializedName("CedenteEnderecoCidadeIBGE")
	@Expose
	private String cedenteEnderecoCidadeIBGE;
	@SerializedName("CedenteTelefone")
	@Expose
	private String cedenteTelefone;
	@SerializedName("CedenteEmail")
	@Expose
	private String cedenteEmail;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Cedente() {
	}

	/**
	 * 
	 * @param cedenteEmail
	 * @param cedenteEnderecoBairro
	 * @param cedenteEnderecoCEP
	 * @param cedenteEnderecoComplemento
	 * @param cedenteRazaoSocial
	 * @param cedenteTelefone
	 * @param cedenteEnderecoNumero
	 * @param cedenteEnderecoCidadeIBGE
	 * @param cedenteEnderecoLogradouro
	 * @param cedenteCPFCNPJ
	 * @param cedenteNomeFantasia
	 */
	public Cedente(String cedenteRazaoSocial, String cedenteNomeFantasia, String cedenteCPFCNPJ,
			String cedenteEnderecoLogradouro, String cedenteEnderecoNumero, String cedenteEnderecoComplemento,
			String cedenteEnderecoBairro, String cedenteEnderecoCEP, String cedenteEnderecoCidadeIBGE,
			String cedenteTelefone, String cedenteEmail) {
		this.cedenteRazaoSocial = cedenteRazaoSocial;
		this.cedenteNomeFantasia = cedenteNomeFantasia;
		this.cedenteCPFCNPJ = cedenteCPFCNPJ;
		this.cedenteEnderecoLogradouro = cedenteEnderecoLogradouro;
		this.cedenteEnderecoNumero = cedenteEnderecoNumero;
		this.cedenteEnderecoComplemento = cedenteEnderecoComplemento;
		this.cedenteEnderecoBairro = cedenteEnderecoBairro;
		this.cedenteEnderecoCEP = cedenteEnderecoCEP;
		this.cedenteEnderecoCidadeIBGE = cedenteEnderecoCidadeIBGE;
		this.cedenteTelefone = cedenteTelefone;
		this.cedenteEmail = cedenteEmail;
	}

	public String getCedenteRazaoSocial() {
		return cedenteRazaoSocial;
	}

	public void setCedenteRazaoSocial(String cedenteRazaoSocial) {
		this.cedenteRazaoSocial = cedenteRazaoSocial;
	}

	public String getCedenteNomeFantasia() {
		return cedenteNomeFantasia;
	}

	public void setCedenteNomeFantasia(String cedenteNomeFantasia) {
		this.cedenteNomeFantasia = cedenteNomeFantasia;
	}

	public String getCedenteCPFCNPJ() {
		return cedenteCPFCNPJ;
	}

	public void setCedenteCPFCNPJ(String cedenteCPFCNPJ) {
		this.cedenteCPFCNPJ = cedenteCPFCNPJ;
	}

	public String getCedenteEnderecoLogradouro() {
		return cedenteEnderecoLogradouro;
	}

	public void setCedenteEnderecoLogradouro(String cedenteEnderecoLogradouro) {
		this.cedenteEnderecoLogradouro = cedenteEnderecoLogradouro;
	}

	public String getCedenteEnderecoNumero() {
		return cedenteEnderecoNumero;
	}

	public void setCedenteEnderecoNumero(String cedenteEnderecoNumero) {
		this.cedenteEnderecoNumero = cedenteEnderecoNumero;
	}

	public String getCedenteEnderecoComplemento() {
		return cedenteEnderecoComplemento;
	}

	public void setCedenteEnderecoComplemento(String cedenteEnderecoComplemento) {
		this.cedenteEnderecoComplemento = cedenteEnderecoComplemento;
	}

	public String getCedenteEnderecoBairro() {
		return cedenteEnderecoBairro;
	}

	public void setCedenteEnderecoBairro(String cedenteEnderecoBairro) {
		this.cedenteEnderecoBairro = cedenteEnderecoBairro;
	}

	public String getCedenteEnderecoCEP() {
		return cedenteEnderecoCEP;
	}

	public void setCedenteEnderecoCEP(String cedenteEnderecoCEP) {
		this.cedenteEnderecoCEP = cedenteEnderecoCEP;
	}

	public String getCedenteEnderecoCidadeIBGE() {
		return cedenteEnderecoCidadeIBGE;
	}

	public void setCedenteEnderecoCidadeIBGE(String cedenteEnderecoCidadeIBGE) {
		this.cedenteEnderecoCidadeIBGE = cedenteEnderecoCidadeIBGE;
	}

	public String getCedenteTelefone() {
		return cedenteTelefone;
	}

	public void setCedenteTelefone(String cedenteTelefone) {
		this.cedenteTelefone = cedenteTelefone;
	}

	public String getCedenteEmail() {
		return cedenteEmail;
	}

	public void setCedenteEmail(String cedenteEmail) {
		this.cedenteEmail = cedenteEmail;
	}

}