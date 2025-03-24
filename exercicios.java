import java.util.Scanner;

public class exercicios {

   public static void main(String[] args) {
      while(true){
         System.out.println("Qual dos 10 exercicios quer rodar? (digite 0 pra fechar o programa)");
         var s = new Scanner(System.in);
         int qual_exercicio = s.nextInt();
         switch (qual_exercicio) {
            case 1:
               exercicio1();
               break;
            case 2:
//               exercicio2();
               break;
            case 3:
//               exercicio3();
               break;
            case 4:
//               exercicio4();
               break;
            case 5:
//               exercicio5();
               break;
            case 6:
//               exercicio6();
               break;
            case 7:
//               exercicio7();
               break;
            case 8:
//               exercicio8();
               break;
            case 9:
//               exercicio9();
               break;
            case 10:
//               exercicio10();
               break;
            default:
               System.out.println("Opcao invalida padrinho, tenta dnv ai");
               break;
         }
         if(qual_exercicio == 0) break;

      }

   }

   public static void exercicio1() {
      System.out.println("Digite 2 numeros");
      Scanner s = new Scanner(System.in);
      float num1 = s.nextFloat();
      float num2 = s.nextFloat();

      System.out.printf("Soma: %.2f\n", num1 + num2);
      System.out.printf("Subtracao: %.2f\n", num1 - num2);
      System.out.printf("multiplicacao: %.2f\n", num1 * num2);
      System.out.printf("divisao: %.2f\n", num1 / num2);

   }

   public class void exercicio2(){



   }
}