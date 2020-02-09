package com.codewithmosh;

import com.codewithmosh.observer.Chart;
import com.codewithmosh.observer.DataSource;
import com.codewithmosh.observer.SpreadSheet;

public class Main {

    public static void main(String[] args) {
        var ds = new DataSource();
        var sheet1 = new SpreadSheet(ds);
        var sheet2 = new SpreadSheet(ds);
        var chart = new Chart(ds);

        ds.addObserver(sheet1);
        ds.addObserver(sheet2);
        ds.addObserver(chart);

        ds.setValue(1);
    }
}
