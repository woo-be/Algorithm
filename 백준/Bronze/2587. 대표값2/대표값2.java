import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int[] arr = new int[5];
    int sum = 0;
    for (int i  = 0; i < 5; i++) {
      arr[i] = Integer.valueOf(br.readLine());
      sum += arr[i];
    }

    boolean b = true; // 배열이 정렬되었는지, 초기값을 true
    while(b) { // 배열이 정렬될 때 까지 무한 반복
      b = false;
      for (int i = 0; i < 4; i++) { // 배열의 앞부터 그 다음 값과 비교하여 정렬
        if (arr[i] > arr[i+1]) {
          int temp = arr[i];
          arr[i] = arr[i+1];
          arr[i+1] = temp;
          b = true;
        }
      }
    }

    bw.write(String.valueOf(sum / 5)); // 평균
    bw.newLine();
    bw.write(String.valueOf(arr[2])); // 중간 값

    bw.flush();
    bw.close();
    br.close();
  }
}