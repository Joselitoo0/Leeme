package es.studium.CadenaMasCorta;

import java.util.Scanner;

public class CadenaMasCorta 
{
	//Contruimos la funcion para hayar la cadena más corta
	
	public static String getCadenaMasCorta(String[] cadenas) 
	{
		
		String cadena = cadenas[0];
		for(int i=1;i<10;i++) 
		{
		 	if(cadena.length()>cadenas[i].length())
		 	{
		 		
		 		cadena=cadenas[i];
		 	}
		}
		
		return cadena;
	}

	public static void main(String[] args) 
	
	{
		
		Scanner teclado = new Scanner(System.in);
		
		String cadenas[] = new String[10];
	
		
		System.out.println("Introduce 10 cadenas de texto");
		
		for(int i=1;i<=10;i++)
		{
			//Vamos mostrando las cadenas por pantalla
			
			System.out.println(i+":");
			cadenas[i-1]=teclado.next();
		}
		
		//Mostramos la cadena más corta tras compararlas entre ellas
		System.out.println("La cadena mas corta es:"+ getCadenaMasCorta(cadenas));
		
		teclado.close();
		

	}

}
