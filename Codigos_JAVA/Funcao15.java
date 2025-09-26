import java.util.Scanner;
class Funcao15{
    public static void main(String arg[]){
        String A = "Digite um numero de 0 a 100: ";
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite cuscuz com dois Z: ");
        String texto = teclado.nextLine();
        if(A.equals(texto))
        System.out.println(" Você digitou cuzcuz, parabens :)! ");
        else
        System.out.println(" Você não digitou cuscuz com doiz z >:(! ");
    }
}