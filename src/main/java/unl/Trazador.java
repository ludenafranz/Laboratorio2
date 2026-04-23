package unl;

public class Trazador {
    public void procesar(Paciente pacienteLocal) {
        // Línea A
        pacienteLocal.setNombre("Modificado");
        // Línea B
        pacienteLocal = new Paciente(500,"Temporar",30);
        // Línea C
        pacienteLocal.setNombre("Reasignado");
    }

}
