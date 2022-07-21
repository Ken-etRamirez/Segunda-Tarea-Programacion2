import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creamos objeto Scanner
        Scanner teclado= new Scanner(System.in);

        //Pedimos dato y guardamos
        System.out.print("Ingrese un nombre: ");
        String nombre= teclado.nextLine();

        //Mostramos el resultado en pantalla
        System.out.println("Bienvenido a Progra II 2022 "+nombre +" !!");
    }

}
