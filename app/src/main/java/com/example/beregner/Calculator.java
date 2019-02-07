package com.example.beregner;

import android.text.Editable;

public class Calculator {
    public double plus(Editable a, Editable b) {
        return Double.parseDouble(a.toString()) + Double.parseDouble(b.toString());
    }

    public double minus(Editable a, Editable b) {
        return Double.parseDouble(a.toString()) - Double.parseDouble(b.toString());
    }

    public double mult(Editable a, Editable b) {
        return Double.parseDouble(a.toString()) * Double.parseDouble(b.toString());
    }

    public double divide(Editable a, Editable b) {

        return Double.parseDouble(a.toString()) / Double.parseDouble(b.toString());
    }
}
