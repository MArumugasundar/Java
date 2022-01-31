package javaprogram;

public class TestBank {
	public static void main(String[] args) {
		Bank b1;
		 b1=new SBI();
		System.out.println("rate of interest:"+b1.getrateofinterest()+"%");
	    b1=new Pnb();
	    System.out.println("rate of interest:"+b1.getrateofinterest()+"%");
}

}