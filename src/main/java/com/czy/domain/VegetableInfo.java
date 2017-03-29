package com.czy.domain;

import javax.persistence.*;

/**
 * Created by hu on 2017/3/29.
 */
@Entity
public class VegetableInfo {

    @Id
    @GeneratedValue
    private long vegetableId;

    private String vegetableName;
    private String vegetablePictureUrl;
    private String vegetableDescription;
    private float vegetableChenBen;
    private float getVegetableCost;
    private int vegetableCount;


    @Override
    public String toString() {
        return "VegetableInfo{" +
                "vegetableId =" + vegetableId +
                ", vegetableName='" + vegetableName + '\'' +
                ", vegetablePictureUrl='" + vegetablePictureUrl + '\'' +
                ", vegetableDescription='" + vegetableDescription + '\'' +
                ", vegetableChenBen=" + vegetableChenBen +
                ", getVegetableCost=" + getVegetableCost +
                ", vegetableCount=" + vegetableCount +
                '}';
    }

    public VegetableInfo() {
    }

    public VegetableInfo(String vegetableName, String vegetablePictureUrl, String vegetableDescription, float vegetableChenBen, float getVegetableCost, int vegetableCount) {
        this.vegetableName = vegetableName;
        this.vegetablePictureUrl = vegetablePictureUrl;
        this.vegetableDescription = vegetableDescription;
        this.vegetableChenBen = vegetableChenBen;
        this.getVegetableCost = getVegetableCost;
        this.vegetableCount = vegetableCount;
    }

    public long getVegetableId() {
        return vegetableId;
    }

    public String getVegetableName() {
        return vegetableName;
    }

    public void setVegetableName(String vegetableName) {
        this.vegetableName = vegetableName;
    }

    public String getVegetablePictureUrl() {
        return vegetablePictureUrl;
    }

    public void setVegetablePictureUrl(String vegetablePictureUrl) {
        this.vegetablePictureUrl = vegetablePictureUrl;
    }

    public String getVegetableDescription() {
        return vegetableDescription;
    }

    public void setVegetableDescription(String vegetableDescription) {
        this.vegetableDescription = vegetableDescription;
    }

    public float getVegetableChenBen() {
        return vegetableChenBen;
    }

    public void setVegetableChenBen(float vegetableChenBen) {
        this.vegetableChenBen = vegetableChenBen;
    }

    public float getGetVegetableCost() {
        return getVegetableCost;
    }

    public void setGetVegetableCost(float getVegetableCost) {
        this.getVegetableCost = getVegetableCost;
    }

    public int getVegetableCount() {
        return vegetableCount;
    }

    public void setVegetableCount(int vegetableCount) {
        this.vegetableCount = vegetableCount;
    }
}
