public class Main {
    public static void main(String[] args) {
int num =10;
        for (int i = 0; i < num; i++) {
            if (num < 0) {
                num = i + i;
                i = i * 10;
            } else {
                i++;
                num++;
            }
            System.out.println(i);
        }
    }
}