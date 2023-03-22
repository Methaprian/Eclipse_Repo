package classes;

public class HashCodeOverride 
{
	int i;

	public HashCodeOverride(int i) {
		super();
		this.i = i;
	}

	@Override //hashCode()
	public int hashCode() 
	{
		int hc=0;
		hc=hc+i;
		return hc;
	}

	@Override //equals()
	public boolean equals(Object o) 
	{
		return this.i==((HashCodeOverride) o).i;
		
	}
	

}
