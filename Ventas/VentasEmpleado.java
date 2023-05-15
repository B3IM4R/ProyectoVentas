
/**
 * Write a description of class VentasEmpleado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class VentasEmpleado
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numEmpleados;
        EmpleadoPoo[] losEmpleados = new EmpleadoPoo[50];
        String id, nombre, puntoV;
        double venta1Mes, venta2Mes, venta3Mes;
        double promedioVentas = 0 ;
        
        System.out.println("Ingrese el numero de Empleados: ");
        numEmpleados = sc.nextInt();
        
        for(int i = 0; i < numEmpleados ; i++)
        {
            System.out.println("Ingrese el ID del Empleado: ");
            id = sc.next();
            System.out.println("Ingrese el nombre del Empleado: ");
            nombre = sc.next();
            System.out.println("Ingrese el punto de venta del Empleado: ");
            puntoV = sc.next();
            System.out.println("Ingrese la cantidad vendida en el primer mes por el empleado: ");
            venta1Mes = sc.nextDouble();
            System.out.println("Ingrese la cantidad vendida en el segundo mes por el empleado: ");
            venta2Mes = sc.nextDouble();
            System.out.println("Ingrese la cantidad vendida en el tercer mes por el empleado: ");
            venta3Mes = sc.nextDouble();
            
            EmpleadoPoo unEmpleado = new EmpleadoPoo();
            unEmpleado.identificaciones = id;
            unEmpleado.nombre = nombre;
            unEmpleado.puntoVenta = puntoV;
            unEmpleado.ventaPrimerMes = venta1Mes;
            unEmpleado.ventaSegundoMes = venta2Mes;
            unEmpleado.ventaTercerMes = venta3Mes;
            losEmpleados[i] = unEmpleado;
          }
          for (int i = 0; i < numEmpleados; i++){
              double sum = (losEmpleados[i].ventaPrimerMes + losEmpleados[i].ventaSegundoMes + losEmpleados[i].ventaTercerMes) / 3;
              promedioVentas = promedioVentas + sum / numEmpleados;
            }
            System.out.println("El promedio de ventas es: " + promedioVentas);
    }
}
