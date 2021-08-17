package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelo.vo.Requerimiento_3Vo;
import util.JDBCUtilities;

public class Requerimiento_3Dao {
    public Requerimiento_3Vo requerimiento3(Requerimiento_3Vo persona) throws SQLException {
        Connection connection = JDBCUtilities.getConnection();
        try {
            String sql = "Insert into Lider(Nombre,Primer_Apellido,Segundo_Apellido,Salario,Ciudad_Residencia,Cargo,Clasificacion,Documento_Identidad,Fecha_Nacimiento) values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement consulta = connection.prepareStatement(sql);
            consulta.setString(1, persona.getNombre());
            consulta.setString(2, persona.getPrimer_Apellido());
            consulta.setString(3, persona.getSegundo_Apellido());
            consulta.setString(4, persona.getSalario());
            consulta.setString(5, persona.getCuidad_Residencia());
            consulta.setString(6, persona.getCargo());
            consulta.setString(7, persona.getClasificacion());
            consulta.setString(8, persona.getDocumento_Identidad());
            consulta.setString(9, persona.getFecha_Nacimiento());

            int rows = consulta.executeUpdate();
            if (rows>0){
                JOptionPane.showMessageDialog(null, "Insertado", "Nuevo Lider creado correctamente",
							JOptionPane.WARNING_MESSAGE);
            }

        } catch (Exception e) {
            //TODO: handle exception
        }
        
        return persona;
    }
}