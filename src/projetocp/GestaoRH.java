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
    private ArrayList<Avaria> avarias = new ArrayList<>();


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
        equipamento.setDataInventariacao(Calendar.getInstance());
        equipamento.setEstadoEquipamento(EstadoEquipamento.DISPONIVEL);
        equipamentos.add(equipamento);
    }


    public void adicionarAvaria(Avaria avaria){
        if (!avarias.isEmpty())
            avaria.setNumero(avarias.get(avarias.size()-1).getNumero()+1);
        else
            avaria.setNumero(1);
        avaria.setDataRegisto(Calendar.getInstance()); // insere data atual
        avaria.setEstadoAvaria(EstadoAvaria.PORREPARAR);
        avarias.add(avaria);
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


    /**
    public void alterarEstadoAvaria(EstadoAvaria novoEstado,int posicao){
        avarias.get(posicao).setEstadoAvaria(novoEstado);

        for (int i = 0; i < avarias.size(); i++)
            if(avarias.get(i).getEstadoAvaria() == EstadoAvaria.PORREPARAR)
                equipamentos.get(posicao).setEstadoEquipamento(EstadoEquipamento.INDISPONIVEL);
            else
                if(avarias.get(i).getEstadoAvaria() == EstadoAvaria.REPARADA)
                    equipamentos.get(posicao).setEstadoEquipamento(EstadoEquipamento.DISPONIVEL);
            else
                if(avarias.get(i).getEstadoAvaria() == EstadoAvaria.IRREPARAVEL)
                    equipamentos.get(posicao).setEstadoEquipamento(EstadoEquipamento.ABATIDO);
    }
*/

    public int pesquisarFuncionarios(int nif) {
        for (int i = 0; i < funcionarios.size(); i++)
            if (funcionarios.get(i).getNif() == nif)
                return i;
        return -1;
    }

    public int pesquisarFuncionariosOutros(int nif) {
        for (int i = 0; i < funcionariosOutros.size(); i++)
            if (funcionariosOutros.get(i).getNif() == nif)
                return i;
        return -1;
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

    public int pesquisarEquipamento(int numInventario){
        for (int i=0; i<equipamentos.size(); i++)
            if (equipamentos.get(i).getNumeroInventario()==numInventario)
                return i;
        return -1;
    }


    public int pesquisarAvarias(int numeroAvaria) {
        for (int i = 0; i < avarias.size(); i++)
            if (avarias.get(i).getNumero() == numeroAvaria)
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

    public String mostrarEquipamentos(){
        StringBuilder str= new StringBuilder("");
        for (int i=0; i<equipamentos.size(); i++) {
            str.append(equipamentos.get(i)).append("\n");
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
            str.append(divisoes.get(i).getDesignacao()).append("\n");
        }
        return str.toString();
    }

    public String mostrarAvarias(){
        StringBuilder str= new StringBuilder("");
        for (int i=0; i<avarias.size(); i++) {
            str.append(avarias.get(i)).append("\n");
        }
        return str.toString();
    }




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
            equipamentos = (ArrayList<Equipamento>) in.readObject();
            avarias = (ArrayList<Avaria>) in.readObject();


            Divisao.quantidadeEquipamentosInstalados= divisoes.size();


            in.close();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
