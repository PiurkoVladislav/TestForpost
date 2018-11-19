package com.vse_vrut.testforpost;

public class DeskItem {
    private String title;       // Желательно придерживаться одного правила
    private String details;     // именования полей - с префиксом или без
    private int image;

    public DeskItem(String title, String details, int image) {
        this.title = title;
        this.details = details;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

}
