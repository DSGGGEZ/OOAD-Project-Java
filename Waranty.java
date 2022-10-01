public class Waranty {

    static int[] wid = new int[100];
    static int[] member_id = new int[100];
    static int[] rid = new int[100];
    static String[] waranty_status = new String[100];

    static int limit = 1;

    Waranty(int rid, int member_id) {
        Waranty.wid[limit] = limit;
        Waranty.member_id[limit] = member_id;
        Waranty.rid[limit] = rid;
        Waranty.waranty_status[limit] = "In waranty";
    }

    public static int getWid(int id) {
        return wid[id];
    }

    public static int getRid(int id) {
        return rid[id];
    }

    public static int getMemberId(int id) {
        return member_id[id];
    }

    public static String getWarantyStatus(int id) {
        return waranty_status[id];
    }

    public static void addWaranty(int idR) {
        limit++;
        wid[limit] = limit;
        rid[limit] = idR;
        waranty_status[limit] = "In waranty";
    }

    public static void updateWarantyStatus(int id, String status_waranty) {
        waranty_status[id] = status_waranty;
    }

}
