package com.jeethink.system.service.test;

import jdk.internal.org.objectweb.asm.Handle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test{

    public static void main(String[] args) {

        /*String[] tokens = {"2","888","9","10","+","10","*","/","*","17","+","5","+"};
        int i = evalRPN(tokens);
        System.out.printf(i + "");*/
        User user = new User();
        user.setAge(12);
        user.setName(null);
        Map<String, Integer> aa = new HashMap<>();
        aa.put("1", 1);
        System.out.println(aa.get(user.getName()));
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
