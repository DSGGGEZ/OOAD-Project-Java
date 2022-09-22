import java.time.LocalDate;
import java.util.*;

public class comshop {
    static Scanner option = new Scanner(System.in);
    static Scanner data = new Scanner(System.in);

    public static void main(String[] args) {
        comshop.firstPage();
    }

    public static void firstPage() {
        System.out.println("                    Welcome to DSG Comshop");
        System.out.println("================================================================");
        System.out.println("Please select you option");
        System.out.println("1.register");
        System.out.println("2.login");
        System.out.println("3.exit");
        System.out.println("================================================================");
        System.out.print("Your option : ");

        int selection = option.nextInt();
        System.out.println("================================================================");
        if (selection == 1) {
            System.out.println("                    Go to register");
        } else if (selection == 2) {
            login();

        } else {
            System.out.println("                          Good bye");
            System.out.println("================================================================");
        }
    }

    // login page for comshop client & member
    public static void login() {
        client clientOption = new client();
        member memberOption = new member();

        System.out.println("                         Login Option");
        System.out.println("1.Client login");
        System.out.println("2.Member login");
        System.out.println("3.back to firstPage");
        System.out.println("================================================================");
        System.out.print("Your option : ");

        int loginOption = option.nextInt();
        System.out.println("================================================================");

        // login as client
        if (loginOption == 1) {
            System.out.println("                         Client Login");
            System.out.print("Enter Username :");
            String cUsername = data.nextLine();
            System.out.print("Enter Password :");
            String cPassword = data.nextLine();
            System.out.println("================================================================");
            clientOption.clientLogin(cUsername, cPassword);
        }
        // login as member
        else if (loginOption == 2) {
            System.out.println("                         Member Login");
            System.out.print("Enter Username :");
            String mUsername = data.nextLine();
            System.out.print("Enter Password :");
            String mPassword = data.nextLine();
            System.out.println("================================================================");
            memberOption.memberlogin(mUsername, mPassword);
        } else {
            firstPage();
        }
    }

    // client main page for managing system
    public static void clientMain() {
        System.out.println("               Welcome To DSG Comshop Admin System");
        System.out.println("================================================================");
        System.out.println("Please select Admin option");
        System.out.println("1.Member");
        System.out.println("2.Product");
        System.out.println("3.Order");
        System.out.println("4.Delivery");
        System.out.println("5.Receipt");
        System.out.println("6.Waranty");
        System.out.println("0.exit");

        System.out.println("================================================================");
        System.out.print("Your option : ");
        int clientOption = option.nextInt();
        System.out.println("================================================================");

        if (clientOption == 1) {
            System.out.println("DSG Comshop Admin : Member");
            System.out.println("Please select option");
            clientMemberMenu();
        } else if (clientOption == 2) {
            System.out.println("DSG Comshop Admin : Product");
            System.out.println("Please select option");
        } else if (clientOption == 3) {
            System.out.println("DSG Comshop Admin : Order");
            System.out.println("Please select option");
        } else if (clientOption == 4) {
            System.out.println("DSG Comshop Admin : Delivery");
            System.out.println("Please select option");
        } else if (clientOption == 5) {
            System.out.println("DSG Comshop Admin : Receipt");
            System.out.println("Please select option");
        } else if (clientOption == 6) {
            System.out.println("DSG Comshop Admin : Waranty");
            System.out.println("Please select option");
        } else {
            System.out.print("                    Back to Login Page...");
            System.out.println("================================================================");
            firstPage();
        }
    }

    // client member menu for managing
    public static void clientMemberMenu() {

        client clientOption = new client();
        member memberOption = new member();

        System.out.println("1.View Member");
        System.out.println("2.Add Member");
        System.out.println("3.Edit Member");
        System.out.println("4.Delete Member");
        System.out.println("0.Back");
        System.out.println("================================================================");
        System.out.print("Your option : ");
        int clientMemberOption = option.nextInt();
        System.out.println("================================================================");

        if (clientMemberOption == 1) {
            System.out.println(memberOption.getData());
            System.out.println("================================================================");
            clientMemberMenu();
        } else if (clientMemberOption == 2) {
            System.out.print("Name : ");
            String member_name = data.nextLine();
            System.out.print("Password : ");
            String member_password = data.nextLine();
            System.out.print("Citizen ID : ");
            String citizen_id = data.nextLine();
            System.out.print("Address : ");
            String address = data.nextLine();
            System.out.print("Email : ");
            String email = data.nextLine();
            System.out.print("Telephone : ");
            String telephone = data.nextLine();
            System.out.println("Balance : 0");

            System.out.println("================================================================");
            System.out.println(memberOption.addMember(member_name, member_password, citizen_id, address,
                    email, telephone, 0));
            System.out.println("================================================================");
            clientMemberMenu();
        } else if (clientMemberOption == 3) {

        } else if (clientMemberOption == 4) {
        } else {
            clientMain();
        }

    }

    public static void check(int x) {
        if (x == 0) {

        }
    }

}

// ========================================================================================================================================================//

class client {

    Scanner co = new Scanner(System.in);

    static String username = "DSGGGEZ";
    static String password = "34213421";

    comshop page = new comshop();
    member memberData = new member();

    client() {
        this.username = "DSGGGEZ";
        this.password = "1234";
    }

    public void clientLogin(String cUsername, String cPassword) {
        if (cUsername.equals(username) && cPassword.equals(password)) {
            comshop.clientMain();
        } else {
            System.out.println("                    Wrong username or password!");
            System.out.println("                    Back to first Page...");
            System.out.println("================================================================");
            comshop.login();
        }
    }

}

// ========================================================================================================================================================//

class member {

    int[] member_id = new int[100];
    String[] member_password = new String[100];
    String[] citizen_id = new String[100];
    String[] member_name = new String[100];
    String[] address = new String[100];
    String[] email = new String[100];
    String[] telephone = new String[100];
    int[] balance = new int[100];

    int x = 0;

    // member(int count, String member_id, String member_password, String
    // citizen_id, String member_name, String address,
    // String email, String telephone, String registered_date, int balance) {
    member() {
        this.member_id[0] = 1;
        this.member_password[0] = "12341234";
        this.citizen_id[0] = "1111111111111";
        this.member_name[0] = "Nanthapong Kongyut";
        this.address[0] = "111/1 no.7 Tapoh Subdistrict , Mueng Phitsanulok Dustrict , Phitsanulok , 65000";
        this.email[0] = "nanthapongk@nu.ac.th";
        this.telephone[0] = "0000000000";
        this.balance[0] = 0;
        this.x += 1;
    }

    public boolean memberlogin(String mUsername, String mPassword) {
        boolean result = false;
        for (int i = 0; i < x; i++) {
            if (mUsername.equals(member_id[i]) && mPassword.equals(member_password[i])) {
                result = true;
            } else {
                System.out.println("                    Wrong username or password!");
                System.out.println("                    Back to Login Page...");
                System.out.println("================================================================");
                result = false;
            }
        }
        return result;
    }

    public String getData() {
        String print = "Number of Member : " + x + 1;
        if (member_id.length >= 0) {
            for (int i = 0; i < x + 1; i++) {
                return print += "\n MemberID : " + member_id[i] + " \n Password : " + member_password[i]
                        + " \n CitizenID : "
                        + citizen_id[i] + " \n Name : " + member_name[i] + " \n Address : " + address[i]
                        + " \n Email : "
                        + email[i] + " \n Telephone : " + telephone[i] + " \n Balance : " + balance[i]
                        + " \n -------------------------------";

            }
        } else {
            print = "Member is empty";
        }
        return print;
    }

    public String addMember(String member_name, String member_password, String citizen_id,
            String address, String email, String telephone, int balance) {

        this.member_id[x] = member_id[x] + 1;
        this.member_name[x] = member_name;
        this.member_password[x] = member_password;
        this.citizen_id[x] = citizen_id;
        this.address[x] = address;
        this.email[x] = email;
        this.telephone[x] = telephone;
        this.balance[x] = balance;
        x += 1;
        return "Register Success!";

    }

}

// ========================================================================================================================================================//

class product {

}

// ========================================================================================================================================================//

class order {

}

// ========================================================================================================================================================//

class receipt {

}

// ========================================================================================================================================================//

class waranty {

}

// ========================================================================================================================================================//

class delivery {

}
