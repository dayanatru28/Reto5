package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import controlador.ControladorRequerimientos;

public class VistaPrincipal extends JFrame implements ActionListener  {
    private ControladorRequerimientos controlador; // objeto miCoordinador que permite la relacion entre esta clase y la clase
									// coordinador
	private JTextArea areaIntroduccion1;
	private JTextArea areaIntroduccion2;
	private JTextArea areaIntroduccion3;
	private JLabel labelTitulo;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;

	private JButton botonReq1;
    private JButton botonReq2;
    private JButton botonReq3;

	/**
	 * Establece la informacion que se presentara como introduccion del sistema
	 */
	public String textoIntroduccion1 = "";
	public String textoIntroduccion2 = "";
	public String textoIntroduccion3 = "";

	/**
	 * constructor de la clase donde se inicializan todos los componentes de la
	 * ventana principal
	 */
	public VistaPrincipal() {
		// Instancia del controlador utilizado
		controlador = new ControladorRequerimientos();

		// Configuración de la Interfaz Gráfica GUI

		// Configuración de la ventana (JFrame)
		setSize(1230, 400);
		setTitle("Mision TIC 2022");
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Label de titulo
		labelTitulo = new JLabel("PATRON MODELO VISTA CONTROLADOR RETO 5");
		labelTitulo.setBounds(450, 40, 450, 30);
		labelTitulo.setFont(new java.awt.Font("Verdana", 1, 15));
		add(labelTitulo);

		// Label1
		label1 = new JLabel("Requerimiento 1");
		label1.setBounds(145, 80, 200, 30);
		label1.setFont(new java.awt.Font("Verdana", 1, 15));
		add(label1);

		// Texte Area Informativo
		textoIntroduccion1 = "Listado de los líderes cuyo salario es superior al mínimo del salario de los líderes y cuya ciudad de residencia es Barranquilla. Devolver campos ID_Lider, Salario, ciudad de residencia. Los promedios deben ser ordenados de forma ascendente";
		areaIntroduccion1 = new JTextArea();
		areaIntroduccion1.setBounds(20, 120, 380, 140);
		areaIntroduccion1.setEditable(false);
		areaIntroduccion1.setFont(new java.awt.Font("Verdana", 0, 14));
		areaIntroduccion1.setLineWrap(true);
		areaIntroduccion1.setText(textoIntroduccion1);
		areaIntroduccion1.setWrapStyleWord(true);
		add(areaIntroduccion1);


		// Label2
		label2 = new JLabel("Requerimiento 2");
		label2.setBounds(540, 80, 200, 30);
		label2.setFont(new java.awt.Font("Verdana", 1, 15));
		add(label2);

		// Texte Area Informativo
		textoIntroduccion2 = "Listado de materiales utilizados y si es importado para los proyectos con ID 1, 184, 400 ordenados de forma ascendente por el ID del proyecto. Devolver los campos id_Proyecto, Nombre_Material, Importado.";
		areaIntroduccion2 = new JTextArea();
		areaIntroduccion2.setBounds(420, 120, 380, 140);
		areaIntroduccion2.setEditable(false);
		areaIntroduccion2.setFont(new java.awt.Font("Verdana", 0, 14));
		areaIntroduccion2.setLineWrap(true);
		areaIntroduccion2.setText(textoIntroduccion2);
		areaIntroduccion2.setWrapStyleWord(true);
		add(areaIntroduccion2);

		// Label3
		label3 = new JLabel("Requerimiento 3");
		label3.setBounds(940, 80, 200, 30);
		label3.setFont(new java.awt.Font("Verdana", 1, 15));
		add(label3);

		// Texte Area Informativo
		textoIntroduccion3 = "Insertar un nuevo líder (tabla Líder) para que esté disponible en los proyectos que requiera la compañía.";
		areaIntroduccion3 = new JTextArea();
		areaIntroduccion3.setBounds(820, 120, 380, 140);
		areaIntroduccion3.setEditable(false);
		areaIntroduccion3.setFont(new java.awt.Font("Verdana", 0, 14));
		areaIntroduccion3.setLineWrap(true);
		areaIntroduccion3.setText(textoIntroduccion3);
		areaIntroduccion3.setWrapStyleWord(true);
		add(areaIntroduccion3);


		botonReq1 = new JButton("Generar");
		botonReq1.setBounds(150, 280, 120, 25);
		add(botonReq1);
		botonReq1.addActionListener(this);

		botonReq2 = new JButton("Generar");
		botonReq2.setBounds(545, 280, 120, 25);
		add(botonReq2);
		botonReq2.addActionListener(this);

		botonReq3 = new JButton("Insertar");
		botonReq3.setBounds(945, 280, 120, 25);
		add(botonReq3);
		botonReq3.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == botonReq1) {
			controlador.mostrarVentanaReq1();
		}

		if (e.getSource() == botonReq2) {
			controlador.mostrarVentanaReq2();
		}

		if (e.getSource() == botonReq3) {
			controlador.mostrarVentanaReq3();
		}

	}
}