package A_Introducao;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class MinhaThreadRunnable implements Runnable {

    private String nome;

    @Override
    public void run() {

        for (int i = 0; i < 500; i++) {
            System.out.print(this.nome);

            if (i % 200 == 0) {
                System.out.println();
            }
        }
    }
}

public class B_UsandoRunnable {

    public static void main(String[] args) {

        var minhaThreadA = new Thread(new MinhaThreadRunnable("A"));
        var minhaThreadB = new Thread(new MinhaThreadRunnable("B"));
        var minhaThreadC = new Thread(new MinhaThreadRunnable("C"));
        var minhaThreadD = new Thread(new MinhaThreadRunnable("D"));

        minhaThreadA.start();
        minhaThreadB.start();
        minhaThreadC.start();
        minhaThreadD.start();
    }
}
