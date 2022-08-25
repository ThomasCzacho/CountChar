public class CountChar {

    public static void main(String[] args) {

        String str = "www.oracle.com";

        int current = 0;
        int max = str.length();
        int count = 0;

        while (current!=(max-1)){

            if (str.charAt(current) != 'w') {
                current++;
                continue;
            }
            current++;
            count++;
        }
        System.out.println("Counting w : " + count );
    }
}


