public abstract  class Empleado {
    private String nombre;
    private String apellido;
    private String legajo;

     abstract  double calcularSueldo(int dias);

    public Empleado(String nombre, String apellido, String legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", legajo='" + legajo + '\'' +
                '}';
    }
}
