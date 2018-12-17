package qiuzhao.didi;

import java.util.Scanner;

public class biancheng2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int np = sc.nextInt();
        int nq = sc.nextInt();
        int nr = sc.nextInt();
        if (pd(np, nq, nr)) {
            System.out.println(0);
            return;
        }
        if (np == nq + nr) {
            long tmp = 1;
            long tmp1 = 1;
            for (int i = np; i >= nq; i--) {
                tmp *= i;
            }
            for (int i = 1; i <= nq; i++) {
                tmp1 *= i;
            }
            System.out.println(2 * (tmp / tmp1));
            return;
        }
        if (nq == np + nr) {
            long tmp = 1;
            long tmp1 = 1;
            for (int i = nq; i >= np; i--) {
                tmp *= i;
            }
            for (int i = 1; i <= np; i++) {
                tmp1 *= i;
            }
            System.out.println(2 * (tmp / tmp1));
            return;
        }
        if (nr == nq + np) {
            long tmp = 1;
            long tmp1 = 1;
            for (int i = nr; i >= nq; i--) {
                tmp *= i;
            }
            for (int i = 1; i <= nq; i++) {
                tmp1 *= i;
            }
            System.out.println(2 * (tmp / tmp1));
        }
        System.out.println(getNum(np - 1, nq, nr, 1)
                + getNum(np, nq - 1, nr, 2)
                + getNum(np, nq, nr - 1, 3));
    }

    private static boolean pd(int np, int nq, int nr) {
        if (np - 1 > nq + nr) {
            return true;
        }
        if (nq - 1 > np + nr) {
            return true;
        }
        if (nr - 1 > nq + np) {
            return true;
        }
        return false;
    }

    private static int getNum(int np, int nq, int nr, int pre) {
        if (np < 0 || nq < 0 || nr < 0) {
            return 0;
        }
        if (pd(np, nq, nr)) {
            return 0;
        }
        if (np == 0 && nq == 0 && nr == 0) {
            return 1;
        }
        if (pre == 1) {
            if (np == 0) {
                if (nq != nr) {
                    return 1;
                } else {
                    return 2;
                }
            }
            return getNum(np, nq - 1, nr, 2) + getNum(np, nq, nr - 1, 3);
        }
        if (pre == 2) {
            if (nq == 0) {
                if (np != nr) {
                    return 1;
                } else {
                    return 2;
                }
            }
            return getNum(np - 1, nq, nr, 1) + getNum(np, nq, nr - 1, 3);
        }
        if (pre == 3) {
            if (nr == 0) {
                if (np != nq) {
                    return 1;
                } else {
                    return 2;
                }
            }
            return getNum(np - 1, nq, nr, 1) + getNum(np, nq - 1, nr, 2);
        }
        return 0;
    }
}
