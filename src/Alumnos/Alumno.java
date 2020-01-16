package Alumnos;

public class Alumno {
	public String nombre, apellido1, apellido2, email, direccion, fNacimiento, dni ;
	public int edad;
	
	public Alumno() {
		
	}
	
	protected Alumno(String nombre, String apellido1, String apellido2, String dni, String email, String direccion,
			String fNacimiento, int edad) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.email = email;
		this.direccion = direccion;
		this.fNacimiento = fNacimiento;
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public String getDni() {
		return dni;
	}
	protected void setDni(String dni) {
		this.dni = dni;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getfNacimiento() {
		return fNacimiento;
	}
	public void setfNacimiento(String fNacimiento) {
		this.fNacimiento = fNacimiento;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	protected String identificarDNI(String dni) {
		String id = this.dni=dni;
		return id;
	}
	
	public String nombreAlumno (String n) {
		String dato = this.nombre=n;
		
		return dato;
	}
	
	public String apellido1Alumno (String a) {
		String dato = this.apellido1=a;
		
		return dato;
	}
	
	public String apellido2Alumnos (String a) {
		String dato = this.apellido2=a;
		
		return dato;
	}
	
	public String Email (String e) {
		
		String dato = this.email=e;
		
		return dato;
	}

	@Override
	public String toString() {
		return "Alumno: nombre: " + nombre + ", Primer apellido: " + apellido1 + ", Segundo apellido: " + apellido2 + ", email: " + email
				+ ", direccion: " + direccion + ", Fecha de nacimiento" + fNacimiento + ", DNI: " + dni + ", edad: " + edad;
	}
	

	
}
