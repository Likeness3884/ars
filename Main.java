import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static int userCount = 1;

    // private static String[][] schedule = new String[20][7];
    private static String[] parts = {"FlightId", "Origin", "Destination", "Date", "Time", "Price", "Seats"};
    //private static String[] FlightIds = new String[20];
    //private static String[] Origins = new String[20];
    //private static String[] Destinations = new String[20];
    //private static String[] Dates = new String[20];
    //private static String[] Times = new String[20];
    //private static String[] Prices = new String[20];
    //private static int[] Seats = new int[20];
	private static int scheduleCount = 3;

	public static ArrayList<String> userNames = new ArrayList<String>();
	public static ArrayList<String> userPasses = new ArrayList<String>();

	public static ArrayList<String> FlightIds = new ArrayList<String>();
	public static ArrayList<String> Origins= new ArrayList<String>();
	public static ArrayList<String> Destinations = new ArrayList<String>();
	public static ArrayList<String> Dates = new ArrayList<String>();
	public static ArrayList<String> Times = new ArrayList<String>();
	public static ArrayList<String> Prices = new ArrayList<String>();
	public static ArrayList<Integer> Seats = new ArrayList<Integer>();

    public static void main(String[] args) {
		Welcome welcome = new Welcome();
		Admin admin = new Admin();
		Passenger passenger = new Passenger();
		userNames.add("Admin");
		userPasses.add("Admin");

		FlightIds.add("WX-12");
		FlightIds.add("WX-15");
		FlightIds.add("BG-22");
		
		Origins.add("Yazd");
		Origins.add("Mashhad");
		Origins.add("Shiraz");
		
		Destinations.add("Tehran");
		Destinations.add("Ahvaz");
		Destinations.add("Tabriz");
		
		Dates.add("1401-12-10");
		Dates.add("1401-12-11");
		Dates.add("1401-12-12");
		
		Times.add("12:30");
		Times.add("08:00");
		Times.add("22:30");
		
		Prices.add("700,000");
		Prices.add("900,000");
		Prices.add("1,100,000");
		
		Seats.add(51);
		Seats.add(245);
		Seats.add(12);
        // Default User
        //userNames[0] = "Admin";
        //userPasses[0] = "Admin";
        // Default Schedules
        //FlightIds[0] = "WX-12";FlightIds[1] = "WX-15";FlightIds[2] = "BG-22";
        //Origins[0] = "Yazd";Origins[1] = "Mashhad";Origins[2] = "Shiraz";
        //Destinations[0] = "Tehran";Destinations[1] = "Ahvaz";Destinations[2] = "Tabriz";
        //Dates[0] = "1401-12-10";Dates[1] = "1401-12-11";Dates[2] = "1401-12-12";
        //Times[0] = "12:30";Times[1] = "08:00";Times[2] = "22:30";
        //Prices[0] = "700,000";Prices[1] = "900,000";Prices[2] = "1,100,000";
        //Seats[0] = 51;Seats[1] = 245;Seats[2] = 12;
        // ==================================================================================

        // while (true) {
        //     System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
        //                     +"           WELCOME TO AIRELINE RESERVATION SYSTEM             \n"
        //                     +"::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
        //                     +"..........................MENU OPTIONS........................\n"
        //                     +"\n"
        //                     +"    <1> Sign in\n"
        //                     +"    <2> Sign up\n");
        //     System.out.print("Enter your choose: ");

        //     int choose = scanner.nextInt();
        //     System.out.println();

        //     switch (choose) {
        //         case 1:
        //             if (!DoSignIn()) continue;
        //             break;
        //         case 2:
        //             if (!DoSignUp()) continue;
        //             break;
        //     }
        //     break;
        // }
        //AdminMenu();
		//admin.ShowMenu();
		welcome.ShowMenu();
		//passenger.ShowMenu();
    }
/*
    private static boolean DoSignIn() {
        System.out.print("Username: ");
        String userName = scanner.next();

        int userIndex = 0;
        Boolean bExist = false;
        for (int i = 0; i < userCount; i++) {
            if (userName.contentEquals(userNames[i])) {
                bExist = true;
                break;
            }
            userIndex++;
        }
        if (!bExist) return false;

        System.out.print("Password: ");
        String userPass = scanner.next();

        if (userPass.contentEquals(userPasses[userIndex]))
        {
            return true;
        }
        return false;
    }

    private static boolean DoSignUp() {
        System.out.print("New Username: ");
        String userName = scanner.next();

        for (int i = 0; i < userCount; i++) {
            if (userName.contentEquals(userNames[i])) {
                return false;
            }
        }
        userNames[userCount] = userName;

        System.out.print("Password: ");
        String userPass = scanner.next();

        userPasses[userCount] = userPass;

        userCount++;
        return true;
    }

    private static void AdminMenu() {
        while (true) {
            System.out.println("""
::::::::::::::::::::::::::::::::::::::::
        Admin MENUE OPTIONS
::::::::::::::::::::::::::::::::::::::::
......................................
    <1> Add
    <2> Update
    <3> Remove
    <4> Flight schedules
    <0> Sign out
                    """);
        System.out.println();

            System.out.print("Enter your choose: ");
            int choose = scanner.nextInt();
            System.out.println();

            switch (choose) {
                case 1:
                    Add();
                    break;
                case 2:
                    Update();
                    break;
                case 3:
                    Remove();
                    break;
                case 4:
                    FlightSchedules();
                    break;
                case 0:
                    break;
            }
            break;
        }
    }

    private static void Add() {
        int id = scheduleCount;
        for (int i = 0; i < scheduleCount; i++) {
            if (Seats[i] < 0) {
                id = i;
            }
        }

        System.out.print("Enter " + parts[0] + ": ");
        FlightIds[id] = scanner.next();
        System.out.print("Enter " + parts[1] + ": ");
        Origins[id] = scanner.next();
        System.out.print("Enter " + parts[2] + ": ");
        Destinations[id] = scanner.next();
        System.out.print("Enter " + parts[3] + ": ");
        Dates[id] = scanner.next();
        System.out.print("Enter " + parts[4] + ": ");
        Times[id] = scanner.next();
        System.out.print("Enter " + parts[5] + ": ");
        Prices[id] = scanner.next();
        System.out.print("Enter " + parts[6] + ": ");
        Seats[id] = scanner.nextInt();

        if (id == scheduleCount) {
            scheduleCount++;
        }
    }

    private static void Update() {
        System.out.print("Enter FlightId: ");
        String userInput = scanner.next();

        int id = -1;
        for (int i = 0; i < scheduleCount; i++) {
            if (userInput.contentEquals(FlightIds[i]) && Seats[id] >= 0) {
                id = i;
                FlightIds[id] = userInput;
                break;
            }
        }

        if (id >= 0) {
            System.out.print("Enter " + parts[1] + ": ");
            Origins[id] = scanner.next();
            System.out.print("Enter " + parts[2] + ": ");
            Destinations[id] = scanner.next();
            System.out.print("Enter " + parts[3] + ": ");
            Dates[id] = scanner.next();
            System.out.print("Enter " + parts[4] + ": ");
            Times[id] = scanner.next();
            System.out.print("Enter " + parts[5] + ": ");
            Prices[id] = scanner.next();
            System.out.print("Enter " + parts[6] + ": ");
            Seats[id] = scanner.nextInt();
        }
    }

    private static void Remove() {
        System.out.print("Enter FlightId: ");
        String userInput = scanner.next();

        int id = -1;
        for (int i = 0; i < scheduleCount; i++) {
            if (userInput.contentEquals(FlightIds[i])) {
                id = i;
                break;
            }
        }

        if (id >= 0) {
            Seats[id] = -1;
        }
    }

    private static void FlightSchedules() {
        String format = "|%-11s|%-11s|%-13s|%-12s|%-11s|%-11s|%-6s|\n";
        System.out.format(format, parts[0], parts[1], parts[2], parts[3], parts[4], parts[5], parts[6]);
        System.out.println("...................................................................................");
        for (int i = 0; i < scheduleCount; i++) {
            System.out.format(format, FlightIds[i], Origins[i], Destinations[i], Dates[i], Times[i], Prices[i], Seats[i]);
            System.out.println("...................................................................................");
        }
    }
*/
}
class Welcome {
	private Scanner scanner = new Scanner(System.in);

	public void ShowMenu() {
		System.out.println(
			  "\n"
			+ ":::::::::::::::::::::::::::::::::::::::::::::::\n"
			+ "    WELCOME TO AIRLINE RESERVATION SYSTEM      \n"
			+ ":::::::::::::::::::::::::::::::::::::::::::::::\n"
			+ " ................MENU OPTIONS................. \n"
			+ "\n"
			+ "    <1> Sign in\n"
			+ "    <2> Sign up\n"
			+ "\n"
		);
		System.out.print("Enter your choose: ");

		int choose = scanner.nextInt();
		System.out.println();
		switch (choose) {
			case 1:
				signIn();
				break;
			case 2:
				signUp();
				break;
		}
	}

	private boolean signIn() {
		System.out.print("Username: ");
		String userName = scanner.next();

		int userIndex = 0;
		Boolean bExist = false;
		for (String name : Main.userNames) {
			if (userName.contentEquals(name)) {
				bExist = true;
				break;
			}
			userIndex++;
		}
		if (!bExist) return false;

		System.out.print("Password: ");
		String userPass = scanner.next();

		if (userPass.contentEquals(Main.userPasses.get(userIndex)))
		{
			return true;
		}
		return false;
	}

	private void signUp() {};
}
