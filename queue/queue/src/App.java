public class App {
    public static void main(String[] args) throws Exception {
        QueueClass fila = new QueueClass();

        System.out.println("tamanho "+ fila.returnSize());
        System.out.println("Tamanho " + fila.addEnd(5));
        System.out.println("Tamanho " + fila.addEnd(8));
        System.out.println("Tamanho " + fila.addEnd(13));
        System.out.println("");
        System.out.println("ultimo: "+ fila.last());
        System.out.println("primeiro: "+ fila.front());
        System.out.println("");
        System.out.println("tamanho "+ fila.returnSize());
        System.out.println("Tamanho " + fila.addEnd(6));

        fila.removeFront();        fila.removeFront();
        fila.removeFront();
        fila.removeFront();
        fila.removeFront();


        System.out.println("apos remover");
        System.out.println("primeiro: "+ fila.front());

    }
}
