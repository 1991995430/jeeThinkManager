package com.ss.up.test;

import com.ss.up.model.StudentCount;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Test0926 {

    @Test
    public void test001() {

        List<StudentCount> countList = new ArrayList<>();
        countList.add(new StudentCount("3", "2", 122, 101));
        countList.add(new StudentCount("1", "2", 128, 111));
        countList.add(new StudentCount("3", "2", 127, 121));
        countList.add(new StudentCount("4", "6", 126, 131));
        countList.add(new StudentCount("5", "1", 123, 141));
        countList.add(new StudentCount("1", "1", 162, 151));
        countList.add(new StudentCount("5", "1", 121, 161));
        

    }

}
