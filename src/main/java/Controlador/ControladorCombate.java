package Controlador;

import Modelo.Personaje;
import Vista.VistaCombate;

public class ControladorCombate {
    //el controlador debe tener
    //las referencias al modelo pero en un arreglo
    //y tambien a la vista
    private Personaje[] grupo;
    private VistaCombate vista;

    //logica de coordinacion
    public ControladorCombate(Personaje[] grupo, VistaCombate vista) {
        this.grupo = grupo;
        this.vista = vista;
    }
    
    public void ejecutarRonda(){
        vista.mostrarInicioDeCombate();
        //polimorfismo
        for(Personaje p: grupo){
            String accion = p.realizarAtaque();
            vista.mostrarAtaque(p.getNombre(), accion);
        }
    }
}
