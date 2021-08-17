package modelo.vo;

public class Requerimiento_2Vo {
    private Integer idProyecto;
    private String nombreMaterial;
    private String importado;

    public Requerimiento_2Vo() {
    }

    public Integer getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(Integer idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getNombreMaterial() {
        return nombreMaterial;
    }

    public void setNombreMaterial(String nombreMaterial) {
        this.nombreMaterial = nombreMaterial;
    }

    public String getImportado() {
        return importado;
    }

    public void setImportado(String importado) {
        this.importado = importado;
    }

    @Override
    public String toString() {
        return "Id del Proyecto= " + idProyecto + ", Nombre del Material= " + nombreMaterial+ ", Importado= "
                + importado+ "\n";
    }

   

}
