package sofe.exercise1;

public class ContinuousArray {

    public static boolean isAlmostIncreasingSequence(int[] sequence) {
        boolean bandera = true;
        boolean bandera2 = false;
        for (int i = 0; i < sequence.length - 1; i++) {

            if (sequence[i] < sequence[i + 1]) {
                bandera = true;

            } else {
                if (bandera2) {
                    bandera = false;
                    break;
                } else {
                    bandera = false;
                    bandera2=true;
                }
            }
        }

        return bandera;

    }

}
