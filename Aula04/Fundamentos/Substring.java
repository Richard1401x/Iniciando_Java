package Fundamentos;

public class Substring {
public static void main(String[] args) {
	
	String str = "Hello";
	String resultado = str.replace("l","w"); /*Para substituir caracteres de uma string, usa-se o método replace da classe String. Esse método
substitui todas as ocorrências de um determinado caractere por outro. */
	System.out.println(resultado);
	
	
	
	/*Em Java o sinal + (mais) age como operador de
concatenação dos objetos String. */
	/*String str = "Oi"; String texto = str + "Mundo";*/
	
	int tres = 3;
	String resultadoFinal = 3 + "tres" + tres; /*Quando um dos operandos não for uma string, Java automaticamente realiza a conversão do tipo para uma representação de String.*/
	System.out.println(resultadoFinal);
	
	String str2 = "Hello World";
	String resultado1 = str2.substring(3,8);/* Nesse ultimo exemplo, a variável resultado receberá uma nova string que contém os caracteres que estão da posição 3 até a posição
8 exclusive (sem o caractere da posição 8).*/
	System.out.println(resultado1);
	
	String str3 = "Hello";
	String resultado2 = str3.toUpperCase(); /*HELLO*//*Para converter todos os caracteres de uma string para maiúsculo usa-se o método toUpperCase ( )*/
	System.out.println(resultado2);
	
	String str4 = " Hello ";
	String resultado3 = str4.trim();/* PARA RETIRAR ESPAÇOS EM BRANCO AO FINAL E INICIO DE UMA STRING, USA-SE O METODO "trim()" */
	System.out.println(resultado3);
	
	String str5 = "Hello";/* = "01234" */
	char c = str5.charAt(1); /* Para extrair um caractere de uma string, usa-se o método charAt ( ). Este método retorna o caractere na posição da string especificada. */
	System.out.println(c);
	
	
	/*Para comparar se duas strings são iguais, podemos usar o método equals da classe String. Existe também o método equalsIgnoreCase 
que compara duas strings ignorando maiúsculas e minúsculas. Esses dois métodos retornam como resultado um valor boolean. Veja os exemplos:*/
	
	String s1 = "Hello";
	String s2 = "HELLO";
	boolean b1 = s1.equals ("Hello");
	boolean b2 = s1.equals (s2);
	boolean b3 = s1.equalsIgnoreCase (s2);
	boolean b4=s1.equalsIgnoreCase("azul");
	System.out.println(b1+ " " + " " + b2 + " " + b3 +" " + b4 );
	
	String str6 = "Hello";
	int tam = str6.length( );/*O tamanho de uma string, ou seja, o número de caracteres pode ser obtido pelo método length. Este método retorna um número inteiro. */
	System.out.println(tam); /*O código acima retorna 3, já que a strings possui 3 caracteres.*/
	
	
	/*Podemos buscar a posição de caracteres ou substrings em uma String através dos métodos indexOf e lastIndexOf. Estes métodos retornam o
índice do caractere que está sendo procurado ou índice do início da substring buscada.*/
	
	String str7 = "Hello World World2";
	int pos = str7.indexOf ("l");
	System.out.println(pos); /*retorna o índice da primeira ocorrência de “l”.*/
	
	int pos2 = str7.lastIndexOf ("l");
	System.out.println(pos2); /* retorna o índice da última ocorrência de ”l”.*/
	
	
}
}
