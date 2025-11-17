package views;

import models.Persona;

public class ShowConsole {
    public void showResult(int resultado, int valorBuscado) {
        if (resultado == -1) {
            System.out.println("El valor " + valorBuscado + " no fue encontrado.");
        } else {
            System.out.println("El valor " + valorBuscado + " fue encontrado en la posición " + resultado + ".");
    }

    }

    public void showPersonResult(Persona persona, String nombreBuscado) {
        if (persona == null) {
            System.out.println("La persona con nombre '" + nombreBuscado + "' no fue encontrada.");
        } else {
            System.out.println("La persona con nombre '" + nombreBuscado + "' fue encontrada:");
            System.out.println(persona); 
        }
    }
}
