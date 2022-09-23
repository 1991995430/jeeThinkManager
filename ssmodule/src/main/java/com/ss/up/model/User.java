package com.ss.up.model;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {
    private Integer id;

    private String name;

    private Integer age;

    private Integer sex;

    private Integer englishScore;

    private Integer mathScore;

    private String address;

    private String school;

    private String city;

    private String region;

    private String province;

    public User() {
    }

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(Integer englishScore) {
        this.englishScore = englishScore;
    }

    public Integer getMathScore() {
        return mathScore;
    }

    public void setMathScore(Integer mathScore) {
        this.mathScore = mathScore;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", age=").append(age);
        sb.append(", sex=").append(sex);
        sb.append(", englishScore=").append(englishScore);
        sb.append(", mathScore=").append(mathScore);
        sb.append(", address=").append(address);
        sb.append(", school=").append(school);
        sb.append(", city=").append(city);
        sb.append(", region=").append(region);
        sb.append(", province=").append(province);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(name, user.name) && Objects.equals(age, user.age) && Objects.equals(sex, user.sex) && Objects.equals(englishScore, user.englishScore) && Objects.equals(mathScore, user.mathScore) && Objects.equals(address, user.address) && Objects.equals(school, user.school) && Objects.equals(city, user.city) && Objects.equals(region, user.region) && Objects.equals(province, user.province);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, sex, englishScore, mathScore, address, school, city, region, province);
    }
}