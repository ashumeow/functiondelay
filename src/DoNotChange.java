import java.lang.*;

public class DoNotChange{

    public DoNotChange(Class2 obj)
    {
        Class2 objClass2 = new Class2(obj);
    }
}

// Calling Class2 from Class1 without creating new object
class Class1{
    private final Class2 obj;
    public Class1(Class2 obj)
    {
        this.obj = obj;
    }
}

class Class2{
    public Class2(Class2 obj)
    {
        System.out.println("Testing...");
    }
}