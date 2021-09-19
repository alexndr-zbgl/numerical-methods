
public class Lab1 {


     static class TaskOne{

        public static int n;

        public double Dob(){
            double p = 1;

            for (double i = 1; i < n; i++) {

                p *= i / (i + 1);
            }
            return p;
        }


        public double Dobby(){
            double p = 1;
            for (double i = n; i > 1; i--){

                p*= (i-1)/i;
            }

            return p;
        }

    }


    static class TaskTwo{

        public static int n;


        public double Dob(){
            double p = 1;

            for (double i = 0; i < n; i++) {

                p *= Math.pow(2, i)/Math.pow(2, i+1);
            }
            return p;
        }


        public double Dobby(){
            double p = 1;
            for (double i = n; i > 0; i--){

                p*= Math.pow(2, i-1)/Math.pow(2, i);
            }

            return p;
        }

    }




    public static void main(String[] args) {

        TaskOne t = new TaskOne();
        t.n = 10000;

        TaskTwo two = new TaskTwo();
        two.n = 1000;

        System.out.println("p1 " + t.Dob());
        System.out.println("p2 " + t.Dobby());

        System.out.println("p1 " + two.Dob());
        System.out.println("p2 " + two.Dobby());
    }

}
