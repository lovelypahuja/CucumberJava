package SeleniumSessions;



class Ab extends B
{

//Constructor of A
Ab()
{
System.out.println("Constructor of class A is called");
}

//Static initialization block of A
static
{
System.out.println("A class is loaded");
}


//Instance initialization block of B
{
//Compiler makes an automatic call to superclass constructor, by calling super() here.
System.out.println("An object of A is being created"); 
}


public static void main(String[] args) 
{
Ab ob= new Ab();
}

}

class B
{

//Constructor of B
B()
{
System.out.println("Constructor of B class is called");
}


//Static initialization block of B
static 
{
System.out.println("B class is loaded");
}

}
