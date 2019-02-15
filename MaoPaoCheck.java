import java.util.Arrays;

/**
 * 冒泡排序算法
 */
public class MaoPaoCheck {
    public static void main(String[] args){
        int[] arrays = {1,8,3,6,5,4};
        maopao(arrays);
        System.out.print(Arrays.toString(arrays));
    }
    private static void maopao(int[] arrays){
        for(int i=0; i<arrays.length-1; i++){
            for(int j=0; j<arrays.length-i-1; j++){
                if(arrays[j]>arrays[j+1]){
                    int temp = arrays[j];
                    arrays[j] = arrays[j+1];
                    arrays[j+1] = temp;
                }
            }
        }
    }
}
