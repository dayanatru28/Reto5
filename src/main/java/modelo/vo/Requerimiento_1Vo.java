package modelo.vo;

public class Requerimiento_1Vo {
    private Integer idLider;
    private Integer salario;
    private String ciudadResidencia;

    public Requerimiento_1Vo() {
    }

    public Integer getIdLider() {
        return idLider;
    }

    public void setIdLider(Integer idLider) {
        this.idLider = idLider;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public String getCiudadResidencia() {
        return ciudadResidencia;
    }

    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }

    @Override
    public String toString() {
        return  "IdLider=" + idLider + ", Salario="
                + salario + ", CiudadResidencia=" + ciudadResidencia +"\n";
    }

  
    

    

    


}
