public class docenteContrato extends Docente{
    private String tipoContrato;

    public docenteContrato(String cedula, String nombre, String fechaNacimiento, String tipoSangre, String direccion, int codigo, String tipoContrato) {
        super(cedula, nombre, fechaNacimiento, tipoSangre, direccion, codigo);
        this.tipoContrato = tipoContrato;
    }

    public String getTipoContrato() {
        return tipoContrato;

    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Tipo de contrato");
        System.out.println("El tipo de contrato es: " + tipoContrato);
    }
}
