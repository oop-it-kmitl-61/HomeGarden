package com.mygdx.game;

public class Tree {
    private String nameTree;
    private boolean statusWatering;
    private int growthStatus;

    public String getNameTree() {
        return nameTree;
    }

    public void setNameTree(String nameTree) {
        this.nameTree = nameTree;
    }

    public boolean isStatusWatering() {
        return statusWatering;
    }

    public void setStatusWatering(boolean statusWatering) {
        this.statusWatering = statusWatering;
    }

    public int getGrowthStatus() {
        return growthStatus;
    }

    public void setGrowthStatus(int growthStatus) {
        this.growthStatus = growthStatus;
    }

    public Tree(String nameTree, boolean statusWatering, int growthStatus) {
        this.nameTree = nameTree;
        this.statusWatering = statusWatering;
        this.growthStatus = growthStatus;
    }
}