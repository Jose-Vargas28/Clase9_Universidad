
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String cedula;
        String nombre;
        String fechaNacimiento;
        String tipoSangre;
        String direccion;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cédula: ");
        cedula = sc.nextLine();
        System.out.println("Ingrese el nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese la f. nacimiento: ");
        fechaNacimiento = sc.nextLine();
        System.out.println("Ingrese el tipo de sangre: ");
        tipoSangre = sc.nextLine();
        System.out.println("Ingrese la direccion: ");
        direccion = sc.nextLine();


        Persona persona1=new Persona(cedula, nombre, fechaNacimiento, tipoSangre, direccion);
        persona1.imprimir();

        persona1.cambiarDatos("1723589871", "Juan Mendez", "21/10/2000", "O+", "El Valle");
        System.out.println("Nuevos Datos");
        persona1.imprimir();






        //Persona persona2=new Persona(cedula, nombre, fechaNacimiento, tipoSangre, direccion);








        //persona1.cambiarDatos(cedula, nombre, fechaNacimiento, tipoSangre, direccion);

       // persona2.imprimir();


       /* Estudiante estudiante1=new Estudiante("1789567892", "Pedro Andrade", "15/05/2002",
                "A+", 58584841);

        estudiante1.imprimir();

        estudianteBecado estudianteBecado1=new estudianteBecado("1784856565", "Juan Macias",
                "10/02/2001", "B+", 47845415, "Media Beca" );
        estudianteBecado1.imprimir();

        estudianteDeportista estudianteDeportista1=new estudianteDeportista("1789562312","Robert Ayoví",
                "25/04/2001", "AB+",47898451, "Fútbol");

        estudianteDeportista1.imprimir();*/


    }
}