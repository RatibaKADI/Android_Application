package fr.android.just_in_time;

public class MenuItem {
    private int imageResource;
    private String name;
    private double price;

    public MenuItem(int imageResource, String name, double price) {
        this.imageResource = imageResource;
        this.name = name;

    }

    public String getName() {
        return name;
    }


    public int getImageResource() {
        return imageResource;
    }
}
