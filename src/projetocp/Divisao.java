package projetocp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;

public class Divisao implements Serializable {
    /**
     * quantidade de equipamentos instalados
     */
    public static int quantidadeEquipamentosInstalados; // isto so se faz quando se associa uma divisao....
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





    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public int getQuantidadeEquipamentosInstalados() {
        return quantidadeEquipamentosInstalados;
    }

    /**
     * método que permite mostrar ao utilizador toda a informação das instâncias da Classe Equipamento e das suas superclasses
     * @return devolve a informação da instância
     */
    @Override
    public String toString() {
        StringBuilder str =new StringBuilder();
        str.append("Divisão:");
        str.append("\n\tDesignação da divisão: ").append(designacao);
        str.append("\n\tLocalização da divisão: ").append(localizacao);
        return str.toString();
    }


}
