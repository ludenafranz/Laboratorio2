package unl.mapeo_referencias;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Experimento {
    public static void main(String[] args) {
        int cantidad = 1000000;
        int[] datosBase = generarDatos(cantidad);

        System.out.println("Medicion");
        medirEstructuraA(datosBase);
        medirEstructuraB(datosBase);
        medirEstructuraC(datosBase);
    }

    public static int[] generarDatos(int cantidad){
        Random random = new Random();
        int[] datos = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            datos[i] = random.nextInt();
        }
        return datos;
    }

    public static void medirEstructuraA(int[] datosBase){
        limpiarMemoria();
        long inicial = medirMemoria();

        int[] arreglo = new int[datosBase.length];
        System.arraycopy(datosBase, 0, arreglo, 0, datosBase.length);

        long fin = medirMemoria();
        System.out.println(arreglo.length);
        imprimirResultado("Arreglo",fin - inicial, datosBase.length);
    }
    public static void medirEstructuraB(int[] datosBase){
        limpiarMemoria();
        long inicial = medirMemoria();

        ArrayList<Integer> listaarray = new ArrayList<>(datosBase.length);
        for (int v : datosBase){
            listaarray.add(v);
        }

        long fin = medirMemoria();
        imprimirResultado("ArrayList",fin-inicial, datosBase.length);
    }
    public static void medirEstructuraC(int[] datosBase){
        limpiarMemoria();
        long inicial = medirMemoria();
        LinkedList<Integer> listaenlazada = new LinkedList<>();
        for (int v : datosBase){
            listaenlazada.add(v);
        }
        long fin = medirMemoria();
        System.out.println(listaenlazada.size());
        imprimirResultado("LinkedList",fin-inicial, datosBase.length);
    }
    public static long medirMemoria(){
        Runtime rt = Runtime.getRuntime();
        long memoriaTotal = rt.totalMemory();
        long memoriaLibre = rt.freeMemory();
        return memoriaTotal - memoriaLibre;
    }

    private static void limpiarMemoria() {
        System.gc();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private static void imprimirResultado(String nombre, long bytes, int cantidad) {
        System.out.printf("%-25s: %d bytes (%.2f MB)%n", nombre, bytes, bytes / (1024.0 * 1024.0));
        calcularPorcentajeDesperdicio(bytes,cantidad);
        System.out.println();
    }
    public static void calcularPorcentajeDesperdicio(long memoriaTotalOcupada, int cantidad) {
        // Memoria Útil: 4 bytes por cada entero (valor teórico base)
        long memoriaUtilDeDatos = (long) cantidad * 4;

        // Evitar división por cero o resultados incoherentes por limpieza del GC
        if (memoriaTotalOcupada <= memoriaUtilDeDatos) {
            System.out.println("Porcentaje de Desperdicio: 0.00% (Estructura óptima)");
            return;
        }

        double desperdicio = (double) (memoriaTotalOcupada - memoriaUtilDeDatos);
        double porcentaje = (desperdicio / memoriaTotalOcupada) * 100;

        System.out.printf("Memoria Útil (Teórica): %d bytes%n", memoriaUtilDeDatos);
        System.out.printf("Memoria Desperdiciada: %.0f bytes%n", desperdicio);
        System.out.printf("%% Desperdicio: %.2f%%%n", porcentaje);
    }
}
