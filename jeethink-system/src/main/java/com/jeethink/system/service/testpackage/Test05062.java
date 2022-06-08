package com.jeethink.system.service.testpackage;

import com.jeethink.common.utils.StringUtils;

import java.io.File;
import java.io.FileDescriptor;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test05062<T> {

    private List<T> list1;

    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        /*Map<Integer, Teacher> teacherMap = new HashMap<>();
        teacherMap.put(1, new Teacher("ss1", 12));
        teacherMap.put(2, new Teacher(null, 121));
        teacherMap.put(3, new Teacher("ss3", 122));
        teacherMap.put(4, new Teacher(null, 123));
        teacherMap.put(5, new Teacher("ss5", 124));
        Map<Integer, String> communityNameMap = new HashMap<>();
        for (Map.Entry<Integer, Teacher> entry : teacherMap.entrySet()) {
            communityNameMap.put(entry.getKey(), entry.getValue().getName());
        }
        System.out.println(communityNameMap);
        System.out.println("---------分隔线-------------");
        for (int i = 0; i < 5; i++) {
            System.out.println(communityNameMap.get(i));
        }*/
        List<User> userList = new ArrayList<>();
        userList.add(new User("ss", 12, "南京江宁1", null));
        userList.add(new User("ss1", 121, "南京江宁2", "21"));
        userList.add(new User("ss2", 122, "南京江宁3",  "22"));
        userList.add(new User("ss2", 122, "南京江宁3",  "122"));
        userList.add(new User("ss2", 122, "南京江宁3",  "2"));
        userList.add(new User("ss2", 122, "南京江宁3",  "13"));
        userList.add(new User("ss3", 123, "南京江宁4", null));

        List<String> collect = userList.stream().map(User::getRemark).filter(Objects::nonNull).distinct().collect(Collectors.toList());
        System.out.println(collect);

        List<String> collect1 = collect.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(collect1);


        System.out.println(collect);

        //generate(userList);
        /*User user = new User("ss3", 123, "南京江宁4", "512", "21456");
        Class<?> aClass = user.getClass();
        List<Field> fields = Arrays.asList(aClass.getDeclaredFields());
        Map<String, Field> collect = fields.stream().collect(Collectors.toMap(Field::getName, a -> a));
        Field field = collect.get("name");
        field.setAccessible(true);
        System.out.println(field.get(user));*/
        String[] aa = "、as、ad、deaf、".split("、");
        // System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
        /*Object o = user;
        List<Field> filedList= Arrays.asList(aClass.getFields());
        List<Constructor<?>> constructors = Arrays.asList(aClass.getConstructors());
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor();
        Object o1 = declaredConstructor.newInstance();

        for (Constructor constructor : constructors) {
            Class[] parameterTypes = constructor.getParameterTypes();
        }
        System.out.println("---------------------------");
        for (Field field : filedList) {
            System.out.println(field.get(o));
        }*/
    }

    public static void generate(List<?> sourceList) throws IllegalAccessException {
        String[] headers = {"ID", "area","name", "age", "address", "remark"};
        Iterator<?> iterator = sourceList.iterator();
        while (iterator.hasNext()) {
            List<Field> fieldList = new ArrayList<>() ;
            Object o = iterator.next();
            Class<?> aClass = o.getClass();
            while (aClass != null) {
                fieldList.addAll(Arrays.asList(aClass.getDeclaredFields()));
                aClass = aClass.getSuperclass();
            }
            Map<String, Field> fieldMap = fieldList.stream().collect(Collectors.toMap(Field::getName, Function.identity()));
            List<Object> fields = new ArrayList<>();
            for (String header : headers) {
                if (StringUtils.isEmpty(header)) continue;
                Field field = fieldMap.get(header);
                field.setAccessible(true);
                Object s = field.get(o);
                System.out.println(s);
            }
            System.out.println();
        }
    }
}


