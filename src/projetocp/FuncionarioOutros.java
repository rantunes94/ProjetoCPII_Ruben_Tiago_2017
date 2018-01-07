package projetocp;

import java.io.Serializable;
import java.util.Calendar;

/**
 * Classe Funcionario Outros que extende de Funcionario
 */
public class FuncionarioOutros extends Funcionario implements Serializable{
    /**
     * Função do Funcionário Outros
     */
    protected String funcao;
    /**
     * Username do Funcionário Outros
     */
    private String username;
    /**
     * Password do Funcionário Outros
     */
    private String password;

    /**
     * Construtor em caso de ser  um Funcionário  não Técnico
     * @param nif nif  do funcionário não técnico
     * @param nome nome do funcionário não técnico
     * @param morada morada do funcionário não técnico
     * @param telefone telefone do funcionário não técnico
     * @param email e-mail do funcionário não técnico
     * @param dataNascimento data de nascimento do funcionário não técnico
     * @param habilitacoes habilitações do funcionário não técnico
     * @param funcao função do funcionário não técnico
     */
    public FuncionarioOutros(int nif, String nome, String morada, int telefone, String email, Calendar dataNascimento, String habilitacoes, String funcao) {
        super(nif, nome, morada, telefone, email, dataNascimento, habilitacoes);
        this.funcao = funcao;
    }

    /**
     * Construtor em caso de ser  um Funcionário  Técnico
     * @param nif nif do funcionário técnico
     * @param nome nome do funcionário técnico
     * @param morada morada do funcionário técnico
     * @param telefone telefone do funcionário técnico
     * @param email e-mail do funcionário técnico
     * @param dataNascimento data de nascimento do funcionário técnico
     * @param habilitacoes habilitações do funcionário técnico
     * @param funcao função do funcionário técnico
     * @param username username do funcionário técnico
     * @param password password do funcionário técnico
     */
    public FuncionarioOutros(int nif, String nome, String morada, int telefone, String email, Calendar dataNascimento, String habilitacoes, String funcao, String username, String password) {
        super(nif, nome, morada, telefone, email, dataNascimento, habilitacoes);
        this.funcao = funcao;
        this.username = username;
        this.password = password;
    }


    public String getFuncao() {
        return funcao;
    }

    /**
     * Método que permite mostar os dados de um Funcionário Outros
     * @return devolve os dados de um Funcionário Outros
     */
    @Override
    public String toString() {
        StringBuilder str =new StringBuilder();
        str.append("Funcionário 'Outros':");
        str.append(super.toString());
        str.append("\n\tFunção: ").append(funcao);
        if(funcao.equalsIgnoreCase("Técnico"))
            str.append("\n\tNome de utilizador: ").append(username);
        return str.toString();
    }
}
