package p1;



class  one
{
    public int num1=90;

}                                           //we cant directly utilise 'this' in main class
class two extends one{
    public int num1=67;
    public void display()
    {

        System.out.println(num1);//it will print 67,value of its same class
        System.out.println(this.num1);
    }


}
public class Test34 {
    public static void main(String[] args) {                            // we cant use super in main method .


        two obj=new two();
       // obj.display();
        System.out.println(obj.num1);

    }

}
