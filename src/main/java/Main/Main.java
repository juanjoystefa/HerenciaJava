package Main;

import Controlador.ControladorCombate;
import Modelo.Paladin;
import Modelo.Personaje;
import Modelo.Ranger;
import Vista.VistaCombate;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Simulador de DND");
        //inicializar
        Personaje explorador = new Ranger("david",14);
        Personaje guerrero = new Paladin("valerie",17);
        Personaje profesor = new Personaje("edwin",10);
        
        Personaje[] miGrupo ={explorador,guerrero,profesor};
        VistaCombate miVista =new VistaCombate();
        
        //inicializamos el controlador (inyectar el modelo y la vista)
        ControladorCombate controlador = new ControladorCombate(miGrupo,miVista);
        
        //la logica de la coordinacion
        controlador.ejecutarRonda();
    }
}
