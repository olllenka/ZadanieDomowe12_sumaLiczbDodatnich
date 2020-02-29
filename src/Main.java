import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Double> list = createNumbersList();

        showReversedList(list);

        Double sum = calculateSum(list);

        showAddition(list, sum);

        showBiggestNum(list);

        showSmallestNum(list);
    }

    private static void showSmallestNum(List<Double> list) {
        Double smallestNum = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)<smallestNum)
                smallestNum=list.get(i);
        }
        System.out.println(smallestNum);
    }

    private static void showBiggestNum(List<Double> list) {
        Double biggestNum = Double.valueOf(0);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)>biggestNum)
                biggestNum=list.get(i);
        }
        System.out.println(biggestNum);
    }

    private static void showAddition(List<Double> list, Double sum) {
        String additionString = list.get(0).toString();
        for (int i = 1; i < list.size(); i++) {
            additionString = additionString + "+" + list.get(i).toString();
        }
        additionString = additionString + "=" + sum.toString();
        System.out.println(additionString);
    }

    private static Double calculateSum(List<Double> list) {
        Double sum = Double.valueOf(0);

        for (int i = 0; i < list.size(); i++) {
            sum+=list.get(i);
        }
        return sum;
    }

    private static void showReversedList(List<Double> list) {
        for (int i = list.size()-1; i>=0; i--) {
            System.out.println(list.get(i));
        }
    }

    private static List<Double> createNumbersList() {
        Scanner sc = new Scanner(System.in);
        List<Double> list = new ArrayList<>();
        Double number;
        do{
            System.out.println("Podaj liczbe nieujemną");
            number = sc.nextDouble();
            if(number>=0)
                list.add(number);
        } while(number>=0);
        return list;
    }
}
