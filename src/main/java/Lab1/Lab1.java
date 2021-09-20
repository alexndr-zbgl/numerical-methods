
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






}
