package Modelo;

public class Jogador{
    private String nome;
    private String RG;
    private Integer idade;
    private Integer fichas;

    public Jogador(String nome, Integer idade, String RG){
        this.nome = nome;
        this.idade = idade;
        this.RG = RG;
        this.fichas = 0;
    }

    public Jogador(String nome, String RG, Integer idade, Integer fichas) {
        this.nome = nome;
        this.RG = RG;
        this.idade = idade;
        this.fichas = fichas;
    }

    public Integer getFichas() {
        return fichas;
    }
    
    public void addFichas(Integer fichas){
        this.fichas=this.fichas+fichas;
    }
    
    public void reduzirFichas(Integer fichas){
        this.fichas=this.fichas-fichas;    
    }

    public void setFichas(Integer fichas) {
        this.fichas = fichas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getDados(){
        String response = "\n"+this.getNome()+", "+this.getIdade().toString()+"\nRG: "+this.getRG();
        return response;
    }
    
}
