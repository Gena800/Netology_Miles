public class Second {
    public static void main(String[] args) {


        int deposit = 1199;
        int bonusLimit = 100;
        int startingScore = 5000;
        int bonus = deposit / bonusLimit;
        if (deposit < 1000) {
            bonus = 0;
        }
        int currentAccount = deposit + bonus + startingScore;
        System.out.println("Вы внесли " + deposit + "р. Вам начисленно " + bonus + " бонусных рублей. Ваш балланс " + currentAccount + "р.");


    }
}