import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> person = new ArrayList<String>();
        person.add("Gustavo"); //add
        person.add("Gustavinho");
        person.add("Tavinho");
        int ultimo = person.size() - 1;
        System.out.println(person.get(ultimo)); //get
        System.out.println(person.get(0));
        person.remove(0); //remove

        for (String nome : person) {
            System.out.println(nome);
        }
        person.clear(); //clear

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(30);
        numeros.add(20);
        numeros.add(10);
        numeros.add(25);
        numeros.add(60);
        Collections.sort(numeros); //sort
        //Collections.sort(numeros,Collections.reverseOrder());
        for (int i : numeros){
            System.out.println(i);
        }


        ArrayList<Pessoa> pessoas =new ArrayList<Pessoa>();
        pessoas.add( new Pessoa("João",23));
        pessoas.add( new Pessoa("Maria",19));
        for (Pessoa cont : pessoas ){
            System.out.println(cont.getNome());
        }
    }
}