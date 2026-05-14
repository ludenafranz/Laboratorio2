package unl.laboratorio5;

public class Carga {
    String idDispositivo;
    double kwhRequeridos;
    long ti;

    public Carga() {
    }

    public Carga(String idDispositivo, double kwhRequeridos, long ti) {
        this.idDispositivo = idDispositivo;
        this.kwhRequeridos = kwhRequeridos;
        this.ti = ti;
    }

    public String getIdDispositivo() {
        return idDispositivo;
    }

    public void setIdDispositivo(String idDispositivo) {
        this.idDispositivo = idDispositivo;
    }

    public double getKwhRequeridos() {
        return kwhRequeridos;
    }

    public void setKwhRequeridos(double kwhRequeridos) {
        this.kwhRequeridos = kwhRequeridos;
    }

    public long getTi() {
        return ti;
    }

    public void setTi(long ti) {
        this.ti = ti;
    }

    @Override
    public String toString() {
        return "Carga{" +
                "idDispositivo='" + idDispositivo + '\'' +
                ", kwhRequeridos=" + kwhRequeridos +
                ", ti=" + ti +
                '}';
    }
}
