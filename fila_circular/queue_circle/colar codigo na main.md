        // [0, 1, 2, 3, 4]
        // [1, 2, 3, 4, 5]

        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);
        fila.enqueue(4);
        fila.enqueue(5);     
     
        fila.showQueue();
   
        // 2 e 5
        fila.dequeue();
        fila.front();
        fila.back();
        System.out.println("-------------------------");

        // 3 e 5
        fila.dequeue();
        fila.front();
        fila.back();
        System.out.println("-------------------------");

        // 4 e 5
        fila.dequeue();
        fila.front();
        fila.back();
        System.out.println("-------------------------");

         // 5 e 5
        fila.dequeue();
        fila.front();
        fila.back();
        System.out.println("-------------------------");

        //fila deveria ser toda null:
        fila.dequeue();
        fila.showQueue();
        System.out.println("-------------------------");

        //fila[0] tem que ser 10 e o back tem que ser null 
        // : Não enfilera pois apesar de tudo ser null, o tamanho ainda é 5
        // : arrumar uma forma de contornar isso aqui. 
        // : MAGIA!
        fila.enqueue(10);
        fila.front();
        fila.back();


//

if(this.size() == 0){
            this.head++;
            this.tail++;
            this.fila[head] = num;
        } else if(this.size() == 5 && this.tail < 4){
            this.tail++;
            this.fila[this.tail] = num;
        } else if(this.tail == 4){
            this.fila[this.tail] = num;
        } else {
            System.out.println("Full");
        }

        