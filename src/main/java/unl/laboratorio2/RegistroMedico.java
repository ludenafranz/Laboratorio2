package unl.laboratorio2;

import java.util.ArrayList;
import java.util.List;

public class RegistroMedico {
    private static List<Object> cache = new ArrayList<>();

    public void agregarPaciente(Paciente p){
        cache.add(p);
    }

    public static List<Object> getCache() {
        return cache;
    }

    public static void setCache(List<Object> cache) {
        RegistroMedico.cache = cache;
    }
}
