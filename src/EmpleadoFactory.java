public class EmpleadoFactory {
    public static Empleado create(String nombre, String apellido, String legajo, String codigo) throws Exception {
        return switch (codigo){
            case "EMP-INT" ->  new EmpleadoRelacionDependencia(nombre, apellido, legajo);
            case "EMP-EXT" -> new EmpleadoContratado(nombre, apellido, legajo);
            default -> throw new Exception();
        };
    }
}
