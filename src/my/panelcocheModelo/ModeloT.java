
package my.panelcocheModelo;

/**
 *
 * @author Alvaro Berrio Galindo
 * @author Alberto Calvo Madurga
 */
public class ModeloT {
    private boolean estado;
    private int temperatura;
    private int intensidad;
    private int slider;
    private boolean lunatrasera;
    private boolean lunadelantera;
    private boolean reciclado;
    private boolean auto;
    public ModeloT(){
        estado=false;
        temperatura=0;
        intensidad=0;
        slider=0;
        lunatrasera=false;
        lunadelantera=false;
        reciclado=false;
        auto=false;
    }
    /**
     * 
     * @return valor del booleano automatico 
     */
    public boolean isAuto() {
        return auto;
    }
    /**
     * 
     * @param aut valor del automatico 
     */
    public void setAuto(boolean aut) {
        auto = aut;
    }
    /**
     * 
     * @return valor de la luna trasera
     */
    public boolean isLunatrasera() {
        return lunatrasera;
    }
    /**
     * 
     * @param lunatras valor de la luna trasera 
     */
    public void setLunatrasera(boolean lunatras) {
        lunatrasera = lunatras;
    }
    /**
     * 
     * @return valor de la luna delantera 
     */
    public boolean isLunadelantera() {
        return lunadelantera;
    }
    /**
     * 
     * @param lunadel valor de la luna delantera
     */
    public void setLunadelantera(boolean lunadel) {
        lunadelantera = lunadel;
    }
    /**
     * 
     * @return valor del reciclado 
     */
    public boolean isReciclado() {
        return reciclado;
    }
    /**
     * 
     * @param reci valor del reciclado 
     */
    public void setReciclado(boolean reci) {
        reciclado = reci;
    }
    /**
     * 
     * @return valor del estado 
     */
    public boolean isEstado(){
        return estado;
    }
    /**
     * 
     * @param est valor del estado 
     */
    public void setEstado(boolean est){
        estado=est;
    }
    /**
     * 
     * @return posicion del aire en el coche 
     */
    public int getSlider() {
        return slider;
    }
    /**
     * 
     * @param sli posicion del aire en el coche
     */
    public void setSlider(int sli) {
        slider = sli;
    }
    /**
     * 
     * @return temperatura actual 
     */
    public int getTemperatura() {
        return temperatura;
    }
    
    /**
     * 
     * @param temp temperatura 
     */
    public void setTemperatura(int temp) {
        if(temp<=25)
            temperatura = temp;
    }
    /**
     * 
     * @return intensidad
     */
    public int getIntensidad() {
        return intensidad;
    }
    /**
     * 
     * @param inten intensidad 
     */
    public void setIntensidad(int inten) {
        if(inten<=10)
            intensidad = inten;
    }
    
}
