public class Tank {

    int x;
    int y;
    int z = 0;

    public void turnRight()
    {
        switch (z) {
            case 0:  z = 1;
                break;
            case 1: z=2;
                break;
            case 2: z=3;
                break;
            case 3: z=0;
                break;
        }
    }
    public void turnLeft()
    {
        switch (z) {
            case 0:  z = 3;
                break;
            case 3: z=2;
                break;
            case 2: z=1;
                break;
            case 1: z=0;
                break;
        }
    }
    public void goForward(int i) {
        switch (z) {
            case 0:x=x+i;
                break;
            case 1:y=y+i;
                break;
            case 2:x=x-i;
                break;
            case 3:y=y-i;
                break;

        }


    }

    public void printPosition() {
        System.out.println("The Tank is at " + x + ", "+y+" now.");
    }


    public void goBackward(int i) {
        i=-i;
        switch (z) {
            case 0:x=x+i;
                break;
            case 1:y=y+i;
                break;
            case 2:x=x-i;
                break;
            case 3:y=y-i;
                break;
        }
    }
}
/*solution
*
* public class Tank {

	int x, y;
	int dir;

	public void goForward(int i) {
		if (dir == 0) x += i;
		else if (dir == 1) y += i;
		else if (dir == 2) x -= i;
		else y -= i;
	}

	public void printPosition() {
		System.out.println("The Tank is at " + x +", " + y + " now.");
	}

	public void turnLeft() {
		dir--;
        if (dir == -1) dir = 3;
	}

	public void turnRight() {
		dir++;
		if (dir == 4) dir = 0;
	}

	public void goBackward(int i) {
        goForward(-i);
	}
}*/