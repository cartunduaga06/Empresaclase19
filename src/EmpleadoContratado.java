public class EmpleadoContratado extends Empleado{
private final static double importePorHora = 7;
private final static  double retencionImpuesto = 0.14;


    public EmpleadoContratado(String nombre, String apellido, String  legajo ) {
        super(nombre, apellido, legajo);

    }

    @Override
    public double calcularSueldo(int dias) {
        double sueldo = (8*importePorHora*dias);
        double impuesto = sueldo *retencionImpuesto;

        return sueldo - impuesto;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
