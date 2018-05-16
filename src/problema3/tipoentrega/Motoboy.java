package problema3.tipoentrega;

import problema3.TipoEntregaInvalido;

public class Motoboy implements ITipoEntrega {

    private int qtdItens;

    public int getQtdItens() {
        return qtdItens;
    }

    public void setQtdItens(int qtdItens) {
        this.qtdItens = qtdItens;
    }

    @Override
    public double calcularValorEntrega(int pesoEmGramas) {
        double pesoEmKG = (pesoEmGramas / 1000);
        if (pesoEmKG > 25 || qtdItens > 30) {
            throw new TipoEntregaInvalido();
        }
        return 7d;
    }

}
