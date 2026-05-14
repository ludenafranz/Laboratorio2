package unl.laboratorio5;

public class main {
    public static void main(String[] args) {
        ColaEnergia colaEnergia = new ColaEnergia();

        // Generar una ráfaga de 10 peticiones iniciales.
        System.out.println("Generando ráfaga inicial (10)");
        for (int i = 0; i < 10; i++) {
            Carga nuevo = new Carga("Dispoditivo"+i, 100.00 +i, 10+i );
            colaEnergia.encolar(nuevo);
        }

        // Procesar 5 peticiones (simulando carga)
        System.out.println("Procesando 5 peticiones");
        for (int i = 0; i < 5; i++) {
            Carga procesar = colaEnergia.desencolar();
            System.out.println("Ejecutando: " + procesar.toString());
            //simula tiempo para procesar la orden
            try { Thread.sleep(100); } catch (InterruptedException e) { e.printStackTrace(); }
        }

        // Generar una segunda ráfaga de 5 peticiones
        System.out.println("Generando segunda ráfaga (5)");
        for (int i = 10; i < 15; i++) {
            Carga nuevo = new Carga("Dispoditivo"+i, 100.00 +i, 10+i );
            colaEnergia.encolar(nuevo);
        }

        //Reto Green Computing: Implementar un método que detecte si la
        //cola está vacía y ponga el proceso en "Estado de Espera"
        System.out.println("Iniciando proceso de verificacion");
        while(true){
            if(!colaEnergia.isEmpy()){
                System.out.println("Vaciando procesos pendientes");
                for (int i = 0; i < colaEnergia.getContador(); i++) {
                    Carga procesar = colaEnergia.desencolar();
                    System.out.println("Ejecutando: " + procesar.toString());
                    try {
                        //simula tiempo para procesar la orden
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } else {
                // Implementación del Estado de Espera para ahorro de CPU
                System.out.println("Cola vacía. Entrando en 'Estado de Espera' (Sleep)");
                try {
                    // 2 segundos de espera por nuevos procesos
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // Verifica si la cola esta vacia para detener el proceso
                if (colaEnergia.isEmpy()) {
                    System.out.println("Cola vacia deteniedo proceso");
                    break;
                }
            }
        }
    }
}
