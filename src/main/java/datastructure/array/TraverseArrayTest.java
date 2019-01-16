package datastructure.array;

/**
 * @author ：ex-xugaoxiang001
 * @description ：
 * @copyright ：	Copyright 2019 yowits Corporation. All rights reserved.
 * @create ：2019/1/15 17:12
 */
public class TraverseArrayTest {

    public static void main(String[] args) {

        int[] array = new int[]{6, 8, 7, 9, 10};
        //O(f(n))时间复杂度的算法
//        loopArray(array);
        //有序列表
        int[] orderlyArray = new int[]{6, 7, 8, 9, 10 ,11};
        int dichotomy = dichotomy(orderlyArray, 1);
        System.out.println("dichotomy : " + dichotomy);
    }

    static int dichotomy(int[] array , int selectValue){
        int minIndex = 0 ;
        int maxIndex = array.length - 1;
        int mid  = -1;
        for(;minIndex <= maxIndex;){
            mid = (maxIndex + minIndex)/2;
            int value = array[mid];
            if(value < selectValue){
                minIndex = mid + 1;
            }else if(value > selectValue){
                maxIndex = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    static void loopArray(int[] array) {
        for (int anArray : array) {
            System.out.println(anArray);
            if(anArray == 9){
                break;
            }
        }
    }
}
