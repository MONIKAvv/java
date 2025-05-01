public class reverse {
    public static void main(String [] args){
//         reverse of the given number
        int num = 1233456;
        System.out.println("The number is " + num);
        int reverse = 0;
        while(num>0){
            int remainder = num%10;
            reverse = reverse * 10 +remainder;
            num = num/10;
        }
        System.out.println("The reverse of the number is " + reverse);
    }
}
