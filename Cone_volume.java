package cone;
/*
 * A java program that calculates volume  of a circula cone
 * Mathematical formula is : V = pi*r^2*(h/3)
 * 
 * */
public class Cone_volume {
	

		public double radius = 4;
		public int height= 4 ;
		
		public Cone_volume() {
					
		}
		public Cone_volume(double radius) {
			this.radius = radius;
			
		}
		public Cone_volume(int height) {
			this.height = height;
			
			
		}
		public double getVolume() {
			
		double volume = Math.PI * radius*radius * height/3 ;
			
			return volume;
		}	
	}


