package Vista;

public class VistaCombate {
    public void mostrarInicioDeCombate(){
        System.out.println("============================");
        System.out.println("========== Inicio de Combate ==========");
        System.out.println("============================");
    }
    
    public void mostrarAtaque(String nombrePersonaje, String accionAtaque){
        System.out.println("¡Boom!"+ nombrePersonaje+"->"+accionAtaque); 
    }
}
