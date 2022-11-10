import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Calendar;

public class comshop {
    static Scanner option = new Scanner(System.in);
    static Scanner data1 = new Scanner(System.in);
    static Scanner data2 = new Scanner(System.in);
    static Scanner data3 = new Scanner(System.in);
    static Scanner data4 = new Scanner(System.in);
    static Scanner data5 = new Scanner(System.in);
    static Scanner data6 = new Scanner(System.in);
    static Scanner data7 = new Scanner(System.in);
    static Scanner data8 = new Scanner(System.in);
    static int selection;
    static int selectId;
    static int next;

    // Check login
    static boolean memberLogin = false;
    static boolean adminLogin = false;

    SimpleDateFormat dateFormatExp = new SimpleDateFormat("hh:mm:ss dd-mm-yyyy ");

    // Admin Data
    static String username = "DSGGGEZ";
    static String password = "1111";
    static String nickname = "DSG";
    static String birthday = "04-09-2001";
    static Admin admin = new Admin(username, password, nickname, birthday);
    // Member Data
    static int member_id = 1;
    static String member_password = "11111111";
    static String citizen_id = "1111111111111";
    static String member_name = "Nanthapong Kongyut";
    static String address = "111/1 no.7 Tapoh Subdistrict , Mueng Phitsanulok Dustrict ";
    static String email = "nanthapongk63@nu.ac.th";
    static String telephone = "0000000000";
    static int balance = 100000;

    static Member member = new Member(member_id, member_password, citizen_id, member_name, address, email, telephone,
            balance);

    // Product Data
    static int[] pId1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17 };
    static String[] pName1 = { "INTEL Core i9-12900KS", "INTEL Core i7-12700", "INTEL Core i5-12400F",
            "INTEL Core i3-12100", "ASUS Prime B660M-A D4 CSM", "MSI Pro H610M-B D4",
            "CORSAIR Vengeance RGB PRO DDR4 16GB (8GBx2) 3466", "ADATA Performance DDR4 32GB (32GBx1) 2666",
            "NVIDIA GeForce RTX 4090", "NVIDIA GeForce RTX 4080 12GB", "GALAX RTX 3090 XLR8",
            "EVGA RTX 3080 FTW3 Ultra", "Addlink S90 1TB M.2", "THERMALTAKE Toughpower PF1 1200W",
            "Antec NX320 Black", "AOC CQ32G3SE", "SILVER STONE Permafrost PF360 ARGB V2 Black" };
    static String[] pType1 = { "CPU", "CPU", "CPU", "CPU", "Mainboard", "Mainboard", "RAM", "RAM", "GPU", "GPU", "GPU",
            "GPU", "SSD", "PSU", "Case", "Monitor", "CPU Cooler" };
    static String[] pWaranty1 = { "3", "3", "3", "3", "3", "3", "Lifetime", "Lifetime", "3", "3", "3", "3", "3", "3",
            "null", "3", "3" };
    static int[] pPrice1 = { 29900, 13400, 6690, 5230, 4390, 2850, 4900, 3690, 68500, 39500, 41900, 28900, 7190, 8290,
            1430, 11990, 3890 };
    static int[] pStock1 = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
    static Product product = new Product(pId1, pName1, pType1, pWaranty1, pPrice1, pStock1);

    // Order Data
    static Date date = Calendar.getInstance().getTime();
    static DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss dd-mm-yyyy ");;

    static int id_member = 1;
    static int idP = 1;
    static String date_bought = dateFormat.format(date);;
    static int totalP = 1;
    static String status_order = "waiting";
    static Order order = new Order(id_member, idP, date_bought, totalP, status_order);

    // Delivery Data
    static Delivery delivery = new Delivery(1, id_member, "111/1 no.7 Tapoh Subdistrict , Mueng Phitsanulok Dustrict ",
            "TH123199149");

    // Reciept Data
    static Receipt receipt = new Receipt(1, id_member, date_bought, totalP);

    static Waranty waranty = new Waranty(1, 1);

    public static void main(String[] args) {

        firstPage();
    }

    public static void firstPage() {
        do {
            System.out.println("                    Welcome to DSG Comshop");
            System.out.println("================================================================");
            System.out.println("Please select you option");
            System.out.println("1.login");
            System.out.println("2.View Product");
            System.out.println("0.exit");
            System.out.println("================================================================");
            System.out.print("Your option : ");
            // option
            selection = option.nextInt();
            System.out.println("================================================================");
            // condition
            if (selection == 1) {
                System.out.println("                        Going to login...");
                // Go to login method
                login();
            } else if (selection == 2) {
                System.out.println("                        Welcome to DSG Comshop");
                System.out.println("================================================================");
                System.out.println("Product List");
                System.out.println("Number of Product : " + Product.limit);
                for (int i = 1; i <= Product.limit; i++) {
                    if (product.getPwaranty(i).equals("Lifetime")) {
                        System.out.println(
                                product.getPid(i) + "." + product.getPname(i)
                                        + "\n Waranty " + product.getPwaranty(i) +
                                        " Years Stock : " + product.getPstock(i) + "                            "
                                        + product.getPprice(i) + " Baht\n");
                    } else if (product.getPwaranty(i).equals("null")) {
                        System.out.println(
                                product.getPid(i) + "." + product.getPname(i)
                                        + "\n Waranty " + product.getPwaranty(i) +
                                        " Years Stock : " + product.getPstock(i) + "                               "
                                        + product.getPprice(i) + " Baht\n");
                    } else if (product.getPprice(i) < 10000) {
                        System.out.println(
                                product.getPid(i) + "." + product.getPname(i)
                                        + "\n Waranty " + product.getPwaranty(i) +
                                        " Years Stock : " + product.getPstock(i) + "                                   "
                                        + product.getPprice(i) + " Baht\n");
                    } else {
                        System.out.println(
                                product.getPid(i) + "." + product.getPname(i)
                                        + "\n Waranty " + product.getPwaranty(i) +
                                        " Years Stock : " + product.getPstock(i) + "                                  "
                                        + product.getPprice(i) + " Baht\n");
                    }

                }
                System.out.println("================================================================");
                firstPage();
            } else {
                System.out.println("                          Good bye");
                System.out.println("================================================================");
                break;
            }
        } while (selection != 0);

    }

    // login page for comshop admin & member
    public static void login() {

        System.out.println("                         Login Option");
        System.out.println("1.Admin login");
        System.out.println("2.Member login");
        System.out.println("3.back to firstPage");
        System.out.println("================================================================");
        System.out.print("Your option : ");
        // option
        selection = option.nextInt();
        System.out.println("================================================================");
        // login option
        // login as admin
        if (selection == 1) {
            System.out.println("                         Admin Login");
            System.out.print("Enter Username : ");
            String cUsername = data1.nextLine();
            System.out.print("Enter Password : ");
            String cPassword = data2.nextLine();
            System.out.println("================================================================");
            adminLogin(cUsername, cPassword);
        }
        // login as member
        else if (selection == 2) {
            System.out.println("                         Member Login");
            System.out.print("Member ID : ");
            int mid = data1.nextInt();
            System.out.print("Enter Password : ");
            String mPassword = data2.nextLine();
            System.out.println("================================================================");
            memberLogin(mid, mPassword);
        } else {
            firstPage();
        }
    }

    // ----------------------------------------------------------------Admin----------------------------------------------------------------------------------
    public static void adminLogin(String cUsername, String cPassword) {
        if (cUsername.equals(admin.getUsername()) && cPassword.equals(admin.getPassword())) {
            adminLogin = true;
            adminMain();
        } else {
            System.out.println("                    Wrong username or password!");
            System.out.println("                    Back to first Page...");
            System.out.println("================================================================");
            login();
        }
    }

    // admin main page for managing system
    public static void adminMain() {
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
        selection = option.nextInt();
        System.out.println("================================================================");

        if (selection == 1) {
            adminMemberMenu();
        } else if (selection == 2) {
            adminProductMenu();
        } else if (selection == 3) {
            adminOrderMenu();
        } else if (selection == 4) {
            adminDeliveryMenu();
        } else if (selection == 5) {
            adminReceiptMenu();
        } else if (selection == 6) {
            adminWaranty();
        } else {
            System.out.println("                    Back to Login Page...");
            System.out.println("================================================================");
            firstPage();
        }
    }

    // admin member menu for managing
    public static void adminMemberMenu() {
        System.out.println("                DSG Comshop Admin : Member");
        System.out.println("Number of Member : " + Member.limit);
        for (int i = 1; i <= Member.limit; i++) {
            if (member.getMemberId(i) == 0) {
                System.out.println(
                        "Member was deleted \n ----------------------------------------------------------------");
            } else if (Member.limit > 0) {
                System.out.println(
                        " ID : " + member.getMemberId(i) + "\n Name : " + member.getMemberName(i)
                                + "\n Citizen ID : " + member.getMemberCitizenId(i) + "\n Password : "
                                + member.getMemberPassword(i)
                                + "\n Address : " + member.getAdress(i) + "\n Email : " + member.getEmail(i)
                                + "\n Telephone : " + member.getTelephone(i) + " \n Balance : "
                                + member.getBalance(i)
                                + "\n ----------------------------------------------------------------");
            } else {
                System.out.println("No member");
            }

        }
        System.out.println("================================================================");
        System.out.println("Please select option");
        System.out.println("1.Search Member");
        System.out.println("2.Add Member");
        System.out.println("3.Edit Member");
        System.out.println("4.Topup");
        System.out.println("5.Delete Member");
        System.out.println("0.Back");
        System.out.println("================================================================");
        System.out.print("Your option : ");
        selection = option.nextInt();
        System.out.println("================================================================");

        if (selection == 1) {
            System.out.print("Search from ID : ");
            selectId = data1.nextInt();
            int condition = member.getMemberId(selectId);
            if (condition == 0) {
                System.out.println("================================================================");
                System.out.println("                        Member Not Found");
                System.out.println("================================================================");
            } else {
                System.out.println("================================================================");
                System.out.println(
                        " ID : " + member.getMemberId(selectId) + "\n Name : " + member.getMemberName(selectId)
                                + "\n Citizen ID : " + member.getMemberCitizenId(selectId) + "\n Password : "
                                + member.getMemberPassword(selectId)
                                + "\n Address : " + member.getAdress(selectId) + "\n Email : "
                                + member.getEmail(selectId)
                                + "\n"
                                + "\n Telephone : " + member.getTelephone(selectId) + " \n Balance : "
                                + member.getBalance(selectId)
                                + "\n================================================================");
            }

            adminMemberMenu();

        }
        // Search member from id
        else if (selection == 2) {
            System.out.println("                        Register member");
            System.out.print("Name : ");
            String member_name = data2.nextLine();
            System.out.print("Password : ");
            String member_password = data3.nextLine();
            System.out.print("Citizen ID : ");
            String citizen_id = data4.nextLine();
            System.out.print("Address : ");
            String address = data5.nextLine();
            System.out.print("Email : ");
            String email = data6.nextLine();
            System.out.print("Telephone : ");
            String telephone = data7.nextLine();
            System.out.println("Balance : 0");

            System.out.println("================================================================");
            Member.setMemberData(1, member_id, member_name, member_password, citizen_id, address, email, telephone, 0);
            System.out.println("                        Register Success!");
            System.out.println("Press 0 to continue");
            System.out.println("================================================================");
            next = option.nextInt();
            adminMemberMenu();
        }
        // Edit Member Data
        else if (selection == 3) {
            System.out.println("                         Edit member");
            System.out.println("0.back");
            System.out.println("================================================================");
            System.out.print("Enter Member ID : ");
            selectId = option.nextInt();
            System.out.println("================================================================");
            if (selectId != 0) {
                System.out.println("                        Edit member : " + selectId);
                System.out.print("Name : ");
                String member_name = data2.nextLine();
                System.out.print("Password : ");
                String member_password = data3.nextLine();
                System.out.print("Citizen ID : ");
                String citizen_id = data4.nextLine();
                System.out.print("Address : ");
                String address = data5.nextLine();
                System.out.print("Email : ");
                String email = data6.nextLine();
                System.out.print("Telephone : ");
                String telephone = data7.nextLine();
                System.out.print("Balance : ");
                int balance = data8.nextInt();

                System.out.println("================================================================");
                System.out.println("             Edit Member" + member.getMemberName(selectId) + " Success!");
                Member.editMemberData(selectId, member_name, member_password, citizen_id, address, email,
                        telephone, balance);
                System.out.println("Press 0 to continue");
                System.out.println("================================================================");
                next = option.nextInt();
                adminMemberMenu();
            }

        } else if (selection == 4) {
            System.out.println("                                Topup");
            System.out.println("0.back");
            System.out.println("================================================================");
            System.out.print("Enter Member ID : ");
            selectId = option.nextInt();
            System.out.println("================================================================");
            if (selectId != 0) {
                System.out.println("                        Topup : " + member.getMemberName(selectId));
                System.out.print("Topup amount : ");
                int topup = data6.nextInt();
                System.out.println("================================================================");
                System.out.println("             Topup : " + member.getMemberName(selectId) + " Success!");
                member.topup(selectId, topup);
                System.out.println("Press 0 to continue");
                System.out.println("================================================================");
                next = option.nextInt();
                adminMemberMenu();
            } else {
                adminMemberMenu();
            }
        }
        // Delete Member
        else if (selection == 5) {
            System.out.println("                        Delete member");
            System.out.println("0.Back");
            System.out.println("================================================================");
            System.out.print("Enter Member ID to Delete : ");
            int deleteMember = option.nextInt();
            System.out.println("================================================================");

            System.out.println("             Delete Member " + member.getMemberName(deleteMember) + " Success!");
            member.deleteMember(deleteMember);
            System.out.println("Press 0 to continue");
            System.out.println("================================================================");
            next = option.nextInt();
            adminMemberMenu();
        } else {
            adminMain();
        }
    }

    // ------------------------Product---------------------------
    public static void adminProductMenu() {
        System.out.println("                DSG Comshop Admin : Product");
        System.out.println("Product List");
        System.out.println("Number of Product : " + Product.limit);
        for (int i = 1; i <= Product.limit; i++) {
            if (product.getPwaranty(i).equals("Lifetime")) {
                System.out.println(
                        product.getPid(i) + "." + product.getPname(i)
                                + "\n Waranty " + product.getPwaranty(i) +
                                " Years Stock : " + product.getPstock(i) + "                            "
                                + product.getPprice(i) + " Baht\n");
            } else if (product.getPwaranty(i).equals("null")) {
                System.out.println(
                        product.getPid(i) + "." + product.getPname(i)
                                + "\n Waranty " + product.getPwaranty(i) +
                                " Years Stock : " + product.getPstock(i) + "                                 "
                                + product.getPprice(i) + " Baht\n");
            } else if (product.getPprice(i) < 10000) {
                System.out.println(
                        product.getPid(i) + "." + product.getPname(i)
                                + "\n Waranty " + product.getPwaranty(i) +
                                " Years Stock : " + product.getPstock(i) + "                                   "
                                + product.getPprice(i) + " Baht\n");
            } else {
                System.out.println(
                        product.getPid(i) + "." + product.getPname(i)
                                + "\n Waranty " + product.getPwaranty(i) +
                                " Years Stock : " + product.getPstock(i) + "                                  "
                                + product.getPprice(i) + " Baht\n");
            }
        }
        System.out.println("================================================================");
        System.out.println("Please select option");
        System.out.println("1.Add Product");
        System.out.println("2.Manage Stock");
        System.out.println("3.Delete Product");
        System.out.println("0.Back");
        System.out.println("================================================================");
        System.out.print("Your option : ");
        selection = option.nextInt();
        System.out.println("================================================================");
        if (selection == 1) {
            // add product
            System.out.println("                        Add Product");
            System.out.print("Product Name : ");
            String pname = data2.nextLine();
            System.out.print("Type : ");
            String ptype = data3.nextLine();
            System.out.print("Waranty : ");
            String pwaranty = data4.nextLine();
            System.out.print("Price : ");
            int pprice = data5.nextInt();
            System.out.print("Stock : ");
            int Stock = data6.nextInt();

            System.out.println("================================================================");
            Product.addProduct(1, pname, ptype, pwaranty, pprice, Stock);
            System.out.println("                    Add Product Success!");
            System.out.println("================================================================");
            adminProductMenu();

        } else if (selection == 2) {
            System.out.println("                         Add Stock");
            System.out.println("0.Back");
            System.out.println("================================================================");
            System.out.print("Enter Product ID : ");
            selectId = data1.nextInt();
            if (selectId != 0) {
                System.out.print("Enter Amount : ");
                int amount = data2.nextInt();

                System.out.println(
                        "   Product : " + product.getPname(selectId) + " " + product.getPstock(selectId) + " In stock");
                System.out.println("Press 0 to continue");
                product.addStock(selectId, amount);
                System.out.println("================================================================");
                next = option.nextInt();

                adminProductMenu();
            } else {
                System.out.println("================================================================");
                adminProductMenu();
            }
        } else if (selection == 3) {
            System.out.println("                        Delete Product");
            System.out.println("0.Back");
            System.out.println("================================================================");
            System.out.print("Enter Product ID to Delete : ");
            int deleteProduct = option.nextInt();
            if (deleteProduct != 0) {
                System.out.println(
                        "   Product : " + product.getPname(deleteProduct) + " was Deleted");
                System.out.println("Press 0 to continue");
                product.deleteProduct(deleteProduct);
                System.out.println("================================================================");
                next = option.nextInt();
                adminProductMenu();
            } else {
                System.out.println("================================================================");
                adminProductMenu();
            }
        } else

        {
            adminMain();
        }
    }

    public static void adminOrderMenu() {
        System.out.println("                DSG Comshop Admin : Order");
        System.out.println("Order List");
        System.out.println("Number of Order : " + Order.limit);
        for (int i = Order.limit; i >= 1; i--) {
            System.out.println("Order Number : " + Order.getOid(i) + "  \n  "
                    + product.getPname(Order.getPid(i)) + ""
                    + "\n  Total : " + Order.getTotal(i) + "\n  Bought Date : " + Order.getBought_date(i)
                    + " \n  Status : " + Order.getOrder_Status(i) + " \n");
        }
        System.out.println("Select Order ID");
        System.out.println("0.Back");
        System.out.println("================================================================");
        System.out.print("Enter Order ID : ");
        selectId = data1.nextInt();
        System.out.println("================================================================");
        if (selectId != 0) {
            System.out.println("                      Update Order Status");
            System.out.println("1.Confirm Order");
            System.out.println("2.Cancel Order");
            System.out.println("0.Back");
            System.out.println("================================================================");
            System.out.print("Your Option : ");
            selection = option.nextInt();
            String stat = "";
            if (selection == 1) {
                stat = "Confirm";
                order.confirmOrder(selectId);
                receipt.makeReceipt(order.getPid(selectId), order.getMemberId(selectId),
                        order.getBought_date(selectId), order.getTotal(selectId));
                System.out.println("================================================================");
                System.out.println("                        Order Confirmed!");
                System.out.println("================================================================");
                adminOrderMenu();
            } else if (selection == 2) {
                stat = "Cancel";
                System.out.println("                 Do you want to Cancel Order : " + selectId);
                System.out.println("1.Confirm");
                System.out.println("0.Back");
                System.out.println("================================================================");
                System.out.print("Your Option : ");
                selection = data2.nextInt();
                if (selection == 1) {
                    member.topup(order.getMemberId(selectId), Order.getTotal(selectId));
                    order.cancelOrder(selectId);
                    System.out.println("                 Order : " + selectId + " was Canceled");
                    System.out.println("Press 0 to continue");
                    System.out.println("================================================================");
                    next = option.nextInt();
                    adminOrderMenu();
                } else {
                    adminOrderMenu();
                }
            } else {
                adminOrderMenu();
            }
        } else {
            adminMain();
        }

    }

    public static void adminDeliveryMenu() {
        System.out.println("                DSG Comshop Admin : Delivery");
        System.out.println("Delivery List");
        System.out.println("Number of Delivery : " + Delivery.limit);
        for (int i = Delivery.limit; i >= 1; i--) {
            System.out.println("Order Number : " + delivery.getDid(i) + "  \n  "
                    + "OrderNumber : " + Delivery.getOid(i) + ""
                    + "\n  Member : " + member.getMemberName(Delivery.getMemberId(i)) + "\n  Delivery Address : "
                    + delivery.getDeliveryAddress(i)
                    + " \n  Delivery Track : " + delivery.getDeliveryTrack(i) + " \n");
        }
        System.out.println("================================================================");
        System.out.println("Please select option");
        System.out.println("1.Make Delivery");
        System.out.println("2.Complete Delivery");
        System.out.println("0.Back");
        System.out.println("================================================================");
        System.out.print("Your option : ");
        selection = option.nextInt();
        System.out.println("================================================================");
        if (selection == 1) {
            // Make Delivery
            System.out.println("                        Make Delivery");
            System.out.println("0.Back");
            System.out.println("================================================================");
            System.out.print("Enter Order ID : ");
            selectId = data1.nextInt();
            if (selectId != 0) {
                System.out.println("Delivery Order : " + selectId + " ?");
                System.out.println("1.Delivery");
                System.out.println("0.Back");
                System.out.println("================================================================");
                System.out.print("Your option : ");
                int selectDelivery = data2.nextInt();
                if (selectDelivery == 1) {
                    System.out.print("Enter Delivery Track : ");
                    String dt = data3.nextLine();
                    delivery.setDeliveryData(1, selectId, order.getMemberId(selectId),
                            member.getAdress(order.getMemberId(selectId)));
                    delivery.enterDeliveryTrack(dt);
                    order.deliveryOrder(selectId, "Delivery");
                } else {
                    adminDeliveryMenu();
                }
                System.out.println("================================================================");
                System.out.println("                    Delivery Success!");
                System.out.println("================================================================");
                adminDeliveryMenu();
            }
        } else if (selection == 2) {
            System.out.println("                    DSG Comshop Admin : Order");
            System.out.println("                          Complete Delivery ");
            System.out.println("0.Back");
            System.out.println("================================================================");
            System.out.print("Enter Order ID : ");
            int d = data1.nextInt();
            if (selectId != 0) {
                System.out.println("                 Do you want to Complete Delivery : " + d);
                System.out.println("1.Confirm");
                System.out.println("0.Back");
                System.out.println("================================================================");
                System.out.print("Your Option : ");
                selection = data1.nextInt();
                if (selection == 1) {
                    // delivery.deleteOrder(d);
                    order.completedOrder(d, "Delivery Completed");
                    waranty.addWaranty(d);
                    adminDeliveryMenu();
                } else {
                    adminDeliveryMenu();
                }
            } else {
                adminDeliveryMenu();
            }
            System.out.println("================================================================");
        } else {
            adminMain();
        }
    }

    public static void adminReceiptMenu() {
        for (int i = receipt.limit; i >= 1; i--) {
            System.out.println("Order Number : " + Receipt.getRid(i) + "  \n  "
                    + product.getPname(Receipt.getPid(i)) + "\n  " + member.getMemberName(receipt.getMemberId(i))
                    + "\n  Total : " + Receipt.getTotal(i) + "\n  Bought Date : " + Order.getBought_date(i));
        }
        adminMain();
    }

    public static void adminWaranty() {
        System.out.println("                DSG Comshop Admin : Waranty");
        System.out.println("Waranty List");
        for (int i = waranty.limit; i >= 1; i--) {

            System.out.println("Waranty Number : " + Waranty.getWid(i) + "  \n  "
                    + product.getPname(Receipt.getPid(Waranty.getRid(i))) + "\n  "
                    + member.getMemberName(Waranty.getMemberId(i))
                    + "\n  Bought Date : " + Receipt.getBought_date(Waranty.getRid(i)) + "\n  Waranty Status : "
                    + waranty.getWarantyStatus(i));
        }
        System.out.println("Please select option");
        System.out.println("1.Manage Waranty Status");
        System.out.println("0.Back");
        System.out.println("================================================================");
        System.out.print("Your option : ");
        selection = option.nextInt();
        System.out.println("================================================================");
        if (selection == 1) {
            System.out.println("                        Manage Waranty Status ");
            System.out.println("0.Back");
            System.out.println("================================================================");
            System.out.print("Enter Waranty ID : ");
            int w = data1.nextInt();
            if (w != 0) {
                waranty.updateWarantyStatus(w);
                System.out.println("================================================================");
                System.out.println("                            Success!");
                System.out.println("================================================================");
            }
            adminWaranty();
        } else {
            adminMain();
        }
    }

    // --------------------------------------------------------------Member----------------------------------------------------------------------

    public static boolean memberLogin(int mid, String mPassword) {
        int memid = 0;
        if (memberLogin == false) {
            for (int i = 0; i < Member.member_id.length; i++) {
                if (mid == member.getMemberId(i) && mPassword.equals(member.getMemberPassword(i))) {
                    memberLogin = true;
                    memid = member.getMemberId(i);
                    memberFirstPage(memid);
                }
            }
        } else {
            System.out.println("                    Wrong username or password!");
            System.out.println("                    Back to Login Page...");
            System.out.println("================================================================");
            memberLogin = false;
            login();
        }
        return memberLogin;
    }

    public static void memberFirstPage(int memid) {
        System.out.println("           Welcome To DSG Comshop : " + member.getMemberName(memid));
        System.out.println("================================================================");
        System.out.println("Please select option");
        System.out.println("1.View Product");
        System.out.println("2.Check Order");
        System.out.println("3.Check Delivery Status");
        System.out.println("4.Check Receipt");
        System.out.println("5.Check Waranty");
        System.out.println("0.exit");

        System.out.println("================================================================");
        System.out.print("Your option : ");
        selection = option.nextInt();
        System.out.println("================================================================");
        if (selection == 1) {
            memberViewProduct(memid);
        } else if (selection == 2) {
            memberViewOrder(memid);
        } else if (selection == 3) {
            memberViewDelivery(memid);
        } else if (selection == 4) {
            memberViewReceipt(memid);
        } else if (selection == 5) {
            memberViewWaranty(memid);
        } else {
            firstPage();
        }

    }

    public static void memberViewProduct(int memid) {
        System.out.println("Product List");
        System.out.println("Number of Product : " + Product.limit);
        for (int i = 1; i <= Product.limit; i++) {
            if (product.getPwaranty(i).equals("Lifetime")) {
                System.out.println(
                        product.getPid(i) + "." + product.getPname(i)
                                + "\n Waranty " + product.getPwaranty(i) +
                                " Years Stock : " + product.getPstock(i) + "                            "
                                + product.getPprice(i) + " Baht");
                System.out.println(" ----------------------------------------------------------------");
            } else if (product.getPwaranty(i).equals("null")) {
                System.out.println(
                        product.getPid(i) + "." + product.getPname(i)
                                + "\n Waranty " + product.getPwaranty(i) +
                                " Years Stock : " + product.getPstock(i) + "                                 "
                                + product.getPprice(i) + " Baht");
                System.out.println(" ----------------------------------------------------------------");
            } else if (product.getPprice(i) < 10000) {
                System.out.println(
                        product.getPid(i) + "." + product.getPname(i)
                                + "\n Waranty " + product.getPwaranty(i) +
                                " Years Stock : " + product.getPstock(i) + "                                   "
                                + product.getPprice(i) + " Baht");
                System.out.println(" ----------------------------------------------------------------");
            } else {
                System.out.println(
                        product.getPid(i) + "." + product.getPname(i)
                                + "\n Waranty " + product.getPwaranty(i) +
                                " Years Stock : " + product.getPstock(i) + "                                  "
                                + product.getPprice(i) + " Baht");
                System.out.println(" ----------------------------------------------------------------");
            }
        }
        System.out.println("================================================================");
        System.out.println("Your Balance : " + member.getBalance(memid));
        System.out.println("0.exit");
        System.out.println("================================================================");
        System.out.print("Select Product : ");
        selectId = option.nextInt();
        System.out.println("================================================================");
        if (selectId != 0) {
            System.out.println("           Welcome To DSG Comshop : " + member.getMemberName(memid));
            System.out.println("================================================================");
            System.out.println(" ----------------------------------------------------------------");
            System.out.println("                             Order");
            System.out.println(" ----------------------------------------------------------------");
            System.out.println(
                    " 1. " + product.getPname(selectId)
                            + "\n amount : 1                                        "
                            + product.getPprice(selectId));
            System.out.println(" ----------------------------------------------------------------");
            System.out.println(" Total                                             " + product.getPprice(selectId));
            System.out.println(" ----------------------------------------------------------------");
            System.out.println("1.Confirm");
            System.out.println("0.exit");
            System.out.println("================================================================");
            System.out.print("Your option : ");
            selection = option.nextInt();
            System.out.println("================================================================");
            if (selection == 1) {
                if (member.getBalance(memid) - product.getPprice(selectId) >= 0) {
                    int total = product.getPprice(selectId);
                    product.sellProduct(selectId);
                    member.buyProduct(memid, total);
                    order.makeAnOrder(1, memid, selectId, date_bought, total, "Waiting");
                    System.out.println("                        Order Success");
                    System.out.println("Press 0 to continue");
                    System.out.println("================================================================");
                    next = option.nextInt();
                    memberViewProduct(memid);
                } else {
                    System.out.println("                        Not Enough Balance");
                    System.out.println("Press 0 to continue");
                    System.out.println("================================================================");
                    next = option.nextInt();
                    memberViewProduct(memid);
                }
            } else {
                memberViewProduct(memid);
            }
        } else
            memberFirstPage(memid);

    }

    public static void memberViewOrder(int memid) {
        System.out.println("           Welcome To DSG Comshop : " + member.getMemberName(memid));
        System.out.println("================================================================");
        System.out.println("Your Order");

        // int[] OrderMemberId = order.getMemberIdA(memid, 0);

        for (int i = order.limit; i >= 1; i--) {
            if (order.getMemberId(i) == memid) {
                System.out.println("Order Number : " + Order.getOid(i) + "  \n  "
                        + product.getPname(Order.getPid(i))
                        + "\n  Total : " + Order.getTotal(i) + "\n  Bought Date : "
                        + Order.getBought_date(i)
                        + " \n  Status : " + Order.getOrder_Status(i) + " \n");
            }

        }
        System.out.println("================================================================");
        memberFirstPage(memid);
    }

    public static void memberViewDelivery(int memid) {
        System.out.println("           Welcome To DSG Comshop : " + member.getMemberName(memid));
        System.out.println("================================================================");
        System.out.println("Your Order");

        // int[] DeliveryMemberId = delivery.getMemberIdA(memid, 0);

        // for (int i = delivery.getLeng(); i >= 1; i--) {
        // System.out.println("Delivery Id : " + delivery.getOid(DeliveryMemberId[i]) +
        // " of Otder "
        // + delivery.getOid(DeliveryMemberId[i])
        // + "\n Member : " + member.getMemberName(memid) + "\n Delivery to : "
        // + delivery.getDeliveryAddress(DeliveryMemberId[i])
        // + " \n Delivery Track : " + delivery.getDeliveryTrack(DeliveryMemberId[i]) +
        // " \n");

        // }
        for (int i = delivery.limit; i >= 1; i--) {
            if (delivery.getMemberId(i) == memid)
                System.out.println("Delivery Id : " + delivery.getOid(i) + " of Otder "
                        + delivery.getOid(i)
                        + "\n  Member : " + member.getMemberName(memid) + "\n  Delivery to : "
                        + delivery.getDeliveryAddress(i)
                        + " \n  Delivery Track : " + delivery.getDeliveryTrack(i) + " \n");
            System.out.println(" ----------------------------------------------------------------");

        }
        System.out.println("================================================================");
        memberFirstPage(memid);
    }

    public static void memberViewReceipt(int memid) {
        System.out.println("           Welcome To DSG Comshop : " + member.getMemberName(memid));
        System.out.println("================================================================");
        System.out.println("Your Receipt");
        for (int i = receipt.limit; i >= 1; i--) {
            if (receipt.getMemberId(i) == memid) {
                System.out.println("Order Number : " + Receipt.getRid(i) + "  \n  "
                        + product.getPname(Receipt.getPid(i)) + "\n  " + member.getMemberName(memid)
                        + "\n  Total : " + Receipt.getTotal(i) + "\n  Bought Date : " + Order.getBought_date(i));
                System.out.println(" ----------------------------------------------------------------");
            }

        }
        System.out.println("================================================================");
        memberFirstPage(memid);

    }

    public static void memberViewWaranty(int memid) {
        System.out.println("           Welcome To DSG Comshop : " + member.getMemberName(memid));
        System.out.println("================================================================");
        System.out.println("Your Waranty");
        for (int i = waranty.limit; i >= 1; i--) {
            if (waranty.getMemberId(memid) == memid) {
                System.out.println("Waranty Number : " + Waranty.getWid(i) + "  \n  "
                        + product.getPname(Receipt.getPid(Waranty.getRid(i))) + "\n  "
                        + member.getMemberName(Waranty.getMemberId(i))
                        + "\n  Bought Date : " + Receipt.getBought_date(Waranty.getRid(i)) + "\n  Waranty Status : "
                        + waranty.getWarantyStatus(i));
                System.out.println(" ----------------------------------------------------------------");
            }
        }
        System.out.println("================================================================");
        memberFirstPage(memid);
    }
}
