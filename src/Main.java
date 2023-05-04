/*
En este ejercicio practicarás las estructuras de control, para ello deberás crear:

1.Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
  Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
2.Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
  Incrementar el valor de la variable en uno cada vez que se ejecute.
  Mostrarlo por pantalla cada vez que se ejecute.
3.Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
4.Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
5.Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.
 */
public class Main {
    public static void main(String[] args) {
        //Ejercicio N°1 Condicional If
        System.out.println("********************************");
        System.out.println("Ejercicio N° 1 - Condicional If");
        int numeroIf = 3;
            if (numeroIf>0 )
        System.out.println("El Numero es Positivo");
            else {
                System.out.println("el numero es negativo");
            }
        System.out.println("********************************");

        // Ejercicio N°2 - Bucle While
        System.out.println("Ejercicio N° 2 - Bucle WHILE");
        int numeroWhile = 0;
            while (numeroWhile <3){
                System.out.println("El Numero actual es: "+numeroWhile);
                numeroWhile++;
            }
       // Ejercicio N°3 - Bucle Do While
        System.out.println("********************************");
        System.out.println("Ejercicio N° 3 - Bucle Do While");
            int NumeroDoWhile = 3;
            do{
                System.out.println(NumeroDoWhile);
                NumeroDoWhile ++;
               } while (NumeroDoWhile<3);

       // Ejercicio N°4 - Bucle For
        System.out.println("********************************");
         System.out.println("Ejercicio N° 4 - Bucle FOR");
        for (int numeroFor = 0; numeroFor <=3; numeroFor++) {
            System.out.println(numeroFor);
        }
        // Ejercicio N°5 - Switch
        System.out.println("********************************");
        System.out.println("Ejercicio N° 5 - Switch");
        var estacion = "verano";
        var distancia = "desconocida";
            switch (estacion){
                case"verano":System.out.println("Es Verano");break;
                case"invierno":System.out.println("Es Invierno");break;
                case"primavera":System.out.println("Es Primavera");break;
                case"otono":System.out.println("Es Otono");break;
                default:
                    System.out.printf("!ATENCION! Estacion Invalida");

            }

    }
}