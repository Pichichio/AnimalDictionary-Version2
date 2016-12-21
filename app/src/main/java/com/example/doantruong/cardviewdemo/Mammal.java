package com.example.doantruong.cardviewdemo;

/**
 * Created by DOANTRUONG on 12/1/2016.
 */

public class Mammal {
//    private String areaAnimal;
//    private String habitatAnimal;
//    private String foodAnimal;
//    private String sizeAnimal;
//    private String babiesAnimal;
    private String nameAnimal;
    private int pictureAnimal;

    public Mammal(String nameAnimal, int pictureAnimal
//                  ,String areaAnimal,
//                  String habitatAnimal, String foodAnimal, String sizeAnimal,
//                  String babiesAnimal
    ) {
        this.setNameAnimal(nameAnimal);
        this.setPictureAnimal(pictureAnimal);
//        this.setAreaAnimal(areaAnimal);
//        this.setHabitatAnimal(habitatAnimal);
//        this.setFoodAnimal(foodAnimal);
//        this.setSizeAnimal(sizeAnimal);
//        this.setBabiesAnimal(babiesAnimal);
    }


    public int getPictureAnimal() {
        return pictureAnimal;
    }

    public void setPictureAnimal(int pictureAnimal) {
        this.pictureAnimal = pictureAnimal;
    }

    public String getNameAnimal() {
        return nameAnimal;
    }

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }


//    public String getAreaAnimal() {
//        return areaAnimal;
//    }
//
//    public void setAreaAnimal(String areaAnimal) {
//        this.areaAnimal = areaAnimal;
//    }
//
//    public String getHabitatAnimal() {
//        return habitatAnimal;
//    }
//
//    public void setHabitatAnimal(String habitatAnimal) {
//        this.habitatAnimal = habitatAnimal;
//    }
//
//    public String getFoodAnimal() {
//        return foodAnimal;
//    }
//
//    public void setFoodAnimal(String foodAnimal) {
//        this.foodAnimal = foodAnimal;
//    }
//
//    public String getSizeAnimal() {
//        return sizeAnimal;
//    }
//
//    public void setSizeAnimal(String sizeAnimal) {
//        this.sizeAnimal = sizeAnimal;
//    }
//
//    public String getBabiesAnimal() {
//        return babiesAnimal;
//    }
//
//    public void setBabiesAnimal(String babiesAnimal) {
//        this.babiesAnimal = babiesAnimal;
//    }
}
