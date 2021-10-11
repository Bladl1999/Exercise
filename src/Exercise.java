import java.util.*;

public class Exercise {

    //������� 1 ��� ������ (�������� 10 �����)
    public static String cities(String[] towns){
        String result = "";
        for(int i = 0; i < towns.length; i++){
            result += towns[i] + ", ";
        }
        result = result.substring(0,result.length() - 2) + ".";
        return result;
    }


    //������� 2 ��� ���������� (�������� 20 �����)
    public static int rounding(float number){
        float remains = number%5;
        System.out.println(remains);
        if(5 - remains < 2.5){
            return (int) number/5 * 5 + 5;
        }
        else
            return  (int) (number/5)* 5;
    }

    //������� 3 ��� ������ (�������� 30 �����)
    public static String countPk(int pk) {
        int remains = pk % 10;
        switch (remains) {
            case (1):
                return pk + " ���������";
            case (2):
            case (3):
            case (4):
                return pk + " ����������";
            case (5):
            case (6):
            case (7):
            case (8):
            case (9):
            case (0):
                return pk + " �����������";
        }
        return null;
    }

    //������� 4 ��� ������� ����� (�������� 10 �����)
    public static String primeNumber(int number){
        for(int i = 2; i < number; i++){
            if(number%i == 0)
                return "�� ������� �����";
        }
        return "������� �����";
    }

    //������� 5 ��� ���������� �������� (�������� 40 �����)
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
        //����� ����������� �� ������� � 1 ������
        String[] arrgs = {"������", "�����-���������", "�������"};
        System.out.println(cities(arrgs));

        //����� ����������� �� ������� �� 2 ������
        System.out.println(rounding(26.6f));

        //����� ����������� �� ������� � 3 ������
        System.out.println(countPk(30));

        //����� ����������� �� ������� � 4 ������
        System.out.println(primeNumber(11));

        //����� ����������� �� ������� � 5 ������
        int [] args1 = {1,3,4,7,8,1,4,4,4};
        int [] args2 = {1,2,2,2,3,3,4,4,1};
        System.out.println(searchNumbers(args1,args2));

    }
}
