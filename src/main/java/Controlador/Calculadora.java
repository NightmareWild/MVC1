/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.Operaciones;
import Vista.V_Calculadora;
import com.sun.corba.se.impl.orbutil.ORBUtility;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Nicolas Peralta
 * @author Brayan Suarez
 * @since 16/10/2020
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /**
        * Se generan lo objetos de cada clase
        */ 
       V_Calculadora vistaCalculadora = new V_Calculadora();
       Operaciones operacion = new Operaciones();
       vistaCalculadora.setVisible(true);
       
       /**
        * Se crea la acción de botón
        */
        ActionListener e = new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
               /**
                * Se asignan los valores de la interfaz a los atributos de la clase Operaciones
                */
               operacion.setNumero1(Integer.parseInt(vistaCalculadora.numero_1.getText()));
               operacion.setNumero2(Integer.parseInt(vistaCalculadora.numero_2.getText()));
               /**
                * Se llama la funcion de 
                */
               vistaCalculadora.resultado.setText(operacion.Resta());
           }
        };
        vistaCalculadora.boton.addActionListener(e);
       
       
    }
    
}
