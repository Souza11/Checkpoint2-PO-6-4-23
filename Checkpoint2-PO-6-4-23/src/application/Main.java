package application;

import entities.Motorista;
import entities.Pessoa;
import entities.Veiculo;
import entities.Viagem;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Motorista[] motoristas = new Motorista[7];
        motoristas[0] = new Motorista("Carlos", "111.111.111-11", "(11)1111-1111", "123456", "B");
        motoristas[1] = new Motorista("Amanda", "222.222.222-22", "(22)2222-2222", "789012", "D");
        motoristas[2] = new Motorista("Renato", "333.333.333-33", "(33)3333-3333", "345678", "C");
        motoristas[3] = new Motorista("Julia", "444.444.444-44", "(44)4444-4444", "901234", "B");
        motoristas[4] = new Motorista("Ricardo", "555.555.555-55", "(55)5555-5555", "567890", "D");
        motoristas[5] = new Motorista("Fernanda", "666.666.666-66", "(66)6666-6666", "234567", "C");
        motoristas[6] = new Motorista("Pedro", "777.777.777-77", "(77)7777-7777", "890123", "B");

        Veiculo[] veiculos = new Veiculo[7];
        veiculos[0] = new Veiculo(motoristas[0],"AAA-1111", "Onix", "Chevrolet", 2021);
        veiculos[1] = new Veiculo(motoristas[1],"BBB-2222", "Corolla", "Toyota", 2022);
        veiculos[2] = new Veiculo(motoristas[2],"CCC-3333", "HB20", "Hyundai", 2020);
        veiculos[3] = new Veiculo(motoristas[3],"DDD-4444", "Uno", "Fiat", 2019);
        veiculos[4] = new Veiculo(motoristas[4],"EEE-5555", "Civic", "Honda", 2023);
        veiculos[5] = new Veiculo(motoristas[5],"FFF-6666", "Golf", "Volkswagen", 2022);
        veiculos[6] = new Veiculo(motoristas[6],"GGG-7777", "S10", "Chevrolet", 2021);

        Pessoa[] clientes = new Pessoa[7];
        clientes[0] = new Pessoa("João", "111.111.111-11", "(11)1111-1111");
        clientes[1] = new Pessoa("Maria", "222.222.222-22", "(22)2222-2222");
        clientes[2] = new Pessoa("Pedro", "333.333.333-33", "(33)3333-3333");
        clientes[3] = new Pessoa("Ana", "444.444.444-44", "(44)4444-4444");
        clientes[4] = new Pessoa("Lucas", "555.555.555-55", "(55)5555-5555");
        clientes[5] = new Pessoa("Carla", "666.666.666-66", "(66)6666-6666");
        clientes[6] = new Pessoa("Felipe", "777.777.777-77", "(77)7777-7777");




        System.out.println("Informe o seu nome: ");
        String nome = sc.nextLine();
        Pessoa pessoa = null;
        for (Pessoa p : clientes) {
            if (p != null && p.getNome().equals(nome)) {
                pessoa = p;
                break;
            }
        }
        if (pessoa == null) {
            System.out.println("Cliente não encontrada");
            return;
        }

        System.out.println("Informe o endereço de origem: ");
        String origem = sc.nextLine();

        System.out.println("Informe o endereço de destino: ");
        String destino = sc.nextLine();

        Veiculo veiculo = veiculos[new Random().nextInt(veiculos.length)];
        double valor = Math.round(Math.random() * 100);
        Viagem viagem = new Viagem(veiculo, valor, origem , destino);

        System.out.println("Data da viagem: " + viagem.getData());
        System.out.println("Origem: " + viagem.getOrigem());
        System.out.println("Destino: " + viagem.getDestino());
        System.out.println("Valor: R$" + viagem.getValor());
        System.out.println(veiculo.toString());

        
    }

}
