import java.util.Scanner;
public class qst3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual a dua idade? ");
        int idade = scan.nextInt();
        scan.close();
        if(idade>18){
            System.out.println("Com "+idade+" anos, você já pode tirar a Habilitação para Dirigir.");
        }else{
            System.out.println("Com "+idade+" anos, você não pode tirar a Habilitação para Dirigir.");
        }
    }
}
