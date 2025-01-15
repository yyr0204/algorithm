
import java.io.*;

public class SelectionSort {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("Input Arr: ");
        bw.flush();
        String[] strArr = br.readLine().split(" ");

        int [] arr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }

        int min;
        int tmp;

        for (int i = 0; i < arr.length - 1; i++) {
            min = arr[i];
            tmp = i;
            for (int j = i+1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    tmp = j;
                }

                arr[tmp] = arr[i];
                arr[i] = min;

            }
        }

        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
