public class NumOfShuttle {
    public static void main(String[] args) {

        int [] arrNum1 = new int [100];
        String temp;
        int count=0;

        for (int i=0; i < arrNum1.length; i++){
            arrNum1 [i] = i+1;
            temp = Integer.toString(arrNum1[i]);
            if (temp.contains("4") || temp.contains("9")) {
                count++;
            }
        }
        int [] arrNum2 = new int [arrNum1.length-count];
        for (int i=0, j=0; i < arrNum1.length; i++){
            temp = Integer.toString(arrNum1[i]);
            if (temp.contains("4") || temp.contains("9")) {
                i++;
            }
            else {
                arrNum2[j] = arrNum1[i];
                j++;
            }
        }
        arrNum1=arrNum2;
        for (int arrRes : arrNum1) {
            System.out.println(arrRes);
        }
    }
}

