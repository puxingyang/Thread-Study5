package lesson5;

public class SingtonRun {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                Sington.getInstance();
            }).start();
        }
    }
}

