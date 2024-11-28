package exercicio5;

public class Main5 extends Thread {
    public void run() {
    System.out.println("Tarefa em segundo plano em Java!");
    }
    public static void main(String[] args) {
    Main5 tarefa = new Main5();
    tarefa.start(); // Inicia a thread
    }
    }
    