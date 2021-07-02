import java.util.Scanner;
public class calculadora {
    static public void main(String[] args){
    Scanner scan=new Scanner(System.in);


    numero n1=new numero();
    numero n2=new numero();
    numero resultado=new numero();

    System.out.printf("%nDigite o valor 1: ");
    n1.setValor(scan.nextInt());
    System.out.printf("%nDigite o valor 2: ");
    n2.setValor(scan.nextInt());
    resultado.setValor(n1.getValor() + n2.getValor());
    System.out.printf("%nA soma de %d com %d e igual a %d",n1.getValor(),n2.getValor(),resultado.getValor());

    scan.close();
    }
}
