/*
INGRESO POR TECLADO
Scanner console  = new Scanner(System.in);
console.nextLine();
console.nextInt();
int dni = Integer.parseInt(console.nextLine());

Tipos de datos: 
Si agrego una l al final de un int casteo de long a int (int)
Si agrego una D al final de un float casteo de double a float (float)
Tipo_dato.MAX_VALUE
Tipo_dato.MIN_VALUE
var tipoFloat = 10.0F; //le agrego el F por por defecto los numeros con coma son doubles de 64 bit
final--> hace constantes las variables.

MANEJO DE STRINGS
valueOf --> convertir tipo de dato a string
ej. var edad = Integer.valueOf(10);
charAt(int)--> pongo la posicion de la string y me guarda la letra.
equals --> comparar contenidos. 
ej. var q = a.equals(cadena2);
public boolean equals (Object o){
       Class objeto = (Class) o; 
       return((dia==objeto.dia)&&(mes==objeto.mes)&&(anio==objeto.anio)); 
substring(desde,hasta)
int pos1 = s.indexOf('e'); //retorna el numero de la posicion donde se encuentra e en la string
int pos1 = s.lastindexOf('e'); //retorna el numero de la posicion donde se encuentra la última e en la string
Formas de concatenar strings:
1) String.format
ej. String resultado = String.format("%d%d", a , b); %d porq es entero. esto guarda 1020
2) cadena3 = cadena1 + " " + cadena2;

OPERADOR TERNARIO 
(condicion) ? (valor si la condicion sale verdadera) : (valor si la condicion sale falsa)


SWITCH
dos tipos
1)  switch(num){
    case 1,2,6 ->
    break; 
2) el tipico

CICLOS
continue: salta a la siguiente iteracion. no ejecuta lo que esta por debajo de el
break: sale directamente del ciclo.
etiquetas-->para redireccionar programa. 
ej.inicio:
    for(.....){
    if(...){
    continue incio;
    }
    }

ARREGLOS
1VARIABLE
dos formas de declarar
1)int [] arreglo = new int[5];
  arreglo[0] = 1; 
  arreglo[1]= 3;
2)int arreglo[] = {1,2,3,4,5}; 

metodo length -->tamaño arreglo. array.length
for (int ii = 0; ii<arreglo.length ; ii++)

2VARIABLES
dos formas
1)int [][] matriz = new int [filas][columnas]; 
2)int [][] matriz = {{0,1,2},{3,4,5},{6,7,8}};
for (int filas = 0; filas <matriz.length; filas++){
        for (int columnas = 0; columnas < matriz[filas].length; columnas++){
        }
        }

NUMEROS RANDOM
var aleatorio = new Random();
int valorAleatorio = aleatorio.nextInt(100+1)

VALOR ABSOLUTO
var numeroAbs = Math.abs(variable);

SOBRE-ESCRITURA MÉTODO EQUALS  -->pongo este ejemplo porq tambien me sirve para pasar los objetos a funciones.
public boolean equals (Object o){
ejercicio2 r = (ejercicio2)o;
return (dia==r.dia) && (mes==r.mes) && (anio==r.anio);}
*/
