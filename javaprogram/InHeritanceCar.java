package javaprogram;

public class InHeritanceCar  extends InHeritanceVehicle {
	
		
		
		private String bodystyle; 
		
		public InHeritanceCar(String make, String color,int year,String model,String bodystyle) {
			super(make,color,year,model);
			this.bodystyle=bodystyle;

		}

		public void carDetails()
		{
			super.printDetails();
			System.out.println("bodystyle:"+bodystyle);

		}
	

		

		public static void main(String[] args) {
			InHeritanceCar elantrasedan=new InHeritanceCar("hyundai","red",2019,"elantra","sedan");
			elantrasedan.carDetails();

			// TODO Auto-generated method stub
		}


}


