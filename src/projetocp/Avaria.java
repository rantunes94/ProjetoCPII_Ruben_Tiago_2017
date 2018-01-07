package projetocp;

import java.io.Serializable;
import java.util.Calendar;

/**
 * classe que representa uma Avaria
 */
public class Avaria implements Serializable{
    /**
     * numero da Avaria
     */
    private int numero;
    /**
     * Data de registo da avaria
     */
    private Calendar dataRegisto = Calendar.getInstance();
    /**
     * Equipamento associado à avaria
     */
    private Equipamento equipamento;
    /**
     * descrição da Avaria
     */
    private String descricao;
    /**
     * Estado da avaria , iniciada a PORREPARAR
     */
    private EstadoAvaria estadoAvaria=EstadoAvaria.PORREPARAR;
    /**
     * Funcionário assoaciado a esta Avaria
     */
    private Funcionario funcionarioTecnico;

    /**
     * Construtor da Avaria
     * @param equipamento equipamento com avaria
     * @param descricao descrição da avaria
     * @param funcionarioTecnico funcionário tecnico que regista a avaria
     */
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

    public EstadoAvaria getEstadoAvaria() {
        return estadoAvaria;
    }

    public void setEstadoAvaria(EstadoAvaria estadoAvaria) {
        this.estadoAvaria = estadoAvaria;
    }

    /**
     * Método que permite mostrar os dados das Avarias
     * @return devolve os dados da Avaria
     */
    @Override
    public String toString() {
        StringBuilder str =new StringBuilder();
        str.append("Avarias:");
        str.append("\n\tNúmero de avaria: ").append(numero);
        str.append("\n\tData de registo: ").
                append(dataRegisto.get(Calendar.DATE)).
                append("-").append((dataRegisto.get(Calendar.MONTH) + 1)).
                append("-").append(dataRegisto.get(Calendar.YEAR));
        str.append("\n\tNúmero de inventário do equipamento: ").append(equipamento.getNumeroInventario());
        str.append("\n\tDescrição: ").append(descricao);
        str.append("\n\tEstado da Avaria: ").append(estadoAvaria);
        str.append("\n ").append(equipamento);
        str.append("\nEsta avaria foi registada por: \n").append(funcionarioTecnico);
        return str.toString();
    }




}
