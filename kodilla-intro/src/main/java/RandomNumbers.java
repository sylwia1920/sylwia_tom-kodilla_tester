import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        RandomNumbers();
    }
    static int max = 0;
    static int min = 0;

    public static int[] RandomNumbers() {
        int[] result = new int[2];
        Random random = new Random();
        int sum = 0;
        while (sum < 5000) {
            int num = random.nextInt(31);
              System.out.println(num);
            sum += num;
            int min = znajdzMin(num);
            result[0] = min;
            int max = znajdzMax(num);
            result[1] = max;
        }
             System.out.println(sum);
        return result;
    }

    public static int znajdzMax(int number) {
        if (number > max) {
            max = number;
        }
        return max;
    }

    public static int znajdzMin(int number) {
        if (number < min) {
            min = number;
        }
        return min;
    }
}

/*public int getCountOfRandomNumber(int max) {
  Random random = new Random();
  int result = 0;
  int sum = 0;
  while (sum < max) {
    int temp = random.nextInt(10);
    sum = sum + temp;
    result++;
  }
  return result;
}
*/
