package projetocp;

import java.io.Serializable;
import java.util.ArrayList;

public class Divisao implements Serializable {
    public static int quantidadeEquipamentosInstalados; // isto so se faz quando se associa uma divisao....
    private String designacao;
    private String localizacao;
    private ArrayList<Equipamento> equipamentos = new ArrayList<>();// metodo para add e mostrar equipamentos


    public Divisao(String designacao, String localizacao) {
        this.designacao = designacao;
        this.localizacao = localizacao;

    }

    public void adicionarEquipamentos(Equipamento equipamento){
        equipamentos.add(equipamento);
    }

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

    @Override
    public String toString() {
        StringBuilder str =new StringBuilder();
        str.append("Divisão:");
        str.append("\n\tDesignação da divisão: ").append(designacao);
        str.append("\n\tLocalização da divisão: ").append(localizacao);
        return str.toString();
    }


}
