package pkg;

public class Employee {
	
	public enum TypeEmployee{Seller, Responsible};
	
	public float calculationNominateGross(TypeEmployee type, float monthlySales, float extraHours) {
		
		float paybase=0, bonuses=0, extras=0;
		
		if(type==TypeEmployee.Responsible)
			paybase=2500;
		else if(type==TypeEmployee.Seller)
			paybase=2000;
		
		if(monthlySales>=1500)
			bonuses=200;
		else if(monthlySales>=1000)
			bonuses=100;
		
		extras=extraHours*30;
		
		return paybase + bonuses + extras;
		
	}
	
	public float calculationNominateNet(float nominateGross) {
		
		float retention=0;
		
		if(nominateGross>=2500)
			retention=0.18f;
		else if(nominateGross>2000)
			retention=0.15f;
		
		return nominateGross*(1-retention);
		
	}
	
}
