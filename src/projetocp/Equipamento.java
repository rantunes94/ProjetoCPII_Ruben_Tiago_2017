package projetocp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;

public class Equipamento implements Serializable {
    private int numeroInventario; // unico
    private Calendar dataInventariacao;
    private String descricao;
    private int numSerie;
    private TipoEquipamento tipoEquipamento;
    private Divisao divisao;


    private Estado estado; // este estado é um ENUM ,  NOTA : este campo não é para ser pedido ao utilizador , no acto da adição deve ficar DISPONIVEL

    // funcionario tecnico que o inventariou e custo do mesmo
    private double custo;
    private Funcionario funcionarioTecnico;
    /////////////////////////////////////////////////////////
    private int numTotalAvariasPorEquipamento; // qnd insiro uma avaria, tenho que ir a este campo e dizer que tenho uma avaria nesse equipamento
    private ArrayList<Avaria> avarias = new ArrayList<>();// metodo para add e mostrar
    private ArrayList<Reparacao> reparacaos = new ArrayList<>();// metodo para add e mostrar


    //divisao e estado nao entram no construtor


    public Equipamento(String descricao,int numSerie, TipoEquipamento tipoEquipamento, double custo, Funcionario funcionarioTecnico) {
        this.descricao = descricao;
        this.numSerie = numSerie;
        this.tipoEquipamento = tipoEquipamento;
        this.custo = custo;
        this.funcionarioTecnico = funcionarioTecnico;
    }

    public void adicionarAvaria(Avaria avaria){
        avarias.add(avaria);
    }

    public String mostrarAvarias(){
        StringBuilder str= new StringBuilder("");
        for (int i=0; i<avarias.size(); i++) {
            str.append(avarias.get(i)).append("\n");
        }
        return str.toString();
    }

    public void adicionarReparacao(Reparacao reparacao){
        reparacaos.add(reparacao);
    }

    public String mostrarReparacoes(){
        StringBuilder str= new StringBuilder("");
        for (int i=0; i<reparacaos.size(); i++) {
            str.append(reparacaos.get(i)).append("\n");
        }
        return str.toString();
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

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
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
}
