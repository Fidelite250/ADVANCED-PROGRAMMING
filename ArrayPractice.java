public class ArrayPractice {
    public static void main(String[] args) {
        int[] oneD = {1, 2, 3, 4, 5};

        System.out.println("One-dimensional array:");
        for (int num : oneD) {
            System.out.println(num);
        }
        
        int[][] twoD = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println("\nTwo-dimensional array:");
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                System.out.println(twoD[i][j]);
            }
        }
    }
}
