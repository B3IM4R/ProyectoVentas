**Ejercicio Base:**
-

En su labor como programador de software ha sido elegido para el desarrollo de una aplicación que necesita el jefe de una empresa de muebles, que desea calcular el promedio de ventas durante 3 meses. El jefe evalúa a los empleados y calcula el promedio general de ventas. Como información básica de cada empleado, se debe registrar el número que lo identifica, su nombre y punto de venta.

Aclaraciones:

+ Se supondrá que la aplicación solo se requiere para calcular el promedio de ventas de cada empleado en un periodo de tres meses.
+ Para efectos de mantener la simplicidad del ejemplo no se contemplan manejar persistencia en el almacenamiento de los datos.
+ No se realiza validación, ni se verifica calidad en los datos ingresados.

***

**Análisis del Ejercicio**
-

<u>**Historia de Usuario**</u>

![HU Empleado](/Images/HU.png)

---

<u>**Caso de Uso**</u>

![DCU Promedio](/Images/DCU.png)

> Descripción Caso de Uso:

*Nombre:* Calcular Promedio Ventas Empleados

*Actores:* Jefe

*Propósito:* Guardar identificación, nombre y punto de venta para calcular promedio de ventas. 

*Curso Normal de Eventos:*

1. El jefe ingresa la cantidad de empleados.
2. El jefe ingresa identificación, nombre y el punto de venta del empleado.
3. Se calcula el promedio de ventas a partir de: 
((venta1mes + venta2mes + venta3mes ) / 3) / Número Empleados 
1. Se muestra el promedio total de ventas de los empleados.

*Postcondiciones:* Promedio de Ventas Calculado
***

<u>**Diagrama de Flujo**</u>

![](/Images/DFPV.png)

Entender el anterior diagrama no debe presentar mayores problemas. Sin embargo, es conveniente realizar las siguientes aclaraciones y comentarios:

- Aunque se puede condensar el código incluyendo las instrucciones del segundo “Para” dentro del primero, de manera intencional se ha dejado así intencionalmente para delimitar funcionalmente cada bloque de código.
- En el algoritmo se captura información, como el ID, el nombre y el punto de venta, que no se utiliza; sin embargo, esta información se mantiene porque posteriormente puede ser útil para ampliar la funcionalidad de la aplicación. Inicialmente el algoritmo no contempla validaciones como impedir el doble ingreso de un mismo número de identificación.
---

<u>**Seudocódigo**</u>

```
Inicio

Caracteres: identificaciones [50], nombres [50], puntosVenta [50]
Real: ventaPrimerMes [50], ventaSegundoMes [50], ventaTercerMes [50]
Caracteres: id, nombre, puntoV
Entero: numEmpleados, i
Real: venta1Mes, venta2Mes, venta3Mes, promedioVentas <- 0
Imprimir: ‘Ingrese el número de empleados:’
Asignar: numEmpleados
Para i = 0 hasta numEmpleados - 1, 1
Imprimir: ‘Digite la identificación del empleado: ’
Asignar: id
Imprimir: ‘Ingrese el ID del empleado: ’
Asignar: id            
Imprimir: ‘Ingrese el nombre del empleado: ’
Asignar: nombre 
Imprimir: ‘Ingrese el punto de venta del empleado: ’ 
Asignar: puntoV             
Imprimir: ‘Ingrese la cantidad vendida en el primer mes por el empleado: ’
Asignar: venta1Mes
Imprimir: ‘Ingrese la cantidad vendida en el segundo mes por el empleado: ’
Asignar: venta2Mes 
Imprimir: ‘Ingrese la cantidad vendida en el tercer mes por el empleado: ’
Asignar: venta3Mes 
identificaciones[i] <- id
nombres[i] <- nombre
puntosVenta [i] <- puntoV
ventaPrimerMes[i] <- venta1Mes
ventaSegundoMes[i] <- venta2Mes
ventaTercerMes[i] <- venta3Mes
finPara
Para i=0 hasta numeroEstudiantes -1, 1
promedioVentas <-
promedioVentas + ((ventaPrimerMes[i] + ventaSegundoMes[i] + ventaTercerMes[i]) / 3 ) / numEmpleados
finPara
Imprimir: ‘El promedio de Ventas es: ’ + promedioVentas

Fin
```
***

