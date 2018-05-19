package problema3.main;

import problema3.*;
import problema3.tipoentrega.EncomendaPAC;
import problema3.tipoentrega.ITipoEntrega;
import problema3.tipoentrega.Motoboy;
import problema3.tipoentrega.RetiradaLocal;
import problema3.tipoentrega.Sedex;
/**
 *
 * @author Luan Gomes
 */
public class Go {
    
    public static void main(String[] args) {
        
        Produto notebook = new Produto("Muito caro", 15, 100);
        Produto livro = new Produto("Esse esta em conta", 3, 600);
        Produto carro = new Produto("MDS que caro", 500, 600000);
        Produto celular = new Produto("Esse é bom", 20, 600);
        Produto mesa = new Produto("Tem 5 pernas", 50, 2000);
        
        
        Pedido pedido1 = new Pedido();
        Pedido pedido2 = new Pedido();
        Pedido pedido3 = new Pedido();
        Pedido pedido4 = new Pedido();
        
        pedido1.incluirItem(notebook, 3);
        pedido1.incluirItem(livro, 4);
        pedido2.incluirItem(celular, 7);
        pedido3.incluirItem(carro, 5);
        pedido4.incluirItem(mesa, 7);
        
        ITipoEntrega tipoEntregaPedido1 = new EncomendaPAC();
        ITipoEntrega tipoEntregaPedido2 = new Sedex();
        ITipoEntrega tipoEntregaPedido3 = new RetiradaLocal();
        ITipoEntrega tipoEntregaPedido4 = new Motoboy();
        
        pedido1.setTipoEntrega(tipoEntregaPedido1);
        pedido2.setTipoEntrega(tipoEntregaPedido2);
        pedido3.setTipoEntrega(tipoEntregaPedido3);
        pedido4.setTipoEntrega(tipoEntregaPedido4);
        
        System.out.println("Pedido 1");
        System.out.println("Valor entrega: " + pedido1.getValorEntrega());
        System.out.println("Valor item " + pedido1.getValorPedido());
        System.out.println("Valor total " + pedido1.getValorTotal());
        
        System.out.println("Pedido 2");
        System.out.println("Valor entrega: " + pedido2.getValorEntrega());
        System.out.println("Valor item: " + pedido2.getValorPedido());
        System.out.println("Valor total: " + pedido2.getValorTotal());
         
        System.out.println("Pedido 3");
        System.out.println("Valor entrega: " + pedido3.getValorEntrega());
        System.out.println("Valor item: " + pedido3.getValorPedido());
        System.out.println("Valor total: " + pedido3.getValorTotal());
         
        System.out.println("Pedido 4");
        System.out.println("Valor entrega: " + pedido4.getValorEntrega());
        System.out.println("Valor item: " + pedido4.getValorPedido());
        System.out.println("Valor total: " + pedido4.getValorTotal());
    }
    
}
