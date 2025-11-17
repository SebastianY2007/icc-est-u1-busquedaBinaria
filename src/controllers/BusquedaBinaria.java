package controllers;

public class BusquedaBinaria {
    public Integer busquedaNumero(int[] arr, int objetivo) {
        int izquierda = 0;
        int derecha = arr.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            if (arr[medio] == objetivo){
                return arr[medio];
            } 
            
            if (arr[medio] < objetivo) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }
        return null;
    }
}
