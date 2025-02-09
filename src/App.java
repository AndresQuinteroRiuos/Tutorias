import java.util.Random;
import java.util.Scanner;

public class App {

    // Definir variables globales
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    // Definir constantes para códigos de color
    static final String GREEN = "\033[32m"; // Verde para barra de progreso
    static final String YELLOW = "\033[33m"; // Amarillo para barra de progreso
    static final String BLUE = "\033[34m"; // Azul para subtitulos
    static final String ORANGE = "\033[38;5;208m"; // Naranja en las recomendaciones
    static final String BOLD = "\033[1m"; // Negrita en subtitulos
    static final String RESET = "\033[0m"; // Resetea el color
    static final String BRIGHT_BLUE = "\033[94m"; // Azul brillante Titulos
    static final String BRIGHT_GREEN = "\033[92m"; // Verde brillante Soluciones
    static final String UNDERLINE = "\033[4m"; // Subrayado en titulos

    // Información de los planetas con descripición.
    static String[] planets = {
            "Marte: Es un planeta pequeño y rocoso tiene una atmósfera delgada y enrarecida",
            "Júpiter: Planeta sin superficie sólida, y con una atmósfera de nubes rojizas",
            "Saturno: El único con un sistema de anillos visible desde la Tierra"
    };

    // milliones de kilometros desde la tierra.
    static double[] distances = { 225.0, 628.0, 1426.0 };

    // Verificación de selección de nave y planeta
    static boolean isPlanetSelected = false; // Verifica si se ha seleccionado un planeta
    static boolean isShipSelected = false; // Verifica si se ha seleccionado una nave
    static int selectedShipIndex = -1; // Indice de nave seleccionada
    static int selectedPlanetIndex = -1; // Indice de planeta seleccionado

    public static void main(String[] args) {
        int option;
        do {
            mostrarMenu();
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    seleccionPlaneta();
                    break;
                case 2:
                    seleccionNave();
                    break;
                case 3:
                    calcularRecursos();
                    break;
                case 4:
                    iniciarSimulacion();
                    break;
                case 0:
                    System.out.println(BRIGHT_GREEN + "Saliendo... ¡Gracias por usar la simulación!" + RESET);
                    break;
                default:
                    System.err.println(ORANGE + "¡¡Selecciona una opción válida! (0-7)." + RESET);
                    break;
            }
        } while (option != 0);
        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println(BOLD + BRIGHT_BLUE + UNDERLINE + "\n\t ### Menú Principal ### " + RESET + "\n");
        System.out.println(BOLD + BLUE + "1)." + RESET + " Planetas destino");
        System.out.println(BOLD + BLUE + "2)." + RESET + " Naves espaciales");
        System.out.println(BOLD + BLUE + "3)." + RESET + " Calcular recursos necesarios");
        System.out.println(BOLD + BLUE + "4)." + RESET + " Iniciar simulación");
        System.out.println(BOLD + BLUE + "0)." + RESET + " Salir");
        System.out.print(BOLD + "Por favor, elige una opción: " + RESET);
    }

    public static void seleccionPlaneta() {
        System.out.println(
                BOLD + BRIGHT_BLUE + UNDERLINE + "\n\tMenú Planetas y sus distancias desde la Tierra " + RESET + "\n");
        for (int i = 0; i < planets.length; i++) {
            System.out.println(BOLD + BRIGHT_BLUE + (i + 1) + "). " + RESET + planets[i] + BLUE + BOLD
                    + " - Distancia: " + distances[i] + " millones de km." + RESET);
        }
        System.out.print(BOLD + "Elige el número de tu planeta destino: " + RESET);
        int selection = scanner.nextInt();

        if (selection >= 1 && selection <= planets.length) {
            selectedPlanetIndex = selection - 1;
            System.out.println(BRIGHT_GREEN+"\nHas seleccionado " + planets[selectedPlanetIndex] + "."+RESET);
            isPlanetSelected = true;
        } else {
            System.err.println(ORANGE+"Selección no válida. Por favor, intenta de nuevo."+RESET);
        }
    }

    public static void seleccionNave() {

    }

    public static void calcularRecursos() {

    }

    public static void iniciarSimulacion() {

    }

}