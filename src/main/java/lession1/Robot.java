package lession1;

public class Robot implements Participant{
    public boolean stop;
    private final int runLimit;
    private final int jumpLimit;

    Robot(int runLimit, int jumpLimit){
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    public boolean getStatus() {
        return this.stop;
    }

    public void jump(Wall wall) {
        if (wall.height <= jumpLimit) {
            System.out.printf("Робот перепрыгнул препятствие ", wall);
        } else {
            System.out.printf("Робот не перепрыгнул препятствие ", wall);
        }

    }
    public void run(Track track) {
        if (track.lenght <= runLimit) {
            System.out.printf("Робот пробежал ", track);
        } else {
            System.out.printf("Робот не пробежал ", track);
            stop = true;
        }
    }
}
