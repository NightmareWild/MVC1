/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.Numeros;
import Vista.V_Calculadora;
import com.sun.corba.se.impl.orbutil.ORBUtility;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Nicolas Peralta
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       V_Calculadora vistaCalculadora = new V_Calculadora();
       Numeros operacion = new Numeros();
       vistaCalculadora.setVisible(true);
       
        ActionListener e = new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
               operacion.setNumero1(Integer.parseInt(vistaCalculadora.numero_1.getText()));
               operacion.setNumero2(Integer.parseInt(vistaCalculadora.numero_2.getText()));
               vistaCalculadora.resultado.setText(operacion.Resta());
           }
        };
        vistaCalculadora.boton.addActionListener(e);
       
       
    }
    
}
