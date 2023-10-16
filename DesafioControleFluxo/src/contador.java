import java.util.Scanner;

public class contador {
    public static void main(String[] args) {



        try {
            Scanner numbers = new Scanner(System.in);
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = numbers.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois =  numbers.nextInt();


            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            System.out.println(exception.getMessage());
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if(parametroUm > parametroDois)
            throw new ParametrosInvalidosException();



        int contagem = parametroDois - parametroUm;
        for (int i = 0; i <=contagem; i++) {

            System.out.println("Imprimindo o número 1 " + (parametroUm + i));
            System.out.println("Imprimindo o número 2 " + (parametroDois + i));

        }
    }


}

