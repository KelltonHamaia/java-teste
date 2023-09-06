public class CircularQueueBackup{

    Object[] fila;
    int head = -1;
    int tail;

    public CircularQueueBackup() {
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
        if(this.head == -1){
            return 0;
        }
        return this.tail + 1;
    }

    public void isEmpty(){
        if(this.size() < 0){
            System.out.println("empty queue.");
        } else {
            System.out.println(this.size());
        }
    }

    public void enqueue(int data){
        try{
            if(this.size() == 5){
                System.out.println("queue is full.");
            } else if(this.size() == 0){
                this.head++;
                this.tail++;
                this.fila[this.head] = data;
            } else if(this.size() < 5) {
                this.tail++;
                this.fila[this.tail] = data;
            } 
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Queue's full.");
        }
    }

    public void dequeue(){
        if(this.head + 1 < 5){
            this.head++;
        } else if(this.head + 1 <= 4 && this.tail == 5){
          this.head++;
          this.tail = 0;      
        } else if(this.head == 4 &&  this.tail == 4){
            for(int i = 0; i < 5; i++){
                this.fila[i] = null;
            }
            this.head = 0;
            this.tail = 4;
        }

    }

    public void front(){
        if(this.size() == 0) {
            System.out.println("Queue's empty.");
        } else {
            System.out.println("head: "+this.fila[this.head]);
        }
    }

    public void back(){
        if(this.size() == 0) {
            System.out.println("Queue's empty.");
        } else {
            System.out.println("tail: " +this.fila[this.tail]);
        }
    }

}
