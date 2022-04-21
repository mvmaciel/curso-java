package main.java.br.com.claudi.orientacaoobjeto;

public class Cliente extends Pessoa implements CalculosVenda{
    public Cliente(String nome, String rg, String cpf) {
        super(nome, rg, cpf);
    }

    @Override
    public void totalVendidoMes() {

    }

    @Override
    public void totalVendidoSemana() {

    }

    @Override
    public void totalVendidoDia() {
        System.out.println("O total vendido no dia foi de R$ 10");
        //ESSA ROTINA VAI RETORNAR TUDO O QUE FOI VENDIDO PARA O CLIENTE
    }

    @Override
    public void totalVendidoNoAno() {

    }
}
