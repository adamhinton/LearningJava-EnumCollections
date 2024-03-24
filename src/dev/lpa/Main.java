package dev.lpa;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class Main {

    enum WeekDay {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}

    public static void main(String[] args) {

        List<WeekDay> annsWorkDays = new ArrayList<>(List.of(WeekDay.MONDAY, WeekDay.TUESDAY, WeekDay.THURSDAY,
                WeekDay.FRIDAY));

        // EnumSet
        var annsDaysSet = EnumSet.copyOf(annsWorkDays);

        // RegularEnumSet
        // Bit vector - just ones and zeros
        // Zero means value is not in set, 1 means it is
        // Very cool
        System.out.println(annsDaysSet.getClass().getSimpleName());

        annsDaysSet.forEach(System.out::println);

        // Set of all WeekDays
        var allDaysSet = EnumSet.allOf(WeekDay.class);
        System.out.println("-".repeat(30));
        // Just pritns all days out in order
        allDaysSet.forEach(System.out::println);

        // complementOf is all workdays minus ann's set
        Set<WeekDay> newPersonDays = EnumSet.complementOf(annsDaysSet);
        System.out.println("-".repeat(30));
        newPersonDays.forEach(System.out::println);

    }
}