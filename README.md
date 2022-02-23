# PruebaInstructoraJava
Prueba técnica de Java.
En este repositorio se encuentran 4 ejercicios técnicos de java.
A continuación se especifica el contenido de cada uno:

## Proyecto 1 
1- Implementar una clase propia 
2- Declarar los siguientes atributos en la clase:
Nombre 
Apellido 
CURP
RFC
Fecha de nacimiento 
Calle 
Colonia 
Ciudad 
Estado 
Código postal 
3- Encapsular los atributos de la clase Propietario 
4- Los atributos nombre, apellido, CURP y RFC son obligatorios (crear un constructor con estos parámetros) 
5- Implementar una clase de coche 
6- Declarar los siguientes atributos en la clase: 
Modelo 
Color 
Año  
Chasis 
Propietario 
Velocidad máxima 
Velocidad actual 
Número de puertas 
¿Tiene techo solar? 
Número de marchas 
¿Tiene caja de cambios automática? 
Volumen de combustible 
7- Encapsular la clase Coche y sus atributos; 
8- Implementar el método acelerar que aumenta la velocidad de 1 en 1 km/h; 
9- Implementar el método frenar que detiene el coche - Velocidad = 0 km/h; 
10- Implementar el método cambiar de marcha; 
11- Implementar el método _reduce la marcha; 
12- Cambiar la clase Propietario para que el atributo Dirección se convierta en una clase; 
13- Encapsular los atributos de la clase Dirección;
14- La dirección del propietario no puede estar vacía (cambio en el constructor para recibir la dirección); 
15- Cada vehículo tiene un propietario (implementa un constructor de vehículo pasando el propietario como parámetro); 
16- La marcha atrás no se puede engranar si la velocidad es superior a 0 KM/h; 17- Implementar un método que calcule la autonomía del vehículo en función del consumo medio pasado como parámetro; 
18- Implementar un método para mostrar el volumen de combustible; 
19- Transformar el atributo Marca de un coche en una clase Marca con nombre, nrModels, año de lanzamiento y código idenficador; 
20- Instanciar un objeto de la clase Coche, Persona, Dirección, Marca y relacionar los objetos utilizando métodos o constructores cuando sea necesario. 

## Proyecto 2 
Cree una clase en Java llamada factura para una tienda de suministros informáticos. La clase debe contener cuatro variables: 
- el número (Cadena), 
- la descripción (Cadena), 
- el importe de un artículo (int) 
- y el precio por artículo (doble). 
La clase debe tener un constructor y un método get y set para cada variable de instancia. Además, proporcione un método llamado getTotalInvoice que calcule el importe de la factura y luego devuelva el valor como un doble. Si el valor no es positivo, debe ponerse a 0. Si el precio por artículo no es positivo, debe fijarse en 0,0. Escriba una aplicación de prueba llamada InvoiceTest (en otro archivo) que demuestre las capacidades de la clase Invoice. 

## Proyecto 3 
Cree una clase llamada Empleado que incluya tres datos como variables de instancia: 
- nombre (Cadena), 
- apellido (Cadena) 
- salario mensual (doble).
La clase debe tener un constructor y métodos get y set para cada variable de instancia. 
Escriba una aplicación de prueba llamada EmployeeTest que cree dos objetos Employee y muestre el salario de cada objeto. A continuación, dé a cada empleado un aumento del 10% y muestre de nuevo el salario anual de cada empleado. Introduzca en la clase Empleado una variable de clase que pueda contar el número de empleados que han pasado por la empresa hasta la fecha.

## Proyecto 4 
Crea una clase en Java llamada IntegerSet. Cada objeto IntegerSet puede almacenar enteros en el rango de 0 a 100. El conjunto está representado por una matriz de booleanos. El elemento del array a[i] es verdadero si el entero i está en el array. El elemento del array a[j] es falso si el entero no está en el array. El constructor sin argumentos inicializa el array de Java como 'array vacío' (todos los valores son falsos). Suministre los siguientes métodos: - El método Unión crea un tercer conjunto que es la unión teórica de dos conjuntos existentes (es decir, aplica la función lógica OR sobre los conjuntos y devuelve el valor lógico verdadero o falso). 
- El método Intersección crea un tercer conjunto que es la intersección teórica de dos conjuntos existentes (es decir, se aplica la función lógica Y a los conjuntos y devuelve el valor lógico verdadero o falso). 
- El método InsertElement inserta un nuevo elemento entero k en un conjunto (estableciendo a[k] como verdadero). 
- El método deleteElement borra el entero m (poniendo a[m] en falso). 
- El método toSetString devuelve una cadena que contiene un conjunto como una lista de números separados por espacios. Incluye sólo los elementos que están presentes en el conjunto. Ulize - "representar un conjunto vacío. 
- El método ehIqualTo determina si dos conjuntos son iguales. struture 
