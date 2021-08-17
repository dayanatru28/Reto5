package controlador;

import java.sql.SQLException;
import java.util.ArrayList;

import modelo.dao.Requerimiento_1Dao;
import modelo.dao.Requerimiento_2Dao;
import modelo.dao.Requerimiento_3Dao;
import modelo.vo.Requerimiento_1Vo;
import modelo.vo.Requerimiento_2Vo;
import modelo.vo.Requerimiento_3Vo;
import vista.VentanaReq1;
import vista.VentanaReq2;
import vista.VentanaReq3;
import vista.VistaPrincipal;

public class ControladorRequerimientos {

    private Requerimiento_1Dao requerimiento_1Dao;
    private Requerimiento_2Dao requerimiento_2Dao;
    private Requerimiento_3Dao requerimiento_3Dao;
    // Su código

    public ControladorRequerimientos() {
        this.requerimiento_1Dao = new Requerimiento_1Dao();
        this.requerimiento_2Dao = new Requerimiento_2Dao();
        this.requerimiento_3Dao = new Requerimiento_3Dao();
    }

    public ArrayList<Requerimiento_1Vo> consultarRequerimiento1() throws SQLException {
        return this.requerimiento_1Dao.requerimiento1();
    }

    public ArrayList<Requerimiento_2Vo> consultarRequerimiento2() throws SQLException {
        return this.requerimiento_2Dao.requerimiento2();
    }

    public Requerimiento_3Vo IngresarRequerimiento3(Requerimiento_3Vo persona) throws SQLException {
        return this.requerimiento_3Dao.requerimiento3(persona);
    }


    public void mostrarVentanaPrincipal() {
        VistaPrincipal vPrincipal = new VistaPrincipal();
        vPrincipal.setVisible(true);
    }

    public void mostrarVentanaReq1() {
        VentanaReq1 vBuscar = new VentanaReq1();
        vBuscar.setVisible(true);
    }

    public void mostrarVentanaReq2() {
        VentanaReq2 vBuscar2 = new VentanaReq2();
        vBuscar2.setVisible(true);
    }

    public void mostrarVentanaReq3() {
        VentanaReq3 vBuscar3 = new VentanaReq3();
        vBuscar3.setVisible(true);
    }



}
