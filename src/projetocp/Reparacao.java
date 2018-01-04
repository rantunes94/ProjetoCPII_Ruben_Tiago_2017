package projetocp;

import java.io.Serializable;
import java.util.Calendar;

/**
 * classe que representa um Reparação
 */
public class Reparacao implements Serializable {
    /**
     * Atributo atribuir um numero à reparação
     */
    int numero;
    /**
     * Permite associar uma avaria à reparação
     */
    Avaria avaria;
    /**
     * Atributo que permite introduzir guardar uma data
     */
    Calendar dataReparacao;
    /**
     * Descrição da reparação
     */
    String descricao;
    /**
     * Custo da reparação
     */
    Double custo;
    /**
     * Funcionário que introduziu a reparação
     */
    Funcionario funcionarioTecnico;

    /**
     * Construtor da Reparação
     * @param avaria
     * @param dataReparacao
     * @param descricao
     * @param custo
     * @param funcionarioTecnico
     */
    public Reparacao(Avaria avaria, Calendar dataReparacao, String descricao, Double custo, Funcionario funcionarioTecnico) {
        this.avaria = avaria;
        this.dataReparacao = dataReparacao;
        this.descricao = descricao;
        this.custo = custo;
        this.funcionarioTecnico = funcionarioTecnico;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Avaria getAvaria() {
        return avaria;
    }

    public void setAvaria(Avaria avaria) {
        this.avaria = avaria;
    }

    public Calendar getDataReparacao() {
        return dataReparacao;
    }

    public void setDataReparacao(Calendar dataReparacao) {
        this.dataReparacao = dataReparacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getCusto() {
        return custo;
    }

    public void setCusto(Double custo) {
        this.custo = custo;
    }

    public Funcionario getFuncionarioTecnico() {
        return funcionarioTecnico;
    }

    public void setFuncionarioTecnico(Funcionario funcionarioTecnico) {
        this.funcionarioTecnico = funcionarioTecnico;
    }


    /**
     * Atributo que permite mostrar os dados todos das intancias de Reparação
     * @return
     */
    @Override
    public String toString() {
        StringBuilder str =new StringBuilder();
        str.append("Reparações:");
        str.append("\n\tNúmero: ").append(numero);
        str.append("\n").append(avaria);
        str.append("\n\tData: ").
                append(dataReparacao.get(Calendar.DATE)).
                append("-").append((dataReparacao.get(Calendar.MONTH) + 1)).
                append("-").append(dataReparacao.get(Calendar.YEAR));
        str.append("\n\tAvaria associada: ").append(avaria.getNumero());
        str.append("\n\tDescrição: ").append(descricao);
        str.append("\n\tCusto: ").append(custo);
        str.append("\nEsta reparação foi efetuada por: \n").append(funcionarioTecnico);
        str.append("\n\tEstado da reparação: ").append(avaria.getEstadoAvaria());
        return str.toString();
    }
}
