import java.util.Scanner;

public class App 
{
    public static void main(String[] args)
    {
        char[] arr; 
        board obj1 = new board();
        player obj2 = new player(); 
        check obj3 = new check();
        int re = 3;
        while(re == 3)
        {
            int ch;
            System.out.println("Player 1 ");
            ch = obj2.take();
            obj1.add_player1(ch);
            obj1.show();
            arr = obj1.returnTable();
            re = obj3.checkTable(arr);
            if(re == 1)
                System.out.println("PLayer 1 is Winner");
            if(re == 3)
            {
                System.out.println("Player 2 ");
                ch = obj2.take();
                obj1.add_player2(ch);
                obj1.show();
                arr = obj1.returnTable();
                re = obj3.checkTable(arr); 
                if(re == 2)
                    System.out.println("PLayer 2 is Winner");
            }
        }
    }
}

class board
{

    char[] table = new char[]{'-','-','-','-','-','-','-','-','-'};

    board()
    {
        for(int i = 0; i < 3; i++)
            System.out.println( "-" + "|" + "-" + "|" + "-");
    }

    void add_player1(int x)
    {
        table[x] = 'X';
    }

    void add_player2(int y)
    {
        table[y] = 'O';
    }

    void show()
    {
        for(int i = 0; i <= 8; i++ )
            if(i == 2 || i == 5)
                System.out.println(table[i] + "|");
            else 
                System.out.printf(table[i] + "|");    
    }

    char[] returnTable()
    {
        return table;
    }
}

class player 
{
    int  take()
    {
        int ch;
        Scanner input = new Scanner(System.in);
        do{
            ch = input.nextInt();
        }
        while(ch <0 || ch > 8);
        return ch;
    }
}

class check
{
    int checkTable(char[] array)
    {
        int countx = 0;
        int counto = 0; 
        if(array[0] == 'X' && array[1] == 'X' && array[2] == 'X')
            return 1;
        else if(array[3] == 'X' && array[4] == 'X' && array[5] == 'X')
            return 1;
        else if(array[6] == 'X' && array[7] == 'X' && array[8] == 'X')  
            return 1;     
        else if(array[0] == 'X' && array[3] == 'X' && array[6] == 'X')  
            return 1;
        else if(array[1] == 'X' && array[4] == 'X' && array[7] == 'X')   
            return 1;
        else if(array[2] == 'X' && array[5] == 'X' && array[8] == 'X') 
            return 1;
        else if(array[0] == 'X' && array[4] == 'X' && array[8] == 'X')
            return 1;
        else if(array[2] == 'X' && array[4] == 'X' && array[6] == 'X')
            return 1;  // telos
        else if(array[0] == 'O' && array[1] == 'O' && array[2] == 'O')
            return 2;
        else if(array[3] == 'O' && array[4] == 'O' && array[5] == 'O')
            return 2;
        else if(array[6] == 'O' && array[7] == 'O' && array[8] == 'O')  
            return 2;     
        else if(array[0] == 'O' && array[3] == 'O' && array[6] == 'O')  
            return 2;
        else if(array[1] == 'O' && array[4] == 'O' && array[7] == 'O')   
            return 2;
        else if(array[2] == 'O' && array[5] == 'O' && array[8] == 'O') 
            return 2;
        else if(array[0] == 'O' && array[4] == 'O' && array[8] == 'O')
            return 2;
        else if(array[2] == 'O' && array[4] == 'O' && array[6] == 'O')
            return 2;   
        else 
            return 3;                                     
    }

}
