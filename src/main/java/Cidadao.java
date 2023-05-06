public class Cidadao {

    private Integer id;
    private String nome;
    private String cpf;
    private EstadoCivil estadoCivil;

    public Cidadao(){
        this.estadoCivil = EstadoCivilSolteiro.getInstance();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        if(estadoCivil != null) {
            this.estadoCivil = estadoCivil;
        }
    }

    public boolean casar(){
        return estadoCivil.casar(this);
    }

    public boolean separar(){
        return estadoCivil.separar(this);
    }

    public boolean divorciar(){
        return estadoCivil.divorciar(this);
    }

    public boolean enviuvar(){
        return estadoCivil.enviuvar(this);
    }
}
