import java.util.Scanner;
import java.io.* ;
import java.io.File;  // Import the File class
import java.io.IOException; 

public class world
{
    public static void main(String[] args)
    {
        try{
            FileWriter obj = new FileWriter("filename.txt");
            File obj2 = new File("Filename1.txt");
            Scanner input = new Scanner(obj2);
            while(input.hasNextLine())
            {
                String data = input.nextLine();
                obj.write(data);
            }
            obj.close();
        }
        catch(IOException ioexc)
        {
            System.out.println("Smth went wrong");
        }
    }
}
