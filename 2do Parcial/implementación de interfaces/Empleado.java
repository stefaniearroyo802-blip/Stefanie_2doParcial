public abstract class Empleado implements PorPagar {
    private final String primerNombre;[span_8](start_span)[span_8](end_span)
    private final String apellidoPaterno;[span_9](start_span)[span_9](end_span)
    private final String numeroSeguroSocial;[span_10](start_span)[span_10](end_span)

    // Constructor
    public Empleado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial) {
        this.primerNombre = primerNombre;[span_12](start_span)[span_12](end_span)
        this.apellidoPaterno = apellidoPaterno;[span_13](start_span)[span_13](end_span)
        this.numeroSeguroSocial = numeroSeguroSocial;[span_14](start_span)[span_14](end_span)
    }

    // Devuelve el primer nombre
    public String obtenerPrimerNombre() {
        return primerNombre;[span_16](start_span)[span_16](end_span)
    }

    // Devuelve el apellido paterno
    public String obtenerApellidoPaterno() {
        return apellidoPaterno;[span_18](start_span)[span_18](end_span)
    }

    // Devuelve el número de seguro social
    public String obtenerNumeroSeguroSocial() {
        return numeroSeguroSocial;[span_20](start_span)[span_20](end_span)
    }

    // Devuelve representación String de un objeto Empleado
    @Override
    public String toString() {
        return String.format("%s %s%nnumero de seguro social: %s",
            obtenerPrimerNombre(), obtenerApellidoPaterno(), obtenerNumeroSeguroSocial());[span_22](start_span)[span_22](end_span)
    }

    // NOTA: Aquí no implementamos el método obtenerMontoPago de PorPagar, así que[span_23](start_span)[span_23](end_span)
    // esta clase debe declararse como abstract para evitar un error de compilación.[span_24](start_span)[span_24](end_span)
}