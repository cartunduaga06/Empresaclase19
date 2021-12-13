public class EmpleadoRelacionDependencia extends Empleado{

    private final static double sueldoMensual = 1000;

    public EmpleadoRelacionDependencia(String nombre, String apellido, String  legajo ) {
        super(nombre, apellido, legajo);

    }

    @Override
    public double calcularSueldo(int dias) {
        return sueldoMensual;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
