package thread;

public class PriorityDemo {
    public static void main(String[] args) {
        Thread noob=new Thread(){
            public void run(){
                for(int i=0;i<10000;i++){
                    System.out.println("noob");
                }
            }
        };

        Thread pro=new Thread(){
            public void run(){
                for(int i=0;i<10000;i++){
                    System.out.println("pro");
                }
            }
        };

        Thread hacker=new Thread(){
            public void run(){
                for(int i=0;i<10000;i++){
                    System.out.println("hacker");
                }
            }
        };

        noob.setPriority(Thread.MIN_PRIORITY);
        hacker.setPriority(Thread.MAX_PRIORITY);

        noob.start();
        pro.start();
        hacker.start();

    }
}
