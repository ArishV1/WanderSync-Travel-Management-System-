package com.example.wandersync.viewmodel.sorting;

import com.example.wandersync.Model.Accommodation;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByCheckOutDate implements SortStrategy<Accommodation> {
    @Override
    public List<Accommodation> sort(List<Accommodation> accommodations) {
        Collections.sort(accommodations, Comparator.comparing(Accommodation::getCheckOutDate));
        return accommodations;
    }
}