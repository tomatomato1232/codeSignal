public class BoxBlur {

    int[][] solution(int[][] image) {

        int hLen = image.length;
        int vLen = image[0].length;
        int[][] ansList = new int[hLen - 2][vLen - 2];

        for (int i = 0; i + 2 < hLen; i++) {
            for (int j = 0; j + 2 < vLen; j++) {
                ansList[i][j] = distortInputImage(image, i, j);
            }
        }
        return ansList;
    }

    public int distortInputImage(int[][] image, int i, int j) {
        int sum = 0;
        for (int k = 0; k < 3; k++) {
            for (int l = 0; l < 3; l++) {
                sum += image[i + k][j + l];
            }
        }
        return sum / 9;
    }

}