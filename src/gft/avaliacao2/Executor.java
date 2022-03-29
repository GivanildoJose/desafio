package gft.avaliacao2;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Executor {
    public static void main(String... args) {

        Scanner input = new Scanner(System.in);
        TreeSet<Double> list = new TreeSet<>();
        try {
            while (input.hasNextDouble()) {
                var valor = input.nextDouble();

                if (!list.contains(valor)) {
                    list.add(valor);
                }

            }

            input.close();
        } catch (Exception ex) {}

        Iterator<Double> iterador = list.iterator();

        while (iterador.hasNext()) {
            System.out.println(iterador.next() + " ");
        }

    }
}
