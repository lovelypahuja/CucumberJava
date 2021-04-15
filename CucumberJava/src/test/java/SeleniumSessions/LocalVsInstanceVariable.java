package SeleniumSessions;

public class LocalVsInstanceVariable {
	//static
	//{System.out.println("I am a static block");}
	
	//LocalVsInstanceVariable(){
		////System.out.println("i m a constructor");
	//}
	
	//{System.out.println("instance Block");}
	
	public void GetMarks(){ int maths=10; int physics=20; int chemistry=30;
	 System.out.println(maths+physics+chemistry); }

	public static void main(String[] args) {
		LocalVsInstanceVariable s= new LocalVsInstanceVariable();
		//s.GetMarks();
		GetMarkss obj = new GetMarkss();
		//System.out.println(obj.maths);
		
		
	}
}
	
	
	
	 
	
	 class GetMarkss{
		int maths=10;
		int physics=20;
		int chemistry=30;
	}

	



