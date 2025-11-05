import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String palabrasecreta = "programacion";
        int intentosmaximos = 10;
        int intentos = 0;
        boolean palabraadivinada = false;

        char [] letrasAdivinadas = new char[palabrasecreta.length()];

        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i]='_';
        } 
        while (!palabraadivinada && intentos < intentosmaximos){
            System.out.println("Palabra a adivinar: "+ String.valueOf(letrasAdivinadas));

            System.out.println("Introduce una letra, quieres? c: ");

            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letracorrecta = false; 

            for (int i = 0; i < palabrasecreta.length(); i++) { 
                
                if (palabrasecreta.charAt(i) == letra){
                    letrasAdivinadas[i] = letra; 
                    letracorrecta = true;
                } 
            }

            if (!letracorrecta){
                intentos++;
                System.out.println("!Incorrecto, te quedan " + (intentosmaximos - intentos) + " intentos." );
            }
                if(String.valueOf(letrasAdivinadas).equals(palabrasecreta)){
                    palabraadivinada = true;
                    System.out.println ("Le atinaste, felicidades, la palabra era: " + palabrasecreta );
                }
               }
                if (!palabraadivinada){
                    System.out.println("Lo siento, perdiste. La palabra era: " + palabrasecreta);
                }
        scanner.close();
    }

}
