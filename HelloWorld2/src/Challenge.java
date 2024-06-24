public class Challenge {
    public static void main(String[] args) {
        double first = 20.00;
        double second = 80.00;
        double third = (first+second)*100.00;
        double fourth = third % 40.00; //10_000:40 = 1000:4 = 250 

        boolean fifth = fourth == 0.00 ? true : false;

        System.out.println("Boolean variable's value is: " + fifth);

        if (!fifth)
            System.out.print("got some remainder");

    }

}
