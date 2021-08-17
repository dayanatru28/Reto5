package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.*;
import controlador.ControladorRequerimientos;
import modelo.vo.Requerimiento_2Vo;


public class VentanaReq2 extends JFrame implements ActionListener {

    private ControladorRequerimientos controlador;
    private JLabel labelTitulo;


    public VentanaReq2(){

        controlador = new ControladorRequerimientos();
        // Configuración de la ventana (JFrame)
		setSize(1230, 400);
		setTitle("Mision TIC 2022");
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);


        // Label de titulo
		labelTitulo = new JLabel("REQUERIMIENTO 2");
		labelTitulo.setBounds(550, 40, 450, 30);
		labelTitulo.setFont(new java.awt.Font("Verdana", 1, 15));
		add(labelTitulo);

        try {

            JTextArea areaIntroduccion1 = new JTextArea();
            areaIntroduccion1.setBounds(300, 120, 600, 200);
            areaIntroduccion1.setEditable(false);
            areaIntroduccion1.setFont(new java.awt.Font("Verdana", 0, 14));
            areaIntroduccion1.setLineWrap(true);
            ArrayList<Requerimiento_2Vo> resultado_requerimiento2 = controlador.consultarRequerimiento2();
            //resultado_requerimiento1.forEach(System.out::println);             
            
            areaIntroduccion1.setText(resultado_requerimiento2.toString());
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

