package AdvanceJava;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Monika", Pattern.CASE_INSENSITIVE);
//        Pattern pattern = Pattern.compile(0-9);
//        creation of pattern
        System.out.println("Enter what you want to search for");
        Scanner in = new Scanner(System.in);
        String input = in.next();
        Matcher matcher = pattern.matcher(input);
        Boolean matchfound = matcher.find();
        if(matchfound){
            System.out.println("Search Pattern founds: "+pattern);
        }else {
            System.out.println("Not found ");
        }

    }

}
/*
Java Regular Expression:- Regular Expressions are the "sequence of characters that forms a search pattern", (Whenever we want to search for any data in a text,
then, we can use search pattern to describe what you are searching for)
                          REgular Expression could be a single character or complex pattern
                          Regular Expression used to perform text search and text replace Operations
                          Regular Expression has some classes called 1. Pattern class 2. matcher class 3. PatternSyntaxException class

steps to sesarch for a pattern
1. creation of pattern using patter.compile(Two arguments)
2. match the created pattern with matcher class object and inset input from where to search
3. return flag as boolean to find wheather the search data has found or not using find();

 */