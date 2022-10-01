public class Receipt {
    static int[] rid = new int[100];
    static int[] pid = new int[100];
    static int[] member_id = new int[100];
    static String[] bought_date = new String[100];
    static int[] total = new int[100];

    static int limit = 1;

    Receipt(int pid, int member_id, String bought_date, int total) {
        Receipt.rid[limit] = limit;
        Receipt.pid[limit] = pid;
        Receipt.member_id[limit] = member_id;
        Receipt.bought_date[limit] = bought_date;
        Receipt.total[limit] = total;
    }

    public static int getRid(int id) {
        return rid[id];
    }

    public static int getPid(int id) {
        return pid[id];
    }

    public static int getMemberId(int id) {
        return member_id[id];
    }

    public static String getBought_date(int id) {
        return bought_date[id];
    }

    public static int getTotal(int id) {
        return total[id];
    }

    public void makeReceipt(int idP, int id_member, String date_bought, int totalP) {

        limit++;
        rid[limit] = limit;
        member_id[limit] = id_member;
        pid[limit] = idP;
        bought_date[limit] = date_bought;
        total[limit] = totalP;
    }

}
