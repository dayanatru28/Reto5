package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import controlador.ControladorRequerimientos;
import modelo.vo.Requerimiento_1Vo;


public class VentanaReq1 extends JFrame implements ActionListener {

    private ControladorRequerimientos controlador;
    private JLabel labelTitulo;


    public VentanaReq1(){

        controlador = new ControladorRequerimientos();
        // Configuración de la ventana (JFrame)
		setSize(1230, 400);
		setTitle("Mision TIC 2022");
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);


        // Label de titulo
		labelTitulo = new JLabel("REQUERIMIENTO 1");
		labelTitulo.setBounds(550, 40, 450, 30);
		labelTitulo.setFont(new java.awt.Font("Verdana", 1, 15));
		add(labelTitulo);

        try {

            JTextArea areaIntroduccion1 = new JTextArea();
            areaIntroduccion1.setBounds(300, 120, 700, 120);
            areaIntroduccion1.setEditable(false);
            areaIntroduccion1.setFont(new java.awt.Font("Verdana", 0, 14));
            areaIntroduccion1.setLineWrap(true);
            ArrayList<Requerimiento_1Vo> resultado_requerimiento1 = controlador.consultarRequerimiento1();
            //resultado_requerimiento1.forEach(System.out::println);             
            
            areaIntroduccion1.setText(resultado_requerimiento1.toString());
            areaIntroduccion1.setWrapStyleWord(true);
            add(areaIntroduccion1);
            
        } catch (Exception e) {
            System.out.println("Se ha producido el siguiente error:" + e.getMessage());
            e.printStackTrace();
        }


        
    }    


    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
