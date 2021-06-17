package homework.lesson5;

public class Main1 {
    public static void main(String[] args) {
        int[][] numbers = new int[6][6];
        for (int i = 0; i < numbers.length; i++){
            for (int j = 2; j >= 0; j--){
                if (i>=j){
                        System.out.print(numbers[i][j] + " ");
                }

                for (int a = numbers.length; a > 0; a--){
                    for (int b = 2; b <=0; b++){
                        if (a<=b){
                            System.out.print(numbers[a][b] + " ");
                        }else {
                            System.out.println("  ");


                        }


                    }
                }

            }
            System.out.println();
        }
    }
}

