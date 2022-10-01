public class Delivery {

    static int[] did = new int[100];
    static int[] oid = new int[100];
    static int[] member_id = new int[100];
    static String[] delivery_address = new String[100];
    static String[] delivery_track = new String[100];

    static int limit = 1;

    static int leng = 0;

    Delivery(int idO, int idMember, String address_delivery, String track_delivery) {

        Delivery.did[limit] = limit;
        Delivery.oid[limit] = idO;
        Delivery.member_id[limit] = idMember;
        Delivery.delivery_address[limit] = address_delivery;
        Delivery.delivery_track[limit] = track_delivery;
    }

    public int[] getMemberIdA(int id, int len) {
        int[] idMember = new int[100];
        leng = len;
        for (int i = 0; i <= limit; i++) {
            if (member_id[i] == id) {
                idMember[len] = i;
                leng++;
            }
        }

        return idMember;
    }

    public int getLeng() {
        return leng;
    }

    // // GetByMemberID-------------------------------------------
    // public int[] getDidA(int id) {
    // int[] idD = new int[100];
    // int len = 0;
    // for (int i = 0; i <= limit; i++) {
    // if (member_id[i] == id) {
    // idD[len] = oid[i];
    // len++;
    // }
    // }
    // return idD;
    // }

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

    // // public int getMemberId(int id) {
    // // int idMember = 0;
    // // for (int i = 0; i <= limit; i++) {
    // // if (member_id[i] == id) {
    // // idMember[] = member_id[i];
    // // }
    // // }

    // // return idMember;
    // // }

    // public int[] getDeliveryAddressA(int id) {
    // int[] addressDelivery = new int[100];
    // int len = 0;
    // for (int i = 0; i <= limit; i++) {
    // if (member_id[i] == id) {
    // addressDelivery[len] = i;
    // len++;
    // }
    // }
    // return addressDelivery;
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
    public int getDid(int id) {
        return did[id];
    }

    public static int getOid(int id) {
        return oid[id];
    }

    public static int getMemberId(int id) {
        return member_id[id];
    }

    public static String getDeliveryAddress(int id) {
        return delivery_address[id];
    }

    public static String getDeliveryTrack(int id) {
        return delivery_track[id];
    }

    // --------------------------------------setMothod---------------------------------------------------
    public void setDeliveryData(int limP, int idO, int id_member, String address_delivery) {

        limit += limP;
        did[limit] = limit;
        oid[limit] = idO;
        member_id[limit] = id_member;
        delivery_address[limit] = address_delivery;
    }

    public void enterDeliveryTrack(String track_delivery) {
        delivery_track[limit] = track_delivery;
    }

    public void deleteOrder(int id) {
        did[id] = 0;
        oid[id] = 0;
        member_id[id] = 0;
        delivery_address[id] = null;
        delivery_track[id] = null;
    }

}
