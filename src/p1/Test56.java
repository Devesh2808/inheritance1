package p1;
interface i1{

}
interface i2 extends i1{

}
interface i3 extends i2{

}


class OverDemo
{
    public void m1(i1 obj1)
    {
        System.out.println("hello");
    }
    public void m1(i2 obj1)
    {                                                   //default value 0f ALL PRiMITiVE ddata type is null
        System.out.println("gla");
    }
    public void m1(i3 obj1)
    {                                                   //default value 0f ALL PRiMITiVE ddata type is null
        System.out.println("welcome");//this will print in output

    }
}

public class Test56 {
    public static void main(String[] args) {
     // new OverDemo().m1(null) ;            //no name object known as anonymous object
    OverDemo obj5=null;
    }

}
