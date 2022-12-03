import java.util.Scanner;

public class Prep
{
    public static void main(String[] args)
    {
        add[] num = new add[5];
        
        num[0] = new add(1,2);
        num[0].show();
        
    } 
}

class add
{
    int x,y;
    public add(int x,int y)
    {
        this.x = x;
        this.y = y;
    }
    public void show()
    {
        System.out.println(x+y);
    }
}
