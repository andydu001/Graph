package org.example;

import org.uma.jmetal.lab.visualization.plot.impl.Plot2D;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Create a 2D plot object
        double[][] x = {{4,4},{5,5},{6,6},{7,7}};
        Plot2D plot = new Plot2D(x, "Andy Duverneau");
        plot.plot();


    }
}