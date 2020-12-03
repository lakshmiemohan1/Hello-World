import java.util.*;
public class Heloworld {

	public static void main(String[] args) {
		lotteryGen();

	}

	public static void lotteryGen() {
		System.out.println("Hello, World!");
		// TODO Auto-generated method stub
		Asciichar as=new Asciichar();
		as.printNumbers();
		Scanner scanner = new Scanner(System.in);
		System.out.print("What's your name: ");     // type a word and hit enter
		String usersname = scanner.next();
		System.out.println("hi " + usersname);

		System.out.println("Do you wish to continue to the interactive portion: ");
		String usersresponse = scanner.next();
		if (usersresponse.equals("yes") || usersresponse.equals("y")) {
			System.out.println("Do you have a red car?");
			String carresponse = scanner.next();

			System.out.println("age of their favorite pet.?");
			int petresponse = scanner.nextInt();

			System.out.println("What is their lucky number?");
			int numresponse = scanner.nextInt();

			System.out.println(" What is two-digit model year of their car??");
			int modelresponse = scanner.nextInt();

			System.out.println("Do they have a favorite quarterback?");
			String qbresponse = scanner.next();
			int qbnumber =0;
			if (qbresponse.equals("yes") || qbresponse.equals("y")) {
				System.out.println("If so what is their jersey number?");
				qbnumber = scanner.nextInt();
			}

			System.out.println("What is the first name of the their favorite actor or actress?");
			String actorresponse = scanner.next();


			System.out.println(" Enter a random number between 1 and 50?");
			int randomresponse = scanner.nextInt();

			Random rand = new Random(); //instance of random class
			int upperbound = 65;
			//generate random values from 0-24
			int int_random = rand.nextInt(upperbound); 
			int int_random2 = rand.nextInt(upperbound); 

			int lotterynum1 = 42;
			int lotterynum2 = petresponse + modelresponse;
			int lotterynum3 = modelresponse + randomresponse;
			int lotterynum4 = numresponse - int_random;
			int lotterynum5 = petresponse + qbnumber + numresponse;


			int magicball = numresponse + int_random2;

			System.out.println("Lottery numbers: " + lotterynum1 + ", " + lotterynum2 + ", " + lotterynum1 + ", " +
					lotterynum3 + ", " + lotterynum4 + ", " + lotterynum5 + " Magic Ball: " + magicball);

			System.out.println("Do you to go again: ");
			String newresponse = scanner.next();
			if (newresponse.equals("yes") || newresponse.equals("y")) {
				lotteryGen();
			} else {
				System.exit(0);
			}

		} else {
			System.exit(0);
		}
	}
}
