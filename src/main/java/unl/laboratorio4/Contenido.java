package unl.laboratorio4;

public class Contenido {
    private String titulo;
    private int duracionSegundos;
    private String calidad; // ej. "4K", "1080p"
    public Contenido(String titulo, int duracion, String calidad) {
        this.titulo = titulo;
        this.duracionSegundos = duracion;
        this.calidad = calidad;
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

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }
}
