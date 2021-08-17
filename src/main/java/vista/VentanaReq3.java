package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import controlador.ControladorRequerimientos;
import modelo.vo.Requerimiento_3Vo;


public class VentanaReq3 extends JFrame implements ActionListener{

    private ControladorRequerimientos controlador;
    private JLabel labelTitulo;
    private JButton botonInsertar;
    private JTextField textNombre, textPrimer_Apellido, textSegundo_Apellido, textSalario, textCiudad_Residencia, textCargo, textClasificacion, textDocumento_Identidad, textFecha_Nacimiento;
	private JLabel Nombre, Primer_Apellido, Segundo_Apellido, Salario, Ciudad_Residencia, Cargo, Clasificacion, Documento_Identidad, Fecha_Nacimiento;

    public VentanaReq3(){

        controlador = new ControladorRequerimientos();
        // Configuración de la ventana (JFrame)
		setSize(1230, 400);
		setTitle("Mision TIC 2022");
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);


        // Label de titulo
		labelTitulo = new JLabel("INGRESAR LIDER");
		labelTitulo.setBounds(550, 40, 450, 30);
		labelTitulo.setFont(new java.awt.Font("Verdana", 1, 15));
		add(labelTitulo);

        // Campos de datos de Persona
		Nombre = new JLabel("Nombre");
		Nombre.setBounds(20, 120, 80, 25);
		add(Nombre);
		textNombre = new JTextField();
		textNombre.setBounds(80, 120, 190, 25);
		add(textNombre);

         // Campos de datos de Persona
		Primer_Apellido = new JLabel("Primer Apellido");
		Primer_Apellido.setBounds(300, 120, 100, 25);
		add(Primer_Apellido);
		textPrimer_Apellido = new JTextField();
		textPrimer_Apellido.setBounds(400, 120, 190, 25);
		add(textPrimer_Apellido);

         // Campos de datos de Persona
		Segundo_Apellido = new JLabel("Segundo Apellido");
		Segundo_Apellido.setBounds(620, 120, 100, 25);
		add(Segundo_Apellido);
		textSegundo_Apellido = new JTextField();
		textSegundo_Apellido.setBounds(730, 120, 190, 25);
		add(textSegundo_Apellido);

        Salario = new JLabel("Salario");
		Salario.setBounds(950, 120, 100, 25);
		add(Salario);
		textSalario = new JTextField();
		textSalario.setBounds(1000, 120, 190, 25);
		add(textSalario);

        Ciudad_Residencia = new JLabel("Cuidad");
		Ciudad_Residencia.setBounds(20, 170, 80, 25);
		add(Ciudad_Residencia);
		textCiudad_Residencia = new JTextField();
		textCiudad_Residencia.setBounds(80, 170, 190, 25);
		add(textCiudad_Residencia);

        Clasificacion = new JLabel("Clasificacion");
		Clasificacion.setBounds(300, 170, 80, 25);
		add(Clasificacion);
		textClasificacion = new JTextField();
		textClasificacion.setBounds(400, 170, 190, 25);
		add(textClasificacion);

        Documento_Identidad = new JLabel("Doc. Identidad");
		Documento_Identidad.setBounds(620, 170, 100, 25);
		add(Documento_Identidad);
		textDocumento_Identidad = new JTextField();
		textDocumento_Identidad.setBounds(730, 170, 190, 25);
		add(textDocumento_Identidad);

        Cargo = new JLabel("Cargo");
		Cargo.setBounds(950, 170, 100, 25);
		add(Cargo);
		textCargo = new JTextField();
		textCargo.setBounds(1000, 170, 190, 25);
		add(textCargo);

        Fecha_Nacimiento = new JLabel("Fecha Nacimiento");
		Fecha_Nacimiento.setBounds(300, 240, 100, 25);
		add(Fecha_Nacimiento);
		textFecha_Nacimiento = new JTextField();
		textFecha_Nacimiento.setBounds(400, 240, 190, 25);
		add(textFecha_Nacimiento);

        botonInsertar = new JButton("Insertar");
		botonInsertar.setBounds(620, 240, 100, 25);
		add(botonInsertar);
		botonInsertar.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonInsertar){
			try {
                Requerimiento_3Vo persona = new Requerimiento_3Vo();
                persona.setNombre(textNombre.getText());
                persona.setPrimer_Apellido(textPrimer_Apellido.getText());
                persona.setSegundo_Apellido(textSegundo_Apellido.getText());
                persona.setSalario(textSalario.getText());
                persona.setCuidad_Residencia(textCiudad_Residencia.getText());
                persona.setCargo(textCargo.getText());
                persona.setClasificacion(textClasificacion.getText());
                persona.setDocumento_Identidad(textDocumento_Identidad.getText());
                persona.setFecha_Nacimiento(textFecha_Nacimiento.getText());

                controlador.IngresarRequerimiento3(persona);


			} catch (Exception e3) {
				JOptionPane.showMessageDialog(null, "Error al consultar", "Error", JOptionPane.ERROR_MESSAGE);
			}

		}
        
    }
    
}
