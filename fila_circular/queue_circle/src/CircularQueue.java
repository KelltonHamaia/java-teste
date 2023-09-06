public class CircularQueue {

    Object[] fila;
    int head = -1;
    int tail;

    public CircularQueue() {
        this.fila = new Object[5];
        this.head = -1;
        this.tail= -1;
    }

    public void showQueue(){
        System.out.println("");
        for(Object x : this.fila){
            System.out.print("| "+x+ " ");
        }
        System.out.println("");
    }

    public int size(){
        int lenght = 0;
        if(this.head == -1){
            return 0;
        }
        for(Object x:this.fila){
            if(x != null){
                lenght++;
            }
        }
        return lenght;
    }

    public void isEmpty(){
        if(this.size() < 0){
            System.out.println("empty queue.");
        } else {
            System.out.println(this.size());
        }
    }

    public void enqueue(Object num) {
        if(this.size() == 0){
            this.head++;
            this.tail++;
            this.fila[head] = num;
        } else if(this.size() < 5 &&  this.tail <= 4){
            this.tail++;
            this.fila[this.tail] = num;
        } else {
            System.out.println("erro");
        }
    }

    public void dequeue(){
        if(this.head < this.tail){
            this.fila[this.head] = null;
            this.head++;
        } else if(this.head == this.tail){
            this.fila[this.tail] = null;
            this.head = -1;
            this.tail = -1;
        }
    }


public void teste(){
    
}


    public void front(){
        System.out.println("index head: "+ this.head + " | value: " +this.fila[this.head]);
    }
    public void tail(){
        System.out.println("index tail: "+ this.tail + " | value: " +this.fila[this.tail]);
    }
}

