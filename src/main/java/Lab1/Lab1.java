package Lab1;

public class Lab1 {


     public static class TaskOne{

        public static int n;

        public double Dob(){
            double p = 1;

            for (double i = 1; i < n; i++) {

                p *= i / (i + 1);
            }
            return p;
        }


        public float Dobby(){
            float p = 1;
            for (float i = n; i > 1f; i--){

                p*= (i-1)/i;
            }

            return p;
        }

    }


    public static class TaskTwo{

        public static int n;


        public double Dob(){
            double p = 1;

            for (double i = 0; i < n; i++) {

                p *= Math.pow(2, i)/Math.pow(2, i+1);
            }
            return p;
        }


        public float Dobby(){
            float p = 1f;
            for (float i = n; i > 0f; i--){

                p*= Math.pow(2, i-1)/Math.pow(2, i);
            }

            return p;
        }

    }
}
