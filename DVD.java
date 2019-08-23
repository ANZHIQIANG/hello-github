package dome;

public class DVD extends Item {
	private String director;
//	private String title;
//	private int playingTime;
//	private boolean gotIt=false;
//	private String comment;
	public DVD(String title, String director, int playingTime, String comment) {
		super(title,playingTime,false,comment); 
		this.director = director;
//		this.title = title;
//		this.playingTime = playingTime;
//		this.comment = comment;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		byte a=1;
//		byte b=1;
//		int c=a+b;
////		byte b=a+1;
////		 a+=1;
//
//		System.out.println(c);
	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.println("DVD");
		super.print();
		System.out.println(director);
		
	}


	

}
