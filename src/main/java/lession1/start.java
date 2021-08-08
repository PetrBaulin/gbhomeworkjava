package lession1;

public class start {
    public static void main(String[] args) {
        Obstacle[] obstacles = {
        new Track(1000),
        new Track(2000),
        new Track(3000),
        new Wall(50),
        new Wall(60),
        new Wall(70),

        };
        Participant[] participants = {
               new Human(1500, 65),
               new Human(2500, 50),
               new Human(3500, 70),
               new Cat(1200, 45),
               new Cat(4000, 80),
               new Cat(2900, 60),
               new Robot(9999, 99),
               new Robot(1,1),
               new Robot(0,0),
        };

        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                if (!participant.getStatus()) {
                    participant.tryObstacles(obstacle);
                }
            }
        }
    }
}
