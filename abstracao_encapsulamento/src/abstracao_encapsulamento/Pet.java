package abstracao_encapsulamento;

public class Pet {

    private final String nome;
    private boolean clean;

    public Pet(String nome) {
        this.nome = nome;
        this.clean = false;
    }

    public String getNome() {
        return nome;
    }

    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }
}
