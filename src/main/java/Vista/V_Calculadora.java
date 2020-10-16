/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Nicolas Peralta
 */
public class V_Calculadora extends JFrame{
    
    public JPanel panel;
    public JButton boton;
    public JTextField numero_1;    
    public JTextField numero_2;
    public JLabel resultado;
    public JLabel label;

    public V_Calculadora() {
        setSize(300,400);
        setTitle("Resta");
        setLocationRelativeTo(null);
        setMaximumSize(new Dimension(300,400));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
        label = new JLabel("Resta");
        label.setBounds(130, 0, 50, 40);
        numero_1 = new JTextField();
        numero_1.setBounds(50, 100, 60, 20);
        numero_2 = new JTextField();
        numero_2.setBounds(150, 100, 60, 20);
        boton = new JButton();
        boton.setBounds(100, 200, 100, 20);
        boton.setText("Restar");
        resultado = new JLabel();
        resultado.setBounds(150, 300, 60, 20);
        panel.add(label);
        panel.add(numero_1);
        panel.add(numero_2);
        panel.add(resultado);
        panel.add(boton);
        
        
    }
    
    
}
