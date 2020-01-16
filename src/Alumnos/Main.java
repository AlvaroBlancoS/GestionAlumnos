package Alumnos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Boolean existe = false;
		int indice = 0;
		Scanner in = new Scanner(System.in);
		/*
		 *Sencillamente hemos creado tres objetos de alumnos de ejemplos para comprobar 
		 *si el el DNI existe o no cuando va recorriendo el iterator con arrayList.  
		 * */
		Alumno Juan = new Alumno("Juan", "Garcia", "Fernandez", "1234567-L", "blabla", "blabla", "1-1-20", 20);
		Alumno Alvaro = new Alumno("Alvaro", "Garcia", "Fernandez", "98741200-S", "blabla", "blabla", "1-1-20", 20);
		Alumno Miguel = new Alumno("Miguel", "Garcia", "Fernandez", "63214389-Q", "blabla", "blabla", "1-1-20", 20);

		//Hemos creado una lista de array de la clase alumno- arrayList
		ArrayList<Alumno> a = new ArrayList<Alumno>();
		
		a.add(Juan);
		a.add(Alvaro);
		a.add(Miguel);
		Juan.toString();
		System.out.println("");
		System.out.println("------Lista de los alumnos------");
		System.out.println("");
		System.out.println(Juan.toString()+"\n"+Alvaro.toString()+"\n"+Miguel.toString());
		
//		mostrarArrayList(a);

		System.out.println("Escribe el DNI por favor");
		
		//Hemos creado un iterador para recorrer la lista de array
		Iterator<Alumno> i = a.iterator();
		// Obtenemos el DNI por teclado
		String dniABuscar = in.nextLine();
		// ---------------------------BUSCAR EL DNI-----------------------------

		// Procedemos a buscar el DNI
			if (i.hasNext()) {
				// Buscamos el DNI con el iterator
				while (i.hasNext() && existe == false) {
					// Queremos ver si ArrayList tiene un Alumno con dni = nextLine
					// Hacemos una copia de cada alumno, y obtenemos su dni. En esta linea, hacemos
					// la copia
					Alumno ejemplo = i.next();
					// En esta linea, comparamos el DNI del alumno que hemos hecho copia con el DNI
					// que buscamos
					if (ejemplo.dni.equalsIgnoreCase(dniABuscar)) {
						existe = true;
					}
					
					//El indice permitirá recoger la posición que ya ha sido encontrado
					indice++;
				}
			} else {
				System.out.println("La lista esta vacia");
				// INSERTAR un nuevo alumno
			}
			
	

		// ----------------ELIMINAR, INSERTAR O MODIFICAR-------------------------

		// Ahora, si el alumno que buscamos ya existe: se puede modificar o eliminar
		if (existe) {
			System.out.println("Parece que el alumno ya existe, puedes:");
			System.out.println("");
			System.out.println("1-Eliminar.");
			System.out.println("2-Modificar.");
			System.out.println("3-Salir.");
			int opcion = in.nextInt();
			Scanner en = new Scanner(System.in);
			switch (opcion) {
			
			case 1: // ELIMINAR
				System.out.println("Estás seguro? si/no");
				String sn = en.nextLine();
				if (sn.equalsIgnoreCase("si")) {
					a.remove(indice - 1);
					System.out.println("Ha sido eliminado con exito.");
					mostrarArrayList(a);
				} else {
					mostrarArrayList(a);

				}

				break;

			case 2: // MODIFICAR
				System.out.println("Que quieres modificar? (nombre/apellido/apellido2/email/direccion/FN/edad)");
				
				String opc = en.nextLine().toLowerCase();
				
				switch (opc) {
				case "nombre":
					System.out.println("Escribe el nuevo nombre");
					String nuevoNombre = en.nextLine();
					a.get(indice-1).setNombre(nuevoNombre);
					mostrarArrayList(a);
					
					break;

				case "apellido":
					System.out.println("Escribe el nuevo apellido");
					String nuevoApellido = en.nextLine();
					a.get(indice-1).setApellido1(nuevoApellido);
					mostrarArrayList(a);

					break;
					
				case "apellido2":
					System.out.println("Escribe el nuevo apellido 2");
					String nuevoApellido2= en.nextLine();
					a.get(indice-1).setApellido2(nuevoApellido2);
					mostrarArrayList(a);
					
					break;	
				case "email":
					System.out.println("Escribe el nuevo email");
					String nuevoEmail= en.nextLine();
					a.get(indice-1).setEmail(nuevoEmail);
					mostrarArrayList(a);
					
					break;
				case "direccion":
					System.out.println("Escribe el nuevo direccion");
					String nuevoDireccion= en.nextLine();
					a.get(indice-1).setDireccion(nuevoDireccion);
					mostrarArrayList(a);
					
					break;
				case "fn":
					System.out.println("Escribe el nuevo fecha nacimiento");
					String nuevoFN= en.nextLine();
					a.get(indice-1).setfNacimiento(nuevoFN);
					mostrarArrayList(a);
		
					break;
				case "edad":
					System.out.println("Escribe el nuevo fecha nacimiento");
					int nuevoEdad= en.nextInt();
					a.get(indice-1).setEdad(nuevoEdad);
					mostrarArrayList(a);
					
					break;	

				default:
					break;
				}

				break;

			case 3: // SALIR

				System.out.println("Hasta luego campeon");
				break;

			default:
				break;
			}

			// MODIFICAR
		}
		// Si no existe, preguntamos al usuario si quiere insertarlo o sino, volvemos a
		// buscar un DNI si no quiere
		else {
			System.out.println("Parece que no existe, quieres insertarlo? (si/no)");
			String resp = in.nextLine();
			if (resp.equalsIgnoreCase("si")) {
				// "Juan", "Garcia", "Fernandez", "088888888J", "blabla", "blabla", "1-1-20", 20
				System.out.println("Escribe el nombre");
				String nombre = in.nextLine();
				System.out.println("Escribe el primer apellido");
				String apellido = in.nextLine();
				System.out.println("Escribe el segundo apellido");
				String apellido2 = in.nextLine();
				System.out.println("Escribe email");
				String email = in.nextLine();
				System.out.println("Escribe la direccion");
				String direccion = in.nextLine();
				System.out.println("Escribe la fecha de nacimiento");
				String naci = in.nextLine();
				System.out.println("Escribe la edad");
				int edad = in.nextInt();
				Alumno nuevo = new Alumno(nombre, apellido, apellido2, dniABuscar, email, direccion, naci, edad);
				a.add(nuevo);
				mostrarArrayList(a);

			} else {
				System.out.println("Hasta luego campeon");
			}
		}

	}

	public static void mostrarArrayList(ArrayList<Alumno> a) {
		System.out.println("");
		System.out.println("-----Lista De Alumnos-----");
		System.out.println("");
		for (Alumno ejemplo : a) {
			
			System.out.println("Alumno: " + ejemplo.nombre + " Apellido: " + ejemplo.apellido1 + " DNI: " + ejemplo.dni);
			
		}
		System.out.println("");
	}

}
