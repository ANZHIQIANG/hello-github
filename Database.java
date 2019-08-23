package dome;

import java.util.ArrayList;

public class Database {
//	public ArrayList<CD> listCD = new ArrayList<CD>();
//	public ArrayList<DVD> listDVD = new ArrayList<DVD>();
	private ArrayList<Item> listItem = new ArrayList<Item>();
	
//	public void add(CD cd){
//		listCD.add(cd);
//	}
//	
//	public void add(DVD dvd){
//		listDVD.add(dvd);
//	}
	
	public void add(Item item){
		listItem.add(item);
	}
	
	public void list(){
		
		for(Item item : listItem){
			item.print();
			System.out.println();
		}
//		for(CD cd : listCD){
//			cd.print();
//		}
//		for(DVD dvd : listDVD){
//			dvd.print();
//		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Item item = new Item("a",1,true,"sss");
		
		
		Database db = new Database();
		 
		db.add(new CD("abc","abc",4,60,"..."));
		db.add(new CD("def","def",4,60,"..."));
		db.add(new DVD("xxx","aaa",60,"..."));
		
		db.add(new VideoGame("azq",29,true,"sas",2));
		db.list();
	
	}
}
