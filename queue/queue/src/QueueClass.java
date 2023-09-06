public class QueueClass {
    Object[] fila;
    int front;
    int back;

    public QueueClass(){
        this.fila = new Object[10];
        this.front = -1;
        this.back = -1;
    }

    public boolean isVazia(){
        if(this.front == -1) {
            return true;
        }
        return false;
    }

    public int returnSize(){
        if(isVazia()) {
            return 0;
        } else {
            return this.front + 1; 
        }
    }

    public int addEnd(int num) {
        fila[++this.front] = num;
        this.back++;
        return this.returnSize();
    }

    public Object last(){
        return fila[back];
    }

    public Object front(){
        if(returnSize() < 0) {
            return "vazio";
        } else {
            return fila[0];
        }
    }

    public void removeFront(){
        for(int i = 0; i < returnSize(); i++) {
            fila[i] = fila[++i];
        }
    }
}
