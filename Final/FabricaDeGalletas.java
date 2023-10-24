import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FabricaDeGalletas {
    private List<Amasadora> amasadoras;
    private CatalogoDeRecetas catalogo;
    private List<Contenedor> contenedores;
    
    public FabricaDeGalletas() {
        amasadoras = new ArrayList<Amasadora>();
        catalogo = new CatalogoDeRecetas();
        contenedores = new ArrayList<Contenedor>();
    }
    
    public List<Amasadora> getAmasadoras() {
        return amasadoras;
    }
    public void setAmasadoras(List<Amasadora> amasadoras) {
        this.amasadoras = amasadoras;
    }
    public CatalogoDeRecetas getCatalogo() {
        return catalogo;
    }
    public void setCatalogo(CatalogoDeRecetas catalogo) {
        this.catalogo = catalogo;
    }
    public List<Contenedor> getContenedores() {
        return contenedores;
    }
    public void setContenedores(List<Contenedor> contenedores) {
        this.contenedores = contenedores;
    }

    public void conectarContenedor(Amasadora a, Contenedor c){
        a.conectarContenedor(c);
    }
    public void desconectarContenedor(Amasadora a, Contenedor c){
        a.desconectarContenedor(c);
    }
    
    public void sacarLoteAmasado(Amasadora a, String receta){
        System.out.print("Buscando receta: "+receta);
        Receta r = catalogo.getReceta(receta);
        System.out.println(r!=null?"Encontrada!" + r:"No existe receta");
        a.setReceta(r);
        a.iniciarProceso();
    }
    
    public static void main(String[] args){
        FabricaDeGalletas fabrica = new FabricaDeGalletas();
        fabrica.init();
        
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        imprimirAyuda();
        while (!salir){
            String linea = scanner.nextLine().trim().toLowerCase();
            if (linea.equals("salir")){
                salir=true;
            } else if (linea.equals("info")){
                fabrica.imprimirInfo();
            } else if (linea.startsWith("cocinar")){
                String[] params = linea.split(" ");
                if (params.length == 3){
                    fabrica.cocinar(params[1],params[2]);
                } else {
                    imprimirAyuda();
                }
            }
            System.out.print(">");
        }
    }
    
    private static void imprimirAyuda(){
        System.out.println ("Uso: cocinar <amasadora> <receta> | info | salir");
        System.out.print(">");
    }
    
    private void imprimirInfo(){
        System.out.println ("Amasadoras disponibles: ");
        for (Amasadora a:amasadoras){
            System.out.println(a.getId());
        }
        System.out.println ("Recetas disponibles: ");
        for (String receta:catalogo.indice()){
            System.out.println (receta);
        }
    }
        
    
    
    
    private  boolean cocinar(String amasadora, String receta){
        for (Amasadora a0: amasadoras){
            if (a0.getId().equals(amasadora.toLowerCase().trim())){
                System.out.println("Amasadora existente: " + a0.getId());
                try {
                    this.sacarLoteAmasado(a0, receta);
                    System.out.println("Cocinando... hora fin: " + a0.getHoraFinAmasado());
                    
                } catch (Exception e){
                    System.out.println ("ERROR: " + e.getMessage());
                    return false;
                }
                return true;
            }		
        }
        System.out.println ("ERROR: Amasadora no encontrada");
        System.out.print(">");
        return false;
    
    }
    
    
    public void init(){
        /*
        Silo s1 = new Silo(Ingrediente.HARINA,1000);
        Silo s2 = new Silo(Ingrediente.AZUCAR,1000);
        Silo s3 = new Silo(Ingrediente.CACAO,500);
        Silo s4 = new Silo(Ingrediente.GALLETA_MOLIDA,750);
        Tanque t1 = new Tanque(Ingrediente.AGUA, 1500);
        Tanque t2 = new Tanque(Ingrediente.ACEITE,250);
        Tanque t3 = new Tanque(Ingrediente.HUEVO,250);
        Tanque t4 = new Tanque(Ingrediente.VAINILLA,20);
                
        contenedores.add(s1);
        contenedores.add(s2);
        contenedores.add(s3);
        contenedores.add(s4);
        contenedores.add(t1);
        contenedores.add(t2);
        contenedores.add(t3);
        contenedores.add(t4);
        
        s1.reprovisionarIngrediente(200);
        s2.reprovisionarIngrediente(200);
        s3.reprovisionarIngrediente(200);
        s4.reprovisionarIngrediente(200);
        t1.reprovisionarIngrediente(200);
        t2.reprovisionarIngrediente(200);
        t3.reprovisionarIngrediente(200);
        t4.reprovisionarIngrediente(20);
        
        
        Amasadora a1 = new Amasadora();
        Amasadora a2 = new Amasadora();
        amasadoras.add(a1);
        amasadoras.add(a2);
        
        a1.encender();
        a2.encender();
        
        conectarContenedor(a1, s1);
        conectarContenedor(a1, s2);
        conectarContenedor(a1, s3);
        conectarContenedor(a1, t1);
        conectarContenedor(a1, t2);
        
        conectarContenedor(a2, s1);
        conectarContenedor(a2, s3);
        conectarContenedor(a2, s4);
        conectarContenedor(a2, t1);
        conectarContenedor(a2, t3);
        conectarContenedor(a2, t4);
        
        Receta r1 = new Receta("vainillas");
        Receta r2 = new Receta("macucas");
        Receta r3 = new Receta("vocacion");
        
        r1.agreagarIngrediente(Ingrediente.HARINA, 20);
        r1.agreagarIngrediente(Ingrediente.HUEVO, 15);
        r1.agreagarIngrediente(Ingrediente.VAINILLA, 1);
        r1.setTiempoDeAmasado(7);
        
        r2.agreagarIngrediente(Ingrediente.HARINA, 20);
        r2.agreagarIngrediente(Ingrediente.CACAO, 5);
        r2.agreagarIngrediente(Ingrediente.AGUA, 12);
        r2.setTiempoDeAmasado(12);
        
        r3.agreagarIngrediente(Ingrediente.HARINA, 20);
        r3.agreagarIngrediente(Ingrediente.GALLETA_MOLIDA, 15);
        r3.agreagarIngrediente(Ingrediente.AGUA, 18);
        r3.agreagarIngrediente(Ingrediente.ACEITE, 5);
        r3.setTiempoDeAmasado(9);
        
        catalogo.agregarReceta(r1);
        catalogo.agregarReceta(r2);
        catalogo.agregarReceta(r3);
        */
    
    }

}
