package projetocp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;

public class Equipamento implements Serializable {
    /**
     * número de inventário do equipamento
     */
    private int numeroInventario; // unico
    /**
     * data de inventariação do equipamento
     */
    private Calendar dataInventariacao;
    /**
     * descrição do equipamento
     */
    private String descricao;
    /**
     * número de série do equipamento
     */
    private int numSerie;
    /**
     * tipo do equipamento
     */
    private TipoEquipamento tipoEquipamento;
    /**
     * divisão do equipamento
     */
    private Divisao divisao;

    /**
     * estadoEquipamento do equipamento, onde chama a Enumeração EstadoEquipamento, que nos permite predefinir os valores do estadoEquipamento (DISPONIVEL,INDISPONIVEL,ABATIDO)
     */
    private EstadoEquipamento estadoEquipamento; // este estadoEquipamento é um ENUM ,  NOTA : este campo não é para ser pedido ao utilizador , no acto da adição deve ficar DISPONIVEL

    // funcionario tecnico que o inventariou e custo do mesmo
    /**
     * custo do equipamento
     */
    private double custo;
    /**
     * funcionário técnico que inventaria o equipamento
     */
    private Funcionario funcionarioTecnico;
    /////////////////////////////////////////////////////////
    /**
     * número total de avarias por equipamento
     */
    private int numTotalAvariasPorEquipamento; // qnd insiro uma avaria, tenho que ir a este campo e dizer que tenho uma avaria nesse equipamento
    /**
     * Array de avarias
     */
    private ArrayList<Avaria> avarias = new ArrayList<>();// metodo para add e mostrar
    /**
     * Array de reparações
     */
    private ArrayList<Reparacao> reparacoes = new ArrayList<>();// metodo para add e mostrar


    //divisao e estadoEquipamento nao entram no construtor

    /**
     * Construtor da classe Equipamento
     * @param numeroInventario número de inventário do equipamento
     * @param descricao descrição do equipamento
     * @param numSerie número de série do equipamento
     * @param tipoEquipamento tipo de equipamento
     * @param custo custo do equipamento
     * @param funcionarioTecnico funcionário técnico que inventaria o equipamento
     */
    public Equipamento(int numeroInventario, String descricao, int numSerie, TipoEquipamento tipoEquipamento, double custo, Funcionario funcionarioTecnico) {
        this.numeroInventario = numeroInventario;
        this.descricao = descricao;
        this.numSerie = numSerie;
        this.tipoEquipamento = tipoEquipamento;
        this.custo = custo;
        this.funcionarioTecnico = funcionarioTecnico;
    }

    /**
     * método que permite adicionar uma avaria a um equipamento, associando-os
     * @param avaria avaria a adicionar
     */
    public void adicionarAvaria(Avaria avaria) {
        avarias.add(avaria);
    }

    /**
     * método que permite mostrar todas as avarias
     * @return devolve o método toString do Equipamento, que permite mostrar ao utilizador toda a informação das instâncias da Classe 
     */
    public String mostrarAvarias() {
        StringBuilder str = new StringBuilder("");

        if(avarias.size()==0){
            System.out.println("Não existem avarias");
        }
        for (int i = 0; i < avarias.size(); i++) {
            str.append(avarias.get(i)).append("\n");
        }
        return str.toString();
    }

    /**
     * método que permite adicionar uma reparação a um equipamento, associando-os
     * @param reparacao reparação a adicionar
     */
    public void adicionarReparacao(Reparacao reparacao) {
        reparacoes.add(reparacao);
    }

    /**
     * método que permite mostrar todas as reparações
     * @return devolve o método toString
     */
    public String mostrarReparacoes() {
        StringBuilder str = new StringBuilder("");
        if(reparacoes.size()==0){
            System.out.println("Não existem reparações");
        }
        for (int i = 0; i < reparacoes.size(); i++) {
            str.append(reparacoes.get(i)).append("\n");
        }
        return str.toString();
    }

    public int getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    public int getNumeroInventario() {
        return numeroInventario;
    }

    public void setNumeroInventario(int numeroInventario) {
        this.numeroInventario = numeroInventario;
    }

    public Calendar getDataInventariacao() {
        return dataInventariacao;
    }

    public void setDataInventariacao(Calendar dataInventariacao) {
        this.dataInventariacao = dataInventariacao;
    }

    public TipoEquipamento getTipoEquipamento() {
        return tipoEquipamento;
    }

    public void setTipoEquipamento(TipoEquipamento tipoEquipamento) {
        this.tipoEquipamento = tipoEquipamento;
    }

    public Divisao getDivisao() {
        return divisao;
    }

    public void setDivisao(Divisao divisao) {
        this.divisao = divisao;
    }

    public EstadoEquipamento getEstadoEquipamento() {
        return estadoEquipamento;
    }

    public void setEstadoEquipamento(EstadoEquipamento estadoEquipamento) {
        this.estadoEquipamento = estadoEquipamento;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public Funcionario getFuncionarioTecnico() {
        return funcionarioTecnico;
    }

    public void setFuncionarioTecnico(Funcionario funcionarioTecnico) {
        this.funcionarioTecnico = funcionarioTecnico;
    }

    public int getNumTotalAvarias() {
        return numTotalAvariasPorEquipamento;
    }

    public void setNumTotalAvarias(int numTotalAvarias) {
        this.numTotalAvariasPorEquipamento = numTotalAvarias;
    }

    public ArrayList<Avaria> getAvarias() {
        return avarias;
    }

    public void setAvarias(ArrayList<Avaria> avarias) {
        this.avarias = avarias;
    }

    public ArrayList<Reparacao> getReparacoes() {
        return reparacoes;
    }

    public void setReparacoes(ArrayList<Reparacao> reparacoes) {
        this.reparacoes = reparacoes;
    }


    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Equipamento:");
        str.append("\n\tNúmero de Inventário do equipamento: ").append(numeroInventario);
        str.append("\n\tData de Inventariação: ").
                append(dataInventariacao.get(Calendar.DATE)).
                append("-").append((dataInventariacao.get(Calendar.MONTH) + 1)).
                append("-").append(dataInventariacao.get(Calendar.YEAR));
        str.append("\n\tDescrição do equipamento: ").append(descricao);
        str.append("\n\tNúmero de Série do equipamento: ").append(numSerie);
        str.append("\n").append(tipoEquipamento);
        str.append("\n\tDivisão associada ao equipamento: ").append(divisao);
        str.append("\n\tEstado de Equipamento: ").append(estadoEquipamento);
        return str.toString();
    }
}