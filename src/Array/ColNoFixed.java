package Array;

public class ColNoFixed {
    public static void main(String [] args){
//        printing the array matrix
        int [][] array = {{1,2,3}, {4,5}, {6,7,8,9}};
        System.out.println("Printing the array elements");
        for (int row = 0; row < 3; row++){
            for (int col = 0; col < array[row].length; col++){
                System.out.print(array[row][col] + " ");
            }
            System.out.println();
        }
    }
}
