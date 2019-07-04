
package my.panelcocheVista;

import my.panelcocheModelo.ModeloT;

/**
 *
 * @author Alvaro Berrio Galindo
 * @author Alberto Calvo Madurga
 */
public class ControladorT {
   
    private ModeloT miModelo;
    private VistaT miVista;
    /**
     * Constructor de la clase
     * @param v
     * @param m 
     */
    public ControladorT(VistaT v, ModeloT m) {
        miVista = v;
        miModelo = m;
    }
    /**
     * Evento invocado al pulsar ON/OFF que enciende asignando los valores iniciales
     * o llama a apagarTodo()
     */
    void eventoOnOff() {
        if (!miModelo.isEstado()) {
            miModelo.setEstado(true);
            miModelo.setTemperatura(15);
            miVista.encender();
            miVista.setTemperatura();
            miModelo.setIntensidad(0);
            miVista.setIntensidad();
            miModelo.setSlider(0);
            miVista.setSlider();
        } else {
            apagarTodo();
        }
    }
    /**
     * Metodo que pone en falso todos los botones y llama varios metodos de la 
     * vista que se encargan de la apariencia
     */
    void apagarTodo() {
        miModelo.setEstado(false);
        miModelo.setAuto(false);
        miModelo.setLunadelantera(false);
        miModelo.setLunatrasera(false);
        miModelo.setReciclado(false);
        miVista.apagarAuto();
        miVista.apagar();
        miVista.apagarLunaDelantera();
        miVista.apagarLunaTrasera();
        miVista.apagarReciclado();
        
    }
    /**
     * Evento invocado al pulsar el boton Auto que enciende o apaga este modo
     */
    void eventoAuto() {
        if (!miModelo.isAuto()) {
            encenderAuto();
        } else {
            apagarAuto();
        }
    }
    /**
     * Establece la situacion de automatico encendido
     */
    void encenderAuto() {
        miModelo.setAuto(true);
        miVista.encenderAuto();
        miModelo.setTemperatura(21);
        miVista.setTemperatura();
        miModelo.setIntensidad(5); //En el dibujo salia intensidad 5
        miVista.setIntensidad();
        miModelo.setSlider(1);
        miVista.setSlider();
        encenderLunaDelantera();
        apagarLunaTrasera();
        apagarReciclado();
    }
    /**
     * Establece la situacion de automatico apagado
     */
    void apagarAuto() {
        miModelo.setAuto(false);
        miVista.apagarAuto();
        apagarLunaDelantera();
        
    }
    /**
     * Evento invocado al pulsar el boton desempanado trasero
     * Se tiene en cuenta una posible compatibilidad con el sistema de aire
     */
    void eventoLunaTrasera() {
        if (!miModelo.isLunatrasera()) {
            encenderLunaTrasera();
            if(miModelo.getSlider()==0){ 
            //Si el aire esta en la cabeza,el slider se mueve a cabeza y desempanado trasero
                miModelo.setSlider(3);
                miVista.setSlider();
            }
        } else {
            apagarLunaTrasera();
            if(miModelo.getSlider()==3){    
            //Si el aire esta en cabeza y desempanado trasero, se mueve a solamente cabeza
                miModelo.setSlider(0);
                miVista.setSlider();
            }
        }
    }
    /**
     * Establece la situacion de desempanado de luna trasera encendido
     */
    void encenderLunaTrasera() {
        miModelo.setLunatrasera(true);
        miVista.encenderLunaTrasera();
    }
    /**
     * Establece la situacion de desempanado de luna trasera apagado
     */

    void apagarLunaTrasera() {
        miModelo.setLunatrasera(false);
        miVista.apagarLunaTrasera();
    }
    /**
     * Evento invocado al pulsar el boton desempanado delantero
     * 
     */
    void eventoLunaDelantera() {
        if (!miModelo.isLunadelantera()) {
            encenderLunaDelantera();
        } else {
            apagarLunaDelantera();
        }

    }
    /**
     * Establece la situacion de desempanado de luna delantera encendido
     */
    void encenderLunaDelantera() {
        miModelo.setLunadelantera(true);
        miVista.encenderLunaDelantera();
    }
    /**
     * Establece la situacion de desempanado de luna delantera apagado
     */

    void apagarLunaDelantera() {
        miModelo.setLunadelantera(false);
        miVista.apagarLunaDelantera();
    }
    /**
     * Evento invocado al pulsar el boton de reciclado de aire
     * 
     */
    void eventoReciclado() {
        if (!miModelo.isReciclado()) {
            encenderReciclado();
        } else {
            apagarReciclado();
        }
    }
    /**
     * Establece la situacion de reciclado de aire encendido
     */
    void encenderReciclado() {
        miModelo.setReciclado(true);
        miVista.encenderReciclado();
    }
    /**
     * Establece la situacion de reciclado de aire apagado
     */
    void apagarReciclado() {
        miModelo.setReciclado(false);
        miVista.apagarReciclado();
    }
    /**
     * Evento invocado al cambiar una posicion de aire 
     */
    void eventoSlider(){
        miModelo.setSlider(miVista.getSlider());
        miVista.setSlider();
    }
    /**
     * Evento invocado al cambiar la temperatura
     */
    void eventoTemperatura(){
        miModelo.setTemperatura(miVista.getTemperatura());
        miVista.setTemperatura();
    }
    /**
     * Evento invocado al cambiar la intensidad
     */
    void eventoIntensidad(){
        miModelo.setIntensidad(miVista.getIntensidad());
        miVista.setIntensidad();
    }
}
