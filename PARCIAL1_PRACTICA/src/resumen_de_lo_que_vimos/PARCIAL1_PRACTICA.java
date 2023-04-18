
package resumen_de_lo_que_vimos;



public class PARCIAL1_PRACTICA 
{

    public static void main(String[] args) 
    {
   /*A este resumen lo voy a divir por las distintas clases que tuvimos a lo largo de lo que va del año
        
        
   CLASE 13-4-23
        1- VIMOS COMO SE INGRESA POR TECLADO. Acordate que hay que importar el scanner "import java.util.Scanner".
        
        Scanner console;
        console = new Scanner(System.in);
        System.out.println("Ingresar tu numero de DNI");
        int dni = Integer.parseInt(console.nextLine());//lo que hago es castear de string (que es lo que me devuelve scanner) a int.
        System.out.println("" + dni);
       ------------------------------------------------------------------------------------------------------------------------------
        
        2- Algunos TIPOS DE DATOS
        
        a) Tipo Byte (puede correr numeros de -128 a 127). A esto lo podemos ver con 
        System.out.println(" " + Byte.MAX_VALUE);
        System.out.println(" " + Byte.MIN_VALUE);
        
        
        b) Tipo Int en int podemos agregar un l al final del numero que ponemos en la 
        variable (hardcodeado) para castear un long a int Por defecto en java todos los numeros sin punto se los trata como enteros de 32 bits
        por ejempl: 
        int datoInt = (int) 121354875454l;
        System.out.println(" " + Integer.MAX_VALUE);
        System.out.println(" " + Integer.MIN_VALUE);
        
        c) Tipo Short 
        short dato = (short)0; 
         System.out.println(" " + Short.MAX_VALUE);
         System.out.println(" " + Short.MIN_VALUE);
        
        d) Tipo con coma por defecto los numeros con coma son doubles de 64 bit
        
        --> float: 
        float numero = (float)3.123456789987654321D; 
        el float admite menos caracteres que el double. Es por eso que poniendo
        una D al final, es posible castear de double a float permitiendo que se
        guarden más numeros. 
        
        --> double: 
       En este caso no es necesario poner una D al final.
        double dato = 3.123456789987654321;
        
        
        
        
   <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        
   CLASE 16-3-23     
        
        e) Tipo Var no se puede usar var fuera de los métodos.
        
        var tipoFloat = 10.0F; //le agrego el F por por defecto los numeros con coma son doubles de 64 bit
        
        ej
        var varChar = (char) 33;
        
        f) Tipo Char comillas simples para las letras. Las comillas dobles son para string
        char dato = 'a'; 
        es posible usar variables tipo UNICODE. por ejemplo, guardar ! puedo hacerlo de dos formas: 
        
        --> char varChar = '!';
        --> char variable = '\u0021';
        --> char variable = 33;
        
        ahora bien, si yo guardo en un entero !, me va a devolver el caracter unicode referido a ese simbolo
        
        int variable = '!';
        o
        int variable = 'a';
        
        
        G) Tipo Boolean boolean
        le podes asignar o true o false.
        un ejemplo que esta bueno de esto es. 
        var resultado = 10 >= 0 && 5 <= 10; //aca se guardaria un true. en vez de var puedo poner boolean
        
        H) FINAL --> hace constantes las variables. 
        ej final int renglon = 3; es usado muchas veces para definir columnas y filas de las matrices ya que estas no cambian a lo largo de la ejecucion
        
   -------------------------------------------------------------------------------------------------------------------------------------------------------------
       vimos el if. pabadita
       vimos las relaciones <   >    <=    >=    !=    ||    &&  !=
   -------------------------------------------------------------------------------------------------------------------------------------------------------------
        TIPOS DE CASTEO
       
        
        --> String a entero
        var edad = Integer.parseInt("20"); 
        otro ej;
        String a=10,b=20; 
        
        int c= Integer.parseInt(a) + Integer.parseInt(b); en este caso no se concatenan las strings sino que me imprime 30
        
        -->String a double 
        var variable = Double.parseDouble("3.1416"); 
        
        --> Cualquier tipo a string 
        var edad = Integer.valueOf(10); 
        DOUBLE
        FLOAT
        ...
        
       
        
        
        MANEJO DE STRINGS
        
        --> metodo charAt(int)-->me permite poner una posicion de string, lo cual se va a guardar en la variable
        ej: 
        var dato = "hola".charAt(0); //como puse un cero, me va a permitir guardar en dato la letra h que corresponde al lugar 0 del string
        ej. me puede servir tambien para recorrer una string
        for(int i=0; i<cadena.length(); i++){
        sout(cadena.charAt(i))
        
        --> metodo equals. compara el contenido de la string. compara los objetos
        String a  = "hola como estas";
        String cadena2  = "hola como estas";
        var q = a.equals(cadena2); --> de todas formas parece que  var e = a==cadena2; si funciona xdxdxd
        
        --> concatenancion de strings
        cadena3 = cadena1 + " " + cadena2; //las comillas las pongo para haccer una separacion entre las palabras de las dos cadenas.
        si estuviesen puestos numeros en las cadenas estos no se suman ponele que yo haga
        (string1 + string2) va a aparecer 1030 no 40.
        
        otra forma puede ser con String.format
        string1 = 10; 
        string2 = 20; 
         String resultado = String.format("%d%d", a , b); %d porq es entero. esto guarda 1020
       
        
        
        <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        
        CLASE 20-3-23
        
        --> operadores
        suma +
        resta -
        multi *
        divi / 
        modulo %
        
        --> operadores asignacion
        +=algo
        -=algo
        *=algo
        /=algo
        %=algo //guarda el valor del resto. 
        
        --> operador ternario
        (condicion) ? (valor si la condicion sale verdadera) : (valor si la condicion sale falsa); 
        var resultado; 
        resultado = (1>2) ? "verdadero" : "falso"; 
        
        -->operdores unarios
        
       --> negar un numero: 
        
        int a = 3; 
        int b = -a;
        
       --> negar un booleano
        
        boole c=true; 
        c= !c;
        

      --> preincremento
        
        ++
        --
        
      en este caso, primero suma a la variable a y despues la asigna b. 
        
        int a = 5; 
        System.out.println(a); 
        int b = ++a;
        System.out.println(b); 
        System.out.println(a); 
        
        posincremento
        
       primero asigna a a b y despues cambia el valor de a
        
        int a = 5; 
        System.out.println(a); 
        int b = a++;
        System.out.println(b); 
        System.out.println(a); 
        
    <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<  
        
        CLASE 27-3-23
        
        Vimos el switch.
       puedo usar dos tipos de cases. no los puedo mezclar
        
        1) var num = 6; 
           var numerotexto = "";
           switch(num){
                case 1,2,6 ->
                numerotexto= "sexo";
                break; 
        } 
        
        O EL TIPICO
        case 1: 
        ....
        break; 
        case 2: 
        ...
        break; 
        
        
        
        vimos tambien ciclos while do-while y for.
        
        aca aparecen las sentencias: 
        continue: salta a la siguiente iteracion. no ejecuta lo que esta por debajo de el
        break: sale directamente del ciclo.
        
    <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< 
        
        CLASE 30-3-23
        
        Arreglos 
        
        int [] arreglo = new int[5];
        arreglo[0] = 1; 
        arreglo[1]= 3;
        
        o
        
        int arreglo[] = {1,2,3,4,5}; 
        
       método length. Me tira el tamaño del arreglo. es útil es los for para recorrer
       ejs:
        System.out.println(arreglo.length);
        for (int ii = 0; ii<arreglo.length ; ii++)
        
        arreglos 2 variables
        
        int [][] matriz = new int [filas][columnas]; 
        
        
        o
        
        
        int [][] matriz = {
        {0,1,2},
        {3,4,5},
        {6,7,8}
        };
        
        
        para recorrer estos arreglos lo que tengo que hacer es lo siguiente:; 
        
        for (int filas = 0; filas <matriz.length; filas++){
        for (int columnas = 0; columnas < matriz[filas].length; columnas++){
        }
        }
     
        <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< 
        
       CLASE 3-4-23
        
        etiquetas
        
        me sirven para redireccionar partes del programa. pongo continue y despues pongo el nombre de la etiqueta.
        por ejemplo
        
        inicio:
        for(.....){
        
        if(...){
        continue incio;
        }
        }
        
        FUNCIONES 
        en las funciones no puedo usar var. 
        
        static tipo_de_dato:que_devuelve nombre (datos que ingresan )  pongo static para no tener que generar una nueva instancia de la clase para poder llamarla
        de esta forma la puedo llamar desde el main sin generar una instancia. 
        
        ej
        static void saludar (String mensaje){
        sout mensaje
        }
        ------------------------
        en el main: 
        saludar(string que quiero meter)
        
        
        paso por valor
        los datos primitivos se pasan por valor. string es un caso especial que se pasa por valor.
        
        paso por referencia 
        los objetos se pasan por referencia. por ejemplo los arreglos
        ej
        static void nombre (int [] argumento)
        --------
        main
        nombre(argumento)
        
        funciones recursivas
        
        alcance de variables
        
        
        ejemplo
        
        public class nombre de clase{
        int i=5; -->para imprimir esto necesito de un objeto. estos tipos de datos se llaman atributos de instancia de clase
        psvm{
        sout(new nombre de clase().i)
        }
        }
        
        otro ejemplo
         public class nombre de clase{
       static int atributoclase = 10; //ya creo el objeto medio que aca me parece. creo que esa es la idea. atributo clase simplemente es un nombre puedo usar cualquier cosa.
        psvm{
      sout(atributoclase)
        }
        }
        
         <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        
        CLASE 10-4-23
        
        numeros random
        
        var aleatorio = new Random();
        int valorAleatorio = aleatorio.nextInt(100+1); esto me genera numeros del 0 al 100. ponele que yo quiera entre 0 y 59, pongo (59+1) o entre + y 1 (1+1)
        
        valor absoluto
        
        simplemente uso el metodo Math.abs(variable o numero)
        ej 
        var numeroAbs = Math.abs(numero);
        
        redondeo y truncamiento
        . . ..
        .
        .
        ..
        <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        
        CLASE 13-4-23 
        
        aca ya emopezamos a ver el tema de clases
        
        cosas importantes
        los nombres de las clases van la primera letra en mayuscula. si tiene más palabras las otras empiezan con mayus tambien
        los nombres de los metodos camelcase
        
        para hacerlo en archivos separados tienen que estar en el mismo paquete
        
        los atributos hay que tratar de que vayan privados
        ej
        public int x; 
        private String s; 
        
        los metodos obviamente publicos
        ej
        public void hacer algo(){}
        public int suma(){
        return suma;}
        
        no admite var.
        
        en el main se declara un puntero que va a apuntar a un objeto.
        nombre_clase nombrr_varible; -->hasta este momento apunta a null
        e = new nombew_clase(); -->creo instancia.
        
        para acceder a los metodos y atributos de la clase desde el main lo hago
        nombre_variable_que_apunta_a_clase.metodo o atributo;
        ej
        e.hacerAlgo();
        e.a
         <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        
        CLASE 17-4-23
        
        modificando el método de la clase object to string, no es necesrio que yo haga lo siguiente
        sout(e.tostring()). va a funcionar pero puedo hacer lo siguiente sout(e).
        en el caso de que yo no modifique el tostring, si yo hago sout(e) me imprimiria una direccion de memoria.
        
        
        
        constructores.
        por omision todas las clases tienen un constructor con cuerpo vacío y sin parametros.
        
        ejercicio_1 e = new ejercicio_1();//constructor por omision.
        
        los constructores que yo creo tienen el mismo nombre que la clase y recibe como parametro
        las variables para los atributos.
        

        un ejemplo de un contructor completo
        
        public class ejercicio2 {
    public int hola; 
    private int chau; 
    public ejercicio2 (int hola, int chau){
        this.hola = hola; 
        this.chau = chau; 
        
    }
    public static void main(String[] args) {
        int hola=0;
        int chau=1; 
        ejercicio2 e = new ejercicio2(hola,chau);
        System.out.println(e.hola);
    }
        
        Una vez creado el constructor, el contructor por omision se elimina.
        por lo tanto la siguiente sentencia no funcionaria
        ejercicio2 e = new ejercicio2();
        
        sin embargo, si creo un constructor, puedo tener un constructor por defecto, al que defino de la siguiente manera. puedo tener ambos.
        public nombreclase (){
        }
        
        sobreescribiendo método equals
        es interesante sobreescribir este método ya que podemos usarlo a nuestra conveniencia.
        nosotros usabamos equals para comparar strings.
        pero que pasa si queremos comparar por ejemplo fechas??
        EN LA CLASE
        public boolean equals (Object o){  //le pasamos por referencia un objeto al que llamamos o
        ejercicio2 r = (ejercicio2)o; //creamos un objeto r que me va a permitir acceder a o
        return (dia==r.dia) && (mes==r.mes) && (anio==r.anio); //comparo
        
        ejercico completo:
        public class ejercicio2 {
    public int dia; 
    public int mes; 
    public int anio;
    public ejercicio2 (int dia, int mes, int anio){
        this.dia = dia; 
        this.mes = mes;
        this.anio = anio; 
    }
    public String toString(){
        return dia + "/" + mes + "/" + anio;
    }
    public boolean equals (Object o){
        ejercicio2 r = (ejercicio2)o;
        return (dia==r.dia) && (mes==r.mes) && (anio==r.anio);
    }
    public static void main(String[] args) {
        int dia=0;
        int mes=1;
        int anio=3;
        boolean b;
        ejercicio2 e = new ejercicio2(dia,mes,anio);
        dia=1;
        mes=2;
        anio=3;
        ejercicio2 f = new ejercicio2 (dia,mes,anio);
        b = e.equals(f);
        System.out.println(b);
        
        
        ENCAPSULAMIENTO
        La idea es facilitar al programador el tema de la complejidad de las clases
        esto me va permitir simplemente dejarle lo que el programador necesite sin tener que ver 
        o analizar la complejidad del codigo
        
        PAQUETES
        
    }
}
    }
      
        
        
*/
   
 
}
       
         
        
        
}
