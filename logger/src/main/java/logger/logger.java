package logger;


	

	import java.io.FileDescriptor;
	import java.io.FileOutputStream;
	import java.io.PrintStream;
	import java.util.Scanner;

	import org.apache.logging.log4j.LogManager;
	import org.apache.logging.log4j.Logger;

	public class logger
	{
		private static final logger LOGGER=LogManager.getLogger(logger.class);

		public logger()
		{
			Scanner sc=new  Scanner(System.in);
		 LOGGER.info("Calculating total Construction Cost");
			//printStream.print("Calculating total Construction Cost\n");
			//printStream.print("Enter the Material Standard\n");
			LOGGER.info("Enter the Material Standard");
			LOGGER.info("Enter");
			LOGGER.info("1--> standard materials");
			//printStream.print("Enter\n1--> standard materials\n");
			LOGGER.info("2--> above standard materials");
			LOGGER.info("3-->high standard material");
			LOGGER.info("4-->high standard material and fully automated home");
			//printStream.print("2--> above standard materials\n");
			//printStream.print("3-->high standard material\n");
			//printStream.print("4-->high standard material and fully automated home\n");
			int material_choice=sc.nextInt();
			LOGGER.info("Enter the total area of the house in sq. ft");
			//printStream.print("Enter the total area of the house in sq.ft\n");
			int total_area=sc.nextInt();
			
			double total_cost=0,cost=0;
			switch (material_choice) 
			{
			case 1:
				cost=1200;			
				break;
			case 2:
				cost=1500;			
				break;
			case 3:
				cost=1800;			
				break;
			case 4:
				cost=2500;			
				break;

			//default:
				//break;
			}
			total_cost=total_area*cost;
			LOGGER.info("Total Cost of COnstruction =");
			LOGGER.info(total_cost);
			//printStream.print("Total Cost of COnstruction = "+total_cost);
			System.exit(0);
		}

		private void info(String string) {
			// TODO Auto-generated method stub
			
		}

	}



