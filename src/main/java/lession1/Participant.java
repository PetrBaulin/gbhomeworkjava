package lession1;

public interface Participant {
    default void tryObstacles(Obstacle obstacle) {
        if (obstacle instanceof Wall) {
            Wall wall = (Wall) obstacle;
            this.jump(wall);
        } else if (obstacle instanceof Track) {
            Track track = (Track) obstacle;
            this.run(track);
        }
    }
    boolean getStatus();
    void run(Track track);
    void jump(Wall wall);
}
