package ejerciciosdepráctica_posta;

public class ej1_main {
    static void conveniencia (Object o1, Object o2){
        
        ej1 ejemplo1 = (ej1)o1;
        ej1 ejemplo2 = (ej1)o2;
        
        if(ejemplo1.equals(ejemplo2)){
            if(ejemplo1.getPrecio() < ejemplo2.getPrecio()){
                System.out.println("Esta funcionando");
                ejemplo1.setPrecio(300); 
                ejemplo1.color = "verde";
        }
        }
    }
    public static void main(String[] args) {
        ej1 auto1 = new ej1("chevrolet","rojo",4,100);
        ej1 auto2 = new ej1("chevrolet","rojo",4,200);
        conveniencia(auto1,auto2);
        System.out.println(auto1.color + " " + auto1.getPrecio());
    }
}
