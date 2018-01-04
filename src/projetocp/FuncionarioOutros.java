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
     * @param nif
     * @param nome
     * @param morada
     * @param telefone
     * @param email
     * @param dataNascimento
     * @param habilitacoes
     * @param funcao
     */
    public FuncionarioOutros(int nif, String nome, String morada, int telefone, String email, Calendar dataNascimento, String habilitacoes, String funcao) {
        super(nif, nome, morada, telefone, email, dataNascimento, habilitacoes);
        this.funcao = funcao;
    }

    /**
     * Construtor em caso de ser  um Funcionário  Técnico
     * @param nif
     * @param nome
     * @param morada
     * @param telefone
     * @param email
     * @param dataNascimento
     * @param habilitacoes
     * @param funcao
     * @param username
     * @param password
     */
    public FuncionarioOutros(int nif, String nome, String morada, int telefone, String email, Calendar dataNascimento, String habilitacoes, String funcao, String username, String password) {
        super(nif, nome, morada, telefone, email, dataNascimento, habilitacoes);
        this.funcao = funcao;
        this.username = username;
        this.password = password;
    }



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    /**
     * Método que permite mostar os dados de um Funcionário Outros
     * @return
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
