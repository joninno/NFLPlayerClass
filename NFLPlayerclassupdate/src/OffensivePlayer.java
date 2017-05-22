import java.util.Random;

public class OffensivePlayer extends NFLPlayer implements Celebrator 
{
		
		private double passing;
		private double rec;
		private double passingAvg;
		private double rushing;
		private double rushingAvg;
		private double rushingAttempts;
		private double td;
		private String position;
		
	//	OffensivePlayer(String name, int age, int number, String team, float height, float weight, String category, double passing,
	//	double rec, double passingAvg, double rushing, double rushingAvg, double rushingAttempts, double td, String position) 
		
OffensivePlayer(String name, int age, int number, String team, double height, int weight, String category,String position,  
		
		int passing,double passingAvg, int rushingAttempts,  double rushing,double rushingAvg, double td,double rec)
	

		
		
		
		
		{
			super(name, age, number, team, height, weight, "off");
			this.setPassing(passing);
			this.setRec(rec);
			this.setPassingAvg(passingAvg);
			this.setRushing(rushing);
			this.setRushingAvg(rushingAvg);
			this.setRushingAttempts(rushingAttempts);
			this.setTd(td);
			this.setPosition(position);
		}
		
		

		public String celebrate() 
		{
			int r = new Random().nextInt(4);
			String message = "";
			switch(r)
			{
			case 0: message = " Points his finger to the sk";
        	break;
		case 1: message = " Throwing up the peace sign";
    		break;
		case 2: message = " Moonwalks 5 pace and does a back flip";
    		break;
		case 3: message = " Points his finger to the sky";
    		break;
		case 4: message = " The Tim Tebow kneeling bobblehead";
	        		break;
			}
			
			
			return message;
			}

		

		public double getPassing() 
		{
			return passing;
		}


		
		public void setPassing(double passing) 
		{
			this.passing = passing;
		}

		

		public double getRec() 
		{
			return rec;
		}

		

		public void setRec(double rec) 
		{
			this.rec = rec;
		}

		

		public double getPassingAvg() 
		{
			return passingAvg;
		}

		

		public void setPassingAvg(double passingAvg) 
		{
			this.passingAvg = passingAvg;
		}

		

		public double getRushing() 
		{
			return rushing;
		}

		

		public void setRushing(double rushing) 
		{
			this.rushing = rushing;
		}

		

		public double RushingAvg() 
		{
			return rushingAvg;
		}

		

		public void setRushingAvg(double rushingAvg) 
		{
			this.rushingAvg = rushingAvg;
		}

		

		public double getRushingAttempts() 
		{
			return rushingAttempts;
		}

		

		public void setRushingAttempts(double rushingAttempts) 
		{
			this.rushingAttempts = rushingAttempts;
		}


		
		public double getTd() 
		{
			return td;
		}

		

		public void setTd(double td) 
		{
			this.td = td;
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