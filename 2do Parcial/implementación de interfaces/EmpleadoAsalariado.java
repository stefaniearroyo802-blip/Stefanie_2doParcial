// La clase EmpleadoAsalariado que implementa la interfaz PorPagar
public class EmpleadoAsalariado extends Empleado {
    private double salarioSemanal;[span_26](start_span)[span_26](end_span)

    // Constructor
    public EmpleadoAsalariado(String primerNombre, String apellidoPaterno,
                               String numeroSeguroSocial, double salarioSemanal) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);[span_28](start_span)[span_28](end_span)

        if (salarioSemanal < 0.0) {[span_29](start_span)[span_29](end_span)
            throw new IllegalArgumentException("El salario semanal debe ser >= 0.0");[span_30](start_span)[span_30](end_span)
        }
        this.salarioSemanal = salarioSemanal;[span_31](start_span)[span_31](end_span)
    }

    // Establece el salario
    public void establecerSalarioSemanal(double salarioSemanal) {
        if (salarioSemanal < 0.0) {[span_33](start_span)[span_33](end_span)
            throw new IllegalArgumentException("El salario semanal debe ser >= 0.0");[span_34](start_span)[span_34](end_span)
        }
        this.salarioSemanal = salarioSemanal;[span_35](start_span)[span_35](end_span)
    }

    // Devuelve el salario
    public double obtenerSalarioSemanal() {
        return salarioSemanal;[span_37](start_span)[span_37](end_span)
    }

    // Calcula los ingresos; implementa el método de la interfaz PorPagar
    // que era abstracto en la superclase Empleado
    @Override
    public double obtenerMontoPago() {
        return obtenerSalarioSemanal();[span_40](start_span)[span_40](end_span)
    }

    // Devuelve representación String de un objeto EmpleadoAsalariado
    @Override
    public String toString() {
        return String.format("Empleado asalariado: %s%n%s: $%,.2f",
            super.toString(), "salario semanal", obtenerSalarioSemanal());[span_42](start_span)[span_42](end_span)
    }
}