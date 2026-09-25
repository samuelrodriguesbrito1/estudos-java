package reforco.ex006;

public class CarteiraIdentidade {

    private String cpf;
    private String rg;
    private Pessoa pessoa;

    CarteiraIdentidade(Pessoa pessoa, String cpf, String rg) {
        setCpf(cpf);
        setRg(rg);
        setPessoa(pessoa);
        if (pessoa != null) {
            pessoa.setCarteiraIdentidade(this);
        }
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
