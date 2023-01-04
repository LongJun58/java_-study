package com.wjl.tankgame;

import javax.swing.*;
import java.awt.*;

public class WjlTankGame {

    private static TankMainView tankMainView = null;
    public static void main(String[] args) {
        tankMainView = TankMainView.getTankMainView();
    }
}
