package com.example.jatimparkgroup;

public class Wahanamodel2 {
    private int imageId;
    private String text;
    private String title;

    public Wahanamodel2(int imageId, String title, String text) {
        this.imageId = imageId;
        this.title = title;
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getText() {
        return text;
    }



    public void setText(String text) {
        this.text = text;
    }
}
