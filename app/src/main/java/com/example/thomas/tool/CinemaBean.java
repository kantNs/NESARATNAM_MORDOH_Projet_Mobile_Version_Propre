package com.example.thomas.tool;

import java.io.Serializable;

/**
 * Created by Alain on 27/03/2018.
 */

public class CinemaBean implements Serializable {


    public CinemaBean(){}

    private String cinemaName;
    private double cinemaPosX;
    private double cinemaPoxY;

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public double getCinemaPosX() {
        return cinemaPosX;
    }

    public void setCinemaPosX(double cinemaPosX) {
        this.cinemaPosX = cinemaPosX;
    }

    public double getCinemaPoxY() {
        return cinemaPoxY;
    }

    public void setCinemaPoxY(double cinemaPoxY) {
        this.cinemaPoxY = cinemaPoxY;
    }
}
