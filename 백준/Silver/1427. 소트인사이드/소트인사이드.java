import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] strs = br.readLine().split("");
    int length = strs.length;
    int[] arr = new int[10];
    for (int i = 0; i < length; i++) {
      arr[i] = Integer.valueOf(strs[i]);
    }

    for (int i = 1; i < length; i++) {
      int selectedIndex = i;
      for (int j = selectedIndex - 1; j >= 0; j--) {
        if (arr[selectedIndex] > arr[j]) {
          int temp = arr[selectedIndex];
          arr[selectedIndex] = arr[j];
          arr[j] = temp;
          selectedIndex--;
          continue;
        }
        break;
      }
    }

    for (int i = 0; i < length; i++) {
      System.out.print(arr[i]);
    }

    br.close();
    bw.flush();
    bw.close();
  }
}