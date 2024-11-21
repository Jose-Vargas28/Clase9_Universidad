public class estudianteBecado extends Estudiante{
    private String tipoBeca;

    public estudianteBecado(String cedula, String nombre, String fechaNacimiento, String tipoSangre, String direccion,
                            int codigo, String tipoBeca) {
        super(cedula, nombre, fechaNacimiento, tipoSangre, direccion, codigo);
        this.tipoBeca = tipoBeca;
    }

    public String getTipoBeca() {
        return tipoBeca;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Estudiante Becado");
        System.out.println("El tipo de beca es: " + tipoBeca);
    }
}
