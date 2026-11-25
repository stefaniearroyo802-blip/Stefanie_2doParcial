// La clase Factura implementa a PorPagar
public class Factura implements PorPagar {
    private final String numeroPieza;[span_44](start_span)[span_44](end_span)
    private final String descripcionPieza;[span_45](start_span)[span_45](end_span)
    private int cantidad;[span_46](start_span)[span_46](end_span)
    private double precioPorArticulo;[span_47](start_span)[span_47](end_span)

    // Constructor
    public Factura(String numeroPieza, String descripcionPieza, int cantidad, double precioPorArticulo) {
        if (cantidad < 0) { // Valida la cantidad
            throw new IllegalArgumentException("Cantidad debe ser >= 0");[span_50](start_span)[span_50](end_span)
        }
        if (precioPorArticulo < 0.0) { // Valida el precio por artículo
            throw new IllegalArgumentException("El precio por articulo debe ser >= 0");[span_52](start_span)[span_52](end_span)
        }

        this.cantidad = cantidad;[span_53](start_span)[span_53](end_span)
        this.numeroPieza = numeroPieza;[span_54](start_span)[span_54](end_span)
        this.descripcionPieza = descripcionPieza;[span_55](start_span)[span_55](end_span)
        this.precioPorArticulo = precioPorArticulo;[span_56](start_span)[span_56](end_span)
    }

    // Obtiene el número de pieza
    public String obtenerNumeroPieza() {
        return numeroPieza;[span_58](start_span)[span_58](end_span)
    }

    // Obtiene la descripción
    public String obtenerDescripcionPieza() {
        return descripcionPieza;[span_60](start_span)[span_60](end_span)
    }

    // Establece la cantidad
    public void establecerCantidad(int cantidad) {
        if (cantidad < 0) {[span_62](start_span)[span_62](end_span)
            throw new IllegalArgumentException("Cantidad debe ser >= 0");[span_63](start_span)[span_63](end_span)
        }
        this.cantidad = cantidad;[span_64](start_span)[span_64](end_span)
    }

    // Obtener cantidad
    public int obtenerCantidad() {
        return cantidad;[span_66](start_span)[span_66](end_span)
    }

    // Establece el precio del artículo
    public void establecerPrecioPorArticulo(double precioPorArticulo) {
        if (precioPorArticulo < 0.0) {[span_68](start_span)[span_68](end_span)
            throw new IllegalArgumentException("El precio por artículo debe ser >= 0");[span_69](start_span)[span_69](end_span)
        }
        this.precioPorArticulo = precioPorArticulo;[span_70](start_span)[span_70](end_span)
    }

    // Obtiene el precio por artículo
    public double obtenerPrecioPorArticulo() {
        return precioPorArticulo;[span_72](start_span)[span_72](end_span)
    }

    // Devuelve representación String de un objeto Factura
    @Override
    public String toString() {
        return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f",
            "factura", "numero de pieza", obtenerNumeroPieza(), obtenerDescripcionPieza(),[span_74](start_span)[span_74](end_span)
            "cantidad", obtenerCantidad(), "precio por articulo", obtenerPrecioPorArticulo());[span_75](start_span)[span_75](end_span)
    }

    @Override
    public double obtenerMontoPago() {
        return obtenerCantidad() * obtenerPrecioPorArticulo();[span_76](start_span)[span_76](end_span)
    }
}

