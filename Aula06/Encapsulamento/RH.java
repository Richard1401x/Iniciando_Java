package Encapsulamento;

public class RH {
	public static void main(String[] args) {
		Funcionario i = new Funcionario();
		i.nome = "Richard";
		System.out.println("Nome: " + i.nome);
		i.cpf = "188.888.999-22";
		System.out.println("CPF: " + i.cpf);
		i.setRg("9.888.145");
		System.out.println("RG: " + i.getRg());
		i.setEnd("Rua teste, 48");
		System.out.println("Endereço: " + i.getEnd());
		i.setEmail("cdd.teste@gmail.com");
		System.out.println("E-mail: " + i.getEmail());
		i.setSalario(2500);
		System.out.println("Salário: " + i.getSalario());
		i.setQuantidadedeFilho(2);
		System.out.println("Quantidade de Filhos: " + i.getQuantidadedeFilho());
		i.setTelefone("81 98877-5522");
		System.out.println("Número de Telefone: " + i.getTelefone());
		
	}

}
