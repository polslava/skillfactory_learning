import static java.lang.Math.abs;

public class Tank
{
    public int x;
    public int y;
    public int z;
    public int fuel;
    public Tank(
    )
    {
        this.x = 0;
        this.y = 0;
        this.fuel = 100;
        System.out.println("justank x:"+x+", y:"+y+", fuel:"+fuel);
    };
    public Tank(
            int x0,
            int y0
      )
    {
        this.x = x0;
        this.y = y0;
        this.fuel = 100;
        System.out.println("anywareTank x:"+x+", y:"+y+", fuel:"+fuel);
    };
    public Tank(
        int x0,
        int y0,
        int fuel0
) {
        this.x=x0;
        this.y=y0;
        this.fuel=fuel0;
        //int z = 0;
        System.out.println("customTank x:"+x+", y:"+y+", fuel"+fuel);
    }
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
    public void goForward(int i0) {
        System.out.println("goForward0 step0:"+i0+", fuel0:"+fuel);
        int i=0;
        int i1=abs(i0);
if (i1<=fuel)
{i=i1;
fuel = fuel - i1;
System.out.println("goForward1 step:"+i+", fuel:"+fuel);
}
else
{i=fuel;
fuel = 0;
    System.out.println("goForward2 step:"+i+", fuel:"+fuel);
};
        if (i0<0)
        {i=-i;} else
        {i=i;}
        switch (this.z) {
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
        System.out.println("The Tank is at " + x + ", "+y+" now."/*+ fuel*/);
    }


    public void goBackward(int i0) {
        System.out.println("goBackward0 step0:"+i0+", fuel0:"+fuel);
        int i=0;
        int i1=abs(i0);
        if (i1<=fuel)
        {i=i1;
            fuel = fuel - i;
            System.out.println("goBackward1 step:"+i+", fuel:"+fuel);
        }
        else
        {i=fuel;
            fuel = 0;
            System.out.println("goBackward2 step:"+i+", fuel:"+fuel);
        };
        if (i0<0)
        {i=i;} else
        {i=-i;}
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
        System.out.println("BAckForward step:"+i+", fuel:"+fuel);
 //       goForward(-i0);
    }
}