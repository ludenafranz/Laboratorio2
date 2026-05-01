package unl.laboratorio2;

public class PruebaClonacion {
    public static void main(String[] args) {
        try {
            Diagnostico diagOriginal = new Diagnostico("Gripe común");
            Paciente p1 = new Paciente(101,"Juan",10, diagOriginal);


            Paciente p2 = (Paciente) p1.clone();

            p2.getDiagnostico().setDescripcion("Infección respiratoria aguda");

            System.out.println("Diagnóstico P1 (Original): " + p1.getDiagnostico().getDescripcion());
            System.out.println("Diagnóstico P2 (Clon): " + p2.getDiagnostico().getDescripcion());

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
