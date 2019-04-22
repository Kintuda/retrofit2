package models;

public class MockData {
	private double id;
	private String nome;
	public double getId() {
		return id;
	}
	public void setId(double id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public MockData(double d, String nome) {
		this.id = d;
		this.nome = nome;
	}
}
