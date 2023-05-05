package application;

import entities.Motorista;
import entities.Pessoa;
import entities.Veiculo;

public class Main {

    public static void main(String[] args) {

        final int N = 7;

        Veiculo veiculos[] = new Veiculo[N];
        Pessoa pessoas [] = new Pessoa[N];

        int i = 0;

        while(veiculos[N-1] == null){
            Motorista a = new Motorista("A"+i,"12345678"+i,"96674559"+i,"98765432"+i,"CT"+i);
            veiculos[i] = new Veiculo(a,"9653"+i,"GT-"+i,"Montadora "+i,2000+i);
            i++;
        }

        i=0;
        while(pessoas[N-1] == null){
            pessoas[i] = new Pessoa("Gustavo"+i,"075445716"+i,"97845400"+i);
            i++;
        }


    }

}
