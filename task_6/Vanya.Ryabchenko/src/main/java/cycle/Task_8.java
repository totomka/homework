package cycle;

public class Task_8 {
    public static void main(String[] args) {
        int size = 78;
        int min = minElement(CreateArray(size), size);
        int max = maxElemnt(CreateArray(size), size);
        System.out.println(min);
        System.out.println(max);
        int sum = Sum(minElement(CreateArray(size),size),maxElemnt(CreateArray(size),size),size);
        System.out.println(sum);

    }

    public static int[] CreateArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 34 + 56);
        }
        return array;
    }

    public static int minElement(int[] array, int size) {
        int min = array[0];
        for (int i = 0; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }
        return min;
    }

    public static int maxElemnt(int[] array, int size) {
        int max = array[0];
        for (int i = 0; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    public  static int Sum(int min, int max, int size) {
        int sum = minElement(CreateArray(size),size) + maxElemnt(CreateArray(size), size);
        return sum;
    }
}
