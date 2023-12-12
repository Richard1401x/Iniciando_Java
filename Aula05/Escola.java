package Aula_05;
import java.util.Date;
public class Escola {

	public static void main(String[] args) {
		Aluno y = new Aluno ("Richard","888.999.444-25",new Date ());
		System.out.println("nome:" + y.nome);
		System.out.println("cpf:" + y.cpf);
		System.out.println("Data de Nascimento:" + y.data_nascimento);
		y.matricula = ("789585");
		System.out.println("Matricula: "+ y.matricula);
	
		Professor x = new Professor ("Thiago","999.777.444-24",new Date ());
		System.out.println("\nProfessor:" + x.nome);
		System.out.println("cpf:" + x.cpf);
		System.out.println("Data de Nascimento:" + x.data_nascimento);
		x.salario = 2500;
		x.disciplina = "História";
		System.out.println("Salario: R$" + x.salario + "\nDisciplina: " + x.disciplina);
		
		Funcionario u = new Funcionario ("Joao","111.755.444-30",new Date ());
		System.out.println("\nFuncionario:" + u.nome);
		System.out.println("cpf:" + x.cpf);
		u.salario = 1600;
		u.cargo = "Manutenção";
		System.out.println("Salário: R$" + u.salario + "\nCargo: " + u.cargo + "\nData de Admissão:" + u.data_admissao);
	}
}
