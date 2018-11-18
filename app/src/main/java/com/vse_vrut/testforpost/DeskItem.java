package com.vse_vrut.testforpost;

public class DeskItem {

    private String title;
    private String detalis;
    private int image;

    public DeskItem(String title, String detalis, int image) {
        this.title = title;
        this.detalis = detalis;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetalis() {
        return detalis;
    }

    public void setDetalis(String detalis) {
        this.detalis = detalis;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
