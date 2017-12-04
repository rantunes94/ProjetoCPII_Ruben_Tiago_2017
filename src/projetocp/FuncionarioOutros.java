package projetocp;

import java.io.Serializable;
import java.util.Calendar;

public class FuncionarioOutros extends Funcionario implements Serializable{
    protected String funcao;
    private String username;
    private String password;

    //Caso seja um Funcionário  não Técnico
    public FuncionarioOutros(int nif, String nome, String morada, int telefone, String email, Calendar dataNascimento, String habilitacoes, String funcao) {
        super(nif, nome, morada, telefone, email, dataNascimento, habilitacoes);
        this.funcao = funcao;
    }

    // Caso seja um Técnico
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

    @Override
    public String toString() {
        StringBuilder str =new StringBuilder();
        str.append("Funcionário 'Outros':");
        str.append(super.toString());
        str.append("\n\tFunção: ").append(funcao);
        str.append("\n\tNome de utilizador: ").append(username);
        return str.toString();
    }
}
