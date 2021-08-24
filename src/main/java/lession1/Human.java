package lession1;
public class Human implements Participant {
    public boolean stop;
    private final int runLimit;
    private final int jumpLimit;

    Human(int runLimit, int jumpLimit){
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }


    public boolean getStatus() {
        return this.stop;
    }
    public void jump(Wall wall) {
        if (wall.height <= jumpLimit) {
            System.out.printf("Человек перепрыгнул препятствие ", wall);
        } else {
            System.out.printf("Человек не перепрыгнул препятствие ", wall);
        }

    }
    public void run(Track track) {
        if (track.lenght <= runLimit) {
            System.out.printf("Человек пробежал ", track);
        } else {
            System.out.printf("Человек не пробежал ", track);
            stop = true;
        }
    }
}
