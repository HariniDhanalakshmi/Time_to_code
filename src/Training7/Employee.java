package Training7;

public class Employee {
    int eid = 10;
    public int hashCode(){
        return eid;
    }
}
class Employee2{
    int eid=20;
    @Override
    public int hashCode(){
        return eid;
    }
}


