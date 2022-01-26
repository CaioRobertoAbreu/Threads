package A_Introducao;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class MinhaThread extends Thread{

    private String nome;

    @Override
    public void run() {
        for(int i=0; i<500; i++){
            System.out.print(this.nome);

            if(i%200 == 0){
                System.out.println();
            }
        }
    }
}
public class A_Thread {

    public static void main(String[] args) {

        var thread = new Thread("Thread 01");
        System.out.println(thread.getName());

        var minhaThread1 = new MinhaThread("A");
        var minhaThread2 = new MinhaThread("B");
        var minhaThread3 = new MinhaThread("C");
        var minhaThread4 = new MinhaThread("D");

        //Ira executar uma de cada vez
//        minhaThread1.run();
//        minhaThread2.run();
//        minhaThread3.run();
//        minhaThread4.run();

        //Ira criar uma nova thread para cada execucao
        minhaThread1.start();
        minhaThread2.start();
        minhaThread3.start();
        minhaThread4.start();
    }
}
