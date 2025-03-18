public class FinalValue {
    public static int finalValueAfterOperations(String[] operations) {
        int count = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].contains("+")) {
                count++;
            } else {
                count--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(finalValueAfterOperations(new String[] {"--X","X++","X++"}));
    }
}
