package projetocp;

/**
 * Classe que representa o total de avarias por Ano
 */
public class TotalAvariaAno {
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

    public void setAno(int ano) {
        this.ano = ano;
    }

    public EstadoAvaria getEstadoAvaria() {
        return estadoAvaria;
    }

    public void setEstadoAvaria(EstadoAvaria estadoAvaria) {
        this.estadoAvaria = estadoAvaria;
    }

    public int getNumAvarias() {
        return numAvarias;
    }

    public void setNumAvarias(int numAvarias) {
        this.numAvarias = numAvarias;
    }

    /**
     * Construtor de Total Avaria por Ano
     * @param ano
     * @param estadoAvaria
     * @param numAvarias
     */
    public TotalAvariaAno(int ano, EstadoAvaria estadoAvaria, int numAvarias) {
        this.ano = ano;
        this.estadoAvaria = estadoAvaria;
        this.numAvarias = numAvarias;
    }
}
