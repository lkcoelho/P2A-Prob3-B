package problema3.tipoentrega;

import problema3.TipoEntregaInvalido;

public class EncomendaPAC implements ITipoEntrega {

    @Override
    public double calcularValorEntrega(int pesoEmGramas) {
        if (pesoEmGramas <= 1000) {
            return 10d;
        } else if (pesoEmGramas <= 2000) {
            return 15d;
        } else if (pesoEmGramas <= 3000) {
            return 20d;
        } else if (pesoEmGramas <= 4000) {
            return 30d;
        }
        throw new TipoEntregaInvalido();
    }

}
