package com.mac.fireflies.wgt.mvpdesign.model;

public class Text {
    String text;

    public Text(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return getText();
    }
}
