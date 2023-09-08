public class Main {


    public static void main(String[] args) {
/*
Make (add code to class Tank),
which can turn around
*/
        Tank tank = new Tank();
        tank.goForward(10);
        tank.printPosition();
        tank.turnRight();
        tank.goForward(50);
        tank.printPosition();
        tank.turnLeft();
        tank.goBackward(100);
        tank.printPosition();

/*
This fragment of code has to output

The Tank is at 10, 0 now.
The Tank is at 10, 50 now.
The Tank is at -90, 50 now.

*/
    }

}