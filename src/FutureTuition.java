public class FutureTuition {
    public static void main(String[] args) {
        int howManyYrs = 0;
        float tuition = 10000.00f;
        while(tuition < 20000.00){
            tuition = (float) (1.07 * tuition);
            howManyYrs++;
            System.out.println("In " + howManyYrs + " year[s], the tuition has become " + tuition);
        }
    }
}
