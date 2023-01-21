import java.util.Scanner;
import java.util.Stack;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

// Import the File class
import java.io.* ;

public class world
{
    public static void main(String[] args)
    {
        try{
            Stack <String> s = new Stack<>();
            FileWriter obj = new FileWriter("filename.txt");
            BufferedWriter writer = new BufferedWriter(obj);
            BufferedReader reader = new BufferedReader(new FileReader("filename1.txt"));
            String data = reader.readLine();

            while(data != null)
            {
                s.push(data);
                data = reader.readLine();
            }
            while(s.size() > 0)
            {
                data = s.pop();
                writer.write(data);
                writer.write("\n");
            }
            writer.close();

        }
        catch(IOException ioexc)
        {
            System.out.println("error");
        }
    }
}
