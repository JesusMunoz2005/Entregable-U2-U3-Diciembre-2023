package u3.entregable;

import java.util.Scanner;

public class palindromo {
public static void main(String[] args) {

System.out.println("Introduzca por teclado una frase:");
Scanner sc = new Scanner(System.in);
String frase= sc.nextLine().toLowerCase();

StringBuilder fraseBuild = new
StringBuilder(frase);
boolean palindromo=false;

StringBuilder reverse = fraseBuild.reverse(); //mete fraseBuild invertido en un nuevo stringBuilder llamado reverse

String fraserev=reverse.toString(); //convertimos a string


if (frase.equals(fraserev)){ //si la frase introducida es igual a la frase introducida invertida la booleana palidromo es verdadera
	palindromo=true;
}

if (palindromo==true) { //si es verdadera se imprime que es un palindromo y sino, que no
	System.out.println("La cadena es un palindromo");
}else if(palindromo==false){
	System.out.println("La cadena NO es un palindromo");	
}
	
 }
}
