import java.util.Scanner;
public class Ahorcado {

    public static void main(String[] args) throws Exception {
        // clase scanner que nos permite que el usuario escriba
        Scanner scanner = new Scanner(System.in);

        // Declaraciones y asignaciones
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // Arreglo:
        char[] letraAdivinada = new char [palabraSecreta.length()];

        for (int i = 0; i < letraAdivinada.length; i++) {
            letraAdivinada[i] = '_';
            System.out.print(letraAdivinada[i]);
        }

        while (!palabraAdivinada &&  intentos < intentosMaximos) {
            System.out.println("palabra a divinar :" + String.valueOf(letraAdivinada));

            System.out.println("Introduce una letra, porfavor");
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    letraAdivinada[i] = letra;
                    letraCorrecta = true;
                }
            }
            if (! letraCorrecta) {
                intentos++;
                System.out.println("Incorrecto te quedan " + (intentosMaximos - intentos ) + "intentos.");

            }

            if (String.valueOf(letraAdivinada).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("Felicidades, has adivinado la palabra secreta"+ palabraSecreta);
            }
            
        }
        if (! palabraAdivinada) {
            System.out.println("Que pena te haz quedado sin intentos");
        }
        scanner.close();

    }
}
