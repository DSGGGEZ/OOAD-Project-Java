public class Member extends Person {

    static String[] citizen_id = new String[100];
    static String[] member_name = new String[100];
    static String[] address = new String[100];
    static String[] email = new String[100];
    static String[] telephone = new String[100];
    static int[] balance = new int[100];

    static int limit = 1;

    Member(int member_id, String member_password, String citizen_id, String member_name, String address, String email,
            String telephone, int balance) {
        super.personId[limit] = member_id;
        super.password[limit] = member_password;
        Member.citizen_id[limit] = citizen_id;
        Member.member_name[limit] = member_name;
        Member.address[limit] = address;
        Member.email[limit] = email;
        Member.telephone[limit] = telephone;
        Member.balance[limit] = balance;
    }

    // -----------------------------------------getMethod-----------------------------------------------
    public int getMemberId(int id) {
        int idMember = 0;
        for (int i = 0; i <= limit; i++) {
            if (personId[i] == id) {
                idMember = personId[i];
            }
        }

        return idMember;
    }

    public String getMemberPassword(int id) {
        String passwordMember = "";
        for (int i = 0; i <= limit; i++) {
            if (id == personId[i]) {
                passwordMember = password[i];
            }
        }
        return passwordMember;
    }

    public String getMemberCitizenId(int id) {
        String idCitizen = "";
        for (int i = 0; i <= limit; i++) {
            if (id == personId[i]) {
                idCitizen = citizen_id[i];
            }
        }
        return idCitizen;
    }

    public static String getMemberName(int id) {
        String nameMember = "";
        for (int i = 0; i <= limit; i++) {
            if (id == personId[i]) {
                nameMember = member_name[i];
            }
        }
        return nameMember;
    }

    public String getAdress(int id) {
        // String addressM = "";
        // for (int i = 0; i <= limit; i++) {
        // if (id == member_id[i]) {
        // addressM = address[i];
        // }
        // }
        return address[id];
    }

    public String getEmail(int id) {
        String emailM = "";
        for (int i = 0; i <= limit; i++) {
            if (id == personId[i]) {
                emailM = email[i];
            }
        }
        return emailM;
    }

    public String getTelephone(int id) {
        String telephoneM = "";
        for (int i = 0; i <= limit; i++) {
            if (id == personId[i]) {
                telephoneM = telephone[i];
            }
        }
        return telephoneM;
    }

    public int getBalance(int id) {
        int balanceM = 0;
        for (int i = 0; i <= limit; i++) {
            if (id == personId[i]) {
                balanceM = balance[i];
            }
        }
        return balanceM;
    }

    // -----------------------------------------SetMethod-----------------------------------------------
    public static void setMemberData(int limP, int id, String name_member, String password_member, String idCitizen,
            String addressM, String emailM, String telephoneM, int balanceM) {
        limit += limP;
        personId[limit] = limit;
        member_name[limit] = name_member;
        password[limit] = password_member;
        citizen_id[limit] = idCitizen;
        address[limit] = addressM;
        email[limit] = emailM;
        telephone[limit] = telephoneM;
        balance[limit] = balanceM;
    }

    // -----------------------------------------EditMethod-----------------------------------------------
    public static void editMemberData(int selectId, String name_member, String password_member,
            String idCitizen, String addressM, String emailM, String telephoneM, int balanceM) {
        member_name[selectId] = name_member;
        password[selectId] = password_member;
        citizen_id[selectId] = idCitizen;
        address[selectId] = addressM;
        email[selectId] = emailM;
        telephone[selectId] = telephoneM;
        balance[selectId] = balanceM;
    }

    // -----------------------------------------DeleteMethod----------------------------------------------
    public void deleteMember(int id) {
        int pos = id;
        personId[pos] = 0;
        password[pos] = null;
        citizen_id[pos] = null;
        member_name[pos] = null;
        address[pos] = null;
        email[pos] = null;
        telephone[pos] = null;
        balance[pos] = 0;

        // limit--;
    }

    // -------------------------------------------Operation------------------------------------------------
    public void buyProduct(int id, int total) {
        balance[id] -= total;
    }

    public static void topup(int id, int total) {
        balance[id] += total;
    }

}