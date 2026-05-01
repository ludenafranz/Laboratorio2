package unl.laboratorio2;

public class Diagnostico implements Cloneable{
    private String Descripcion;

    public Diagnostico() {
    }

    public Diagnostico(String descripcion) {
        Descripcion = descripcion;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}
