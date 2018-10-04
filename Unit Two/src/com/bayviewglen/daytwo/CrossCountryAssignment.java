package com.bayviewglen.daytwo;

import java.util.Scanner;

public class CrossCountryAssignment {

	public static void main(String[] args) {
		Runner runner1 = new Runner();
		Runner runner2 = new Runner();
		Runner runner3 = new Runner();
		Runner runner4 = new Runner();
		Runner runner5 = new Runner();
		final int SUMMARY_GAP_WIDTH = 4;
		final int TABLE_GAP_WIDTH = 21;

		runner1.prompt();
		System.out.println("\n\nRunner One Summary\n******************");
		System.out.printf(
				"\n%15s%" + (runner1.fullName.length() + SUMMARY_GAP_WIDTH)
						+ "s \n%15s%5d:%06.3f \n%15s%5d:%06.3f \n%15s%5d:%06.3f \n%15s%5d:%06.3f\n\n\n",
				"Runner Name:", runner1.fullName, "First Split:", runner1.minutesSplitOne, runner1.secondsSplitOne,
				"Second Split:", runner1.minutesSplitTwo, runner1.secondsSplitTwo, "Third Split:",
				runner1.minutesSplitThree, runner1.secondsSplitThree, "Total:", runner1.minutesTotal,
				runner1.secondsTotal);

		runner2.prompt();
		System.out.println("\n\nRunner Two Summary\n******************");
		System.out.printf(
				"\n%15s%" + (runner2.fullName.length() + SUMMARY_GAP_WIDTH)
						+ "s \n%15s%5d:%06.3f \n%15s%5d:%06.3f \n%15s%5d:%06.3f \n%15s%5d:%06.3f\n\n\n",
				"Runner Name:", runner2.fullName, "First Split:", runner2.minutesSplitOne, runner2.secondsSplitOne,
				"Second Split:", runner2.minutesSplitTwo, runner2.secondsSplitTwo, "Third Split:",
				runner2.minutesSplitThree, runner2.secondsSplitThree, "Total:", runner2.minutesTotal,
				runner2.secondsTotal);

		runner3.prompt();
		System.out.println("\n\nRunner Three Summary\n******************");
		System.out.printf(
				"\n%15s%" + (runner3.fullName.length() + SUMMARY_GAP_WIDTH)
						+ "s \n%15s%5d:%06.3f \n%15s%5d:%06.3f \n%15s%5d:%06.3f \n%15s%5d:%06.3f\n\n\n",
				"Runner Name:", runner3.fullName, "First Split:", runner3.minutesSplitOne, runner3.secondsSplitOne,
				"Second Split:", runner3.minutesSplitTwo, runner3.secondsSplitTwo, "Third Split:",
				runner3.minutesSplitThree, runner3.secondsSplitThree, "Total:", runner3.minutesTotal,
				runner3.secondsTotal);

		runner4.prompt();
		System.out.println("\n\nRunner Four Summary\n******************");
		System.out.printf(
				"\n%15s%" + (runner4.fullName.length() + SUMMARY_GAP_WIDTH)
						+ "s \n%15s%5d:%06.3f \n%15s%5d:%06.3f \n%15s%5d:%06.3f \n%15s%5d:%06.3f\n\n\n",
				"Runner Name:", runner4.fullName, "First Split:", runner4.minutesSplitOne, runner4.secondsSplitOne,
				"Second Split:", runner4.minutesSplitTwo, runner4.secondsSplitTwo, "Third Split:",
				runner4.minutesSplitThree, runner4.secondsSplitThree, "Total:", runner4.minutesTotal,
				runner4.secondsTotal);

		runner5.prompt();
		System.out.println("\n\nRunner Five Summary\n******************");
		System.out.printf(
				"\n%15s%" + (runner5.fullName.length() + SUMMARY_GAP_WIDTH)
						+ "s \n%15s%5d:%06.3f \n%15s%5d:%06.3f \n%15s%5d:%06.3f \n%15s%5d:%06.3f\n\n\n\n",
				"Runner Name:", runner5.fullName, "First Split:", runner5.minutesSplitOne, runner5.secondsSplitOne,
				"Second Split:", runner5.minutesSplitTwo, runner5.secondsSplitTwo, "Third Split:",
				runner5.minutesSplitThree, runner5.secondsSplitThree, "Total:", runner5.minutesTotal,
				runner5.secondsTotal);

		System.out.println("All Runner Runner Summaries\n***************************\n\n");
		System.out.printf(
				"%15s %17s, %-" + (TABLE_GAP_WIDTH - runner2.lastName.length()) + "s%s, %-"
						+ (TABLE_GAP_WIDTH - runner3.lastName.length()) + "s%s, %-"
						+ (TABLE_GAP_WIDTH - runner4.lastName.length()) + "s%s, %-"
						+ (TABLE_GAP_WIDTH - runner5.lastName.length()) + "s%s, %s \n\n",
				"Runner Name:", runner1.lastName, runner1.firstName, runner2.lastName, runner2.firstName,
				runner3.lastName, runner3.firstName, runner4.lastName, runner4.firstName, runner5.lastName,
				runner5.firstName);
		System.out.printf("%15s %15d:%06.3f %15d:%06.3f %15d:%06.3f %15d:%06.3f %15d:%06.3f\n", "First Split:",
				runner1.minutesSplitOne, runner1.secondsSplitOne, runner2.minutesSplitOne, runner2.secondsSplitOne,
				runner3.minutesSplitOne, runner3.secondsSplitOne, runner4.minutesSplitOne, runner4.secondsSplitOne,
				runner5.minutesSplitOne, runner5.secondsSplitOne);
		
		System.out.printf("%15s %15d:%06.3f %15d:%06.3f %15d:%06.3f %15d:%06.3f %15d:%06.3f\n", "Second Split:",
				runner1.minutesSplitOne, runner1.secondsSplitOne, runner2.minutesSplitOne, runner2.secondsSplitOne,
				runner3.minutesSplitOne, runner3.secondsSplitOne, runner4.minutesSplitOne, runner4.secondsSplitOne,
				runner5.minutesSplitOne, runner5.secondsSplitOne);
		
		System.out.printf("%15s %15d:%06.3f %15d:%06.3f %15d:%06.3f %15d:%06.3f %15d:%06.3f\n", "Third Split:",
				runner1.minutesSplitOne, runner1.secondsSplitOne, runner2.minutesSplitOne, runner2.secondsSplitOne,
				runner3.minutesSplitOne, runner3.secondsSplitOne, runner4.minutesSplitOne, runner4.secondsSplitOne,
				runner5.minutesSplitOne, runner5.secondsSplitOne);
		
		System.out.printf("%15s %15d:%06.3f %15d:%06.3f %15d:%06.3f %15d:%06.3f %15d:%06.3f\n", "Total:",
				runner1.minutesSplitOne, runner1.secondsSplitOne, runner2.minutesSplitOne, runner2.secondsSplitOne,
				runner3.minutesSplitOne, runner3.secondsSplitOne, runner4.minutesSplitOne, runner4.secondsSplitOne,
				runner5.minutesSplitOne, runner5.secondsSplitOne);
		
																																																																																																																																																																																																																																																																																																											
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
	String lastName;

	public void prompt() {
		System.out.print("Please enter the runner's full name: ");
		fullName = in.nextLine();
		firstName = fullName.substring(0, fullName.indexOf(" "));
		lastName = fullName.substring(fullName.indexOf(" "));

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
