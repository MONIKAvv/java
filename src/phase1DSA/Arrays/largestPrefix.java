class Main{
    public static void main(String[] args){
//        find largest prefix from array of string
//        just like we show integer value through arr[0] , in the same way if
//        there is string in an array it will return the whole string
//        and if we want to access each element of the string then
//        we can do that throught like this arr[0].chatAt(0) right -> it will return the first element of the array

        String []strs = {"Flower", "Flow", "Flit"};
        String result = "";
        for(int i = 0; i < strs[0].length; i++){
            char current = strs[0].charAt(i);
            for(int j = 0; j< strs.length; j++){
                if(i >= strs[j].length()){
                    System.out.println(result);
                }
                if(current != strs[j].chatAt(i)){
                    System.out.println(result);
                }
            }
            result += current;
        }
        System.out.println(result);
    }
}