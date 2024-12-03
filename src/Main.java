public class Main {
    public static void main(String[] args) {

        int startingScore = 100;
        int draft = 1100;

        int bonus;
        if (draft > 1000) {
            bonus = draft / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Итоговый бонус:" + bonus);
    }
}
