package com.bayviewglen.daytwo;

import java.util.Scanner;

public class CrossCountryAssignment {

	public static void main(String[] args) {
		Runner runner1 = new Runner();
		Runner runner2 = new Runner();
		Runner runner3 = new Runner();
		Runner runner4 = new Runner();
		Runner runner5 = new Runner();
		String strFirstSplit = "First Split:";
		String strSecondSplit = "Second Split:";
		String strThirdSplit = "Third Split:";
		String strTotal = "Total:";

		runner1.prompt();
		System.out.println("\n\nRunner One Summary\n******************");
		System.out.printf("\n%15s%" + (runner1.fullName.length() + 3) + "s \n%15s%5d:%06.3f \n%15s%5d:%06.3f \n%15s%5d:%06.3f \n%15s%5d:%06.3f\n\n\n", "Runner Name:", runner1.fullName, strFirstSplit, runner1.minutesSplitOne, runner1.secondsSplitOne,
				strSecondSplit, runner1.minutesSplitTwo, runner1.secondsSplitTwo, strThirdSplit,
				runner1.minutesSplitThree, runner1.secondsSplitThree, strTotal, runner1.minutesTotal,
				runner1.secondsTotal);

		runner2.prompt();
		System.out.println("\n\nRunner Two Summary\n******************");
		System.out.printf("\n%15s%" + (runner2.fullName.length() + 3) + "s \n%15s%5%15s%5d:%06.3f \n%15s%5d:%06.3f \n%15s%5d:%06.3f \n%15s%5d:%06.3f\n\n\n",
				strFirstSplit, runner2.minutesSplitOne, runner2.secondsSplitOne, strSecondSplit,
				runner2.minutesSplitTwo, runner2.secondsSplitTwo, strThirdSplit, runner2.minutesSplitThree,
				runner2.secondsSplitThree, strTotal, runner2.minutesTotal, runner2.secondsTotal);

		runner3.prompt();
		System.out.println("\n\nRunner Three Summary\n******************");
		System.out.printf("\n%15s%" + (runner3.fullName.length() + 3) + "s \n%15s%5d:%06.3f \n%15s%5d:%06.3f \n%15s%5d:%06.3f \n%15s%5d:%06.3f\n\n\n", strFirstSplit,
				runner3.minutesSplitOne, runner3.secondsSplitOne, strSecondSplit, runner3.minutesSplitTwo,
				runner3.secondsSplitTwo, strThirdSplit, runner3.minutesSplitThree, runner3.secondsSplitThree, strTotal,
				runner3.minutesTotal, runner3.secondsTotal);

		runner4.prompt();
		System.out.println("\n\nRunner Four Summary\n******************");
		System.out.printf("\n%15s%" + (runner1.fullName.length() + 3) + "s \n%15s%5d:%06.3f \n%15s%5d:%06.3f \n%15s%5d:%06.3f \n%15s%5d:%06.3f\n\n\n", strFirstSplit,
				runner4.minutesSplitOne, runner4.secondsSplitOne, strSecondSplit, runner4.minutesSplitTwo,
				runner4.secondsSplitTwo, strThirdSplit, runner4.minutesSplitThree, runner4.secondsSplitThree, strTotal,
				runner4.minutesTotal, runner4.secondsTotal);

		runner5.prompt();
		System.out.println("\n\nRunner Five Summary\n******************");
		System.out.printf("\n%15s%" + (runner1.fullName.length() + 3) + "s \n%15s%5d:%06.3f \n%15s%5d:%06.3f \n%15s%5d:%06.3f \n%15s%5d:%06.3f\n\n\n", strFirstSplit,
				runner5.minutesSplitOne, runner5.secondsSplitOne, strSecondSplit, runner5.minutesSplitTwo,
				runner5.secondsSplitTwo, strThirdSplit, runner5.minutesSplitThree, runner5.secondsSplitThree, strTotal,
				runner5.minutesTotal, runner5.secondsTotal);

		System.out.println("All Runner Runner Summaries\n***************************");
		System.out.printf("", args);

	}

}

class Runner {
	Scanner in = new Scanner(System.in);
	int minutesSplitOne;
	int minutesSplitTwo;
	int minutesSplitThree;
	int minutesTotal;
	double secondsSplitOne;
	double secondsSplitTwo;
	double secondsSplitThree;
	double secondsTotal;
	String fullName;
	String firstName;

	public void prompt() {
		System.out.print("Please enter the runner's full name: ");
		fullName = in.nextLine();
		firstName = fullName.substring(0, fullName.indexOf(" "));

		System.out.printf("%s, Please enter the time it took you to run the first mile (mm:ss.sss): ", firstName);
		String strTimeOneMile = in.nextLine();

		System.out.print("Please enter the time it took you to run to the end of the second mile (mm:ss.sss): ");
		String strTimeTwoMiles = in.nextLine();

		System.out.print("Please enter the time it took you to run to the end of the fifth mile (mm:ss.sss): ");
		String strTimeFiveMiles = in.nextLine();

		final int SECONDS_IN_MINUTE = 60;

		int colonLocationOneMile = strTimeOneMile.indexOf(":");
		int colonLocationTwoMiles = strTimeTwoMiles.indexOf(":");
		int colonLocationFiveMiles = strTimeFiveMiles.indexOf(":");

		int minutesOneMile = Integer.parseInt(strTimeOneMile.substring(0, colonLocationOneMile));
		double secondsOneMile = Double.parseDouble(strTimeOneMile.substring(colonLocationOneMile + 1));

		int minutesTwoMiles = Integer.parseInt(strTimeTwoMiles.substring(0, colonLocationTwoMiles));
		double secondsTwoMiles = Double.parseDouble(strTimeTwoMiles.substring(colonLocationTwoMiles + 1));

		int minutesFiveMiles = Integer.parseInt(strTimeFiveMiles.substring(0, colonLocationFiveMiles));
		double secondsFiveMiles = Double.parseDouble(strTimeFiveMiles.substring(colonLocationFiveMiles + 1));

		minutesSplitOne = minutesOneMile;
		minutesSplitTwo = minutesTwoMiles - minutesOneMile
				- (int) (secondsTwoMiles + secondsOneMile) / SECONDS_IN_MINUTE;
		minutesSplitThree = minutesFiveMiles - minutesTwoMiles
				- (int) (secondsFiveMiles + secondsTwoMiles) / SECONDS_IN_MINUTE;
		minutesTotal = minutesFiveMiles;

		secondsSplitOne = secondsOneMile;
		secondsSplitTwo = (SECONDS_IN_MINUTE + secondsTwoMiles - secondsOneMile) % SECONDS_IN_MINUTE;
		secondsSplitThree = (SECONDS_IN_MINUTE + secondsFiveMiles - secondsTwoMiles) % SECONDS_IN_MINUTE;
		secondsTotal = secondsFiveMiles;
	}

}
