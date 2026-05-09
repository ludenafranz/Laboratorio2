package unl.investigacion;

public class Actividad {
    private String titulo;
    private int duracionSegundos;
    private String importancia;
    public Actividad(String titulo, int duracion, String importancia) {
        this.titulo = titulo;
        this.duracionSegundos = duracion;
        this.importancia = importancia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracionSegundos() {
        return duracionSegundos;
    }

    public void setDuracionSegundos(int duracionSegundos) {
        this.duracionSegundos = duracionSegundos;
    }

    public String getImportancia() {
        return importancia;
    }

    public void setImportancia(String importancia) {
        this.importancia = importancia;
    }

    @Override
    public String toString() {
        return "Actividad{" +
                "titulo='" + titulo + '\'' +
                ", duracionSegundos=" + duracionSegundos +
                ", importancia='" + importancia + '\'' +
                '}';
    }

}
