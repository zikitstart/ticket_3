public class Main {
    public static void main(String[] args) {
        String line = "158694276";
        char [] lineToArray = line.toCharArray();
        int l = lineToArray.length;

        String line1 = line.substring(0,(l+1)/2);
        String line2 = line.substring(line1.length(),l);

        System.out.println(line1);
        System.out.println(line2);
    }
}