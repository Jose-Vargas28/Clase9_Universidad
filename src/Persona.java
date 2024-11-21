import java.util.Scanner;

public class Persona {
    private String cedula;
    private String nombre;
    private String fechaNacimiento;
    private String tipoSangre;
    private String direccion;

    public Persona(String cedula, String nombre, String fechaNacimiento, String tipoSangre, String direccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoSangre = tipoSangre;
        this.direccion = direccion;
    }

    private String getCedula() {
        return cedula;
    }

    private String getNombre() {
        return nombre;
    }

    private String getFechaNacimiento() {
        return fechaNacimiento;
    }

    private String getTipoSangre() {
        return tipoSangre;
    }

    private String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public void imprimir(){
        System.out.println("Los datos de la persona son: ");
        System.out.println("Cedula: " + cedula);
        //System.out.println("Cedula: " + this.getCedula());

        System.out.println("Nombre: " + nombre);
        //System.out.println("Nombre: " + this.getNombre());

        System.out.println("FechaNacimiento: " + fechaNacimiento);
        //System.out.println("FechaNacimiento: " + this.getFechaNacimiento());

        System.out.println("Tipo de Sangre: " + tipoSangre);
        //System.out.println("Tipo de Sangre: " + this.getTipoSangre());
        System.out.println("La dirección es: " + direccion);

    }

    //forma1
    public void cambiarDatos(String p1, String p2, String p3, String p4, String p5) {
        cedula = p1;
        nombre = p2;
        fechaNacimiento = p3;
        tipoSangre = p4;
        direccion = p5;


        /* forma 2
        public void cambiarDatos2(String p1, String p2, String p3, String p4, String p5){
            setCedula(p1);
            setNombre(p2);
            setFechaNacimiento(p3);
            setTipoSangre(p4);
            setDireccion(p5);
        }*/
    }
    //forma 3

    public void cambiarDatos3(){
        Scanner sc = new Scanner(System.in);
        String cedula= sc.nextLine();
        String nombre= sc.nextLine();
        String fechaNacimiento= sc.nextLine();
        String tipoSangre= sc.nextLine();
        String direccion= sc.nextLine();
        setCedula(cedula);
        setNombre(nombre);
        setFechaNacimiento(fechaNacimiento);
        setTipoSangre(tipoSangre);
        setDireccion(direccion);

    }
    public void cambiardatos4(){
        Scanner sc = new Scanner(System.in);
        this.cedula = sc.nextLine();
        this.nombre = sc.nextLine();
        this.fechaNacimiento = sc.nextLine();
        this.tipoSangre = sc.nextLine();
        this.direccion = sc.nextLine();
    }
}
