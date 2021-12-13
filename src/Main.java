public class Main {
    public static void main(String[] args) throws Exception {
        Empresa empresa = new Empresa("Exito");

        empresa.agregarEmpleado("ASUCBUAISC","ABCSJAC","1","EMP-INT");
        empresa.agregarEmpleado("ACUBASUC", "ACNAJSCNA", "2", "EMP-EXT");
        System.out.println(empresa.CalcularSueldosTotal(30));
        System.out.println(empresa.getEmpleados());
    }
}
