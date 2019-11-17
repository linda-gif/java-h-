
//public class Hero {
//	String name;
//	float HP;
//	float armor;
//	int speed;
//	
//	public Hero(String heroName,float heroHP,float heroArmor,int heroMoveSpeed) {
//		name=heroName;
//		HP=heroHP;
//		armor=heroArmor;
//		speed=heroMoveSpeed;
//	}
//	  public static void main(String[] args) {
//	        Hero h =  new Hero("¸ÇÂ×",333,11,89); 
//	        System.out.println(h.name + h.HP + h.armor + h.speed);
//	    }
//	     
//}
public class Hero {
	String name;
	float HP;
	float armor;
	int speed;
	
	public Hero(String name,float HP,float armor,int speed) {
		this.name=name;
		this.HP=HP;
		this.armor=armor;
		this.speed=speed;
		
	}
	  public static void main(String[] args) {
	        Hero h =  new Hero("¸ÇÂ×",333,11,89); 
	        System.out.println(h.name + h.HP + h.armor + h.speed);
	    }
	     
}