package main.java.br.com.claudi.orientacaoobjeto;

public class Vendedor extends Pessoa implements CalculosVenda{

    public Vendedor(String nome, String rg, String cpf) {
        super(nome, rg, cpf);
    }

    private float comissao;
    private float totalVendido;

    public void calculaComissao(float porcentagemComissao){
        comissao = totalVendido * porcentagemComissao;
    }

    public float getComissao() {
        return this.comissao;
    }

    public void setTotalVendido(float totalVendido) {
        this.totalVendido = totalVendido;
    }

    public float getTotalVendido() {
        return totalVendido;
    }

    @Override
    public void totalVendidoMes() {

    }

    @Override
    public void totalVendidoSemana() {

    }

    @Override
    public void totalVendidoDia() {

    }

    @Override
    public void totalVendidoNoAno() {

    }
}
