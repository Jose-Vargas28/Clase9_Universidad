public class Docente extends Persona{
    private int codigo;

    public Docente(String cedula, String nombre, String fechaNacimiento, String tipoSangre, String direccion, int codigo ) {
        super(cedula, nombre, fechaNacimiento, tipoSangre, direccion);
        this.codigo = codigo;
    }

    private int getCodigo() {
        return codigo;
    }
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Los datos del docente son: ");
        System.out.println("Codigo del docente: " + getCodigo());
    }
}
