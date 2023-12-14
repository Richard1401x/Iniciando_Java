package Encapsulamento;

public class Funcionario {
	public String nome;
	public String cpf;
	private String rg;
	private String end;
	private String email;
	private double salario;
	private int QuantidadedeFilho;
	private String telefone;
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getQuantidadedeFilho() {
		return QuantidadedeFilho;
	}
	public void setQuantidadedeFilho(int quantidadedeFilho) {
		QuantidadedeFilho = quantidadedeFilho;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
}