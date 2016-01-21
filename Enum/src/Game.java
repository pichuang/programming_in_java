/**
 * Created by roan on 2016/1/22.
 */
public class Game {
    public static void main(String args[]) {
        play(Action.STOP);
    }

    public static void play(Action action) {
        switch (action) {
            case STOP:
                System.out.println("stop");
                break;
            case UP:
                System.out.println("up");
        }
    }
}
