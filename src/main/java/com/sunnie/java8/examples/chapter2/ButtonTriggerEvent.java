package com.sunnie.java8.examples.chapter2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonTriggerEvent {
    public static void buttonTriggerEvent() {
        Button button = new Button();
        /**
         * 匿名内部类
         */
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.out.println("button clicked");
            }
        });
        /**
         * lambda表达式
         */
        button.addActionListener(event -> System.out.println("button clicked"));
    }

    public static void main(String[] args) {
        buttonTriggerEvent();
    }
}
