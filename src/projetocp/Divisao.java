package projetocp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * classe que representa uma Divisão
 */
public class Divisao implements Serializable {
    /**
     * quantidade de equipamentos instalados por divisão
     */
    private int qntdEquipamentosInstaladosPorDivisao;

    /**
     * designação da divisão
     */
    private String designacao;
    /**
     * localização da divisão
     */
    private String localizacao;
    /**
     * Array de equipamentos
     */
    private ArrayList<Equipamento> equipamentos = new ArrayList<>();// metodo para add e mostrar equipamentos

    /**
     * Construtor da classe Divisão
     * @param designacao designação da divisão
     * @param localizacao localização da divisão
     */
    public Divisao(String designacao, String localizacao) {
        this.designacao = designacao;
        this.localizacao = localizacao;

    }

    /**
     * método que permite remover um equipamento da lista de equipamentos da classe Divisão
     * @param e equipamento a remover
     */
    public void removerEquipamento(Equipamento e){
        equipamentos.remove(e);
    }

    /**
     * método que permite adicionar equipamentos associados à divisão
     * @param equipamento equipamento a adicionar
     */
    public void adicionarEquipamentos(Equipamento equipamento){
        equipamento.setDataInventariacao(Calendar.getInstance());
        equipamento.setEstadoEquipamento(EstadoEquipamento.DISPONIVEL);
        equipamentos.add(equipamento);
    }

    /**
     * método que permite mostrar todos os equipamentos
     * @return devolve o método toString do Equipamento, que permite mostrar ao utilizador toda a informação das instâncias da Classe Equipamento e das suas superclasses
     */
    public String mostrarEquipamentos(){
        StringBuilder str= new StringBuilder("");
        for (int i=0; i<equipamentos.size(); i++) {
            str.append(equipamentos.get(i)).append("\n");
        }
        return str.toString();
    }

    public int getQntdEquipamentosInstaladosPorDivisao() {
        return qntdEquipamentosInstaladosPorDivisao;
    }

    public void setQntdEquipamentosInstaladosPorDivisao(int qntdEquipamentosInstaladosPorDivisao) {
        this.qntdEquipamentosInstaladosPorDivisao = qntdEquipamentosInstaladosPorDivisao;
    }

    public String getDesignacao() {
        return designacao;
    }

    /**
     * método que permite mostrar os dados da Divisão
     * @return devolve os dados da Divisão
     */
    @Override
    public String toString() {
        StringBuilder str =new StringBuilder();
        str.append("Divisão:");
        str.append("\n\tDesignação da divisão: ").append(designacao);
        str.append("\n\tLocalização da divisão: ").append(localizacao);
        str.append("\n\tQuantidade de equipamentos instalados nesta divisão: ").append(qntdEquipamentosInstaladosPorDivisao);
        return str.toString();
    }


}
