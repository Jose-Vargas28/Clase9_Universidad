public class docenteNombramiento extends Docente{
    private String nombramiento;

    public docenteNombramiento(String cedula, String nombre, String fechaNacimiento, String tipoSangre, String direccion,  int codigo, String nombramiento) {
        super(cedula, nombre, fechaNacimiento, tipoSangre, direccion, codigo);
        this.nombramiento = nombramiento;
    }

    public String getNombramiento() {
        return nombramiento;
    }

    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Nombramiento Docente");
        System.out.println("El docente contratado cuenta con nombramiento?: " + nombramiento);
    }
}
