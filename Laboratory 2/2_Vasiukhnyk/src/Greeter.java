//Exercise 9
public class Greeter extends Thread  implements Runnable {
    public String target;
    public int n;

    public Greeter(int n, String target){
        this.n = n;
        this.target = target;
    }
    public void run(){
        for (int i = 0; i < n; i++) {
            System.out.println("Witaj, " + target);
        }
    }

    public static void main(String[] args) {
    Greeter object1 = new Greeter(8, "Andre");
    Greeter object2 = new Greeter(4, "Volodymyr");

    Thread thr1 = new Thread(object1);
    Thread thr2 = new Thread(object2);

    thr1.start();
    thr2.start();
    }

}
