package com.jeethink.common.practice;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Test0815 {

    public static void main(String[] args) {
        /*OperationAdd operationAdd = new OperationAdd();
        System.out.println(operationAdd.getResult(21, 26));

        OperationSub operationSub = new OperationSub();
        System.out.println(operationSub.getResult(21, 5));*/

        Operation operate = OperationFactory.createOperate("+");
        System.out.println(operate.getResult(12, 35));

        Operation operate1 = OperationFactory.createOperate("-");
        System.out.println(operate1.getResult(36, 35));
    }

    @Test
    public void Test0816() {
        List<Single> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Single single = Single.getInstance();
            single.setId(String.valueOf(i));
            single.setName("tom" + i);
            list.add(single);
        }
        System.out.println(list);

        int[] arr = new int[3];
        arr[0] = 2;
        arr[1] = 1;
        arr[2] = 3;

        arr[0] = arr[1] ^ arr[2];
        System.out.println(arr[0]);
    }

}
