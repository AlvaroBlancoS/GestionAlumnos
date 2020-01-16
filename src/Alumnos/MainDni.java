package Alumnos;

import java.util.Scanner;

public class MainDni {

	public static void main(String[] args) {
		Nif nf1 = new Nif();
		StringBuilder s = new StringBuilder();
		Scanner in = new Scanner(System.in);
		System.out.println("Inserta el DNI");
		int dni = in.nextInt();
		while (dni <=10000000) {
			System.out.println("Tiene que ser ocho dígito, vuelva a escribir correctamente por favor:");
			dni = in.nextInt();
		}
		nf1.setDni(dni);
		s.append(nf1.getDni());
		s.append("-");
		s.append(nf1.calculaLetra(dni));

			
		
			//Tiene que ser ocho dígitos
			System.out.println(s);
	}

}
