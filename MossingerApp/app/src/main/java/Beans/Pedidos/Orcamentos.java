package Beans.Pedidos;

/**
 *
 * @author Matheus Henrique
 */

public class Orcamentos {
    
    private Long protocolo;
    private Long idcliente;
    private String listaprodutos;
    private String datapedido;

    public Orcamentos(Long protocolo, Long idcliente, String listaprodutos, String datapedido) {
        this.protocolo = protocolo;
        this.idcliente = idcliente;
        this.listaprodutos = listaprodutos;
        this.datapedido = datapedido;
    }
    
    public Orcamentos() {
      
    }

    public long getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(long protocolo) {
        this.protocolo = protocolo;
    }

    public long getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(long idcliente) {
        this.idcliente = idcliente;
    }

    public String getListaprodutos() {
        return listaprodutos;
    }

    public void setListaprodutos(String listaprodutos) {
        this.listaprodutos = listaprodutos;
    }

    public String getDatapedido() {
        return datapedido;
    }

    public void setDatapedido(String datapedido) {
        this.datapedido = datapedido;
    }
    

    
    
    
}
