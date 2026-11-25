// Programa de prueba de la interfaz PorPagar que procesa objetos
// Factura y Empleado mediante el polimorfismo.
public class PruebaInterfazPorPagar {
    public static void main(String[] args) {
        // Crea arreglo PorPagar con cuatro elementos
        PorPagar[] objetosPorPagar = new PorPagar[4];[span_80](start_span)[span_80](end_span)

        // Llena el arreglo con objetos que implementan la interfaz PorPagar
        objetosPorPagar[0] = new Factura("01234", "asiento", 2, 375.00);[span_82](start_span)[span_82](end_span)
        objetosPorPagar[1] = new Factura("56789", "llanta", 4, 79.95);[span_83](start_span)[span_83](end_span)
        objetosPorPagar[2] = new EmpleadoAsalariado("John", "Smith", "111-11-1111", 800.00);[span_84](start_span)[span_84](end_span)
        objetosPorPagar[3] = new EmpleadoAsalariado("Lisa", "Barns", "888-88-8888", 1200.60);[span_85](start_span)[span_85](end_span)

        System.out.println("Facturas y Empleados procesados en forma polimorfica:");[span_86](start_span)[span_86](end_span)

        // Procesa en forma genérica cada elemento en el arreglo objetosPorPagar
        for (PorPagar porPagarActual : objetosPorPagar) {[span_88](start_span)[span_88](end_span)
            // Imprime porPagarActual y su monto de pago apropiado
            System.out.printf("%n%s %n%s: $%,.2f%n", 
                porPagarActual.toString(), // Se podría invocar de manera implícita
                
                "pago vencido", 
                porPagarActual.obtenerMontoPago());[span_91](start_span)[span_91](end_span)
        }
    }
}