Aula 1 - 17/02/23

We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth.

Para um engenheiro de Software vários fatores influenciam na criação de um programa, tal como tempo, escala do programa, etc, sendo seu trabalho manejar os recursos dispostos a si da melhor maneira possível, tendo em conta todos os fatores citados acima. Isso, contudo, nem sempre será possível, devendo ele priorizar um ou outro fator dependendo do cenário em questão, por vezes tomando decisões baseadas em presunções imprecisas. Tais fatores servem para diferi-lo do programador, devendo o engenheiro de software ter uma visão mais completa e heuristica deste processo, buscando a criação do melhor produto possível apesar das adversidades. 

Aula 2-23/02/23

Within Google, we sometimes say, “Software engineering is programming integrated over time.” Programming is certainly a significant part of software engineering: after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, maintenance). The addition of time adds an important new dimension to programming. Cubes aren’t squares, distance isn’t velocity. Software engineering isn’t programming.

Existe uma diferença fundamental entre programadores e desenvolvedores de software, de modo que o primeiro foca na criação do código, enquanto o outro fica responsável por sua arquiterura, manutenção e estruturação. Em suma, apesar de suas tarefas interseccionarem em determinados pontos, ambos são fundamentalmente diferentes, tendo um maior responsabilidade na construção do programa que o outro, apesar de ambos serem importantes para o todo.

Aula 3-24/02/23

1-O que é Engenharia de Software? <br/>
2-O que são requisitos? <br/>
2.1- O que são requisitos funcionais? <br/>
2.2-O que são requisitos não funcionais? <br/>
Dê exemplos. <br/>

DESAFIO- Escreva 2 exemplos de trade-offs envolvendo requisitos não funcionais. <br/>

1- Trata-se de uma abordagem técnica e sistematica para a criação e desenvolvimento de softwares, focando nas questões praticas do processo e buscando criar o melhor produto possível, adequando-o as expectativas do usuário. Em outra visão, poderia ser descrita como uma forma de programação que tem como diferencial o tempo, escala e trade-offs na hora de sua criação. <br/>
2- Em suma, trata-se dos pontos que o programa precisa cumprir para que corresponda as necessidades e desejos de seus usuários. <br/>
2.1- Trata-se dos pontos necessários que um software deve ter para que o mesmo funcione de acordo com os objetivos especificados na sua criação, atendendo assim as necessidades de seus usuários e suprindo suas demandas. Pode se ter como exemplo disso a capacidade de inserir e extratir dados de um banco de dados ou permitir que uma pessoa possa entrar em comunicação com o vendedor num site de vendas online. <br/>
2.2- trata-se daqueles requisitos não necessários, mas desejados ao bom funcionamento de um sistema. Foca-se aqui na qualidade do mesmo, estando tais pontos por vezes implicitos na hora da criação de um programa. Ex: Aspectos de segurança do software; Acessibilidade; Usabilidade; etc. <br/>
3[DESAFIO]-performance e tempo de aprendizagem. <br/>

Aula 4- 24/03/23

Classe UML + Código
![UML_Bertoti](https://github.com/vmorais111/bertoti/assets/111707785/0d125af6-8764-4c1a-88d9-449504aaf41c)



Código:

CLASSE DATA:

public class Data {

    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }  
    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public String Formatardata(){
        return dia + "/"+ mes + "/" + ano;
    }
}

---------------------------------------------------------------------------------------

CLASSE ALUNO:

public class Aluno {
    
    private int ra;
    private String nome;
    private char sexo;
    private String rg;
    private String cpf;
    private Data dataNasc;

    public Aluno(int ra, String nome, char sexo, String rg, String cpf, int dia, int mes, int ano) {
        this.ra = ra;
        this.nome = nome;
        this.sexo = sexo;
        this.rg = rg;
        this.cpf = cpf;
        this.dataNasc = new Data(dia, mes, ano);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Data getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Data dataNasc) {
        this.dataNasc = dataNasc;
    }
    
    public void imprimirAluno(){
       System.out.println("RA: "+ this.getRa());
       System.out.println("Nome: "+ this.getNome());
       System.out.println("Sexo: "+this.getSexo());
       System.out.println("RG: "+ this.getRg());
       System.out.println("CPF: "+this.getCpf());
       System.out.println("Data: "+ this.dataNasc.Formatardata());
    }
}

----------------------------------------------------------------------------------------------------

CLASSE ESCOLA: 

public class Escola {

    private String nome;
    private List<Aluno> listAluno;

    public Escola(String nome) {
        this.nome = nome;
        listAluno = new ArrayList<Aluno>();
    }
    
    public void addAluno(Aluno aluno){
        listAluno.add(aluno);
    }
    public void imprimir(){
        System.out.println("nome: "+ nome);
        for (int i=0;i<listAluno.size();i++){
            Aluno aluno = listAluno.get(i);
            System.out.println("*");
            aluno.imprimirAluno();
        }
    }  
    

}

----------------------------------------------------------------------------------------------------

CLASSE TESTE:

public class Teste {

        Aluno al1,al2,al3;
        al1= new Aluno(33049251, "Joselito Morales", 'M',"31.123.321-5", "789.678.567-43", 12, 12, 23);
        al2= new Aluno(33049251, "Miguelito Silva", 'M',"32.333.444-6", "567.443.221-22", 14, 01, 23);
        al3= new Aluno(33049251, "Mariana Silveira", 'F',"22.454.323-5", "798.000.111-34", 12, 06, 23);
        
        Escola escola=new Escola("Escola Estadual Mazaropi");
        escola.addAluno(al1);
        escola.addAluno(al2);
        escola.addAluno(al3);
        escola.imprimir();
}
