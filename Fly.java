public class Fly extends Super {
    private int z;
    private int y;

    public Fly() {
        this(0);
        System.out.println("here?");
    }

    public Fly(int n) {
        //System.out.println();
        //System.out.printf("x: %d , z: %d , y: %d , n: %d\n",x,z,y,n);
        z = x + y + n;
        System.out.println(" fly times " + z);
    }

    public static void main(String[] args) {
        Duper d = new Duper();
        int delta = 1;
        Fly f = new Fly(delta);
}
}