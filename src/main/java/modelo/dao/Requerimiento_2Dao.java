package modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.vo.Requerimiento_2Vo;
import util.JDBCUtilities;

public class Requerimiento_2Dao {
    public ArrayList<Requerimiento_2Vo> requerimiento2() throws SQLException {
            Connection connection = JDBCUtilities.getConnection();
            ArrayList<Requerimiento_2Vo> listado_registros_rq2 = new ArrayList<Requerimiento_2Vo>();
            String sql = "SELECT ID_Proyecto, MC.Nombre_Material, MC.Importado FROM Compra C JOIN MaterialConstruccion MC ON C.ID_MaterialConstruccion==MC.ID_MaterialConstruccion WHERE C.ID_Proyecto ==1 OR C.ID_Proyecto ==184 OR C.ID_Proyecto ==400 ORDER BY C.ID_Proyecto ASC;";
            try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
                while (rs.next()) {
                    Requerimiento_2Vo requerimiento2 = new Requerimiento_2Vo();
                    requerimiento2.setIdProyecto(rs.getInt("ID_Proyecto"));
                    requerimiento2.setNombreMaterial(rs.getString("Nombre_Material"));
                    requerimiento2.setImportado(rs.getString("Importado"));
                    listado_registros_rq2.add(requerimiento2);
                }
            }
            return listado_registros_rq2;
    }
}