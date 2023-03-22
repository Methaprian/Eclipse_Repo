package classes;

public class Book1 
{
	int bid;
	String author;
	double price;
	Book1(){}
	
	public Book1(int bid, String author, double price) {
		super();
		this.bid = bid;
		this.author = author;
		this.price = price;
	}
	
	public int hashCode()
	{
		int hc=0;
		hc=hc+bid;
		hc=hc+author.hashCode();
		hc=hc+(int)price;
		return hc;
		
	}
	
	public boolean equals(Object obj)
	{
		Book1 temp=(Book1)obj;
		if(this.bid==temp.bid && this.author==temp.author && this.price==temp.price)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	

}
