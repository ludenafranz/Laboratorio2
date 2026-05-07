package unl.laboratorio4;

import unl.laboratorio2.Paciente;
import unl.laboratorio2.RegistroMedico;
import unl.laboratorio2.Trazador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GreenFeedPlayer videos = new GreenFeedPlayer();

        videos.agregarAlFeed(new Contenido("long",15,"4k"));

    }
}