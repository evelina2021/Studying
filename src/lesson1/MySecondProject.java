package lesson1;

public class MySecondProject {

    public static void main(String[] args) {
        double roomWeight = 5.7;
        double roomLength = 4; // автоматическое преобразование типа

        double tableWeight = 2;
        double tableLength = 2.6;

        double ploshadRoom = roomWeight * roomLength;
        double ploshadTable = tableLength * tableWeight;

        int countTableToInsertToRoom = (int) (ploshadRoom / ploshadTable);
        System.out.println("столов влезет в комнату" +countTableToInsertToRoom);
        double freePloshad = ploshadRoom - countTableToInsertToRoom * ploshadTable;
        System.out.println ("свободная площадь:" + freePloshad);

    }
}
