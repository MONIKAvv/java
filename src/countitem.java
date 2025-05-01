public class countitem {
    public static void main(String [] args){
//        Count the number of accurances from the given big number;
        int count = 0;
        int num = 12344343;
        while(num>0){
            int remainder = num%10;
            if(remainder == 4){
                count ++;
            }
            num = num/10;
        }
        System.out.println("Number if occureance of 4 is ");
        System.out.println(count);
    }
}
