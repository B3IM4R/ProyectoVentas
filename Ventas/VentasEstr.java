
/**
 * Write a description of class VentasEstr here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class VentasEstr
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
    
        String[] identificaciones = new String[50];
        String[] nombres = new String[50];
        String[] puntosVenta = new String[50];
        
        double[] ventaPrimerMes = new double[30];
        double[] ventaSegundoMes = new double[30];
        double[] ventaTercerMes = new double[30];
        
        int numEmpleados;
        
        String id, nombre, puntoV;
        
        double venta1Mes, venta2Mes, venta3Mes;
        double promedioVentas = 0;
        
        System.out.println("Ingrese la cantidad de empleados: ");
        numEmpleados = sc.nextInt();
        
        for(int i = 0; i < numEmpleados; i++)
        {
            System.out.println("Ingrese el ID del empleado: ");
            id = sc.next();
            
            System.out.println("Ingrese el nombre del empleado: ");
            nombre = sc.next();
            
            System.out.println("Ingrese el punto de venta del empleado: ");
            puntoV = sc.next();
            
            System.out.println("Ingrese la cantidad vendida en el primer mes por el empleado: ");
            venta1Mes = sc.nextDouble();
            
            System.out.println("Ingrese la cantidad vendida en el segundo mes por el empleado: ");
            venta2Mes = sc.nextDouble();
            
            System.out.println("Ingrese la cantidad vendida en el tercer mes por el empleado: ");
            venta3Mes = sc.nextDouble();
            
            identificaciones[i] = id;
            nombres[i] = nombre;
            puntosVenta[i] = puntoV;
            ventaPrimerMes[i] = venta1Mes;
            ventaSegundoMes[i] = venta2Mes;
            ventaTercerMes[i] = venta3Mes;
        }
        
        for(int i = 0; i < numEmpleados; i++)
        {
            promedioVentas = promedioVentas + ((ventaPrimerMes[i] + ventaSegundoMes[i] + ventaTercerMes[i]) / 3 ) / numEmpleados;   
        }
        
        System.out.println("El promedio de ventas es: " + promedioVentas);
    }
}
