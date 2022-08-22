public class Main {
    public static void main(String[] args) {
        BonusServis service = new BonusServis();
        long bonus = service.calculate(5000, true);
        System.out.println(bonus);
    }
}
