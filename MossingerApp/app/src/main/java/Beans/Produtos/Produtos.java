package Beans.Produtos;

/**
 *
 * @author Matheus Henrique
 */


public class Produtos {
    
    private long id;
    private String pmodelo;
  //  private String pcapacidade;
    private long custo;

    public Produtos(long id, String pmodelo, long custo) {
        this.id = id;
        this.pmodelo = pmodelo;
      //  this.pcapacidade = pcapacidade;
        this.custo = custo;
    }
    
       public Produtos() {
      
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getpmodelo() {
        return pmodelo;
    }

    public void setPModelo(String pmodelo) {
        this.pmodelo = pmodelo;
    }


    public long getCusto() {
        return custo;
    }

    public void setCusto(long custo) {
        this.custo = custo;
    }
   
    
}
