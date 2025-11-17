package controllers;

import models.Persona;

public class PersonaController {

    public Persona findByName(Persona[] personas, String nombre) {
        int izquierda = 0;
        int derecha = personas.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            if (personas[medio].getNombre().equalsIgnoreCase(nombre)){
                return personas[medio];
            } 
            
            if (personas[medio].getNombre().compareToIgnoreCase(nombre) < 0) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }
        return null;
    }

    public void sortByName(Persona[] people) {
        for (int i = 0; i < people.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < people.length - 1; j++) {
                if (people[i].getNombre().compareToIgnoreCase(people[j].getNombre()) < 0) {
                    Persona aux = people[i];
                    people[i] = people[j];
                    people[j] = aux;
                    swapped = true;
                }
            }
        }
    }
}
