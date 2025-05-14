package JavaFileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {

        try {
            File myfile = new File("Monika.txt");
            if (myfile.createNewFile()) {
                System.out.println("Successsfully created " + myfile.getName());
            } else {
                System.out.println("File already exists");
            }

            if(myfile.exists()){
                System.out.println("can we write " +myfile.canWrite());
                System.out.println("can we read : "+ myfile.canRead());
                System.out.println("Length of the file: "+myfile.length());
                System.out.println("path of the file: "+myfile.getAbsolutePath());
                System.out.println("paht : "+myfile.getPath());
                System.out.println("name of file: "+myfile.getName() );
            }else{
                System.out.println("GO to home");
            }

//            FileWriter write = new FileWriter("Monika.txt");
//            write.write("Java file handling is fun in learing but it is same dificult to manage");
//            write.close();
//            System.out.println("Successsfully written into the file");


            Scanner read = new Scanner(myfile);
while (read.hasNextLine()){
    String readData = read.nextLine();

    System.out.println(readData);
}

//            System.out.println("what is this");
            read.close();
        } catch (IOException e) {
            System.out.println("Error while creating the file");
            e.printStackTrace();
        }
    }
}


/*
File class in java with java.io package allow us to work with file
file obj = new file(filename);
if(obj.createNewFile()){
sout (new file created)

 */
