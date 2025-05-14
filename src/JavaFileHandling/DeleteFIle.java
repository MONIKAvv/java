package JavaFileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DeleteFIle {
    public static void main(String[] args) {
        try {
            File myfile = new File("NewFile.txt");
            if (myfile.createNewFile()) {
                System.out.println("New file crated");

            } else {
                System.out.println("Problem while creating file");
            }

            FileWriter write = new FileWriter(myfile);
            write.write("Hey what is this color called as!");
            write.close();
            Scanner read = new Scanner(myfile);
            while (read.hasNextLine()) {
                String encodeddata = read.nextLine();
                System.out.println(encodeddata);
            }
            read.close();
//we can delete folders as well.....just provide the right path to the myfile object
            if(myfile.delete()){
                System.out.println("File get Deleted: "+myfile.getName());
            }else{
                System.out.println("No such file present ");
            }

        } catch (IOException e) {
            System.out.println("Some error !");
        }


    }
}
