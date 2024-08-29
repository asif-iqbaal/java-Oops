// Random number guessing game
import java.util.Random;
import java.util.Scanner;

class play {

    static int count = 0;
    private int num;
    private int sytem_num;
    Random random = new Random();
    Scanner sc = new Scanner(System.in);

    public void play() {
        sytem_num = random.nextInt(100);
    }

    public int takeInput() {
        System.out.println("enter your number");
        return this.num = sc.nextInt();
    }

    public void isCorrect() {
        if (num == sytem_num) {
            System.out.println("yes you get the right number " + this.sytem_num);
            System.out.println(" total number of guess are :" + (count+1));
        } else if (num > sytem_num) {
            System.out.println("you picked the large number");
            takeInput();
            count++;
            isCorrect();
        } else {
            System.out.println("you smaller the large number");
            takeInput();
            count++;
            isCorrect();
        }
    }

}

public class program9 {

    public static void main(String[] args) {
        play p1 = new play();
        p1.play();
        p1.takeInput();
        p1.isCorrect();

    }
}
