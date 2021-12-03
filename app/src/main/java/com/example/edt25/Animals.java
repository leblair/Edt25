package com.example.edt25;

public class Animals {
    private  String urlImage;
    private String type;
    private String nickname;
    private int age;
    private int birthdateyear;
    private String[] meals;
    private String description;

    public Animals(String urlImage, String type, String nickname, int age, int birthdateyear, String[] meals, String description) {
        this.urlImage = urlImage;
        this.type = type;
        this.nickname = nickname;
        this.age = age;
        this.birthdateyear = birthdateyear;
        this.meals = meals;
        this.description = description;
    }


    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBirthdateyear() {
        return birthdateyear;
    }

    public void setBirthdateyear(int birthdateyear) {
        this.birthdateyear = birthdateyear;
    }

    public String getMeals() {
        String str = "";
        for(String meal: meals){
            str+=meal;
        }
        return str;
    }

    public void setMeals(String[] meals) {
        this.meals = meals;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
