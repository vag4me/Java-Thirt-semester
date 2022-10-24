import java.util.Scanner;

class questions 
{
    questions()
    {
        System.out.println("Welcome to the EU quiz!");
    }
    
	void show_first_que()
    {
        System.out.println("How many countries in the EU?");
    }
    
    void show_second_que()
    {
        System.out.println("When did Greece joined the EU?");
	}
    
    void show_third_que()
    {
        System.out.println("When the EU was formally established? ");
	}
}

class valid 
{
    int f,s,t;
    int sco = 0;
    valid(int first,int second,int third)
    {
        f = first;
        s = second;
        t = third;
    }
    int score()
    {
        if(f == 27)
        {
            sco = sco + 1;
		}
        if(s == 1981)
        {
            sco = sco +1;
		}
        if(t == 1957)
        {
            sco = sco + 1;
        }
        return sco;
	}
}    

public class quiz 
{
    public static void main(String[] args)
    {
        int first,second,third;
        int total;
        Scanner output = new Scanner(System.in);
        questions obj1 = new questions();
        obj1.show_first_que();
        first = output.nextInt();
        obj1.show_second_que();
        second = output.nextInt();
        obj1.show_third_que();
        third = output.nextInt();
        valid obj2 = new valid(first,second,third);
        total = obj2.score();
        System.out.println("Your score is: " + total +"/3");
    }
}    
