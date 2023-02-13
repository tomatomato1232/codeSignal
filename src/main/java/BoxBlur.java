import java.util.ArrayList;
import java.util.List;

public class BoxBlur {

    int[][] solution(int[][] image) {

        int hLen = image.length;
        int vLen = image[0].length;
        int[][] ansList = new int[hLen - 2][vLen - 2];

        for (int i = 0; i + 2 < hLen; i++) {
            System.out.println(hLen);
            for (int j = 0; j + 2 < vLen; j++) {
                List<Integer> pixelList = new ArrayList<>();
                pixelList.add(image[i][j]);
                pixelList.add(image[i][j + 1]);
                pixelList.add(image[i][j + 2]);
                pixelList.add(image[i + 1][j]);
                pixelList.add(image[i + 1][j + 1]);
                pixelList.add(image[i + 1][j + 2]);
                pixelList.add(image[i + 2][j]);
                pixelList.add(image[i + 2][j + 1]);
                pixelList.add(image[i + 2][j + 2]);

                System.out.println("vLen:" + vLen);
                ansList[i][j] = distortInputImage(pixelList);
            }
        }
        return ansList;
    }

    public int distortInputImage(List<Integer> pixels) {
        return pixels.stream().mapToInt(v -> v).sum() / 9;
    }

}
