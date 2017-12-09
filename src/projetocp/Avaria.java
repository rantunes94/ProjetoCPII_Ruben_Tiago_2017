package projetocp;

import java.io.Serializable;
import java.util.Calendar;

public class Avaria implements Serializable{
    private int numero;
    private Calendar dataRegisto;
    private Equipamento equipamento;
    private String descricao;
    private EstadoAvaria estadoAvaria;
    private Funcionario funcionarioTecnico;


    //numero nao entra no construtor e estado


    public Avaria(Equipamento equipamento, String descricao, Funcionario funcionarioTecnico) {
        this.equipamento = equipamento;
        this.descricao = descricao;
        this.funcionarioTecnico = funcionarioTecnico;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Calendar getDataRegisto() {
        return dataRegisto;
    }

    public void setDataRegisto(Calendar dataRegisto) {
        this.dataRegisto = dataRegisto;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public EstadoAvaria getEstadoAvaria() {
        return estadoAvaria;
    }

    public void setEstadoAvaria(EstadoAvaria estadoAvaria) {
        this.estadoAvaria = estadoAvaria;
    }

    public Funcionario getFuncionarioTecnico() {
        return funcionarioTecnico;
    }

    public void setFuncionarioTecnico(Funcionario funcionarioTecnico) {
        this.funcionarioTecnico = funcionarioTecnico;
    }


    @Override
    public String toString() {
        StringBuilder str =new StringBuilder();
        str.append("Avarias:");
        str.append("\n\tNúmero de avaria: ").append(numero);
        str.append("\n\tData de registo: ").
                append(dataRegisto.get(Calendar.DATE)).
                append("-").append((dataRegisto.get(Calendar.MONTH) + 1)).
                append("-").append(dataRegisto.get(Calendar.YEAR));
        str.append("\n\tDescrição: ").append(descricao);
        str.append("\n\tEstado da Avaria: ").append(estadoAvaria);
        str.append("\n ").append(equipamento);
        str.append("\n\nEsta avaria foi resgistada por: \n").append(funcionarioTecnico);
        return str.toString();
    }




}
