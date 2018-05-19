package problema3;

public class ItemPedido {

    private Produto produto;
    private int quantidade;

    /**
     * @param produto
     * @param quantidade
     */
    public ItemPedido(Produto produto, int quantidade) {
        setProduto(produto);
        setQuantidade(quantidade);
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        if (produto == null) {
            throw new IllegalArgumentException("Deve ser definido um produto");
        } else {
            this.produto = produto;
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade de itens de pedido deve ser maior que ZERO");
        } else {
            this.quantidade = quantidade;
        }
    }

    public double getValorItem() {
        return this.quantidade * this.produto.getValor();
    }
}
