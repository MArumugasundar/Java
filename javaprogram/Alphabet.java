package javaprogram;

public class Alphabet {
	static String getAlphaNumericString(int n) {
	  String AlphaNumericString="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	+"0123456789"
			  +"abcdefghijklmnopqrstuvwxyz";
	  StringBuilder sb=new StringBuilder(n);
	  for(int i=0;i<n;i++) {
		  int index=(int)(AlphaNumericString.lengeth()*Math.random());
		  sb.append(AlphaNumericString.charAt(index));
	  }
	}

	public static void main(String[] args) {
		int n=20;
		System.out.println(RandomString.getAlphaNumericString(n));
		// TODO Auto-generated method stub

	}

}
