package com.chukwuebuka.grocerylist;

public class DataSource {

    private String name;
    private int imageResource;
    private String price;

    //MDE stands for meat, diary and eggs
    public static final DataSource[] groceryMDE = {
            new DataSource("Butter", R.drawable.butter, "$10"),
            new DataSource("Chicken", R.drawable.chicken, "$100"),
            new DataSource("Cream", R.drawable.cream, "$5"),
            new DataSource("Eggs", R.drawable.egg, "$3"),
            new DataSource("Milk", R.drawable.milk, "$30"),
            new DataSource("Peanut Butter", R.drawable.peanut_butter, "$20"),
            new DataSource("Popcorn", R.drawable.popcorn, "$6"),
            new DataSource("Chocolate Chip", R.drawable.chocolate_chip, "$15"),
            new DataSource("Instant Ramen", R.drawable.instant_ramen, "$23"),
            new DataSource("Stock Cube", R.drawable.stock_cube, "$17"),
            new DataSource("Vinegar", R.drawable.vinegar, "$20")};

    //Miscellaneous
//    public static final DataSource[] groceryMiscel = {
//            )
//    };



    public DataSource(String name, int imageResource, String price) {
        this.name = name;
        this.imageResource = imageResource;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
