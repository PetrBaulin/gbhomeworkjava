package lession1;

public class Cat implements Participant{
    public boolean stop;
    private final int runLimit;
    private final int jumpLimit;

    Cat(int runLimit, int jumpLimit){
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    public boolean getStatus() {
        return this.stop;
    }

    public void jump(Wall wall) {
        if (wall.height <= jumpLimit) {
            System.out.printf("Кот перепрыгнул препятствие ", wall);
        } else {
            System.out.printf("Кот не перепрыгнул препятствие ", wall);
        }
    }
        public void run(Track track) {
            if (track.lenght <= runLimit) {
                System.out.printf("Кот пробежал ", track);
            } else {
                System.out.printf("Кот не пробежал ", track);
                stop = true;
            }
        }
    }