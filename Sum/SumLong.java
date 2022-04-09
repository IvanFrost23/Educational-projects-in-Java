public class SumLong {
    public static void main(String[] args) {
        StringBuilder now = new StringBuilder();
        Long sum = 0l;
        for (int i = 0; i < args.length; i++) {
            args[i] += " ";
            for (int j = 0; j < args[i].length(); j++) {
                if (Character.isWhitespace(args[i].charAt(j))) {
                    if (now.length() != 0) {
                        sum += Long.valueOf(now.toString());
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
