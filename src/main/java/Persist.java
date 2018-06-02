public class Persist {
    public static int persistence (long number) {
        //int num = 294;
        int repetitions = 0;

        System.out.println("Nº inicial es: " + number);
        // La primera condición es que el numero sea mayor a 2 digitos o sea mayor a 9, se puede colocar de la misma manera que sea number >=10
        while(number > 9){
            int product = 1;
            while(number != 0){
                long units = number % 10;
                product *= units;
                number = (number - units)/10;
            }
            repetitions++;
            System.out.println("Producto " + repetitions + "º es:" + product);
            number = product;
        }
        // Se itera hasta que solo tenga un digito el numero
        System.out.println("La persistencia es: " + repetitions + ", la cifra final: " + number);
        return repetitions;
    }
}
