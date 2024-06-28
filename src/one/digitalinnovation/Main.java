package one.digitalinnovation;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Carro> listCarros = new ArrayList<>();

        listCarros.add(new Carro ("FORD"));
        listCarros.add(new Carro ("FERRARI"));
        listCarros.add(new Carro ("FIAT"));
        listCarros.add(new Carro ("BUGGATI"));

        //SE ESTÁ NA LISTA
        System.out.println((listCarros.contains(new Carro ("FORD"))));

        //IMPRIME OQUE ESTA NA LISTA
        System.out.println(listCarros.get(2));

        //VERIFICA EM QUE INDIÇE ESTÁ
        System.out.println(listCarros.indexOf(new Carro ("FERRARI")));

        System.out.println(listCarros.remove(2));
        System.out.println(listCarros);
        
    }
}
