public class estudianteDeportista extends Estudiante{
    private String tipoDeporte;

    public estudianteDeportista(String cedula, String nombre, String fechaNacimiento, String tipoSangre, String direccion, int codigo, String tipoDeporte) {
        super(cedula, nombre, fechaNacimiento, tipoSangre, direccion, codigo);
        this.tipoDeporte = tipoDeporte;
    }
    public String getTipoDeporte() {
        return tipoDeporte;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Estudiante deportista");
        System.out.println("El tipo de deporte practicado es: " + tipoDeporte);
    }
}
