public class ABC {
    public static void adferd1() {
        System.out.println("Static");
    }

    public void adferd2() {
        System.out.println("Instance");
    }

    public static void main(String[] args) {
        adferd1();
        ABC hlut = new ABC();
        hlut.adferd2();
    }
}
