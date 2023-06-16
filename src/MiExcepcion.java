public class MiExcepcion extends Exception {

    private String referencia;

    public MiExcepcion(String referencia) {
        this.referencia = referencia;
    }

    public String mostrarCadena() {
        return referencia;
    }

}
