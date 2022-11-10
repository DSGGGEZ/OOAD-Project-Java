public class Order {
    // Queue<Integer> qoid = new LinkedList<>();
    // Queue<Integer> qmember_id = new LinkedList<>();
    // Queue<Integer> qpId = new LinkedList<>();
    // Queue<String> qbought_date = new LinkedList<>();
    // Queue<Integer> qtotal = new LinkedList<>();
    // Queue<String> qorder_status = new LinkedList<>();

    static int[] oid = new int[100];
    static int[] member_id = new int[100];
    static int[] pId = new int[100];
    static String[] bought_date = new String[100];
    static int[] total = new int[100];
    static String[] order_status = new String[100];

    static int limit = 1;
    static int leng = 0;

    Order(int id_member, int idP, String date_bought, int totalP, String status_order) {

        Order.oid[limit] = limit;
        Order.member_id[limit] = id_member;
        Order.pId[limit] = idP;
        Order.bought_date[limit] = date_bought;
        Order.total[limit] = totalP;
        Order.order_status[limit] = status_order;
    }

    public int[] getMemberIdA(int id, int len) {
        int[] idMember = new int[100];
        leng = len;
        for (int i = 0; i <= limit; i++) {
            if (member_id[i] == id) {
                idMember[leng] = i;
                leng++;
            }
        }

        return idMember;
    }

    public int getLeng() {
        return leng;
    }

    // // -------------------------------------------
    // public int[] getOidA(int id) {
    // int[] idO = new int[100];
    // int len = 0;
    // for (int i = 0; i <= limit; i++) {
    // if (member_id[i] == id) {
    // idO[len] = oid[i];
    // len++;
    // }
    // }
    // return idO;
    // }

    // // public int getMemberIdA(int id) {
    // // int idMember = 0;
    // // for (int i = 0; i <= limit; i++) {
    // // if (member_id[i] == id) {
    // // idMember = member_id[i];
    // // }
    // // }

    // // return idMember;
    // // }

    // public int[] getPidA(int id) {
    // int[] idP = new int[100];
    // int len = 0;
    // for (int i = 0; i <= limit; i++) {
    // if (member_id[i] == id) {
    // idP[len] = pId[i];
    // len++;
    // }
    // }
    // return idP;
    // }

    // public String[] getBought_dateA(int id) {
    // String[] date_bought = new String[100];
    // int len = 0;
    // for (int i = 0; i <= limit; i++) {
    // if (member_id[i] == id) {
    // date_bought[len] = bought_date[i];
    // len++;
    // }
    // }
    // return date_bought;
    // }

    // public int[] getTotalA(int id) {
    // int[] totalO = new int[100];
    // int len = 0;
    // for (int i = 0; i <= limit; i++) {
    // if (member_id[i] == id) {
    // totalO[len] = total[i];
    // len++;
    // }
    // }
    // return totalO;
    // }

    // public String[] getOrder_StatusA(int id) {
    // String[] status_order = new String[100];
    // int len = 0;
    // for (int i = 0; i <= limit; i++) {
    // if (member_id[i] == id) {
    // status_order[len] = order_status[i];
    // len++;
    // }
    // }
    // return status_order;
    // }

    // -----------------getNonArray--------------------
    public static int getOid(int id) {
        return oid[id];
    }

    public int getMemberId(int id) {
        return member_id[id];
    }

    public static int getPid(int id) {
        return pId[id];
    }

    public static String getBought_date(int id) {
        return bought_date[id];
    }

    public static int getTotal(int id) {
        return total[id];
    }

    public static String getOrder_Status(int id) {
        return order_status[id];
    }

    // --------------------------------------setMothod---------------------------------------------------
    public void makeAnOrder(int limP, int id_member, int idP, String date_bought, int totalP,
            String status_order) {

        // Sort Array
        // Arrays.sort(oid);
        // Arrays.sort(member_id);
        // Arrays.sort(pId);
        // Arrays.sort(bought_date);
        // Arrays.sort(total);
        // Arrays.sort(order_status);
        // Add Parameter
        limit += limP;
        oid[limit] = limit;
        member_id[limit] = id_member;
        pId[limit] = idP;
        bought_date[limit] = date_bought;
        total[limit] = totalP;
        order_status[limit] = status_order;
    }

    public void confirmOrder(int id) {
        order_status[id] = "confirm";
    }

    public void deliveryOrder(int id, String status) {
        order_status[id] = status;
    }

    public void completedOrder(int id, String status) {
        order_status[id] = status;
    }

    public int cancelOrder(int id) {
        int refund = total[id];

        oid[id] = limit;
        member_id[id] = 0;
        pId[id] = 0;
        bought_date[id] = null;
        total[id] = 0;
        order_status[id] = "Canceled";

        return refund;

    }

}
