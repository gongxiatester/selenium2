
public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Bar a=new Bar();
      try {
		a.Enter(19);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
	}

}
class Bar{
	
	public void Enter(int a) throws Exception{
		
		if (a>18)
		{
		throw new exc("aaa");
		}
		else{
			System.out.println(a);}

	}
	
}
class exc extends Exception{
	
	public String message;
	public exc(String message){
		
		this.message=message;
		
	}
	public String getMessage(){
		
		return message;
		
	}
	
	
}