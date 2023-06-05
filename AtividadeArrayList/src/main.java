import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ana.cardoz
 */
public class main {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
    
    Curso curso = null;
    ArrayList<Curso> cursos = new ArrayList<>();
    
    Aluno aluno = new Aluno();
    ArrayList<Double> notas = new ArrayList<>();
    
    Telefone telefone;
    ArrayList<Telefone>tel = new ArrayList<>();
    
    Professor novoProfessor = new Professor();
    
    Endereco endereco;
    
    /*PROFESSOR*/
    
    System.out.println("------CADASTRO PROFESSOR------\n");
    System.out.println("**Preencha as informações a seguir**\n");
    System.out.println("Nome: ");
    novoProfessor.setNome(scan.nextLine());
    
    System.out.println("CPF: ");
    novoProfessor.setCpf(scan.nextLine());
    
    System.out.println("Email: ");
    novoProfessor.setEmail(scan.nextLine());

    endereco = new Endereco();
    
    System.out.println("Rua: ");
    endereco.setRua(scan.nextLine());
    
    System.out.println("Cidade: ");
    endereco.setCidade(scan.nextLine());
    
    System.out.println("Estado: ");
    endereco.setEstado(scan.nextLine());
    
    novoProfessor.setEndereco(endereco);
    
    System.out.println("---TELEFONE--- |max 2|");
    for(int i = 0; i < 2; i++){
        telefone = new Telefone();
        
        System.out.println("Tipo: ");
        telefone.setTipo(scan.nextLine());
        
        System.out.println("DDD: ");
        telefone.setDdd(scan.nextLine());
        
        System.out.println("Numero: ");
        telefone.setNumero(scan.nextLine());
        
        tel.add(telefone);
    }
    novoProfessor.setTelefone(tel);
    
    System.out.println("Titulacao: ");
    novoProfessor.setTitulacao(scan.nextLine());
    
    System.out.println("Salario: ");
    novoProfessor.setSalario(scan.nextDouble());
    
    System.out.println("---CURSOS--- |max 1|");
    for(int i = 0; i < 1; i++){
        curso = new Curso();
        System.out.println("Nome: ");
        curso.setNome(scan.nextLine());
        novoProfessor.setCurso(cursos);
    }
    
    /*ALUNO*/
    
     Aluno novoAluno = new Aluno();
    System.out.println("------CADASTRO ALUNO------\n");
    System.out.println("**Preencha as informações a seguir**\n");
    System.out.println("Nome: ");
    aluno.setNome(scan.nextLine());
    
    System.out.println("CPF: ");
    aluno.setCpf(scan.nextLine());
    
    System.out.println("Nome: ");
    aluno.setEmail(scan.nextLine());
    
    endereco = new Endereco();
    
    System.out.println("Rua: ");
    endereco.setRua(scan.nextLine());
    
    System.out.println("Cidade: ");
    endereco.setCidade(scan.nextLine());
    
    System.out.println("Estado: ");
    endereco.setEstado(scan.nextLine());
    
    novoAluno.setEndereco(endereco);
    
    System.out.println("---TELEFONE--- |max 2|");
    for(int i = 0; i < 2; i++){
        telefone = new Telefone();
        
        System.out.println("Tipo: ");
        telefone.setTipo(scan.nextLine());
        
        System.out.println("DDD: ");
        telefone.setDdd(scan.nextLine());
        
        System.out.println("Numero: ");
        telefone.setNumero(scan.nextLine());
        
        tel.add(telefone);
    }
     novoAluno.setTelefone(tel);
     
     System.out.println("---CURSO--- |max 1|");
     for(int i = 0; i < 1; i++){
        curso = new Curso();
        System.out.println("Nome: ");
        curso.setNome(scan.nextLine());
        novoAluno.setCurso(curso);
    }
    
    System.out.println("Notas: ");
    for(int i = 0; i < 2; i++){
        notas.add(scan.nextDouble());
    }
    novoAluno.setNotas(notas);
    
    novoProfessor.imprimir();
    novoAluno.imprimir();
    }
}