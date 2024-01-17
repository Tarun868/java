public class Reversetype {
    public static void main(String[] args){
        int x=12345;
        while(x!=0) {
            int j = x % 10;
            System.out.print(j);
            x = x / 10;
        }

    }
}
