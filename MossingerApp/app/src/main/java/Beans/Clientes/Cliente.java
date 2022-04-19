package Beans.Clientes;

/**
 *
 * @author Matheus Henrique
 */

public class Cliente {
    
    private Long id; 
    private String nome;
    private String razaoSocial;
    private String endereco;
    private String cidade;
    private String cnpj;
    private String cpf;
    private String email;
    private long celular;
    private long telefone;
    private int lestd;
    private int cep;
    private String datanascimento;
    private String uf;
    private String banco;
    private String agencia;
    private String contatobanco;

    public Cliente(String nome, String razaoSocial, String endereco, String cidade, String cnpj, String cpf, String email, long celular, long telefone, int lestd, int cep, String datanascimento, String uf, String banco, String agencia, String contatobanco) {
       
        this.nome = nome;
        this.razaoSocial = razaoSocial;
        this.endereco = endereco;
        this.cidade = cidade;
        this.cnpj = cnpj;
        this.cpf = cpf;
        this.email = email;
        this.celular = celular;
        this.telefone = telefone;
        this.lestd = lestd;
        this.cep = cep;
        this.datanascimento = datanascimento;
        this.uf = uf;
        this.banco = banco;
        this.agencia = agencia;
        this.contatobanco = contatobanco;
    }

     public Cliente() {
       
     
    }
     
         public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public int getLestd() {
        return lestd;
    }

    public void setLestd(int lestd) {
        this.lestd = lestd;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getContatobanco() {
        return contatobanco;
    }

    public void setContatobanco(String contatobanco) {
        this.contatobanco = contatobanco;
    }
    
  
    
    
    
    
}
