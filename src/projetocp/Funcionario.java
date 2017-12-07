package projetocp;
import java.io.Serializable;
import java.util.Calendar;


import java.io.Serializable;
import java.util.Calendar;

/**
 * classe que representa o funcionário
 */
public class Funcionario implements Serializable {
    /**
     * nif do funcionário
     */
    protected int nif;
    /**
     * nome do funcionário
     */
    protected String nome;
    /**
     * morada do funcionário
     */
    protected   String morada;
    /**
     * telefone do funcionário
     */
    protected int telefone;
    /**
     * email do funcionario
     */
    protected String email;
    /**
     * data de nascimento do funcionário
     */
    protected Calendar dataNascimento;
    /**
     * habilitações do funcionário
     */
    protected String habilitacoes;

    /**
     * Construtor da classe funcionário
     * @param nif nif do funcionário
     * @param nome nome do funcionário
     * @param morada morada do funcionário
     * @param telefone telefone do funcionário
     * @param email email do funcionário
     * @param dataNascimento data de nascimento do funcionário
     * @param habilitacoes habilitações do funcionário
     */
    public Funcionario(int nif, String nome, String morada, int telefone, String email, Calendar dataNascimento, String habilitacoes) {
        this.nif = nif;
        this.nome = nome;
        this.morada = morada;
        this.telefone = telefone;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.habilitacoes = habilitacoes;
    }


    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getHabilitacoes() {
        return habilitacoes;
    }

    public void setHabilitacoes(String habilitacoes) {
        this.habilitacoes = habilitacoes;
    }

    @Override
    public String toString() {
        StringBuilder str =new StringBuilder();
        //str.append("Funcionário:");
        str.append("\n\tNif: ").append(nif);
        str.append("\n\tNome: ").append(nome);
        str.append("\n\tMorada: ").append(morada);
        str.append("\n\tTelefone: ").append(telefone);
        str.append("\n\tEmail: ").append(email);

        str.append("\n\tData de nascimento: ").
                append(dataNascimento.get(Calendar.DATE)).
                append("-").append((dataNascimento.get(Calendar.MONTH) + 1)).
                append("-").append(dataNascimento.get(Calendar.YEAR));


        str.append("\n\tHabilitações: ").append(morada);

        return str.toString();
    }
}
