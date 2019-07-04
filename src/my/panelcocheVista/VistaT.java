
package my.panelcocheVista;

import java.awt.Color;
import javax.swing.ImageIcon;
import my.panelcocheModelo.ModeloT;

/**
 *
 * @author Alvaro Berrio Galindo
 * @author Alberto Calvo Madurga
 * 
 */
public class VistaT extends javax.swing.JFrame {
    private Color verdeBonito;
    private ModeloT miModelo;
    private ControladorT miControl;
    /**
     * Creates new form VistaT
     */
    public VistaT() {
        initComponents();
        verdeBonito = new Color (23,137,15);
        miModelo = new ModeloT();
        miControl = new ControladorT(this, miModelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        LunaTrasera = new javax.swing.JButton();
        Auto = new javax.swing.JToggleButton();
        OnOff = new javax.swing.JToggleButton();
        Reciclado = new javax.swing.JButton();
        LunaDelantera = new javax.swing.JButton();
        temperatura = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        intensidad = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        Slider = new javax.swing.JSlider();
        airecabeza = new javax.swing.JLabel();
        airepies = new javax.swing.JLabel();
        airecabezapies = new javax.swing.JLabel();
        airecabezadesemp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        LunaTrasera.setBackground(java.awt.Color.lightGray);
        LunaTrasera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dt.png"))); // NOI18N
        LunaTrasera.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LunaTrasera.setEnabled(false);
        LunaTrasera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LunaTraseraActionPerformed(evt);
            }
        });
        jPanel2.add(LunaTrasera);

        Auto.setBackground(java.awt.Color.lightGray);
        Auto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Auto.setText("AUTO");
        Auto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Auto.setEnabled(false);
        Auto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutoActionPerformed(evt);
            }
        });
        jPanel2.add(Auto);

        OnOff.setBackground(java.awt.Color.lightGray);
        OnOff.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        OnOff.setForeground(new java.awt.Color(255, 0, 0));
        OnOff.setSelected(true);
        OnOff.setText("ON/OFF");
        OnOff.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        OnOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnOffActionPerformed(evt);
            }
        });
        jPanel2.add(OnOff);

        Reciclado.setBackground(java.awt.Color.lightGray);
        Reciclado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/rec.png"))); // NOI18N
        Reciclado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Reciclado.setEnabled(false);
        Reciclado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecicladoActionPerformed(evt);
            }
        });
        jPanel2.add(Reciclado);

        LunaDelantera.setBackground(java.awt.Color.lightGray);
        LunaDelantera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dd.png"))); // NOI18N
        LunaDelantera.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LunaDelantera.setEnabled(false);
        LunaDelantera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LunaDelanteraActionPerformed(evt);
            }
        });
        jPanel2.add(LunaDelantera);

        temperatura.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        temperatura.setModel(new javax.swing.SpinnerNumberModel(15, 15, null, 1));
        temperatura.setEnabled(false);
        temperatura.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                temperaturaStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setText("TEMPERATURA");

        intensidad.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        intensidad.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        intensidad.setEnabled(false);
        intensidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                intensidadStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("INTENSIDAD");

        Slider.setMaximum(3);
        Slider.setMinorTickSpacing(1);
        Slider.setPaintLabels(true);
        Slider.setPaintTicks(true);
        Slider.setEnabled(false);
        Slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SliderStateChanged(evt);
            }
        });

        airecabeza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/acno.png"))); // NOI18N
        airecabeza.setEnabled(false);

        airepies.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/apno.png"))); // NOI18N
        airepies.setEnabled(false);

        airecabezapies.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/acpno.png"))); // NOI18N
        airecabezapies.setEnabled(false);

        airecabezadesemp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/adno.png"))); // NOI18N
        airecabezadesemp.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(361, 361, 361)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(temperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(airecabeza)
                                        .addGap(47, 47, 47)
                                        .addComponent(airepies)
                                        .addGap(58, 58, 58)
                                        .addComponent(airecabezapies)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(airecabezadesemp))
                                    .addComponent(Slider, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(intensidad, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(temperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(intensidad, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(airecabeza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(airepies, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(airecabezapies, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(airecabezadesemp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Manejador del evento para el encendido/apagado del sistema
     * @param evt 
     */
    private void OnOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnOffActionPerformed
        miControl.eventoOnOff();
    }//GEN-LAST:event_OnOffActionPerformed
    /**
     * Manejador del evento del modo automatico
     * @param evt 
     */
    private void AutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutoActionPerformed
        miControl.eventoAuto();
    }//GEN-LAST:event_AutoActionPerformed
    /**
     * Manejador del evento del desempanado de la luna trasera
     * @param evt 
     */
    private void LunaTraseraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LunaTraseraActionPerformed
        miControl.eventoLunaTrasera();
    }//GEN-LAST:event_LunaTraseraActionPerformed
    /**
     * Manejador del evento del desempanado de la luna delantera
     * @param evt 
     */
    private void LunaDelanteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LunaDelanteraActionPerformed
        miControl.eventoLunaDelantera();
    }//GEN-LAST:event_LunaDelanteraActionPerformed
    /**
     * Manejador del evento del reciclado del aire
     * @param evt 
     */
    private void RecicladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecicladoActionPerformed
        miControl.eventoReciclado();
    }//GEN-LAST:event_RecicladoActionPerformed
    /**
     * Manejador del evento de la seleccion de la salida del aire
     * @param evt 
     */
    private void SliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SliderStateChanged
        miControl.eventoSlider();
    }//GEN-LAST:event_SliderStateChanged
    /**
     * Manejador del evento de cambio de temperatura
     * @param evt 
     */
    private void temperaturaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_temperaturaStateChanged
        miControl.eventoTemperatura();
    }//GEN-LAST:event_temperaturaStateChanged
    /**
     * Manejador del evento de cambio de intensidad
     * @param evt 
     */
    private void intensidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_intensidadStateChanged
        miControl.eventoIntensidad();
    }//GEN-LAST:event_intensidadStateChanged
    /**
    * Establece los parametros deseados al encender el sistema y activa los botones
    */
    public void encender() {
        OnOff.setForeground(verdeBonito);
        OnOff.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        OnOff.setEnabled(true);
        Reciclado.setEnabled(true);
        LunaDelantera.setEnabled(true);
        LunaTrasera.setEnabled(true);
        Auto.setEnabled(true);
        intensidad.setEnabled(true);
        temperatura.setEnabled(true);
        Slider.setEnabled(true);
        jLabel1.setEnabled(true);
        jLabel2.setEnabled(true);
        airecabeza.setEnabled(true);
        airepies.setEnabled(true);
        airecabezapies.setEnabled(true);
        airecabezadesemp.setEnabled(true);
    }
    /**
     * Establece los parametros deseados al apagar el sistema y desactiva los elementos
     */
    public void apagar() {
        OnOff.setForeground(Color.red);
        Auto.setEnabled(false);
        LunaTrasera.setEnabled(false);
        LunaDelantera.setEnabled(false);
        Reciclado.setEnabled(false);
        intensidad.setEnabled(false);
        temperatura.setEnabled(false);
        Slider.setEnabled(false);
        jLabel1.setEnabled(false);
        jLabel2.setEnabled(false);
        airecabeza.setEnabled(false);
        airepies.setEnabled(false);
        airecabezapies.setEnabled(false);
        airecabezadesemp.setEnabled(false);
        OnOff.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

    }
    /**
     * Activacion del boton de automatico
     */
    public void encenderAuto() {
        Auto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        Auto.setForeground(verdeBonito);
        temperatura.setEnabled(false);
        intensidad.setEnabled(false);
        Slider.setEnabled(false);
        LunaDelantera.setEnabled(false);
        LunaTrasera.setEnabled(false);
        Reciclado.setEnabled(false);
    }
    /**
     * Desactivacion del boton de automatico
     */
    public void apagarAuto() {//Tiene la restriccion de que una vez en automatico solo puedes o desactivarlo,
                              //o apagar el sistema
        Auto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Auto.setSelected(false);
        Auto.setForeground(Color.black);
        temperatura.setEnabled(true);
        intensidad.setEnabled(true);
        Slider.setEnabled(true);
        LunaDelantera.setEnabled(true);
        LunaTrasera.setEnabled(true);
        Reciclado.setEnabled(true);
    }
    /**
     * Activacion del desempandado de la luna trasera
     */
    public void encenderLunaTrasera() {
        LunaTrasera.setBackground(Color.green);
    }
    /**
     * Desactivacion del desempandado de la luna trasera
     */
    public void apagarLunaTrasera() {
        LunaTrasera.setBackground(Color.LIGHT_GRAY);
    }
    /**
     * Activacion del desempandado de la luna delantera
     */
    public void encenderLunaDelantera() {
        LunaDelantera.setBackground(Color.green);
    }
    /**
     * Desactivacion del desempandado de la luna delantera
     */
    public void apagarLunaDelantera() {
        LunaDelantera.setBackground(Color.LIGHT_GRAY);
    }
    /**
     * Activacion del reciclado del aire
     */
    public void encenderReciclado() {
        Reciclado.setBackground(Color.green);
    }
    /**
     * Desactivacion del reciclado del aire
     */
    public void apagarReciclado() {
        Reciclado.setBackground(Color.LIGHT_GRAY);
    }
    /**
     * 
     * @return posicion de la salida del aire 
     */
    public int getSlider(){
        return Slider.getValue();
    }
    /**
     * 
     * @return temperatura
     */
    public int getTemperatura(){
        return (int)temperatura.getValue();
    }
    /**
     * 
     * @return intensidad
     */
    public int getIntensidad(){
        return (int)intensidad.getValue();
    }
    /**
     * Prepara la visualizacion de los iconos dependiendo de la posicion de la salida del aire
     * 
     */
    void setSlider() {
        Slider.setValue(miModelo.getSlider());
        //Para cada posicion se resalta en otro color la posicion de la salida del aire
        //Los demas iconos quedaran en el color estandar
        switch (miModelo.getSlider()) {
            case 0:
                //En este caso controlaremos una posible compatibilidad con el desempanado trasero
                if(!miModelo.isLunatrasera()){
                    airecabeza.setIcon(new ImageIcon(getClass().getResource("/Imagenes/acao.png")));
                    airepies.setIcon(new ImageIcon(getClass().getResource("/Imagenes/apno.png")));
                    airecabezapies.setIcon(new ImageIcon(getClass().getResource("/Imagenes/acpno.png")));
                    airecabezadesemp.setIcon(new ImageIcon(getClass().getResource("/Imagenes/adno.png")));
                }
                else{
                    //Si coincide la salida del aire a la cabeza y el desempanado trasero, 
                    //se situara el slider en la posicion que combina a las dos
                    miModelo.setSlider(3);
                    setSlider();
                }
                break;
            case 1:
                airecabeza.setIcon(new ImageIcon(getClass().getResource("/Imagenes/acno.png")));
                airepies.setIcon(new ImageIcon(getClass().getResource("/Imagenes/apao.png")));
                airecabezapies.setIcon(new ImageIcon(getClass().getResource("/Imagenes/acpno.png")));
                airecabezadesemp.setIcon(new ImageIcon(getClass().getResource("/Imagenes/adno.png")));

               break;
            case 2:
                airecabeza.setIcon(new ImageIcon(getClass().getResource("/Imagenes/acno.png")));
                airepies.setIcon(new ImageIcon(getClass().getResource("/Imagenes/apno.png")));
                airecabezapies.setIcon(new ImageIcon(getClass().getResource("/Imagenes/acpao.png")));
                airecabezadesemp.setIcon(new ImageIcon(getClass().getResource("/Imagenes/adno.png")));
               break;
            case 3:
                airecabeza.setIcon(new ImageIcon(getClass().getResource("/Imagenes/acno.png")));
                airepies.setIcon(new ImageIcon(getClass().getResource("/Imagenes/apno.png")));
                airecabezapies.setIcon(new ImageIcon(getClass().getResource("/Imagenes/acpno.png")));
                airecabezadesemp.setIcon(new ImageIcon(getClass().getResource("/Imagenes/adao.png")));
                miControl.encenderLunaTrasera();
               break;
            default:
               break;
        }
        
    }
    /**
     * Establece el valor de la variable temperatura del modelo en el lugar indicado
     */
    public void setTemperatura() {
        temperatura.setValue(miModelo.getTemperatura());
    }
    /**
     * Establece el valor de la variable intensidad del modelo en el lugar indicado
     */
    public void setIntensidad() {
        intensidad.setValue(miModelo.getIntensidad());

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Auto;
    private javax.swing.JButton LunaDelantera;
    private javax.swing.JButton LunaTrasera;
    private javax.swing.JToggleButton OnOff;
    private javax.swing.JButton Reciclado;
    private javax.swing.JSlider Slider;
    private javax.swing.JLabel airecabeza;
    private javax.swing.JLabel airecabezadesemp;
    private javax.swing.JLabel airecabezapies;
    private javax.swing.JLabel airepies;
    private javax.swing.JSpinner intensidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSpinner temperatura;
    // End of variables declaration//GEN-END:variables
}
