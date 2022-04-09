package S106N1Ex3;

public class GenericMethodsEx3 <T>{
    public void f(T obj1, int cash, T obj2){ //Order matters
        System.out.println("\n"+obj1+" "+cash+" "+obj2+". ");
        System.out.println("\n"+obj2+" "+cash+" "+obj1+". ");//You can change the order here. :)
    }


}

