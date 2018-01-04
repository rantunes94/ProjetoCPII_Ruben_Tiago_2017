package projetocp;

/**
 * classe que nos permite calcular o total gasto por ano em equipamentos (ordenado por ordem decrescente do total)
 */
public class TotalAno {
    /**
     * ano desse total
     */
    private int ano;
    /**
     * custo total em equipamentos nesse ano
     */
    private double total;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * Construtor do TotalAno
     * @param ano
     * @param total
     */
    public TotalAno(int ano, double total) {
        this.ano = ano;
        this.total = total;
    }

    @Override
    public String toString() {
        return "TotalAno{" +
                "ano=" + ano +
                ", total=" + total +
                '}';
    }
}
