import java.util.Random;

public class DefensivePlayer extends NFLPlayer implements Celebrator 
{
	
	private double tackles;
	private double ast;
	private double comb;
	private double sacks;
	private double inter;
	private String position;
	
	
	
	
	DefensivePlayer(String name, int age, int number, String team, String position, double height, int weight, String category,  int comb, int tackles,
	int ast, double d, double inter) 
	{
		super(name, age, number, team, height, weight, "def");
		this.setTackles(tackles);
		this.setAst(ast);
		this.setComb(comb);
		this.setSacks(d);
		this.setInter(inter);
		this.setPosition(position);
	}
	
	
	

	




	public String celebrate() 
	{
		int r = new Random().nextInt(4);
		String message = "";
		switch(r){
		case 0: message = " The Tim Tebow kneeling bobblehead";
    	break;
	case 1: message = " Moonwalks 5 pace and does a back flip";
		break;
	case 2: message = " Throwing up the peace sign";
		break;
	case 3: message = " Give his friends a high five";
		break;
	case 4: message = " Points his finger to the sky";
        		break;
		}
		return message;
		}




	public double getTackles() 
	{
		return tackles;
	}


	
	public void setTackles(double tackles) 
	{
		this.tackles = tackles;
	}


	
	public double getAst() 
	{
		return ast;
	}

	
	
	public void setAst(double ast) 
	{
		this.ast = ast;
	}


	
	public double getComb() 
	{
		return comb;
	}


	
	public void setComb(double comb) 
	{
		this.comb = comb;
	}

	
	
	public double getSacks() 
	{
		return sacks;
	}


	
	public void setSacks(double sacks) 
	{
		this.sacks = sacks;
	}


	
	public double getInter() 
	{
		return inter;
	}

	
	
	public void setInter(double inter) 
	{
		this.inter = inter;
	}


	
	
	public String getPosition() 
	{
		return position;
	}

	
	
	public void setPosition(String position) 
	{
		this.position = position;
	}

}	