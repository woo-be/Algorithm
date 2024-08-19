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
    arr[0] = Integer.parseInt(br.readLine());
    int length = 1; // 배열의 길이

    for (int i = 0; i < n - 1; i++) {
      int input = Integer.parseInt(br.readLine());
      boolean b = false; // 입력받은 수가 배열의 있는 수보다 클 경우 true, 아니면 false
      for (int j = 0; j < length; j++) {
        if (input < arr[j]) {
          // 배열의 가장 뒤부터 1씩 뒤로 밀기, 입력받은 수보다 큰 수들만 밀기.
          for (int k = 0; k < length - j; k++) {
            arr[length - k] = arr[length - k - 1];
          }

          arr[j] = input;
          length++;
          b = true;
          break;
        }
      }
      if (!b) { // false면 배열의 끝에 입력값을 넣음.
        arr[length] = input;
        length++;
      }
    }

    for(int i : arr) {
      bw.write(String.valueOf(i));
      bw.write("\n");
    }

    bw.flush();
    bw.close();
    br.close();

  }

}
