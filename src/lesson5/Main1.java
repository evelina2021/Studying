package lesson5;

public class Main1 {
    public static void main(String[] args) {
        int[][] numbers = {{3, 6, 7, 8},
                           {3, 2, 7, 8},
                           {4, 6, 5, 3}};

        System.out.print(numbers[0][0] + " ");
        System.out.print(numbers[0][1] + " ");
        System.out.print(numbers[0][2] + " ");
        System.out.print(numbers[0][3] + " ");
        System.out.println();

        System.out.print(numbers[1][0] + " ");
        System.out.print(numbers[1][1] + " ");
        System.out.print(numbers[1][2] + " ");
        System.out.print(numbers[1][3] + " ");
        System.out.println();

        System.out.print(numbers[2][0] + " ");
        System.out.print(numbers[2][1] + " ");
        System.out.print(numbers[2][2] + " ");
        System.out.print(numbers[2][3] + " ");
        System.out.println();

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                System.out.print(numbers[i][j] + " ");

            }
//            System.out.print(numbers[i][0] + " ");
//            System.out.print(numbers[i][1] + " ");
//            System.out.print(numbers[i][2] + " ");
//            System.out.print(numbers[i][3] + " ");
            System.out.println();

        }
    }
}
