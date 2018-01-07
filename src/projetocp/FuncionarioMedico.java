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
     * @param nif nif do funcionário médico
     * @param nome nome do funcionário médico
     * @param morada morada do funcionário médico
     * @param telefone telefone do funcinário médico
     * @param email e-mail do funcionário médico
     * @param dataNascimento data de nascimento do funcionário médico
     * @param habilitacoes habilitações do funcionário médico
     * @param especialidade especialidade do funcionário médico
     * @param seccaoTrabalho secção de trabalho do funcionário médico
     */
    public FuncionarioMedico(int nif, String nome, String morada, int telefone, String email, Calendar dataNascimento, String habilitacoes, String especialidade, String seccaoTrabalho) {
        super(nif, nome, morada, telefone, email, dataNascimento, habilitacoes);
        this.especialidade = especialidade;
        this.seccaoTrabalho = seccaoTrabalho;
    }

    /**
     * Método que permite mostrar os dados do Funcionário Médico
     * @return devolve os dados do funcionário médico
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
