/**
 * Created by student5 on 17.01.19.
 */
public class Philosopher extends Thread {
    public static int id;
    int myid= 0;
    Fork left;
    Fork right;

    public Philosopher(){

    }

    public Philosopher(Fork r, Fork l){
        myid = id;
        id++;
        right = r;
        left = l;
    }

    @Override
    public void run(){
        while (true) {
            boolean eating = false;
            System.out.println("MyID: " + myid + ": Thinking");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (left.picked == false && right.picked == false) {

                System.out.println("MyID: " + myid + ": Eating");
                left.picked = true;
                right.picked = true;
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


                System.out.println("MyID: " + myid + ": Finishing");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                left.picked = false;
                right.picked = false;
            }

        }
    }
}
