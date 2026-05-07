package unl.mapeo_referencias;

import java.util.Arrays;

public class ArrayListAnalisis {
    int capacidad;
    int[] arreglo;
    long size;

    public ArrayListAnalisis() {
        capacidad = 10;
        arreglo = new int[capacidad];
        this.size =0;
    }

    private int[] redimensionar (){
        int oldcapacidad = arreglo.length;
        if(oldcapacidad > 0){
            int newcapacidad = capacidad + (capacidad >> 1);
            capacidad = newcapacidad;
            return arreglo = Arrays.copyOf(arreglo, (int)newcapacidad);
        } else{
            return arreglo = Arrays.copyOf(arreglo, capacidad);
        }

    }

    public void agregar(int s) {
        if (size == capacidad) {
            arreglo = redimensionar();
        }
        arreglo[Math.toIntExact(size)] = s;
        size++;
    }

}
