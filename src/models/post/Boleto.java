package models.post;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Boleto {

	@SerializedName("CedenteContaNumero")
	@Expose
	private String cedenteContaNumero;
	@SerializedName("CedenteContaNumeroDV")
	@Expose
	private String cedenteContaNumeroDV;
	@SerializedName("CedenteConvenioNumero")
	@Expose
	private String cedenteConvenioNumero;
	@SerializedName("CedenteContaCodigoBanco")
	@Expose
	private String cedenteContaCodigoBanco;
	@SerializedName("SacadoCPFCNPJ")
	@Expose
	private String sacadoCPFCNPJ;
	@SerializedName("SacadoEmail")
	@Expose
	private String sacadoEmail;
	@SerializedName("SacadoEnderecoNumero")
	@Expose
	private String sacadoEnderecoNumero;
	@SerializedName("SacadoEnderecoBairro")
	@Expose
	private String sacadoEnderecoBairro;
	@SerializedName("SacadoEnderecoCEP")
	@Expose
	private String sacadoEnderecoCEP;
	@SerializedName("SacadoEnderecoCidade")
	@Expose
	private String sacadoEnderecoCidade;
	@SerializedName("SacadoEnderecoComplemento")
	@Expose
	private String sacadoEnderecoComplemento;
	@SerializedName("SacadoEnderecoLogradouro")
	@Expose
	private String sacadoEnderecoLogradouro;
	@SerializedName("SacadoEnderecoPais")
	@Expose
	private String sacadoEnderecoPais;
	@SerializedName("SacadoEnderecoUF")
	@Expose
	private String sacadoEnderecoUF;
	@SerializedName("SacadoNome")
	@Expose
	private String sacadoNome;
	@SerializedName("SacadoTelefone")
	@Expose
	private String sacadoTelefone;
	@SerializedName("SacadoCelular")
	@Expose
	private String sacadoCelular;
	@SerializedName("TituloDataEmissao")
	@Expose
	private String tituloDataEmissao;
	@SerializedName("TituloDataVencimento")
	@Expose
	private String tituloDataVencimento;
	@SerializedName("TituloMensagem01")
	@Expose
	private String tituloMensagem01;
	@SerializedName("TituloMensagem02")
	@Expose
	private String tituloMensagem02;
	@SerializedName("TituloMensagem03")
	@Expose
	private String tituloMensagem03;
	@SerializedName("TituloNossoNumero")
	@Expose
	private String tituloNossoNumero;
	@SerializedName("TituloNumeroDocumento")
	@Expose
	private String tituloNumeroDocumento;
	@SerializedName("TituloValor")
	@Expose
	private String tituloValor;
	@SerializedName("TituloLocalPagamento")
	@Expose
	private String tituloLocalPagamento;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Boleto() {
	}

	/**
	 * 
	 * @param sacadoTelefone
	 * @param sacadoEnderecoCidade
	 * @param tituloMensagem01
	 * @param tituloMensagem03
	 * @param sacadoEmail
	 * @param tituloMensagem02
	 * @param cedenteContaNumeroDV
	 * @param sacadoCelular
	 * @param sacadoEnderecoUF
	 * @param sacadoEnderecoPais
	 * @param sacadoEnderecoCEP
	 * @param cedenteContaCodigoBanco
	 * @param sacadoNome
	 * @param tituloNossoNumero
	 * @param tituloValor
	 * @param sacadoEnderecoLogradouro
	 * @param tituloNumeroDocumento
	 * @param cedenteContaNumero
	 * @param sacadoEnderecoBairro
	 * @param cedenteConvenioNumero
	 * @param sacadoCPFCNPJ
	 * @param sacadoEnderecoNumero
	 * @param tituloLocalPagamento
	 * @param sacadoEnderecoComplemento
	 * @param tituloDataVencimento
	 * @param tituloDataEmissao
	 */
	public Boleto(String cedenteContaNumero, String cedenteContaNumeroDV, String cedenteConvenioNumero,
			String cedenteContaCodigoBanco, String sacadoCPFCNPJ, String sacadoEmail, String sacadoEnderecoNumero,
			String sacadoEnderecoBairro, String sacadoEnderecoCEP, String sacadoEnderecoCidade,
			String sacadoEnderecoComplemento, String sacadoEnderecoLogradouro, String sacadoEnderecoPais,
			String sacadoEnderecoUF, String sacadoNome, String sacadoTelefone, String sacadoCelular,
			String tituloDataEmissao, String tituloDataVencimento, String tituloMensagem01, String tituloMensagem02,
			String tituloMensagem03, String tituloNossoNumero, String tituloNumeroDocumento, String tituloValor,
			String tituloLocalPagamento) {
		this.cedenteContaNumero = cedenteContaNumero;
		this.cedenteContaNumeroDV = cedenteContaNumeroDV;
		this.cedenteConvenioNumero = cedenteConvenioNumero;
		this.cedenteContaCodigoBanco = cedenteContaCodigoBanco;
		this.sacadoCPFCNPJ = sacadoCPFCNPJ;
		this.sacadoEmail = sacadoEmail;
		this.sacadoEnderecoNumero = sacadoEnderecoNumero;
		this.sacadoEnderecoBairro = sacadoEnderecoBairro;
		this.sacadoEnderecoCEP = sacadoEnderecoCEP;
		this.sacadoEnderecoCidade = sacadoEnderecoCidade;
		this.sacadoEnderecoComplemento = sacadoEnderecoComplemento;
		this.sacadoEnderecoLogradouro = sacadoEnderecoLogradouro;
		this.sacadoEnderecoPais = sacadoEnderecoPais;
		this.sacadoEnderecoUF = sacadoEnderecoUF;
		this.sacadoNome = sacadoNome;
		this.sacadoTelefone = sacadoTelefone;
		this.sacadoCelular = sacadoCelular;
		this.tituloDataEmissao = tituloDataEmissao;
		this.tituloDataVencimento = tituloDataVencimento;
		this.tituloMensagem01 = tituloMensagem01;
		this.tituloMensagem02 = tituloMensagem02;
		this.tituloMensagem03 = tituloMensagem03;
		this.tituloNossoNumero = tituloNossoNumero;
		this.tituloNumeroDocumento = tituloNumeroDocumento;
		this.tituloValor = tituloValor;
		this.tituloLocalPagamento = tituloLocalPagamento;
	}

	public String getCedenteContaNumero() {
		return cedenteContaNumero;
	}

	public void setCedenteContaNumero(String cedenteContaNumero) {
		this.cedenteContaNumero = cedenteContaNumero;
	}

	public String getCedenteContaNumeroDV() {
		return cedenteContaNumeroDV;
	}

	public void setCedenteContaNumeroDV(String cedenteContaNumeroDV) {
		this.cedenteContaNumeroDV = cedenteContaNumeroDV;
	}

	public String getCedenteConvenioNumero() {
		return cedenteConvenioNumero;
	}

	public void setCedenteConvenioNumero(String cedenteConvenioNumero) {
		this.cedenteConvenioNumero = cedenteConvenioNumero;
	}

	public String getCedenteContaCodigoBanco() {
		return cedenteContaCodigoBanco;
	}

	public void setCedenteContaCodigoBanco(String cedenteContaCodigoBanco) {
		this.cedenteContaCodigoBanco = cedenteContaCodigoBanco;
	}

	public String getSacadoCPFCNPJ() {
		return sacadoCPFCNPJ;
	}

	public void setSacadoCPFCNPJ(String sacadoCPFCNPJ) {
		this.sacadoCPFCNPJ = sacadoCPFCNPJ;
	}

	public String getSacadoEmail() {
		return sacadoEmail;
	}

	public void setSacadoEmail(String sacadoEmail) {
		this.sacadoEmail = sacadoEmail;
	}

	public String getSacadoEnderecoNumero() {
		return sacadoEnderecoNumero;
	}

	public void setSacadoEnderecoNumero(String sacadoEnderecoNumero) {
		this.sacadoEnderecoNumero = sacadoEnderecoNumero;
	}

	public String getSacadoEnderecoBairro() {
		return sacadoEnderecoBairro;
	}

	public void setSacadoEnderecoBairro(String sacadoEnderecoBairro) {
		this.sacadoEnderecoBairro = sacadoEnderecoBairro;
	}

	public String getSacadoEnderecoCEP() {
		return sacadoEnderecoCEP;
	}

	public void setSacadoEnderecoCEP(String sacadoEnderecoCEP) {
		this.sacadoEnderecoCEP = sacadoEnderecoCEP;
	}

	public String getSacadoEnderecoCidade() {
		return sacadoEnderecoCidade;
	}

	public void setSacadoEnderecoCidade(String sacadoEnderecoCidade) {
		this.sacadoEnderecoCidade = sacadoEnderecoCidade;
	}

	public String getSacadoEnderecoComplemento() {
		return sacadoEnderecoComplemento;
	}

	public void setSacadoEnderecoComplemento(String sacadoEnderecoComplemento) {
		this.sacadoEnderecoComplemento = sacadoEnderecoComplemento;
	}

	public String getSacadoEnderecoLogradouro() {
		return sacadoEnderecoLogradouro;
	}

	public void setSacadoEnderecoLogradouro(String sacadoEnderecoLogradouro) {
		this.sacadoEnderecoLogradouro = sacadoEnderecoLogradouro;
	}

	public String getSacadoEnderecoPais() {
		return sacadoEnderecoPais;
	}

	public void setSacadoEnderecoPais(String sacadoEnderecoPais) {
		this.sacadoEnderecoPais = sacadoEnderecoPais;
	}

	public String getSacadoEnderecoUF() {
		return sacadoEnderecoUF;
	}

	public void setSacadoEnderecoUF(String sacadoEnderecoUF) {
		this.sacadoEnderecoUF = sacadoEnderecoUF;
	}

	public String getSacadoNome() {
		return sacadoNome;
	}

	public void setSacadoNome(String sacadoNome) {
		this.sacadoNome = sacadoNome;
	}

	public String getSacadoTelefone() {
		return sacadoTelefone;
	}

	public void setSacadoTelefone(String sacadoTelefone) {
		this.sacadoTelefone = sacadoTelefone;
	}

	public String getSacadoCelular() {
		return sacadoCelular;
	}

	public void setSacadoCelular(String sacadoCelular) {
		this.sacadoCelular = sacadoCelular;
	}

	public String getTituloDataEmissao() {
		return tituloDataEmissao;
	}

	public void setTituloDataEmissao(String tituloDataEmissao) {
		this.tituloDataEmissao = tituloDataEmissao;
	}

	public String getTituloDataVencimento() {
		return tituloDataVencimento;
	}

	public void setTituloDataVencimento(String tituloDataVencimento) {
		this.tituloDataVencimento = tituloDataVencimento;
	}

	public String getTituloMensagem01() {
		return tituloMensagem01;
	}

	public void setTituloMensagem01(String tituloMensagem01) {
		this.tituloMensagem01 = tituloMensagem01;
	}

	public String getTituloMensagem02() {
		return tituloMensagem02;
	}

	public void setTituloMensagem02(String tituloMensagem02) {
		this.tituloMensagem02 = tituloMensagem02;
	}

	public String getTituloMensagem03() {
		return tituloMensagem03;
	}

	public void setTituloMensagem03(String tituloMensagem03) {
		this.tituloMensagem03 = tituloMensagem03;
	}

	public String getTituloNossoNumero() {
		return tituloNossoNumero;
	}

	public void setTituloNossoNumero(String tituloNossoNumero) {
		this.tituloNossoNumero = tituloNossoNumero;
	}

	public String getTituloNumeroDocumento() {
		return tituloNumeroDocumento;
	}

	public void setTituloNumeroDocumento(String tituloNumeroDocumento) {
		this.tituloNumeroDocumento = tituloNumeroDocumento;
	}

	public String getTituloValor() {
		return tituloValor;
	}

	public void setTituloValor(String tituloValor) {
		this.tituloValor = tituloValor;
	}

	public String getTituloLocalPagamento() {
		return tituloLocalPagamento;
	}

	public void setTituloLocalPagamento(String tituloLocalPagamento) {
		this.tituloLocalPagamento = tituloLocalPagamento;
	}

}