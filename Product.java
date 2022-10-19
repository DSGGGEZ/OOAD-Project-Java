public class Product {
    static int[] pId = new int[100];
    static String[] pName = new String[100];
    static String[] pType = new String[100];
    static String[] pWaranty = new String[100];
    static int[] pPrice = new int[100];
    static int[] pStock = new int[100];

    static int limit = 1;

    Product(int[] pId, String[] pName, String[] pType, String[] pWaranty, int[] pPrice, int[] pStock) {
        for (int i = 0; i < pId.length; i++) {
            Product.pId[i + 1] = pId[i];
            Product.pName[i + 1] = pName[i];
            Product.pType[i + 1] = pType[i];
            Product.pWaranty[i + 1] = pWaranty[i];
            Product.pPrice[i + 1] = pPrice[i];
            Product.pStock[i + 1] = pStock[i];
            if (limit != pId.length)
                Product.limit++;
        }
    }

    public int getPid(int id) {
        int idMember = 0;
        for (int i = 0; i <= limit; i++) {
            if (pId[i] == id) {
                idMember = pId[i];
            }
        }

        return idMember;
    }

    public String getPname(int id) {
        String nameP = "";
        for (int i = 0; i <= limit; i++) {
            if (id == pId[i]) {
                nameP = pName[i];
            }
        }
        return nameP;
    }

    public String getPtype(int id) {
        String typeP = "";
        for (int i = 0; i <= limit; i++) {
            if (id == pId[i]) {
                typeP = pType[i];
            }
        }
        return typeP;
    }

    public String getPwaranty(int id) {
        String warantyP = "";
        for (int i = 0; i <= limit; i++) {
            if (id == pId[i]) {
                warantyP = pWaranty[i];
            }
        }
        return warantyP;
    }

    public int getPprice(int id) {
        int priceP = 0;
        for (int i = 0; i <= limit; i++) {
            if (id == pId[i]) {
                priceP = pPrice[i];
            }
        }
        return priceP;
    }

    public int getPstock(int id) {
        int stockP = 0;
        for (int i = 0; i <= limit; i++) {
            if (id == pId[i]) {
                stockP = pStock[i];
            }
        }
        return stockP;
    }

    // -----------------------------------------SetMethod-----------------------------------------------
    public static void addProduct(int limP, String nameP, String typeP, String warantyP, int priceP,
            int stockP) {
        limit += limP;
        pId[limit] = limit;
        pName[limit] = nameP;
        pType[limit] = typeP;
        pWaranty[limit] = warantyP;
        pPrice[limit] = priceP;
        pStock[limit] = stockP;
    }

    public void deleteProduct(int id) {
        int pos = id;
        pId[pos] = 0;
        pName[pos] = null;
        pType[pos] = null;
        pWaranty[pos] = null;
        pPrice[pos] = 0;
        pStock[pos] = 0;
    }

    public void sellProduct(int id) {
        pStock[id]--;
    }

    public void addStock(int id, int amount) {
        pStock[id] += amount;
    }

}