package unl.laboratorio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RegistroMedico registro = new RegistroMedico();
        Trazador trazar = new Trazador();

        for (int i = 0; i < 500000 ; i++){
            registro.agregarPaciente(new Paciente(i,"Paciente", 10,null));
        }

        Paciente pnuevo = new Paciente(0,"Temporar",0,null);
//        int sido = sc.nextInt(); //Espera antes de darle valor nulo a pnuevo
        pnuevo = null;



        Paciente original = new Paciente(101, "Inicial", 25,null);
        System.out.println("Paciente original: "+original);
        trazar.procesar(original);
        System.out.println("Paciente trazado: "+original);
    }
}