package Practice.bai53;

import java.util.Arrays;
import java.util.Scanner;

public class StoreManagement {
    private int n;
    private Store[] stores;

    public StoreManagement(int n) {
        this.n = n;
        this.stores = new Store[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            stores[i] = new Store(i + 1);
        }
        sc.close();
    }

    public int hasBluetooth() {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < stores[i].getN(); j++) {
                if (stores[i].getPhones()[j].isHasBluetooth()) {
                    count++;
                }
            }
        }
        return count;
    }

    public int has5G() {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < stores[i].getN(); j++) {
                if (stores[i].getPhones()[j].isHas5G()) {
                    count++;
                }
            }
        }
        return count;
    }

    public int hasWifi() {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < stores[i].getN(); j++) {
                if (stores[i].getPhones()[j].isHasWifi()) {
                    count++;
                }
            }
        }
        return count;
    }

    public void print() {
        for (int i = 0; i < n; i++) {
            stores[i].print(i);
        }
    }

    public String MaxRevenue() {
        Store max = stores[0];
        for (int i = 0; i < n; i++) {
            if (stores[i].revenue() > max.revenue()) {
                max = stores[i];
            }
        }
        return max.toString();
    }

    public String MinRevenue() {
        Store min = stores[0];
        for (int i = 0; i < n; i++) {
            if (stores[i].revenue() < min.revenue()) {
                min = stores[i];
            }
        }
        return min.toString();
    }

    public String MaxTotalSold() {
        Store max = stores[0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < stores[i].getN(); j++) {
                if (stores[i].getPhones()[j].getTotalSold() > max.getPhones()[j].getTotalSold()) {
                    max = stores[i];
                }
            }
        }
        return max.toString();
    }

    public String MinTotalSold() {
        Store min = stores[0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < stores[i].getN(); j++) {
                if (stores[i].getPhones()[j].getTotalSold() < min.getPhones()[j].getTotalSold()) {
                    min = stores[i];
                }
            }
        }
        return min.toString();
    }
}
