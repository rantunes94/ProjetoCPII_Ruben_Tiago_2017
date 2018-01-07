package projetocp;

/**
 * Classe que representa o total de avarias por Ano
 */
public class TotalAvariaAno implements Comparable<TotalAvariaAno> {
    /**
     * ano da avaria
     */
    private int ano;
    /**
     * estado da avaria
     */
    private EstadoAvaria estadoAvaria;
    /**
     * número de avarias por ano
     */
    private int numAvarias;

    public int getAno() {
        return ano;
    }

    public int getNumAvarias() {
        return numAvarias;
    }

    public void setNumAvarias(int numAvarias) {
        this.numAvarias = numAvarias;
    }

    /**
     * Construtor de Total Avaria por Ano
     * @param ano ano do TotalAvariaAno
     * @param estadoAvaria estado da avaria do TotalAvariaAno
     * @param numAvarias número de avarias do TotalAvariaAno
     */
    public TotalAvariaAno(int ano, EstadoAvaria estadoAvaria, int numAvarias) {
        this.ano = ano;
        this.estadoAvaria = estadoAvaria;
        this.numAvarias = numAvarias;
    }


    /**
     * método que permite mostrar os dados do TotalAvariaAno
     * @return devolve os dados do TotalAvariaAno
     */
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Totais avarias por ano:");
        str.append("\n\tAno: ").append(ano);
        str.append("\n\tEstado da avaria: ").append(estadoAvaria);
        str.append("\n\t Número de avarias: ").append(numAvarias);
        return str.toString();
    }

    /**
     * Método que permite ordenar primeiro pelo numAvarias e depois pelo ano ( NÃO PELO ESTADO, porque não nos era possivel)
     * @param
     * @return
     */
    @Override
    public int compareTo(TotalAvariaAno o) {
        if (this.numAvarias < o.getNumAvarias()) {
            return 1;
        }
        if (this.numAvarias > o.getNumAvarias()) {
            return -1;
        }

        if (this.numAvarias == o.getNumAvarias() && this.ano > o.getAno()) {
            return 1;
        }
        if (this.numAvarias == o.getNumAvarias() && this.ano < o.getAno()) {
            return -1;
        }
        return 0;
    }
}
