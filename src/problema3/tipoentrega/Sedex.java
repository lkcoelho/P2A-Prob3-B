package problema3.tipoentrega;

public class Sedex implements ITipoEntrega {

    @Override
    public double calcularValorEntrega(int pesoEmGramas) {
        if (pesoEmGramas <= 500) {
            return 12.5d;
        } else if (pesoEmGramas <= 750) {
            return 20d;
        } else if (pesoEmGramas <= 1200) {
            return 30d;
        } else if (pesoEmGramas <= 2000) {
            return 45d;
        } else {
            double total = 45d;
            int i = pesoEmGramas - 2000;
            while (i > 0) {
                total += 1.5d;
                i -= 100;
            }
            return total;
        }
    }

}
