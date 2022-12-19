import java.util.function.ToLongBiFunction;

public class App {
    public static void main(String[] args) throws Exception {
        add obj1 = new add(5,200,4,4);
        obj1.show();
    
    }
}

class car
{
    int portes;
    int rodes;
    public car(int p,int r)
    {
        portes = p;
        rodes = r;
    }
}

class add extends car
{
    int theseis;
    int speed;

    public add(int t,int s,int p,int r)
    {
        super(p, r);
        theseis = t;
        speed = s;
    }

    void show()
    {
        System.out.printf("%d %d %d %d",portes,rodes,theseis,speed);
    }
}
