package problema3;

import java.util.ArrayList;
import java.util.Date;
import problema3.tipoentrega.ITipoEntrega;
import problema3.tipoentrega.Motoboy;

public class Pedido {

    private int numero;
    private String nomeCliente;
    private Date data;
    private String endereco;
    private ArrayList<ItemPedido> itens;
    private ITipoEntrega tipoEntrega;

    public Pedido() {
        this.itens = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void incluirItem(Produto p, int qtd) {
        this.itens.add(new ItemPedido(p, qtd));
        atualizaQtdTipoEntregaMotoBoy();
    }

    public double getValorPedido() {
        double valorTotal = 0;
        for (ItemPedido ip : this.itens) {
            valorTotal += (ip.getValorItem());
        }
        return valorTotal;
    }

    private int pesoTotalPedido() {
        int pesoTotal = 0;
        for (ItemPedido item : itens) {
            pesoTotal += item.getProduto().getPeso() * item.getQuantidade();
        }
        return pesoTotal;
    }

    public double getValorEntrega() {
        return tipoEntrega.calcularValorEntrega(pesoTotalPedido());
    }

    public double getValorTotal() {
        return getValorPedido() + getValorEntrega();
    }

    public ITipoEntrega getTipoEntrega() {
        return tipoEntrega;
    }

    public void setTipoEntrega(ITipoEntrega tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
        atualizaQtdTipoEntregaMotoBoy();
    }

    private void atualizaQtdTipoEntregaMotoBoy() {
        if (tipoEntrega instanceof Motoboy) {
            ((Motoboy) tipoEntrega).setQtdItens(itens.size());
        }
    }

}
