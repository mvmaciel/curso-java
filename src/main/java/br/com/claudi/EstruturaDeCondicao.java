package main.java.br.com.claudi;


public class EstruturaDeCondicao {

    public static void main(String[] args) {
        Clima ensolarado = new Clima("SOL");
        Clima chuvoso = new Clima("CHUVA");
        Clima nubaldo = new Clima("NUBLADO");
        Clima meteoro = new Clima("METEORO");
        Clima granizo = new Clima("GRANIZO");
        Clima furacao = new Clima("FURACAO");


        Clima previsaoAtual = furacao;


        if (previsaoAtual.getPrevisao().equals("SOL")) {
            System.out.println("PARTIU PRAIA !!!");
        }else if (previsaoAtual.getPrevisao().equals("CHUVA")) {
            System.out.println("PARTIU NETFLIX E PIPOCA !!! ");
        }else if (previsaoAtual.getPrevisao().equals("NUBLADO")) {
            System.out.println("ALMOÇO COM A FAMILIA !!");
        } else {
            System.out.println("FUGIR PARA AS COLINAS");
        }


        switch (previsaoAtual.getPrevisao()){
            case "SOL":
                System.out.println("PARTIU PRAIA !!!");
                break;
            case "CHUVA":
                System.out.println("PARTIU NETFLIX E PIPOCA !!! ");
                break;
            case "NUBLADO":
                System.out.println("ALMOÇO COM A FAMILIA !!");
                break;
            case "METEORO":
                System.out.println("FUGIR PARA AS COLINAS");
                break;
            default:
                System.out.println("NÃO FAZER NADA");
        }

    }

    static class Clima {
        private String previsao;

        public Clima(String previsao) {
            this.previsao = previsao;
        }

        public String getPrevisao() {
            return previsao;
        }
    }


}
