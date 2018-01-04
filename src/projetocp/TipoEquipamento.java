package projetocp;

import java.io.Serializable;

/**
 * classe que representa um Tipo de Equipamento
 */
public class TipoEquipamento implements Serializable {
    //public static int numeroT;// variável auxiliar para incrementar o numero
    private int numero;
    /**
     * descrição do tipo de equipamento
     */
    private String designacao;
    /**
     * variavel que permite guardar o numero de equipamentos por tipo de equipamento
     */
    private int numEquipamentoPorEquipamento; // variavel para estatisticas


    public int getNumEquipamentoPorEquipamento() {
        return numEquipamentoPorEquipamento;
    }

    public void setNumEquipamentoPorEquipamento(int numEquipamentoPorEquipamento) {
        this.numEquipamentoPorEquipamento = numEquipamentoPorEquipamento;
    }

    /**
     * Construtor do ipo de equipamento
     * @param designacao
     */
    public TipoEquipamento(String designacao) {
        this.designacao = designacao;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }


    /**
     * método que permite mostarr os dados de um Tipo de Equipamento
     * @return
     */
    @Override
    public String toString() {
        StringBuilder str =new StringBuilder();
        str.append("Tipo de Equipamento:");
        str.append("\n\tNúmero do Tipo de Equipamento: ").append(numero);
        str.append("\n\tDesignação do Tipo de Equipamento: ").append(designacao);
        str.append("\n\tNúmero de equipamentos neste tipo de equipamento: ").append(numEquipamentoPorEquipamento);
        return str.toString();
    }

}
