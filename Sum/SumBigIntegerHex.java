import java.math.BigInteger;

public class SumBigIntegerHex {
    public static void main(String[] args) {
        StringBuilder now = new StringBuilder();
        BigInteger sum = BigInteger.ZERO;
        for (int i = 0; i < args.length; i++) {
            args[i] += " ";
            for (int j = 0; j < args[i].length(); j++) {
                if (Character.isWhitespace(args[i].charAt(j))) {
                    if (now.length() != 0) {
                        BigInteger number;
                        if (now.length() > 1 && (now.charAt(1) == 'x' || now.charAt(1) == 'X')) {
                            number = new BigInteger(now.substring(2), 16);
                        } else {
                            number = new BigInteger(now.toString());
                        }
                        sum = sum.add(number);
                        now = new StringBuilder();
                    }
                } else {
                    now.append(args[i].charAt(j));
                }
            }
        }
        System.out.println(sum);
    }
}
