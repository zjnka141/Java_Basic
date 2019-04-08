package mangvaphuongthuc;

import java.util.Arrays;

public class DeleteElement {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 3) {
                for(int j=i;j<num.length-1;j++){
                    num[j]=num[j+1];
                }
                num[num.length-1]=0;
                break;
            }
        }
        System.out.println(Arrays.toString(num));
    }
}
