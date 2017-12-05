package projetocp;

import java.io.*;
import java.util.ArrayList;
import java.util.Calendar;


public class GestaoRH {

    private ArrayList<Divisao> divisoes = new ArrayList<>();
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private ArrayList<FuncionarioMedico> funcionariosMedicos = new ArrayList<>();
    private ArrayList<FuncionarioOutros> funcionariosOutros = new ArrayList<>();
    private ArrayList<TipoEquipamento> tiposEquipamento = new ArrayList<>();
    private ArrayList<Equipamento> equipamentos = new ArrayList<>();


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


    public void adicionarFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }
    public void adicionarFuncionarioMedico(FuncionarioMedico funcionarioMedico){
        funcionariosMedicos.add(funcionarioMedico);
        funcionarios.add(funcionarioMedico);
    }
    public void adicionarFuncionarioOutros(FuncionarioOutros funcionarioOutros){
        funcionariosOutros.add(funcionarioOutros);
        funcionarios.add(funcionarioOutros);
    }


    public void adicionarDivisao(Divisao divisao){ divisoes.add(divisao); }
    public void adicionarTipoEquipamento(TipoEquipamento tipoEquipamento){
        if (!tiposEquipamento.isEmpty())
            tipoEquipamento.setNumero(tiposEquipamento.get(tiposEquipamento.size()-1).getNumero()+1);
        else
            tipoEquipamento.setNumero(1);

        tiposEquipamento.add(tipoEquipamento);
    }

    public void adicionarEquipamento(Equipamento equipamento){
        if (!equipamentos.isEmpty())
            equipamento.setNumeroInventario(equipamentos.get(equipamentos.size()-1).getNumeroInventario()+1);
        else
            equipamento.setNumeroInventario(1);

        Calendar.getInstance().get(Calendar.DATE);
        Calendar.getInstance().get(Calendar.MONTH + 1);
        Calendar.getInstance().get(Calendar.YEAR);
        equipamento.setDataInventariacao(Calendar.getInstance());  //a dataInv fica com a data atual no momento da adição

        equipamentos.add(equipamento);
    }


    public void eliminarFuncionario(int pos){

        funcionarios.remove(pos);
    }

    public void alterarFuncionario(int novoTelefone,String novaMorada,int posicao){
        funcionarios.get(posicao).setTelefone(novoTelefone);
        funcionarios.get(posicao).setMorada(novaMorada);
    }

    public void alterarFuncionarioTelefone(int novoTelefone,int posicao){
        funcionarios.get(posicao).setTelefone(novoTelefone);

    }

    public void alterarFuncionarioMorada(String novaMorada,int posicao){

        funcionarios.get(posicao).setMorada(novaMorada);
    }

    public int pesquisarFuncionarios(int nif) {
        for (int i = 0; i < funcionarios.size(); i++)
            if (funcionarios.get(i).getNif() == nif)
                return i;
        return -1;
    }

    public int pesquisarFuncionariosFuncao(String funcao) {
        for (int i = 0; i < funcionariosOutros.size(); i++)
            if (funcionariosOutros.get(i).getFuncao() == funcao)
                return i;
        return -1;
    }


    public String mostrarFuncionarios(){
        StringBuilder str= new StringBuilder("");
        for (int i=0; i<funcionarios.size(); i++) {
            str.append(funcionarios.get(i)).append("\n");
        }
        return str.toString();
    }

    public String mostrarFuncionariosMedicos(){
        StringBuilder str= new StringBuilder("");
        for (int i=0; i<funcionariosMedicos.size(); i++) {
            str.append(funcionariosMedicos.get(i)).append("\n");
        }
        return str.toString();
    }

    public String mostrarFuncionariosOutros(){
        StringBuilder str= new StringBuilder("");
        for (int i=0; i<funcionariosOutros.size(); i++) {
            str.append(funcionariosOutros.get(i)).append("\n");
        }
        return str.toString();
    }

    public String mostrarTipoEquipamentos(){
        StringBuilder str= new StringBuilder("");
        for (int i=0; i<tiposEquipamento.size(); i++) {
            str.append(tiposEquipamento.get(i)).append("\n");
        }
        return str.toString();
    }

    public String mostrarDivisao(){
        StringBuilder str= new StringBuilder("");
        for (int i=0; i<divisoes.size(); i++) {
            str.append(divisoes.get(i)).append("\n");
        }
        return str.toString();
    }

    public String mostrarDivisaoDesignacao(){
        StringBuilder str= new StringBuilder("");
        for (int i=0; i<divisoes.size(); i++) {
            str.append(divisoes.get(i).getDesignacao());
        }
        return str.toString();
    }





    public int pesquisarTipoEquipamento(int numero){ // à partida nao vai ser necessario
        for (int i=0; i<tiposEquipamento.size(); i++)
            if (tiposEquipamento.get(i).getNumero()==numero)
                return i;
        return -1;
    }

    public int pesquisarDivisao(String designacao){
        for (int i=0; i<divisoes.size(); i++)
            if (divisoes.get(i).getDesignacao().equalsIgnoreCase(designacao))
                return i;
        return -1;
    }






    public void gravarFicheiro() {
        try {
            ObjectOutputStream out= new ObjectOutputStream(new FileOutputStream("grh.dat"));
            out.writeObject(divisoes);
            out.writeObject(funcionarios);
            out.writeObject(funcionariosMedicos);
            out.writeObject(funcionariosOutros);
            out.writeObject(tiposEquipamento);

            out.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void lerFicheiro() {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("grh.dat"));
            divisoes = (ArrayList<Divisao>) in.readObject();
            funcionarios = (ArrayList<Funcionario>) in.readObject();
            funcionariosMedicos = (ArrayList<FuncionarioMedico>) in.readObject();
            funcionariosOutros = (ArrayList<FuncionarioOutros>) in.readObject();
            tiposEquipamento = (ArrayList<TipoEquipamento>) in.readObject();

            Divisao.quantidadeEquipamentosInstalados= divisoes.size();


            in.close();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
