package Polimorfismo;

public class Animal {
	    public void fazerSom() {
	        System.out.println("Som genérico de animal");
	    }
	}

	class Cachorro extends Animal {
	    @Override
	    public void fazerSom() {
	        System.out.println("Au au!");
	    }

	    // Sobrecarga do método fazerSom
	    public void fazerSom(String som) {
	        System.out.println("Som do cachorro: " + som);
	    }
	}

	class Gato extends Animal {
	    @Override
	    public void fazerSom() {
	        System.out.println("Miau!");
	    }
	}
