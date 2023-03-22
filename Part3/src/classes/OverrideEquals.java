package classes;

import java.util.Objects;

public class OverrideEquals 
{
	int a;

	public OverrideEquals(int a) {
		super();
		this.a = a;
	}

	/*
	 * @Override
	public int hashCode() {
		return Objects.hash(a);
	}
	*/

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OverrideEquals other = (OverrideEquals) obj;
		return a == other.a;
	}
	
	
	

}
