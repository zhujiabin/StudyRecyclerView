package com.che.studyreclclerview;

/**
 * 作者：余天然 on 16/7/14 下午1:37
 */
public class MyBean {
    int icon;
    String name;

    public MyBean(int icon, String name) {
        this.icon = icon;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
