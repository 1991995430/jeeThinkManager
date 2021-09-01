package com.jeethink.system.service.test;

import java.util.ArrayList;
import java.util.List;

public class Test{

    public static void main(String[] args) {

        String[] tokens = {"2","888","9","10","+","10","*","/","*","17","+","5","+"};
        int i = evalRPN(tokens);
        System.out.printf(i + "");
    }

    public static int evalRPN(String[] tokens) {
        List<Integer> list = new ArrayList<>();
        List<String> signal = new ArrayList<>();
        signal.add("+");
        signal.add("-");
        signal.add("*");
        signal.add("/");
        for (String token : tokens) {
            if (!signal.contains(token)) {
                list.add(Integer.valueOf(token));
            } else if (token.equals("+")) {
                int aa = list.get(list.size() - 2) + list.get(list.size() - 1);
                extracted(list, aa);
            } else if (token.equals("-")) {
                int aa = list.get(list.size() - 2) - list.get(list.size() - 1);
                extracted(list, aa);
            } else if (token.equals("*")) {
                int aa = list.get(list.size() - 2) * list.get(list.size() - 1);
                extracted(list, aa);
            } else if (token.equals("/")) {
                int aa = list.get(list.size() - 2) / list.get(list.size() - 1);
                extracted(list, aa);
            }
        }
        return list.get(0);
    }

    private static void extracted(List<Integer> list, int aa) {
        list.remove(list.size() - 1);
        list.remove(list.size() - 1);
        list.add(aa);
    }

}
