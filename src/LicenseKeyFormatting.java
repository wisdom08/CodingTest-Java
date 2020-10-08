public class LicenseKeyFormatting {
    public static void main(String[] args) {

        String s = "5F3Z-2e-9-w";
        int k = 3;
        System.out.println(solve(s,k));
    }

    public static String solve(String s, int k){

        String newS = s.replace("-", "");

        newS = newS.toUpperCase();

        StringBuilder sb = new StringBuilder();
        int leng = newS.length();

        for (int i = 0; i < leng; i++) {
            sb.append(newS.charAt(i));
        }

        //i=> 4, 8, 12 ..
        for (int i = k; i < leng; i = i + k) {
            sb.insert(leng-i, "-");
        }

        return sb.toString();
    }
}
