package unl.laboratorio3;

public class PuntoOptimizacion {
    private int id;
    private double consumo;
    private String nombreSensor;

    public PuntoOptimizacion(int id, double consumo, String nombreSensor) {
        this.id = id;
        this.consumo = consumo;
        this.nombreSensor = nombreSensor;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Sensor #" + id + " [" + nombreSensor + "]: " + consumo + " kWh";
    }
}