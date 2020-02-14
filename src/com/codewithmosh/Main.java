package com.codewithmosh;

import com.codewithmosh.adapter.CaramelFilter;
import com.codewithmosh.adapter.Image;
import com.codewithmosh.adapter.ImageView;
import com.codewithmosh.adapter.avaFilters.Caramel;

public class Main {

    public static void main(String[] args) {
        var imageView = new ImageView(new Image());
        imageView.apply(new CaramelFilter(new Caramel()));
    }
}
