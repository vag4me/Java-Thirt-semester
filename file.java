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
            obj.write("Vaggelis\nFor the\nWin");
            obj.close();
        }
        catch(IOException ioex)
        {
            System.out.println("smth went wrong");
        }

        try{
            File obj2 =new File("filename.txt");
            Scanner input = new Scanner(obj2);
            while(input.hasNextLine())
            {
                String data = input.nextLine();
                System.out.println(data);
            }
        }
        catch(IOException IOsx)
        {
            System.out.println("smth went wrong");
        }
    }
}
