package Challenge82;

public class ArrayOperations {
    private int[] numbers;

    public ArrayOperations(int[] numbers) {
        this.numbers = numbers;
    }

    public class statistics{

        double mean(){
            double sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += i;
            }
            return sum/numbers.length;
        }
        private double median(){
            System.out.println();
            return 0;
        }
    }
}
