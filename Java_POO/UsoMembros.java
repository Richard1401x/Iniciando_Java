package Java_POO;

public class UsoMembros {

	public static void main(String[] args) {
		DataNascimento dt = new DataNascimento();
		DataNascimento dt2 = new
		DataNascimento();
		dt.dia=23;
		dt.mes=10;
		dt.ano=1998;
		dt2.dia=9;
		dt2.mes=03;
		dt2.ano=2001;
		System.out.printf("A data de Nascimento "
		+ "é %d %d %d \n", dt.dia, dt.mes,
		dt.ano );
		System.out.printf("A data de Nascimento "
		+ "é %d %d %d", dt2.dia, dt2.mes,
		dt2.ano );
	}

}
