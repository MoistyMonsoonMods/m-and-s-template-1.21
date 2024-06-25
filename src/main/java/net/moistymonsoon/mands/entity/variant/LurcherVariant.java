package net.moistymonsoon.mands.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum LurcherVariant {
    BLACK(0),
    BROWN(1),
    MERLE(2);

    private static final LurcherVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(LurcherVariant::getId)).toArray(LurcherVariant[]::new);
    private final int id;

    LurcherVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static LurcherVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
