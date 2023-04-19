package Ej.Fechas;

import java.util.Scanner;

public class Main {
    static void func (Object o){
        Class f1 = (Class)o;
        Scanner console = new Scanner(System.in);
        System.out.println("Ingresar fecha del siguiente modo:\n dia/mes/anio, implicitando /");
        f1.ingresarFecha(console.nextLine());
}
    public static void main(String[] args) {
       Class fecha1 = new Class();
       Class fecha2 = new Class();
       int i = 0;
       Scanner console = new Scanner(System.in);
       fecha2.addDias();
       func(fecha1);
       System.out.println("Fecha 1: " + fecha1.toString());
       System.out.println("Fecha 2: " + fecha2.toString());
       do{
           System.out.println("Ingrese:\n 1) Agregar dias\n 2) Ver la cantidad de dias que tiene una fecha \n 3) imprimir fecha \n 4) salir");
           i = console.nextInt();
           switch(i){
               case 1:
                   System.out.println("Ingrese 1 si quiere cambiar la fecha 1 o ingrese 2 si quiere cambiar la fecha 2");
                   i = console.nextInt();
                   if (i == 1){
                       fecha1.addDias();
                   }else{
                       fecha2.addDias();
                   }
                   System.out.println("...Completado");
                   break; 
               case 3:
                   System.out.println("Ingrese 1 si quiere visualizar 1 o ingrese 2 si quiere visualizar 2");
                   i = console.nextInt();
                   if(i==1){
                       System.out.println(fecha1.toString());
                   }else{
                       System.out.println(fecha2.toString());
                   }
                   System.out.println("...Completado");
                   break;
               case 2:
                   if(i==1){
                       System.out.println(fecha1.fechasToDias());
                   }else{
                       System.out.println(fecha2.fechasToDias());
                   }
                   System.out.println("...Completado");
                   break;
               case 4:
                   System.out.println("chau");
                   break;
           }
       }while(i != 4);
      
      
      
    }
}
