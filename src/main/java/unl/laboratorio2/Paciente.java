package unl.laboratorio2;

public class Paciente implements Cloneable {
    private long id;
    private String nombre;
    private int edad;
    private Diagnostico diagnostico;

    public Paciente() {
    }

    public Paciente(long id, String nombre, int edad, Diagnostico diagnostico) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.diagnostico = diagnostico;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Paciente clone = (Paciente) super.clone();
        clone.setDiagnostico((Diagnostico) this.diagnostico.clone());
        return clone;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", diagnostico=" + diagnostico +
                '}';
    }
}
