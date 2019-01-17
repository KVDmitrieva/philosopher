/**
 * Created by student5 on 17.01.19.
 */

public class Main {
    public static void main(String[] args){
        Philosopher philosophers[] = new Philosopher[9];
        Fork forks[] = new Fork[philosophers.length];
        for (int i=0; i<forks.length; i++){
          forks[i] = new Fork();
        }
        for (int i=0; i<philosophers.length;i++){
            Fork leftFork = forks[i];
            Fork rightFork = forks[(i + 1) % forks.length];
            philosophers[i] = new Philosopher(leftFork, rightFork);
            philosophers[i].start();
        }

    }
}
