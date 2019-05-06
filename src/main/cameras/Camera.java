package main.cameras;

import javax.swing.*;
import java.awt.*;

public class Camera {
    private String name;
    private String url;
    private ImageIcon icon;

    public Camera(String name, String url, ImageIcon icon) {
        this.name = name;
        this.url = url;
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ImageIcon getIcon() {
        return icon;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }
}
