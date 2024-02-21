public class Book{
	private String title;
	private String author;
	private boolean hardcover; 
	private double price;
	private int numberOfPages;
	private int timeReads;
  
    public Book(String title, String author, boolean hardcover, double price, int numberOfPages){
	  this.title = title;
	  this.author = author;
	  this.hardcover = hardcover;
	  this.price = price;
	  this.numberOfPages = numberOfPages;
  }
public void read(){
    this.numberOfPages +=1;	
  }
public int getReadTimeInMinute(){
    timeReads = (int) Math.ceil(numberOfPages / 0.8);
	return timeReads;
  }
public String getReadTimeMessage(){
    if(timeReads < 60){
		return "You can read this";
	} else if(timeReads >= 60 && timeReads <= 240){
		return "Are you sure you want to read this now ?";
	} else {
	    return "You should not start reading this right now";
	}
 }
 
 @Override
public String toString() {
     return "Read{" + 
	 "title=" + title + "," + "opening time=" + timeReads + '}';	 
  }
  
public static void main(String[] args){
     Book reader1 = new Book("Lord of the Rings", "Charlie", true, 12, 11);
	 System.out.println(reader1);
	 System.out.println("Read time: " + reader1.getReadTimeInMinute() + " minutes");
	 System.out.println("Message: " + reader1.getReadTimeMessage());
  }
}  