public class HelperArray {

    public static double HarmonicAvarage(double[] arr){

        double sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += 1/arr[i];
        }
        return sum/arr.length;
    }
}
