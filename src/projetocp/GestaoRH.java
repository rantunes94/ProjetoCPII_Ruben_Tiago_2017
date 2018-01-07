package projetocp;

import java.io.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;

/**
 * classe que permite guardar todos os dados do projecto e declarar métodos auxiliares
 */
public class GestaoRH {

    /**
     * atributo que guarda o número total de equipamentos avariados
     */
    private int numTotalEquipsAvariados;

    public int getNumTotalEquipsAvariados() {
        return numTotalEquipsAvariados;
    }

    public void setNumTotalEquipsAvariados(int numTotalEquipsAvariados) {
        this.numTotalEquipsAvariados = numTotalEquipsAvariados;
    }


    /**
     * Lista de divisões
     */
    private ArrayList<Divisao> divisoes = new ArrayList<>();
    /**
     * Lista de funcionários
     */
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    /**
     * lista de funcionários médicos
     */
    private ArrayList<FuncionarioMedico> funcionariosMedicos = new ArrayList<>();
    /**
     * lista de funcionários outros
     */
    private ArrayList<FuncionarioOutros> funcionariosOutros = new ArrayList<>();
    /**
     * lista de tipos de equipamentos
     */
    private ArrayList<TipoEquipamento> tiposEquipamento = new ArrayList<>();
    /**
     * lista de equipamentos
     */
    private ArrayList<Equipamento> equipamentos = new ArrayList<>();
    /**
     * lista de avarias
     */
    private ArrayList<Avaria> avarias = new ArrayList<>();
    /**
     * lista de totais ano
      */
    private ArrayList<TotalAno> totaisAno = new ArrayList<>();
    /**
     * lista do número de avarias totais por ano
     */
    private ArrayList<TotalAvariaAno> totaisAvariaAno = new ArrayList<>();


    public int getTotalFuncionarios() {
        return funcionarios.size();
    }
    public int getTotalFuncionariosOutros() {
        return funcionariosOutros.size();
    }
    public int getTotalFuncionariosMedico() {
        return funcionariosMedicos.size();
    }
    public int getTotalDivisoes() { return divisoes.size(); }
    public int getTotalTiposEquipamento() { return tiposEquipamento.size(); }
    public int getTotalEquipamentos() {
        return equipamentos.size();
    }
    public int getTotalAvarias() { return avarias.size(); }
    public int getTotalAnos() { return totaisAno.size(); }
    public int getTotalAvariaAnos() { return totaisAvariaAno.size(); }

    public Funcionario obterFuncionario (int pos){
        return funcionarios.get(pos);
    }
    public Funcionario obterFuncionarioMedico (int pos){
        return funcionariosMedicos.get(pos);
    }
    public FuncionarioOutros obterFuncionarioOutros (int pos){
        return funcionariosOutros.get(pos);
    }
    public Divisao obterDivisao (int pos){
        return divisoes.get(pos);
    }
    public TipoEquipamento obterTiposEquipamento (int pos){
        return tiposEquipamento.get(pos);
    }
    public Equipamento obterEquipamento (int pos){
        return equipamentos.get(pos);
    }
    public Avaria obterAvaria (int pos){
        return avarias.get(pos);
    }
    public TotalAno obtertTotal (int pos){
        return totaisAno.get(pos);
    }
    public TotalAvariaAno obtertTotalAvariaAno (int pos){
        return totaisAvariaAno.get(pos);
    }


    /**
     * método que permite adicionar um funcionário médico
     * @param funcionarioMedico funcionário médico a inserir
     */
    public void adicionarFuncionarioMedico(FuncionarioMedico funcionarioMedico){
        funcionariosMedicos.add(funcionarioMedico);
        funcionarios.add(funcionarioMedico);
    }

    /**
     * método que permite adicionar outros funcionários
     * @param funcionarioOutros outro funcionário a inserir
     */
    public void adicionarFuncionarioOutros(FuncionarioOutros funcionarioOutros){
        funcionariosOutros.add(funcionarioOutros);
        funcionarios.add(funcionarioOutros);
    }

    /**
     * método que permite adicionar uma divisão
     * @param divisao divisão a inserir
     */
    public void adicionarDivisao(Divisao divisao){ divisoes.add(divisao); }

    /**
     * método que permite adicionar um tipo de equipamento
     * @param tipoEquipamento tipo de equipamento a inserir
     */
    public void adicionarTipoEquipamento(TipoEquipamento tipoEquipamento){
        if (!tiposEquipamento.isEmpty())
            tipoEquipamento.setNumero(tiposEquipamento.get(tiposEquipamento.size()-1).getNumero()+1);
        else
            tipoEquipamento.setNumero(1);

        tiposEquipamento.add(tipoEquipamento);
    }

    /**
     * método que permite adicionar um equipamento
     * @param equipamento equipamento a inserir
     */
    public void adicionarEquipamento(Equipamento equipamento){
        equipamento.setDataInventariacao(Calendar.getInstance());
        equipamento.setEstadoEquipamento(EstadoEquipamento.DISPONIVEL);
        equipamentos.add(equipamento);
    }

    /**
     * método que permite adicionar um custo do total do ano
     * @param totalAno custo
     */
    public void adicionarTotalAno(TotalAno totalAno){ totaisAno.add(totalAno);
        Collections.sort(totaisAno);
    }

    /**
     * método que permite adicionar o número total de avarias por ano
     * @param totalAvariaAno
     */
    public void adicionarTotalAvariaAno(TotalAvariaAno totalAvariaAno) {
        totaisAvariaAno.add(totalAvariaAno);
        //Collections.sort(totalAvariaAno);
    }

    /**
     * método que permite adicionar uma avaria
     * @param avaria
     */
    public void adicionarAvaria(Avaria avaria){
        if (!avarias.isEmpty())
            avaria.setNumero(avarias.get(avarias.size()-1).getNumero()+1);
        else
            avaria.setNumero(1);
        avaria.setDataRegisto(Calendar.getInstance()); // insere data atual
        avaria.setEstadoAvaria(EstadoAvaria.PORREPARAR);
        avarias.add(avaria);
    }

    /**
     * método que permite eliminar um funcionário
     * @param pos posição do funcionário a eliminar
     */
    public void eliminarFuncionario(int pos){
        funcionarios.remove(pos);
    }

    /**
     * método que permite alterar as informações de um funcionário
     * @param novoTelefone telefone a alterar
     * @param novaMorada morada a alterar
     * @param posicao posição a alterar
     */
    public void alterarFuncionario(int novoTelefone,String novaMorada,int posicao){
        funcionarios.get(posicao).setTelefone(novoTelefone);
        funcionarios.get(posicao).setMorada(novaMorada);
    }

    /**
     * método que permite alterar apenas o telefone do funcionário
     * @param novoTelefone telefone a alterar
     * @param posicao posição do funcionário a alterar
     */
    public void alterarFuncionarioTelefone(int novoTelefone,int posicao){
        funcionarios.get(posicao).setTelefone(novoTelefone);
    }

    /**
     * método que permite alterar apenas a morada do funcionário
     * @param novaMorada morada a alterar
     * @param posicao posição do funcionário a alterar
     */
    public void alterarFuncionarioMorada(String novaMorada,int posicao){
        funcionarios.get(posicao).setMorada(novaMorada);
    }

    /**
     * método que permite pesquisar funcionários pelo seu nif
     * @param nif nif do funcionário que se pretende pesquisar
     * @return devolve se existe ou não algum funcionário com esse nif
     */
    public int pesquisarFuncionarios(int nif) {
        for (int i = 0; i < funcionarios.size(); i++)
            if (funcionarios.get(i).getNif() == nif)
                return i;
        return -1;
    }

    /**
     * método que permite pesquisar os custos totais por ano
     * @param ano ano que se pretende pesquisar
     * @return devolve se existe algum ano ou não
     */
    public int pesquisarTotais(int ano) {
        for (int i = 0; i < totaisAno.size(); i++)
            if (totaisAno.get(i).getAno() == ano)
                return i;
        return -1;
    }

    /**
     * método que permite pesquisar a número total de avarias por ano
     * @param ano ano que se pretende saber o número total de avarias
     * @return devolve se esse ano existe ou não
     */
    public int pesquisarTotaisAvariaAno(int ano) {
        for (int i = 0; i < totaisAno.size(); i++)
            if (totaisAno.get(i).getAno() == ano)
                return i;
        return -1;
    }

    /**
     * método que permite pesquisar tipos de equipamento pelo seu número
     * @param numero número do tipo de equipamento
     * @return devolve se existe ou não esse número de tipo de equipamento
     */
    public int pesquisarTipoEquipamento(int numero){ // à partida nao vai ser necessario
        for (int i=0; i<tiposEquipamento.size(); i++)
            if (tiposEquipamento.get(i).getNumero()==numero)
                return i;
        return -1;
    }

    /**
     * método que permite pesquisar um divisão pela sua designação
     * @param designacao designação da divisão que se pretende pesquisar
     * @return devolve se existe ou não essa designação da divisão
     */
    public int pesquisarDivisao(String designacao){
        for (int i=0; i<divisoes.size(); i++)
            if (divisoes.get(i).getDesignacao().equalsIgnoreCase(designacao))
                return i;
        return -1;
    }

    /**
     * método que permite pesquisar um equipamento pelo seu número de inventariação
     * @param numInventario número de inventariação que s epretende pesquisar
     * @return devolve se esse numero de inventariação existe ou não
     */
    public int pesquisarEquipamento(int numInventario){
        for (int i=0; i<equipamentos.size(); i++)
            if (equipamentos.get(i).getNumeroInventario()==numInventario)
                return i;
        return -1;
    }

    /**
     * método que permite pesquisar uma avaria pelo seu número
     * @param numeroAvaria número da avaria que s epretende pesquisar
     * @return devolve se existe ou não uma avaria com esse número
     */
    public int pesquisarAvarias(int numeroAvaria) {
        for (int i = 0; i < avarias.size(); i++)
            if (avarias.get(i).getNumero() == numeroAvaria)
                return i;
        return -1;
    }

    /**
     * método que permite mostrar os funcionários existentes
     * @return devolve os dados dos funcionários existentes
     */
    public String mostrarFuncionarios(){
        StringBuilder str= new StringBuilder("");
        for (int i=0; i<funcionarios.size(); i++) {
            str.append(funcionarios.get(i)).append("\n");
        }
        return str.toString();
    }

    /**
     * método que permite mostrar os funcionários médicos existentes
     * @return devolve os dados dos funcionários médicos existentes
     */
    public String mostrarFuncionariosMedicos(){
        StringBuilder str= new StringBuilder("");
        for (int i=0; i<funcionariosMedicos.size(); i++) {
            str.append(funcionariosMedicos.get(i)).append("\n");
        }
        return str.toString();
    }

    /**
     * método que permite mostrar os outros funcionários existentes
     * @return devolves os dados dos outros funcionários existentes
     */
    public String mostrarFuncionariosOutros(){
        StringBuilder str= new StringBuilder("");
        for (int i=0; i<funcionariosOutros.size(); i++) {
            str.append(funcionariosOutros.get(i)).append("\n");
        }
        return str.toString();
    }

    /**
     * método que permite mostrar o custo total por ano
     * @return mostrar os dados do custo total por ano
     */
    public String mostrarTotaisAno(){
        StringBuilder str= new StringBuilder("");
        for (int i=0; i<totaisAno.size(); i++) {
            str.append(totaisAno.get(i)).append("\n");
        }
        return str.toString();
    }

    /**
     * método que permite mostrar o número total de avarias por ano
     * @return devolves o número total de avarias por ano
     */
    public String mostrarTotaisAvariaAno(){
        StringBuilder str= new StringBuilder("");
        for (int i=0; i<totaisAno.size(); i++) {
            str.append(totaisAno.get(i)).append("\n");
        }
        return str.toString();
    }

    /**
     * método que permite mostrar os dados dos tipos de equipamento
     * @return devolves os dados dos tipos de equipamento
     */
    public String mostrarTipoEquipamentos(){
        StringBuilder str= new StringBuilder("");
        for (int i=0; i<tiposEquipamento.size(); i++) {
            str.append(tiposEquipamento.get(i)).append("\n");
        }
        return str.toString();
    }

    /**
     * método que permite mostrar os dados dos equipamentos
     * @return devolve os dados dos equipamentos
     */
    public String mostrarEquipamentos(){
        StringBuilder str= new StringBuilder("");
        for (int i=0; i<equipamentos.size(); i++) {
            str.append(equipamentos.get(i)).append("\n");
        }
        return str.toString();
    }

    /**
     * método que permite mostrar os dados das divisões
     * @return devolve os dados das divisões
     */
    public String mostrarDivisao(){
        StringBuilder str= new StringBuilder("");
        for (int i=0; i<divisoes.size(); i++) {
            str.append(divisoes.get(i)).append("\n");
        }
        return str.toString();
    }

    /**
     * método que permite mostrar apenas as designações das divisões
     * @return devolve as designações das divisões
     */
    public String mostrarDivisaoDesignacao(){
        StringBuilder str= new StringBuilder("");
        for (int i=0; i<divisoes.size(); i++) {
            str.append(divisoes.get(i).getDesignacao()).append("\n");
        }
        return str.toString();
    }

    /**
     * método que permite mostrar as avarias
     * @return devolves os dados das avarias
     */
    public String mostrarAvarias(){
        StringBuilder str= new StringBuilder("");
        for (int i=0; i<avarias.size(); i++) {
            str.append(avarias.get(i)).append("\n");
        }
        return str.toString();
    }

    /**
     * método que permite adicionar o número de avarias por equipamento
     * @param equipamento equipamento a adicionar a avaria
     */
    public void addNumAvariasPorEquipamento(Equipamento equipamento){
        equipamento.setNumTotalAvariasPorEquipamento(equipamento.getNumTotalAvariasPorEquipamento()+1);
    }

    /**
     * método que permite calcular a percentagem de avarias no hospital
     * @return devolve a percentagem de avarias no hospital
     */
    public int calcularPercentagemAvariasNoHospital(){
        int percentagem;
           int e= equipamentos.size();
           percentagem = (numTotalEquipsAvariados*100)/e;

     return percentagem;
    }

    /**
     * método que permite gravar todas as alterações feitas no menú
     */
    public void gravarFicheiro() {
        try {
            ObjectOutputStream out= new ObjectOutputStream(new FileOutputStream("grh.dat"));
            out.writeObject(divisoes);
            out.writeObject(funcionarios);
            out.writeObject(funcionariosMedicos);
            out.writeObject(funcionariosOutros);
            out.writeObject(tiposEquipamento);
            out.writeObject(equipamentos);
            out.writeObject(avarias);
            out.writeObject(numTotalEquipsAvariados);
            out.writeObject(totaisAno);
            out.writeObject(totaisAvariaAno);


            out.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * método que permite ler todas as alterações feitas no menú
     */
    public void lerFicheiro() {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("grh.dat"));
            divisoes = (ArrayList<Divisao>) in.readObject();
            funcionarios = (ArrayList<Funcionario>) in.readObject();
            funcionariosMedicos = (ArrayList<FuncionarioMedico>) in.readObject();
            funcionariosOutros = (ArrayList<FuncionarioOutros>) in.readObject();
            tiposEquipamento = (ArrayList<TipoEquipamento>) in.readObject();
            equipamentos = (ArrayList<Equipamento>) in.readObject();
            avarias = (ArrayList<Avaria>) in.readObject();
            numTotalEquipsAvariados=(int)in.readObject();
            totaisAno = (ArrayList<TotalAno>) in.readObject();
            totaisAvariaAno = (ArrayList<TotalAvariaAno>) in.readObject();

            in.close();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
