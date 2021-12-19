class GirlsMarriage{
	boolean Marriage=true;

	public boolean shouldIMarry(String job,String face,String background) {
		
		if(job== "Government Job" && face=="Handsome" && background=="rich" )
			return Marriage;
		else
			return !Marriage;
	}
}

public class Girls{
	public static void main(String args[]) {
		String job=" No Government Job";
		String face="Handsome";
		String background="rich";
		GirlsMarriage young = new GirlsMarriage ();
		boolean result = young.shouldIMarry(job,face,background);
		System.out.println(result);
		
	}
}