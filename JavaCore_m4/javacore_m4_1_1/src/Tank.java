public class Tank {
    public int x;
    public int y;
    public void goForward(int x1)
    {
        this.x = x+ x1;
    };
    public void goBackward(int x2)
    {
        this.x = x- x2;
    };
    public void printPosition()
    {
        System.out.println("The Tank is at "+x+" now.");
    }
}