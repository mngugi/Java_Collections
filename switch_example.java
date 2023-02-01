public class Main{
enum Foods {
Fruits,
Meat,
Cereals,
Vegitables

}

        public static void main(String[] args){
                Foods food_types = Foods.Meat;
                
                switch(food_types){
                case Fruits:
                        System.out.println("Fruits\n Apple\n Banana\n Oranga\n");
                        break;
                case Meat:
                        System.out.println("Meat\n Pork\n Beef\n Fish\n");
                        break;        
                case Vegitables:
                        System.out.println("Vegis\n Kare\n Cabagges\n Carrots\n");
                        break;  
                }
        
        }
        
        }




