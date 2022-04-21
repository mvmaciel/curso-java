package main.java.br.com.claudi;

import java.util.ArrayList;
import java.util.List;

public class EstruturaDeRepeticao {

    public static void main(String[] args) {
        List<Cliente> listaDeClientes = new ArrayList();
        Cliente marcos = new Cliente("Marcos", "123");
        Cliente claudio = new Cliente("Claudio", "456");
        Cliente juliana = new Cliente("Juliana", "789");
        Cliente isabela = new Cliente("Isabela", "101112");

        listaDeClientes.add(marcos);
        listaDeClientes.add(claudio);
        listaDeClientes.add(juliana);
        listaDeClientes.add(isabela);

        //ESTRUTURAS DE REPETIÇÃO UTILIZANDO FOR E FOREACH PARA PERCORRER A LISTA

        //ESTRUTURA COM AUXILIADORES INT E PEGANDO DIRETAMENTE DA LISTA COM POSIÇÃO DE ITEM DENTRO DA LISTA
        for (int cliente = 0; cliente < listaDeClientes.size(); cliente++) {
            System.out.println("Nome: " + listaDeClientes.get(cliente).getNome());
            System.out.println("CPF: " + listaDeClientes.get(cliente).getCpf());
        }


        //DUAS ESTRUTURAS DE REPETIÇÃO DIFERENTES PORÉM COM A MESMA FUNCIONALIDADE DE FILTRO POR NOME E CPF DE CLIENTE

        //ESTRUTURA DE REPETICÃO ITERANDO A PROPRIA LISTA E PREENCHENDO UMA VARIAVEL DO TIPO CLIENTE -> MESMA LOGICA DO EXEMPLO 3
        for (Cliente cliente : listaDeClientes) {
            if (cliente.getNome().equals("Claudio")) {
                System.out.println("Nome: " + cliente.getNome());
                System.out.println("CPF: " + cliente.getCpf());
                break;
            }
        }

        //FOR EACH PARA ITERAR A PROPRIA LISTA JÁ RETORNANDO UMA VARIAVEL DO TIPO CLIENTE PARA PEGAR OS DADOS
        listaDeClientes.forEach(cliente -> {
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("CPF: " + cliente.getCpf());
        });


        // ESTRUTURA DE REPETIÇÃO UTILIZANDO LAMBDA COM FILTRO DE CLIENTE E CPF MESMA LOGICA DO EXEMPLO 2 E 3
        listaDeClientes.stream().filter(cliente -> cliente.getNome().equals("Claudio") && cliente.getCpf().equals("123")).findFirst().ifPresent(cliente -> {
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("CPF: " + cliente.getCpf());
        });
    }

    static class Cliente {

        public Cliente(String nome, String cpf) {
            this.nome = nome;
            this.cpf = cpf;
        }

        private String nome;
        private String cpf;

        public String getNome() {
            return nome;
        }

        public String getCpf() {
            return cpf;
        }
    }
}
