public class condition {
    public static void main(String [] args){
//        if else statements
        int salary = 1000;
//        if(salary>=10000){
//            salary = salary+300;
//        }else {
//            salary= salary+ 90;
//        }
        if(salary>100000){
            salary += 489;
        } else if (salary<= 23545) {
            salary -= 90;

        }else {
            salary = salary+90;
        }
        System.out.println(salary);
    }
}
