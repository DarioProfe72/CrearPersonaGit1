package paquete2;

public class Estudiante extends Persona {
	private String matricula;
	
	public Estudiante(String nombre, int edad, String matricula) {
		super(nombre, edad);
		this.matricula=matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	
	@Override
	public void mostrarInfomacion(){
		super.mostrarInfomacion();
		System.out.println("Matrícula: "+matricula);
	}
	
	
	

}
