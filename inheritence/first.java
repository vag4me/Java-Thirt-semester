public class App {
    public static void main(String[] args) throws Exception {
        add obj1 = new add();
        obj1.portes = 4;
        obj1.rodes = 4;
        obj1.theseis = 5;
        obj1.speed = 100;
        obj1.show();
    }
}

class car
{
    int portes;
    int rodes;
}

class add extends car
{
    int theseis;
    int speed;

    void show()
    {
        System.out.printf("%d %d %d %d",portes,rodes,theseis,speed);
    }
}
