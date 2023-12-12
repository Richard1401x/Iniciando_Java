package Aula_05;

import java.util.Date;

public class Cidade {

	public static void main(String[] args) {
		Bicicleta y = new Bicicleta ("Bike","GTS","PRETA");
		System.out.println("nome:" + y.Nome+ " " + y.Modelo +" "+  y.Cor);
		y.Valor = 1300;
		System.out.println("Valor: R$"+ y.Valor);

		Carro x = new Carro ("Tucson", "GLI", "PRETA");
		System.out.println("\nnome:" + x.Nome+ " " + x.Modelo +" "+  x.Cor);
		x.Valor = 36000;
		System.out.println("Valor: R$"+ x.Valor);
		
		Moto t = new Moto ("XRE", "RALY", "VERMELHA");
		System.out.println("\nnome:" + t.Nome+ " " + t.Modelo +" "+  t.Cor);
		x.Valor = 29500;
		System.out.println("Valor: R$"+ x.Valor);
	}

}
