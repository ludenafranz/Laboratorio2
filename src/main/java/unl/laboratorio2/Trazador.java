package unl.laboratorio2;

public class Trazador {
    public void procesar(Paciente pacienteLocal) {
        // Línea A
        pacienteLocal.setNombre("Modificado");
        // Línea B
        pacienteLocal = new Paciente(500,"Temporar",30,null);
        // Línea C
        pacienteLocal.setNombre("Reasignado");
    }

}
