import java.util.Scanner;
import java.util.Stack;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stack = new Stack<String>();
        
        for(int i=0; i < 5; i++) {
            System.out.print("Insira um nome no " + (i+1) +"º valor da stack: ");
            stack.push(scanner.nextLine());
        }
        
        System.out.println("");
        for(int i=0; i < stack.size(); i++) {
            System.out.print(stack.get(i) + " ");
        }
        System.out.println("");

        System.out.println("Roleta russa: Digite um numero de 0 a 4 e veja quem você removeu: ");
        int rmv = scanner.nextInt();
        if(rmv >= 0 && rmv <=4) {
            stack.remove(rmv);
        }


        System.out.println("Roleta russa: Digite um numero de 0 a 4 e veja quem você removeu: ");
        int rmv2 = scanner.nextInt();

        if(rmv2 >= 0 && rmv2 <= 3 ) {
            stack.remove(rmv2);
        }

        for(int i=0; i < stack.size(); i++) {
            System.out.print(stack.get(i) + " ");
        }
        System.out.println("");
        int stop = (stack.size() + 5);

        
        for(int i=stack.size(); i <= stop ; i++) {
            System.out.print("Insira um nome no " + (i) +"º valor da stack: ");
            stack.push(scanner.next());
        }

        for(int i=0; i < stack.size(); i++) {
            System.out.print(stack.get(i) + " ");
        }
        System.out.println("");
        String last = stack.pop();
        System.out.println("Ultimo valor: "+ last);

        System.out.println("p.e - escolha um valor entre 0 e " + (stack.size() - 1) );
        System.out.println(stack.get(scanner.nextInt()));

        System.out.println("Digite um valor para ver se ta na stack: ");
        String x = scanner.next();

        if(stack.indexOf(x) != -1) {
            System.out.println(" Valor encontrado no indice: "+ stack.indexOf(x) +" e com valor " + stack.get(stack.indexOf(x)));
        } else {
            System.out.println("Valor não encontrado.");
        }

        System.out.println("Informe quantos valores deseja remover da stack, sem ultrapassar o valor "+ stack.size());
        int rmStack = scanner.nextInt();

        for(int i = 0; i < rmStack; i++) {
            stack.pop();
        }
        System.out.println(stack);
        System.out.println("A pilha esta vazia? " + stack.isEmpty());

    }
}
