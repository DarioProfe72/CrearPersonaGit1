package paquete2;

public class CrearPersona {

	public static void main(String[] args) {
	
		Persona persona1=new Persona("María", 30);
		persona1.mostrarInfomacion();
		
		Persona persona2=new Persona("Juan",27);
		persona2.mostrarInfomacion();

		System.out.println("-------------------------");
		System.out.println("Estuduantes");
		System.out.println("..........");
		
		Estudiante estudiante1 =new Estudiante("Anna",20,"A12345");
		estudiante1.mostrarInfomacion();
		
		Estudiante estudiante2=new Estudiante("Pedro",18,"B54321");
		estudiante2.mostrarInfomacion();
		
		Estudiante estudiante4=new Estudiante("Lola",19,"D111111");
		estudiante4.mostrarInfomacion();
	
	}

}
