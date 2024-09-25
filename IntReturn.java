public class IntReturn {
    public void wantCoffee() {
        System.out.println("I like to have coffee");
    }

    public int wantACandy(int a, int b) {
        if (a > b)
         return 0;
        return 1;

    }

    public static void main(String[] args) {
        IntReturn obj = new IntReturn();
        obj.wantCoffee();
        int x = obj.wantACandy(55, 10);
        System.out.println(x);
    }
}
