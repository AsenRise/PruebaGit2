public class Metodos {

    public void recursividad1(int num){
        int acumulador=0;

        /*
        Ejercicio 1: Determina qué calcula la siguiente función recursiva. Piensa en que trazá tendría con varios
        casos de prueba, e implementa una función iterativa que realice la misma tarea en Java.
            entero  función (entero n)
            Inicio
            entero resultado
            SI (n == 0)
            resultado = 0
            EN OTRO CASO
            resultado = n + funcion(n-1)
            FINSI
            Devolver (resultado)
            Fin

            traza con el 3--> primera iteracion, resultado 3+funcion(2)
            con la 2--> resultado = 5+funcion(1);
            con la 3 --> resultado 6.
            El metodo funcion, suma los numeros consecutivos desde 1 al numero indicado;
         */

        for (int i=0; i<=num; i++){
            acumulador=acumulador+i;
        }
        System.out.println(acumulador);
    }
    public void recursividad2(int m, int n){
        int resultado;
        /*
        Ejercicio 2: Determina qué calcula la siguiente función recursiva. Piensa en que trazá tendría con
         varios casos de prueba, e implementa una función iterativa que realice la misma tarea en Java.

        entero  función (entero m, entero n)
        Inicio
        entero resultado
        SI (n == 0)
        resultado = 0
        EN OTRO CASO
        SI (n == 1)
        resultado = m
        EN OTRO CASO
        resultado = m + funcion(m,n-1)
        FINSI
        FINSI
            FIN
        Este metodo lo que hace es sumar el numero n veces, lo q es lo mismo multiplicar.
         */
        resultado=m*n;
        System.out.println(resultado);
    }

    public void recursividad22(int m, int n){
        int resultado=0;
        for (int i=0; i<n;i++){
            resultado+=m;
        }
        System.out.println(resultado+" Metodo con for");
    }
}
