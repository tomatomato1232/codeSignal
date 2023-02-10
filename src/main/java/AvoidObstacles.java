import java.util.Arrays;

public class AvoidObstacles {
    int solution(int[] inputArray) {

        Arrays.sort(inputArray);
        int max = inputArray[inputArray.length - 1];
        boolean[] inputList = new boolean[max + 1];

        for (int value : inputArray) {
            inputList[value] = true;
        }

        for (int j = 2; j < max; j++) {
            for (int k = 1; j * k < max + 1; k++) {
                if (inputList[j * k]) {
                    break;
                }
                if (j * (k + 1) > max) {
                    return j;
                }
            }
        }

        return max + 1;
    }
}
