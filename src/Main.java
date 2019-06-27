public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 8;
        int c = 1;
        double degrees = 4;
        double x = Math.toRadians(degrees);


        if (x > 0) {
            double g = (Math.sin(x)) * (Math.sin(x));
        } else{
            double g = (1 - 2* Math.sin(x*x));
        }


    }
}
