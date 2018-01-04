package projetocp;

import java.io.Serializable;
import java.util.Calendar;

/**
 * classe que representa um  Médico que extende de Funcionário
 */
public class FuncionarioMedico extends Funcionario  implements Serializable{
    /**
     * Especialidade do Funcionário Médico
     */
    private String especialidade;
    /**
     * Secção de trabalho do Funcionário Médico
     */
    private String seccaoTrabalho;

    /**
     * Construtor do Funcionário Médico
     * @param nif
     * @param nome
     * @param morada
     * @param telefone
     * @param email
     * @param dataNascimento
     * @param habilitacoes
     * @param especialidade
     * @param seccaoTrabalho
     */
    public FuncionarioMedico(int nif, String nome, String morada, int telefone, String email, Calendar dataNascimento, String habilitacoes, String especialidade, String seccaoTrabalho) {
        super(nif, nome, morada, telefone, email, dataNascimento, habilitacoes);
        this.especialidade = especialidade;
        this.seccaoTrabalho = seccaoTrabalho;
    }



    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getSeccaoTabalho() {
        return seccaoTrabalho;
    }

    public void setSeccaoTabalho(String seccaoTabalho) {
        this.seccaoTrabalho = seccaoTabalho;
    }

    /**
     * Método que permite mostrar os dados do Funcionário Médico
     * @return
     */
    @Override
    public String toString() {
        StringBuilder str =new StringBuilder();
        str.append("Funcionário Médico:");
        str.append(super.toString());

        str.append("\n\tEspecialidade do médico: ").append(especialidade);
        str.append("\n\tSecção de trabalho do médico: ").append(seccaoTrabalho);

        return str.toString();
    }
}
