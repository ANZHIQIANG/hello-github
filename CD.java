package dome;

public class CD extends Item {
	private String artist;
	private int numOfTracks;
//	private int playingTime;
//	private boolean gotIt=false;
//	private String comment;
//	
	public CD(String title, String artist, int numOfTracks, int playingTime, String comment) {
		super(title,playingTime,false,comment);
		this.artist = artist;
		this.numOfTracks = numOfTracks;
//		this.title = title;
//		this.playingTime = playingTime;
//		this.comment = comment;
	}

	public static void main(String[] args) {
		CD cd = new CD("asa","sasa",3,21,"dad");
		CD cd1 = new CD("asa","sasa",3,21,"dad");
		System.out.println(cd.equals(cd1));
//		cd.print();
//		String s = "aa"+cd;
//		System.out.println(s);

	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		CD cc = (CD)obj;
		return artist.equals(cc.artist);
	}

	
	@Override
	public String toString() {
		return "CD [artist=" + artist + ", numOfTracks=" + numOfTracks
				+ ", toString()=" + super.toString() + "]";
	}

//	public void print() {
//		System.out.println("CD:"+"《"+title+"》"+" is be played by "+artist);
//		
//	}

}
