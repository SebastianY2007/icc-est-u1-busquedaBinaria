import controllers.BusquedaBinaria;
import controllers.PersonaController;
import models.Persona;
import views.ShowConsole;

public class App {
    public static void main(String[] args) throws Exception {
        BusquedaBinaria busquedaBinaria = new BusquedaBinaria();
        BubbleSort bubbleSort = new BubbleSort();
        ShowConsole showConsole = new ShowConsole();

        int[] arr = {10,2,4,6,8,13,20};
        bubbleSort.bubblesort(arr);
        int result = busquedaBinaria.busquedaNumero(arr, 10);
        
        showConsole.showResult(result, 10);

        Persona[] personas = new Persona[] {
            new Persona("Juan", 25),
            new Persona("Ana", 30),
            new Persona("Pedro", 20),
            new Persona("Maria", 28),
            new Persona("Luis", 22),
            new Persona("Carmen", 27),
            new Persona("Sofia", 24),
        };

        PersonaController personaController = new PersonaController();

        personaController.sortByName(personas);

        Persona resultado = personaController.findByName(personas, "Pedro");
        showConsole.showPersonResult(resultado, "Pedro");
    }
}
