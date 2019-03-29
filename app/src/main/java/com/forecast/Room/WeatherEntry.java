package com.forecast.Room;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

import java.sql.Date;

@Entity(tableName = "weather")
public class WeatherEntry {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private int weatherIconId;
    private Date date;
    private double min;
    private double max;
    private double humidity;
    private double pressure;
    private double wind;
    private double degrees;

    public WeatherEntry(int id, int weatherIconId, Date date, double min, double max,
                        double humidity, double pressure, double wind, double degrees) {
        this.id = id;
        this.weatherIconId = weatherIconId;
        this.date = date;
        this.min = min;
        this.max = max;
        this.humidity = humidity;
        this.pressure = pressure;
        this.wind = wind;
        this.degrees = degrees;
    }

    @Ignore
    public WeatherEntry(int weatherIconId, Date date, double min, double max,
                        double humidity, double pressure, double wind, double degrees) {
        this.weatherIconId = weatherIconId;
        this.date = date;
        this.min = min;
        this.max = max;
        this.humidity = humidity;
        this.pressure = pressure;
        this.wind = wind;
        this.degrees = degrees;
    }

    public int getId() {
        return id;
    }

    public int getWeatherIconId() {
        return weatherIconId;
    }

    public Date getDate() {
        return date;
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public double getWind() {
        return wind;
    }

    public double getDegrees() {
        return degrees;
    }
}
