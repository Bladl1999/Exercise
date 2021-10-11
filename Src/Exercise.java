import java.util.*;

public class Exercise {

     //Задание 1 про города (Затратил 10 минут)
    public static String cities(String[] towns){
        String result = "";
        for(int i = 0; i < towns.length; i++){
            result += towns[i] + ", ";
        }
        result = result.substring(0,result.length() - 2) + ".";
        return result;
    }


    //Задание 2 про округление (Затратил 20 минут)
    public static int rounding(float number){
        float remains = number%5;
        System.out.println(remains);
        if(5 - remains < 2.5){
            return (int) number/5 * 5 + 5;
        }
        else
            return  (int) (number/5)* 5;
    }

    //Задание 3 про падежы (Затратил 30 минут)
    public static String countPk(int pk) {
        int remains = pk % 10;
        switch (remains) {
            case (1):
                return pk + " êîìïüþòåð";
            case (2):
            case (3):
            case (4):
                return pk + " êîìïüþòåðà";
            case (5):
            case (6):
            case (7):
            case (8):
            case (9):
            case (0):
                return pk + " êîìïüþòåðîâ";
        }
        return null;
    }

    //Задание 4 про простые числа (Затратил 10 минут)
    public static String primeNumber(int number){
        for(int i = 2; i < number; i++){
            if(number%i == 0)
                return "Íå ïðîñòîå ÷èñëî";
        }
        return "Ïðîñòîå ÷èñëî";
    }

    //Задание 5 про обьденение массивов (Затратил 40 минут)
    public static List<Integer> searchNumbers(int[] args1, int [] args2){
        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map1 = new HashMap<>();
        for(int i = 0; i < args1.length; i++){
            if(map1.get(args1[i]) != null){
                map1.put(args1[i], map1.get(args1[i]) + 1);
            }else{
                map1.put(args1[i],1);
            }
        }

        Map<Integer,Integer> map2 = new HashMap<>();
        for(int i = 0; i < args1.length; i++){
            if(map2.get(args2[i]) != null){
                map2.put(args2[i], map2.get(args2[i]) + 1);
            }else{
                map2.put(args2[i],1);
            }
        }

        for (Map.Entry<Integer, Integer> pair: map1.entrySet()){
            if(pair.getValue() >= 2){
                if(map2.get(pair.getKey()) >= 2){
                    list.add(pair.getKey());
                }
            }
        }

        return list;
    }



    public static void main(String[] args) {
        //Âûâîä ðåçóëüòàòàò íà êîíñîëü ê 1 çàäà÷à
        String[] arrgs = {"Ìîñêâà", "Ñàíêò-Ïåòåðáóðã", "Âîðîíåæ"};
        System.out.println(cities(arrgs));

        //Âûâîä ðåçóëüòàòàò íà êîíñîëü êî 2 çàäà÷å
        System.out.println(rounding(26.6f));

        //Âûâîä ðåçóëüòàòàò íà êîíñîëü ê 3 çàäà÷å
        System.out.println(countPk(30));

        //Âûâîä ðåçóëüòàòàò íà êîíñîëü ê 4 çàäà÷å
        System.out.println(primeNumber(11));

        //Âûâîä ðåçóëüòàòàò íà êîíñîëü ê 5 çàäà÷å
        int [] args1 = {1,3,4,7,8,1,4,4,4};
        int [] args2 = {1,2,2,2,3,3,4,4,1};
        System.out.println(searchNumbers(args1,args2));

    }
}
