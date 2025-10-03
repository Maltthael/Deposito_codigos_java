
import java.util.Scanner;
class Executavel
{
    public static void main(String a[]){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Boa noite professor!");
        System.out.print("Digite seu nome: ");
        String nome = teclado.next();
        System.out.print("Digite sua matricula: ");
        int matricula = teclado.nextInt();
        System.out.print("Digite seu salario: ");
        float salario = teclado.nextFloat();
        System.out.print("Digite seu curso: ");
        String curso = teclado.next();
        Professor p1 = new Professor(nome, matricula, salario, curso);
        System.out.println("Nome.....: " + p1.getNome());
         System.out.println("Matricula.....: " + p1.getMatricula());
          System.out.println("Salario.....: " + p1.getSalario());
           System.out.println("Curso.....: " + p1.getCurso());
           System.out.println(p1);
    }
}
        
