package org.example;

import org.uma.jmetal.lab.visualization.plot.impl.Plot2D;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Create a 2D plot object
        double[][] x = {{4.0,4.0},{5.0,5.0},{6.0,6.0},{7.0,7.0}};
        Plot2D plot = new Plot2D(x, "Andy Duverneau");
        plot.plot();


    }
}