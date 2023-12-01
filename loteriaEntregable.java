package u3.entregable;

import java.util.Iterator;

public class loteriaEntregable {
public static void main(String[] args) {

int numeroBolas=99999;
int numeroPremios=1807;

String [] tipoPremio = {"primer premio","segundo premio","tercer premio","cuarto premio","quinto premio","pedrea"};


System.out.println(creaBomboNumeros(numeroBolas));
System.out.println(creaBomboPremios(numeroPremios));
 }

public static int[] creaBomboNumeros(int numeroBolas) {
	
	int[] numero=new int [100000];
	int i;
	for (i = 0; i < numeroBolas; i++) {
		
		numero[i] = (int) (Math.random() * 100000);
	}
	
	return numero;
}

public static int[] creaBomboPremios(int numeroPremios) {
	
	int[] numero=new int [1808];
	int i;
	for (i = 0; i < numeroPremios; i++) {
		
		numero[i] = (int) (Math.random() * 1807);
	}
	
	return numero;
}

public static void listadoPremios (int[] numero, int[] premio) {
	
	for (int i = 0; i < numero.length; i++) {
		for (int j = 0; j < premio.length; j++) {
			System.out.println("Listado oficial de premios:");
			System.out.println("Numero "+premio[j]+" agraciado con:");
		}	
	}
	
	
}

public static int[] dameNumero(int [] numeros) {
	
	for (int i = 0; i < 99999; i++) {
		numeros[i] = (int) (Math.random() * 100000);
	 }	
	
	return numeros;
}


public static int[] damepremios(int [] premios) {
	
	int primerPremio=0;
	int segundoPremio=0;
	int tercerPremio=0;
	int[] cuartoPremio= new int [2];
	int[] quintoPremio= new int [8];
	int[] pedreas = new int[1794];
	
	for (int i = 0; i < 1807; i++) {
		premios[i]=(int) (Math.random()*1807);
		
		for (int j = 0; j < pedreas.length; j++) {
			premios[i]=pedreas[j];
		}
	}	
	
	return pedreas;
	
}


}

//String numeroFormateado=String.formar("%05d".numeroAgraciado
