package Challenge82;

public class Test {
    public static void main(String[] args) {
        ArrayOperations test = new ArrayOperations(new int[]  {1,3,65,2});
    ArrayOperations.statistics StatsInner = test.new statistics();
        System.out.println(StatsInner.mean());
    }
}
