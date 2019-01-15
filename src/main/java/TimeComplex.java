/**
 * @author ：ex-xugaoxiang001
 * @description ：
 * @copyright ：	Copyright 2019 yowits Corporation. All rights reserved.
 * @create ：2019/1/15 13:33
 */
public class TimeComplex {

    public  static void main(String[] args){
        //时间复杂度为 T(n) = O(f(n))
        TestOne(1000);

    }

    static void TestOne(int num ){
        for(int i = 0 ; i < num ; i++){
            System.out.println(i);
        }
    }

}
