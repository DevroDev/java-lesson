public class TestInher
{
	public static void main(String args[]){
		Clone c=new Clone();
		System.out.println ("Parent value is:" +c.getvalue());
		
		Quarter q=new Quarter();
		System.out.println ("Child value is:" +q.getvalue());
	}
}
class Clone{
	int value;
	public int getvalue(){return value;}
}
class Quarter extends Clone{
	public Quarter(){value =25;
	}
}