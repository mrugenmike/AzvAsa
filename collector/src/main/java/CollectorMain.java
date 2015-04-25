import java.util.Timer;



public class CollectorMain 
{
	
	public static void main(String[] args){
		
		if(args.length<2)
		{
			System.out.println("Commandline args missing. VMNAME,FilePath");
			return;
		}
		Timer recoveryTimer = new Timer(); 
		Collector collectorTask = new Collector(args[0],args[1]); 
		recoveryTimer.schedule(collectorTask, 0, 5*1000); 

		
	}

}
