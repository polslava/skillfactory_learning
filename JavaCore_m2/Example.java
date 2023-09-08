public class Example {
    public static void main(String[] args) {
        int[] array = new int[10];
        int[] copy = array;
        copy[0]=5;
        for (int i = 1; i < copy.length; i++) {
            copy[i] = copy[i-1] +1;
            System.out.println(copy[i]);
        }

    }
}
