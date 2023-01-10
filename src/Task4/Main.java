package Task4;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        int[][] array = new int[n][n];
        int[] diagonal = new int[n];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
                diagonal[i] = array[i][n - 1 - i];
                System.out.printf("%3d", array[i][j]);
            }
            System.out.println();
        }
        System.out.print("Побочная Диагональ = ");
        for (int i = 0; i < diagonal.length; i++) {
            System.out.printf("%2d", diagonal[i]);
        }

        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (diagonal[i] < min) {
                min2 = min;
                min = diagonal[i];
            } else if (diagonal[i]<min2 && diagonal[i] != min) {
                min2=diagonal[i];
            }
        }
        System.out.println(" ");

        if (array[2][2] == min) {
            System.out.println(min2);
        } else System.out.println(min);
    }
}

