package p1;

import javax.swing.text.html.parser.TagElement;

public class Emp extends Person {
    int eid;
    int sal;

    public Emp(int eid,int sal,int age,String name)
    {

    super(age,name);//to perform class chaining we use "super paranthesis" and it must be first satate.. in every const.
        this.eid=eid;
        this.sal=sal;

    }

}
