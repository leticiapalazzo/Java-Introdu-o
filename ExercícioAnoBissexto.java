import java.util.Scanner;

public class ExercícioAnoBissexto { 
   public static void main(String[] args){

Scanner entrada = new Scanner(System.in);

System.out.print("Digite o ano: ");
int ano = entrada.nextInt();

if(ano % 400 == 0){
    System.out.println(ano + " é bissexto.");
}else if(ano % 4 == 0){
    if(ano % 100 != 0){
        System.out.println(ano + " é bissexto");
    }
}else{
    System.out.print(ano + " não é bissexto.");
}

   }
}
