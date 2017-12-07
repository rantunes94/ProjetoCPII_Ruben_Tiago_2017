package projetocp;

import projetocp.util.Consola;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

    private static GestaoRH grh = new GestaoRH();
    public static SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");

    public static void main(String[] args) {
        // write your code here
        int opcao, opcaoSubMenu;



        // hardcode apenas para testes
        Calendar dataCalendar =new GregorianCalendar();
        Calendar dataCalendar2 =new GregorianCalendar();

        String dataNascimento = "12-12-1995";
        String  dataNascimento2= "12-02-1984";

        try {
            dataCalendar.setTime(formato.parse(dataNascimento));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        try {
            dataCalendar2.setTime(formato.parse(dataNascimento2));
        } catch (ParseException e) {
            e.printStackTrace();
        }


        TipoEquipamento tee1;
        tee1 = new TipoEquipamento("XTPO");
        grh.adicionarTipoEquipamento(tee1);

        FuncionarioMedico ff1;
        ff1= new FuncionarioMedico(1,"Rui Almeida","Rua da almeidinha fonseca",91965554,"email@fonseca.pah",dataCalendar,"12º e já vai com sorte","Absolutamente nenhuma","Em casa");
        grh.adicionarFuncionarioMedico(ff1);

        FuncionarioOutros ff2;
        ff2= new FuncionarioOutros(2,"Ana Fonseca", "Rua da fonsequinha",919191191,"anocas@dd.com",dataCalendar,"Doutorada em fazer nada","Nenhnuma");
        grh.adicionarFuncionarioOutros(ff2);

        FuncionarioOutros ff3;
        ff3= new FuncionarioOutros(3,"Miguel Estrudes", "Rua da estrudes",919191555,"s@dd.com",dataCalendar,"9º ano","Técnico");
        grh.adicionarFuncionarioOutros(ff3);



        grh.lerFicheiro();

        do {
            opcao = menu();
            switch (opcao) {
                case 1: {

                    do {
                        opcaoSubMenu = menuFuncionario();
                        switch (opcaoSubMenu) {
                            case 1:
                                criarFuncionario();
                                break;
                            case 2:
                                if (grh.getTotalFuncionarios() > 0)
                                    alterarFuncionario();
                                else
                                    System.err.println("Ainda não foram inseridos funcionários!");
                                break;
                            case 3:
                                if (grh.getTotalFuncionarios() > 0) {
                                    System.out.println(grh.mostrarFuncionariosMedicos());
                                    System.out.println(grh.mostrarFuncionariosOutros());
                                } else
                                    System.err.println("Ainda não foram inseridos funcionários!");
                                break;
                            case 4:
                                if (grh.getTotalFuncionarios() > 0)
                                    eliminarFuncionario();
                                else
                                    System.err.println("Ainda não foram inseridos funcionários!");
                                break;
                            case 0:
                                System.out.println("Vai voltar ao menu anterior");
                        }
                        if (opcaoSubMenu != 0) {
                            Consola.sc.nextLine();
                        }
                    }
                    while (opcaoSubMenu != 0);

                }

                break;

                case 2: {

                    do {
                        opcaoSubMenu = menuDivisão();
                        switch (opcaoSubMenu) {
                            case 1:
                                criarDivisao();
                                break;
                            case 2:
                                if (grh.getTotalDivisoes() > 0)
                                    consultarDivisao();
                                else
                                    System.err.println("Ainda não foram inseridas divisões!");
                                break;
                            case 0:
                                System.out.println("Vai voltar ao menu anterior");
                        }
                        if (opcaoSubMenu != 0) {
                            Consola.sc.nextLine();
                        }
                    }
                    while (opcaoSubMenu != 0);

                }

                break;
                case 3: {

                    do {
                        opcaoSubMenu = menuTiposEquipamento();
                        switch (opcaoSubMenu) {
                            case 1:
                                criarTiposEquipamento();
                                break;
                            case 2:
                                if (grh.getTotalTiposEquipamento() > 0)
                                    System.out.println(grh.mostrarTipoEquipamentos());
                                else
                                    System.err.println("Ainda não foram inseridos Tipos de Equipamento!");
                                break;
                            case 0:
                                System.out.println("Vai voltar ao menu anterior");
                        }
                        if (opcaoSubMenu != 0) {
                            Consola.sc.nextLine();
                        }
                    }
                    while (opcaoSubMenu != 0);

                }


                break;
                case 4: {

                    do {
                        opcaoSubMenu = menuEquipamentos();
                        switch (opcaoSubMenu) {
                            case 1:
                                criarEquipamento();
                                break;
                            case 2:
                                associarDivisaoAoEquipamento();
                                break;
                            case 3:
                                consultarEquipamentosPorDivisao();
                                break;
                            case 0:
                                System.out.println("Vai voltar ao menu anterior");
                        }
                        if (opcaoSubMenu != 0) {
                            Consola.sc.nextLine();
                        }
                    }
                    while (opcaoSubMenu != 0);

                }


                break;
                case 5: {

                    do {
                        opcaoSubMenu = menuAvarias();
                        switch (opcaoSubMenu) {
                            case 1:
                                criarAvaria();

                                if (grh.getTotalEquipamentos() > 0 && grh.getTotalFuncionarios() > 0)
                                    criarAvaria();
                                else
                                    System.err.println("Ainda não foram inseridos equipamentos e/ou funcionários!");
                                break;
                            case 2:

                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 0:
                                System.out.println("Vai voltar ao menu anterior");
                        }
                        if (opcaoSubMenu != 0) {
                            Consola.sc.nextLine();
                        }
                    }
                    while (opcaoSubMenu != 0);

                }


                break;
                case 6: {

                    do {
                        opcaoSubMenu = menuEstatisticas();
                        switch (opcaoSubMenu) {
                            case 1:

                                break;
                            case 2:

                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 0:
                                System.out.println("Vai voltar ao menu anterior");
                        }
                        if (opcaoSubMenu != 0) {
                            Consola.sc.nextLine();
                        }
                    }
                    while (opcaoSubMenu != 0);

                }


                break;

                case 0:
                    System.out.println("Programa terminou...");
            }
            Consola.sc.nextLine();
        } while (opcao != 0);

        grh.gravarFicheiro();

    }


    private static int menu() {
        int opcao;

        System.out.println();
        System.out.println("1 - Gerir Funcionários");
        System.out.println("2 - Gerir Divisão");
        System.out.println("3 - Gerir Tipos de Equipamento");
        System.out.println("4 - Gerir Equipamento");
        System.out.println("5 - Gerir Avarias/Reparações");
        System.out.println("6 - Estatisticas");
        System.out.println("0 - Sair\n");
        opcao = Consola.lerInt("Opcao: ", 0, 6);

        return opcao;
    }

    private static int menuFuncionario() {
        int opcao;

        System.out.println();
        System.out.println("1 - Inserir Funcionário"); // criar sub menus para cada tipo de funcionario OU printf em que dizemos escolha a opcao 1,2,3
        // ter um método para verificar que tipo é consoante o numero de forma  evitar codigo
        System.out.println("2 - Alterar Funcionário");
        System.out.println("3 - Consultar Funcionário");
        System.out.println("4 - Eliminar Funcionário");
        System.out.println("0 - Voltar ao Menu Anterior\n");
        opcao = Consola.lerInt("Opcao: ", 0, 4);

        return opcao;
    }


    private static int menuDivisão() {
        int opcao;

        System.out.println();
        System.out.println("1 - Inserir Divisão");
        System.out.println("2 - Consultar por Designação");
        System.out.println("0 - Voltar ao Menu Anterior\n");
        opcao = Consola.lerInt("Opcao: ", 0, 2);

        return opcao;
    }

    private static int menuTiposEquipamento() {
        int opcao;

        System.out.println();
        System.out.println("1 - Inserir o tipo de equipamento");
        System.out.println("2 - Consultar todos");
        System.out.println("0 - Voltar ao Menu Anterior\n");
        opcao = Consola.lerInt("Opcao: ", 0, 2);

        return opcao;
    }

    private static int menuEquipamentos() {
        int opcao;

        System.out.println();
        System.out.println("1 - Registar equipamentos");
        System.out.println("2 - Associar Divisão");
        System.out.println("3 - Consultar por divisão");
        System.out.println("0 - Voltar ao Menu Anterior\n");
        opcao = Consola.lerInt("Opcao: ", 0, 3);

        return opcao;
    }

    private static int menuAvarias() {
        int opcao;

        System.out.println();
        System.out.println("1 - Registar avarias");
        System.out.println("2 - Alterar estado");
        System.out.println("3 - Consultar por número de equipamento");
        System.out.println("0 - Voltar ao Menu Anterior\n");
        opcao = Consola.lerInt("Opcao: ", 0, 3);

        return opcao;
    }

    private static int menuEstatisticas() {
        int opcao;

        System.out.println();
        //System.out.println("1 - Inserir Divisão");
        //System.out.println("2 - Consultar por Designação");
        System.out.println("0 - Voltar ao Menu Anterior\n");
        opcao = Consola.lerInt("Opcao: ", 0, 2);

        return opcao;
    }


    public static void criarDivisao() {
        String designacao, localizacao;
        Divisao d1;

        designacao = Consola.lerString("Indique a designação da Divisão: ");
        localizacao = Consola.lerString("Indique a localização da Divisão: ");

        d1 = new Divisao(designacao, localizacao);


        grh.adicionarDivisao(d1);

        System.out.println("Divisão inserida com sucesso!");
    }

    public static void criarTiposEquipamento() {
        String designacao;
        TipoEquipamento te1;

        designacao = Consola.lerString("Indique a designação do Tipo de equipamento: ");


        te1 = new TipoEquipamento(designacao);

        grh.adicionarTipoEquipamento(te1);

        System.out.println("Tipo de equipamento inserido com sucesso!");
    }

    public static void criarEquipamento() {
        String descricao;
        int numtipoEquipamento, numInventario;
        Funcionario funcionarioTecnico;
        Double custo;
        int numSerie, nif;
        int pos;
        Equipamento e1;

        do {
            nif = Consola.lerInt("Indique o nif do Funcionário: ", 1, 999999999);
            pos = grh.pesquisarFuncionarios(nif);
            if (pos == -1)
                System.err.println("Funcionario não existe!");
            else {
                funcionarioTecnico = grh.obterFuncionario(pos);
                if (funcionarioTecnico instanceof FuncionarioOutros) {
                    if (((FuncionarioOutros) funcionarioTecnico).getFuncao().equalsIgnoreCase("técnico")) {
                        break;
                    }
                }
                pos=-1;
                System.out.println("Este funcionário não é Técnico!");
            }
        } while (pos == -1);

        funcionarioTecnico = grh.obterFuncionario(pos);
        //numInv e dataInventariacao estao na grh no metodo adicionarEquipamentos
        numInventario = Consola.lerInt("Indique o número de inventário do equipamento: ", 1, 999999999);
        descricao = Consola.lerString("Indique a descrição do Equipamento: ");
        numSerie = Consola.lerInt("Indique o número de série do equipamento: ", 0, 999999999);
        custo = Consola.lerDouble("Indique o custo do equipamento: ", 0, 999999999);

        do {
            System.out.println(grh.mostrarTipoEquipamentos());
            numtipoEquipamento = Consola.lerInt("Indique o tipo do equipamento: ", 0, 9999999);

            pos = grh.pesquisarTipoEquipamento(numtipoEquipamento);
            if (pos == -1)
                System.err.println("Tipo de equipamento não existe");
        } while (pos == -1);

        TipoEquipamento tipoEquipamento = grh.obterTiposEquipamento(pos);

        e1 = new Equipamento(numInventario, descricao, numSerie, tipoEquipamento, custo, funcionarioTecnico);

        grh.adicionarEquipamento(e1);

        System.out.println("Equipamento inserido com sucesso");
    }




    public static void criarAvaria() {  //qnd adicionamos uma avaria, o estadoAvaria tem que ficar PORREPARAR; e o estado INDISPONIVEL

    int pos,nif;
    int numEquipamento;
    String descricao;
    Funcionario funcionarioTecnico;
    Avaria av1;

        do {
            System.out.println(grh.mostrarEquipamentos());
            numEquipamento = Consola.lerInt("Indique o equipamento no qual quer registar a ocorrência de uma avaria: ", 1, 9999999);
            pos = grh.pesquisarEquipamento(numEquipamento);
            if (pos == -1)
                System.err.println("Equipamento não existe");
        } while (pos == -1);
        Equipamento equipamento = grh.obterEquipamento(pos);

        descricao = Consola.lerString("Indique a descrição da Avaria: ");

        do {
            System.out.println(grh.mostrarFuncionarios());
            nif = Consola.lerInt("Indique o nif do Funcionário que registou a avaria : ", 1, 999999999);
            pos = grh.pesquisarFuncionarios(nif);
            if (pos == -1)
                System.err.println("Funcionario não existe!");
            else {
                funcionarioTecnico = grh.obterFuncionario(pos);
                if (funcionarioTecnico instanceof FuncionarioOutros) {
                    if (((FuncionarioOutros) funcionarioTecnico).getFuncao().equalsIgnoreCase("técnico")) {
                        break;
                    }
                }
                pos=-1;
                System.out.println("Este funcionário não é Técnico!");
            }
        } while (pos == -1);
        funcionarioTecnico = grh.obterFuncionario(pos);





        av1 = new Avaria(equipamento,descricao,funcionarioTecnico);

        grh.adicionarAvaria(av1);
        System.out.println("Avaria inserida com sucesso");

    }

    public static void consultarEquipamentosPorDivisao() {
        /*int pos;
        String designacaoDivisao;

        System.out.println("Lista de Divisões: ");
        System.out.println(grh.mostrarDivisaoDesignacao());

        do {

            designacaoDivisao = Consola.lerString("Insira a designação da divisão a consultar: ");
            pos = grh.pesquisarDivisao(designacaoDivisao);

            if (pos == -1) {
                System.out.println("Divisão não existe!");
            }
            while (pos == -1) ;

            System.out.println("");
        } while (pos != -1);*/

        int pos;
        String designacao;
        Equipamento e;
        Divisao d;

        do{
            System.out.println(grh.mostrarDivisao());
            designacao = Consola.lerString("Indique a designação da divisão: ");
            pos = grh.pesquisarDivisao(designacao);
            if (pos == -1)
                System.err.println("Divisão não existe");
        }while (pos == -1);
        d = grh.obterDivisao(pos);
        System.out.println(d.mostrarEquipamentos());
    }


    public static void associarDivisaoAoEquipamento() {
        int pos, numInventario;
        String designacao;
        Equipamento e;
        Divisao d;

        do{
            System.out.println(grh.mostrarDivisao());
            designacao = Consola.lerString("Indique a designação da divisão: ");
            pos = grh.pesquisarDivisao(designacao);
            if(pos == -1)
                System.err.println("Divisão não existe!");
        }while (pos == -1);

        d = grh.obterDivisao(pos);

        do{
            System.out.println(grh.mostrarEquipamentos());
            numInventario = Consola.lerInt("Insira o número de inventário do equipamento: ",0, 999999999);
            pos = grh.pesquisarEquipamento(numInventario);
            if (pos == -1)
                System.err.println("Equipamento não existe!");
        }while (pos == -1);

        e = grh.obterEquipamento(pos);
        d.adicionarEquipamentos(e);  //d.associarEquipamento(e);
        e.setDivisao(d);

        System.out.println("Divisão associda com sucesso!");
    }


    public static void consultarDivisao() {
        int pos;
        String designacao;
        Divisao divisao;
        do {
            designacao = Consola.lerString("Indique a designação da Divisão: ");
            pos = grh.pesquisarDivisao(designacao);
            if (pos == -1)
                System.err.println("Divisão não existe!");
        } while (pos == -1);

        divisao = grh.obterDivisao(pos);

        System.out.println(divisao);
    }


    public static void criarFuncionario() {
        int nif, telefone, tipo, pos;
        String nome, morada, email, habilitacoes, dataN, especialidade, seccaoTrabalho, username, password, funcao;
        Calendar dataNascimento = new GregorianCalendar();
        FuncionarioMedico f1;
        FuncionarioOutros f2;
        int errodn = 0;
        //validação a ver se o funcionario que criamos ja existe ou nao
        do {
            nif = Consola.lerInt("Indique o nif do Funcionário: ", 1, 999999999);
            pos = grh.pesquisarFuncionarios(nif);
            if (pos != -1)
                System.err.println("Funcionário já existe!");
        } while (pos != -1);

        nome = Consola.lerString("Indique o nome do Funcionário: ");
        telefone = Consola.lerInt("Indique o telefone do Funcionário: ", 1, 999999999);
        morada = Consola.lerString("Indique a morada do Funcionário: ");
        email = Consola.lerString("Indique o email do Funcionário: ");
        habilitacoes = Consola.lerString("Indique as habilitações do Funcionário: ");

        //validar idade dos funionarios? metodo validarIdade na classe Funcionario mais interfaceFuncionario
        /*if (f1.validarIdade()) {
            grh.adicionarFuncionario(f1);
            System.out.println("Funcionário introduzido com sucesso!");
        } else {
            System.err.println("Funcionário com idade inválida!");
        }*/
        do {
            errodn = 0;
            try {
                dataN = Consola.lerString("Indique a data de nascimento do funcionário (dd-mm-yyyy): ");
                dataNascimento.setTime(formato.parse(dataN));
            } catch (ParseException e) {
                errodn = 1;
                System.err.println("Data de nascimento com formato inválido!");
            }
        } while (errodn == 1);

        do {
            System.out.println("Escolha o tipo de Funcionário a inserir:");
            System.out.println("1 - Médico");
            System.out.println("2 - Técnico");
            System.out.println("3 - Outros");
            tipo = Consola.lerInt("Opcao: ", 1, 3);
        } while (tipo < 0 && tipo > 3);

        if (tipo == 1) {
            especialidade = Consola.lerString("Indique a especialidade do médico: ");
            seccaoTrabalho = Consola.lerString("Indique a seccção de trabalho do médico: ");

            f1 = new FuncionarioMedico(nif, nome, morada, telefone, email, dataNascimento, habilitacoes, especialidade, seccaoTrabalho);

            grh.adicionarFuncionarioMedico(f1);
            System.out.println("Funcionário inserido com sucesso!");
        }
        if (tipo == 2) {
            username = Consola.lerString("Indique o username do técnico: ");
            password = Consola.lerString("Indique a password do técnico: ");

            funcao = ("Técnico");
            f2 = new FuncionarioOutros(nif, nome, morada, telefone, email, dataNascimento, habilitacoes, funcao, username, password);

            grh.adicionarFuncionarioOutros(f2);
            System.out.println("Funcionário inserido com sucesso!");
        }
        if (tipo == 3) {
            funcao = Consola.lerString("Indique a função do Funcionário: ");

            f2 = new FuncionarioOutros(nif, nome, morada, telefone, email, dataNascimento, habilitacoes, funcao);

            grh.adicionarFuncionarioOutros(f2);
            System.out.println("Funcionário inserido com sucesso!");
        }

    }


    public static void alterarFuncionario() {
        int nif, pos, opcao = 0;
        int novoTelefone;
        String novaMorada;

        do {
            nif = Consola.lerInt("Indique o nif do funcionário a alterar: ", 100000000, 999999999);
            pos = grh.pesquisarFuncionarios(nif);
            if (pos == -1) {
                System.err.println("Funcionário não existe!");
            } else

                do {
                    System.out.println("Escolha o campo que quer alterar:");
                    System.out.println("1 - Número de Telefone");
                    System.out.println("2 - Morada");
                    System.out.println("3 - Ambos");
                    opcao = Consola.lerInt("Opcao: ", 1, 3);
                } while (opcao < 0 && opcao > 3);

            if (opcao == 1) {

                novoTelefone = Consola.lerInt("Indique o novo telefone do Funcionário: ", 100000000, 999999999);
                grh.alterarFuncionarioTelefone(novoTelefone, pos);
                System.out.println("Alteração feita com sucesso!");
            }
            if (opcao == 2) {

                novaMorada = Consola.lerString("Indique a nova morada do Funcionário: ");
                grh.alterarFuncionarioMorada(novaMorada, pos);
                System.out.println("Alteração feita com sucesso!");
            }

            if (opcao == 3) {

                novoTelefone = Consola.lerInt("Indique o novo telefone do Funcionário: ", 100000000, 999999999);
                novaMorada = Consola.lerString("Indique a nova morada do Funcionário: ");
                grh.alterarFuncionario(novoTelefone, novaMorada, pos);
                System.out.println("Alteração feita com sucesso!");
            }

        } while (pos == -1);

    }


    public static void eliminarFuncionario() {
        int nif, pos;
        do {
            nif = Consola.lerInt("Indique o nif do funcionário: ", 100000000, 999999999);
            pos = grh.pesquisarFuncionarios(nif);
            if (pos == -1)
                System.err.println("Funcionário não existe!");
        } while (pos == -1);
        grh.eliminarFuncionario(pos);
        System.out.println("Funcionário removido com sucesso!");
    }


}
