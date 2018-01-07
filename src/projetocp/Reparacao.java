package projetocp;

import java.io.Serializable;
import java.util.Calendar;

/**
 * classe que representa uma Reparação
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
     * @param avaria avaria da reparação
     * @param dataReparacao data da reparação
     * @param descricao descrição da reparação
     * @param custo custo da reparação
     * @param funcionarioTecnico funionário técnico que introduziu a reparação
     */
    public Reparacao(Avaria avaria, Calendar dataReparacao, String descricao, Double custo, Funcionario funcionarioTecnico) {
        this.avaria = avaria;
        this.dataReparacao = dataReparacao;
        this.descricao = descricao;
        this.custo = custo;
        this.funcionarioTecnico = funcionarioTecnico;
    }

    public Avaria getAvaria() {
        return avaria;
    }
    /**
     * Método que permite mostrar os dados da Reparação
     * @return devolve os dados da Reparação
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
