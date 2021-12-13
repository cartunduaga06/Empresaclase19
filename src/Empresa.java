import java.util.HashSet;
import java.util.Set;

public class Empresa {
    private String nombre;
    private Set<Empleado> empleados;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.empleados = new HashSet<>();
    }

    public double CalcularSueldosTotal(int u){
        double acumuladora = 0;

        for (Empleado empleado :this.empleados
             ) {
            acumuladora += empleado.calcularSueldo(u);
        }
            return acumuladora;
        }

    public Set<Empleado> getEmpleados() {
        return empleados;
    }

    public void agregarEmpleado(String nombre, String apellido, String legajo, String codigo ) throws Exception{
        Empleado nuevoEmpleado = EmpleadoFactory.create(nombre, apellido, legajo, codigo);
        this.empleados.add(nuevoEmpleado);
    }
}
