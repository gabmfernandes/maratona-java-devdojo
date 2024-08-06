package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais {
    public static void main(String[] args) {
        int[][] array = new int[3][];

        array[0] = new int[2]; // array[0] = new int[]{1,2};
        array[1] = new int[3];
        array[2] = new int[6];

        int[][] arrayInt2 = {{1,2},{4,5,6},{0,9,8,7,3}};




        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }
        System.out.println("----------------------");
        for(int[] dados: arrayInt2){
            for(int num: dados){
                System.out.print(num+" ");
            }
            System.out.println("\n");
        }
    }
}
