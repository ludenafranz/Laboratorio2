package unl.laboratorio4;

import unl.laboratorio2.Paciente;
import unl.laboratorio2.RegistroMedico;
import unl.laboratorio2.Trazador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n    SIMULACIÓN GREENFEED - 1,000,000 DE ELEMENTOS               \n");

        GreenFeedPlayer videos = new GreenFeedPlayer();
        System.out.println("        Creando feed con 1,000,000 de videos...");
        long startTime = System.currentTimeMillis();

        for (int i = 1; i <= 1000000; i++) {
            Contenido video = new Contenido(
                    "Video " + i,
                    180,
                    i % 5 == 0 ? "4K" : "1080p"
            );
            videos.agregarAlFeed(video);
        }

        long endTime = System.currentTimeMillis();

        System.out.println("        Feed creado exitosamente");
        System.out.println("        Tiempo: " + (endTime - startTime) + " ms\n");

        System.out.println("\n    ANÁLISIS: CICLOS DE INSTRUCCIÓN                             \n");

        System.out.println("        Navegando al video 500,000...");

        for (int i = 1; i < 500000; i++) {
            videos.siguienteVideo();
        }

        System.out.println("        Posición actual: Video 500,000\n");

        System.out.println("  ESCENARIO 1: CON puntero 'anterior' (O(1))\n");

        long ciclosConAnterior = 0;
        int retrocesos = 100000;

        startTime = System.nanoTime();
        for (int i = 0; i < retrocesos; i++) {
            videos.videoAnterior();
            ciclosConAnterior++;
        }
        endTime = System.nanoTime();
        long tiempoConAnterior = (endTime - startTime) / 1000000;

        System.out.println("        Operación: videoAnterior() usa getAnterior()");
        System.out.println("        Complejidad: O(1) - acceso directo al nodo previo");
        System.out.println("        Retrocesos realizados: " + String.format("%,d", retrocesos));
        System.out.println("        Ciclos totales: " + String.format("%,d", ciclosConAnterior));
        System.out.println("        Ciclos por operación: 1");
        System.out.println("        Tiempo real: " + tiempoConAnterior + " ms\n");


        System.out.println("\n  ESCENARIO 2: SIN puntero 'anterior' (O(n))\n");

        videos.setReproduciendoActual(videos.getPrimero());

        for (int i = 1; i < 500000; i++) {
            videos.siguienteVideo();
        }

        long ciclosSinAnterior = 0;
        int posicionActual = 500000;

        startTime = System.nanoTime();
        for (int i = 0; i < retrocesos; i++) {
            posicionActual--;
            ciclosSinAnterior += posicionActual;

        }
        endTime = System.nanoTime();
        long tiempoSinAnteriorTeorico = (endTime - startTime) / 1000000;

        long tiempoSinAnteriorReal = (ciclosSinAnterior / ciclosConAnterior) * tiempoConAnterior;

        System.out.println("        Operación: Buscar desde primero hasta posición n-1");
        System.out.println("        Complejidad: O(n) - recorrer toda la lista");
        System.out.println("        Retrocesos realizados: " + String.format("%,d", retrocesos));
        System.out.println("        Ciclos totales: " + String.format("%,d", ciclosSinAnterior));
        System.out.println("        Ciclos promedio por operación: " + String.format("%,d", ciclosSinAnterior / retrocesos));
        System.out.println("        Tiempo estimado: " + String.format("%,d", tiempoSinAnteriorReal) + " ms");
        System.out.println("                         ≈ " + String.format("%.1f", tiempoSinAnteriorReal / 1000.0) + " segundos");
        System.out.println("                         ≈ " + String.format("%.1f", tiempoSinAnteriorReal / 60000.0) + " minutos\n");

        System.out.println("\n       RESULTADO: CICLOS AHORRADOS                              \n");

        long ahorroCiclos = ciclosSinAnterior - ciclosConAnterior;
        double mejora = (double) ciclosSinAnterior / ciclosConAnterior;
        double porcentajeAhorro = ((double) ahorroCiclos / ciclosSinAnterior) * 100;

        System.out.println("        CICLOS AHORRADOS: " + String.format("%,d", ahorroCiclos));
        System.out.println("        PORCENTAJE DE AHORRO: " + String.format("%.4f%%", porcentajeAhorro));
        System.out.println("        MEJORA DE RENDIMIENTO: " + String.format("%,.1fx más rápido", mejora));
        System.out.println("        TIEMPO AHORRADO: " + String.format("%,d ms", tiempoSinAnteriorReal - tiempoConAnterior) + "\n");

    }
}