package stringPrograms;
public class YUga 
{   
	private int eid;
	private double esal;
	private String ename;
	private YUga(int eid, double esal, String ename) {
		this.eid = eid;
		this.esal = esal;
		this.ename = ename;
	}
	public String toString()
	{
		return ename;
	}
	public int hashCode()
	{
		return eid;
	}
	public boolean equals (Object o1)
	{
	  YUga e= (YUga) o1;
	  return this.esal==e.esal;
	}
	public static void main(String[] args) 
	{
	YUga y=new YUga(100,666,"Leo");
	YUga g=new YUga(400,777,"HJO");
	System.out.println(g);
	System.out.println(y.hashCode());
	System.out.println(g.hashCode());
	System.out.println(y.equals(g));
	

	}

}
