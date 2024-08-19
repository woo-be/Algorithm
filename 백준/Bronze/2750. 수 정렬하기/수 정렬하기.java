import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    int length = 1;
    arr[0] = Integer.parseInt(br.readLine());
    for (int i = 0; i < n - 1; i++) {
      int input = Integer.parseInt(br.readLine());
      boolean b = false;
      for (int j = 0; j < length; j++) {
        if (input < arr[j]) {
          
          for (int k = 0; k < length - j; k++) {
            arr[length - k] = arr[length - k - 1];
          }

          arr[j] = input;
          length++;
          b = true;
          break;
        }
      }
      if (!b) {
        arr[length] = input;
        length++;
      }
    }

    for(int i : arr) {
      System.out.println(i);
    }

    bw.flush();
    bw.close();
    br.close();

  }

}
