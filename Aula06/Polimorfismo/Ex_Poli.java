package Polimorfismo;

public class Ex_Poli {

	public static void main(String[] args) {
		        // Polimorfismo de sobrescrita
		        Animal animalGenerico = new Animal();
		        Cachorro cachorro = new Cachorro();
		        Gato gato = new Gato();

		        System.out.println("Sons do Polimorfismo de Sobrescrita:");
		        animalGenerico.fazerSom();  // Saída: Som genérico de animal
		        cachorro.fazerSom();        // Saída: Au au!
		        gato.fazerSom();            // Saída: Miau!

		        // Sobrecarga
		        System.out.println("\nSobrecarga:");
		        cachorro.fazerSom("Bravo!");  // Saída: Som do cachorro: Bravo!
		        // Note que a classe Gato não possui um método sobrecarregado 'fazerSom'

	}

}
