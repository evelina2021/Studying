package homework.lesson1;

public class MyFirstHomework {


    public static void main(String[] args) {

        double allTheMoney = 1000;

        double pizzaPrice = 230;
        double gumPrice = 26;
        double candyPrice = 2.5;


        System.out.println("На 1000 рублей мы можем купить:");


        int theNumberOfPizzasWeCanBuy = (int) (allTheMoney / pizzaPrice); // число пиц = все деньги 1000/цена пиццы 230 = 4
        System.out.println("Количество пиц - " + theNumberOfPizzasWeCanBuy);
        double oddMoney = allTheMoney - theNumberOfPizzasWeCanBuy * pizzaPrice; // оставш.деньги  = все деньги 1000-число пиц 4 * цена пиццы 230 = 80р.



        int theNumberOfGumWeCanBuyForOddMoney = (int) (oddMoney / gumPrice); // число жвачек = 80/26 = 3
        System.out.println("Количество жвачек - " + theNumberOfGumWeCanBuyForOddMoney);
        double remainingOddMoney = oddMoney - theNumberOfGumWeCanBuyForOddMoney * gumPrice; // ост.сдача = 80-3*26 = 2р.



        int theNumberOfCandiesWeCanBuyForTheRemainingOddMoney =  (int) (remainingOddMoney / candyPrice); // число конфет = 2/2,5=0
        System.out.println("Количество конфет - " + theNumberOfCandiesWeCanBuyForTheRemainingOddMoney);
        int smallChange = (int) (remainingOddMoney - theNumberOfCandiesWeCanBuyForTheRemainingOddMoney * candyPrice); // сдача = 2-0*2,5 = 2р.


        System.out.println("Сдача с магазина: " + smallChange);


    }
}
