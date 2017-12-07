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
    private int numTotalAvariasPorEquipamento; // qnd insiro uma avaria, tenho que ir a este campo e dizer que tenho uma avaria nesse equipamento
    private ArrayList<Avaria> avarias = new ArrayList<>();// metodo para add e mostrar
    private ArrayList<Reparacao> reparacaos = new ArrayList<>();// metodo para add e mostrar


    //divisao e estadoEquipamento nao entram no construtor


    public Equipamento(int numeroInventario, String descricao, int numSerie, TipoEquipamento tipoEquipamento, double custo, Funcionario funcionarioTecnico) {
        this.numeroInventario = numeroInventario;

        this.descricao = descricao;
        this.numSerie = numSerie;
        this.tipoEquipamento = tipoEquipamento;
        this.custo = custo;
        this.funcionarioTecnico = funcionarioTecnico;
    }

    public void adicionarAvaria(Avaria avaria) {
        avarias.add(avaria);
    }

    public String mostrarAvarias() {
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < avarias.size(); i++) {
            str.append(avarias.get(i)).append("\n");
        }
        return str.toString();
    }

    public void adicionarReparacao(Reparacao reparacao) {
        reparacaos.add(reparacao);
    }

    public String mostrarReparacoes() {
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < reparacaos.size(); i++) {
            str.append(reparacaos.get(i)).append("\n");
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

    public ArrayList<Reparacao> getReparacaos() {
        return reparacaos;
    }

    public void setReparacaos(ArrayList<Reparacao> reparacaos) {
        this.reparacaos = reparacaos;
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
        str.append("\n\tTipo de equipamento: ").append(tipoEquipamento);
        str.append("\n\tDivisão associada ao equipamento: ").append(divisao);
        return str.toString();
    }
}