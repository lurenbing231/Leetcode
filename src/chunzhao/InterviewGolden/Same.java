package chunzhao.InterviewGolden;


public class Same {
    public boolean checkSam(String stringA, String stringB) {
        if (stringA.length() != stringB.length()) return false;
        int[] a = new int[256];
        int[] b = new int[256];
        for (int i = 0; i < stringA.length(); i++) {
            a[stringA.charAt(i)]++;
            b[stringB.charAt(i)]++;
        }
        for (int i=0;i<256;i++){
            if (a[i]!=b[i]) return false;
        }
        return true;
    }
}
