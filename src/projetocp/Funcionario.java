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
     * atributo que permite verificar se um Funcionário já inventariou algo ou não de forma a não se apagar esse Funcionário se já inventariou algo
     */
    private boolean verificaAssociacao;
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
     * idade do funcionário
     */
    protected int idade;

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
        idade = calcularIdadeFunc();
    }

    /**
     * método que verifica se o funcionário inventariou um equipamento
     * @return devolve a verificação
     */
    public boolean isVerificaAssociacao() {
        return verificaAssociacao;
    }

    public void setVerificaAssociacao(boolean verificaAssociacao) {
        this.verificaAssociacao = verificaAssociacao;
    }

    public int getNif() {
        return nif;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }


    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    /**
     * Método que permite calcular a idade de um Funcionário
     * @return a idade
     */
    private int calcularIdadeFunc(){
        int anos;
        Calendar dataAtual = Calendar.getInstance();
        anos = dataAtual.get(Calendar.YEAR)- dataNascimento.get(Calendar.YEAR);
        if(dataAtual.get(Calendar.DAY_OF_YEAR) < dataNascimento.get(Calendar.DAY_OF_YEAR)){
            anos--;
        }
        return anos;
    }

    /**
     * Método que valida se a idade do Funcionário é maior que 18
     * @return devolve a validação
     */
    public boolean validarIdadeFunc(){
        if (idade <18){
            return false;
        }
        return true;
    }

    /**
     * Método que permite mostrar os dados do Funcionário
     * @return devolve os dados do funcionário
     */
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
