public class Ejercicio_1 {
    //Definimos el vector
    int [] vector_numeros = new int [10];
    // Constructor por defecto
public Ejercicio_1(){
}
// metodo para realizar la accion
public void ejecutar(){
    // inicializamos el vector
    for (int i = 0; i < vector_numeros.length; i++) {
        int aleatorio =(int)(Math.random() *10 + 1);
        vector_numeros[i] = aleatorio;
    }
    for (int i = 0; i < vector_numeros.length; i++) {
        int numero = vector_numeros[i];
        int cuadrado= (int) Math.pow(numero,2);
        int cubo= (int) Math.pow(numero,3);
        System.out.println("Vector numeros [" + i + "]: " + numero + ", "+ cuadrado +", "+ cubo );
    }
}
}
