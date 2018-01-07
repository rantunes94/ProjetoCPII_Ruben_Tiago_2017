package projetocp;

/**
 * classe que nos permite calcular o total gasto por ano em equipamentos (ordenado por ordem decrescente do total)
 */
public class TotalAno implements Comparable<TotalAno> {
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


    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * Construtor do TotalAno
     * @param ano ano correspondente
     * @param total total em equipamentos
     */
    public TotalAno(int ano, double total) {
        this.ano = ano;
        this.total = total;
    }

    /**
     * método que permite mostrar os dados do TotalAno
     * @return devolves os dados do TotalAno
     */
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Totais gasto por ano:");
        str.append("\n\tAno: ").append(ano);
        str.append("\n\tTotal: ").append(total);
        return str.toString();
    }

    /**
     * método que permite ordenar o TotalAno por ano
     * @param o novo TotalAno a inserir
     * @return devolve a ordenação
     */
    @Override
    public int compareTo(TotalAno o) {
        if (this.total < o.getTotal()) {
            return 1;
        }
        if (this.total > o.getTotal()) {
            return -1;
        }
        return 0;
    }
}
