import java.util.Scanner;

public class App {

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario el tamaño del array
        System.out.print("Ingrese el tamaño del array: ");
        int tamano = scanner.nextInt();
        
        // Crear un array del tamaño especificado
        int[] array = new int[tamano];
        
        // Llenar el array
        try {
            llenarArray(array, scanner);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }
        
        // Imprimir el array original
        System.out.println("Array original:");
        imprimirArray(array);
        
        // Invertir el array
        int[] arrayInvertido = invertirArray(array);
        
        // Imprimir el array invertido
        System.out.println("Array invertido:");
        imprimirArray(arrayInvertido);
        
        scanner.close();
    }
    
    // Método para llenar el array
    public static void llenarArray(int[] array, Scanner scanner) throws Exception {
        System.out.println("Ingrese los elementos del array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
    }
    
    // Método para imprimir el array
    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
    // Método para invertir el array
    public static int[] invertirArray(int[] array) {
        int[] arrayInvertido = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayInvertido[i] = array[array.length - 1 - i];
        }
        return arrayInvertido;
    }
}