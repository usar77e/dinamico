package com.dinamica.backend.criteria;

import com.dinamica.backend.enums.Color;
import io.github.jhipster.service.filter.*;

public class CocheCriteria {
    public static class ColorFilter extends Filter<Color>{}
    private StringFilter marca;
    private StringFilter modelo;
    private StringFilter version;
    private BooleanFilter cambio;
    private ColorFilter color;
    private IntegerFilter km;

    public StringFilter getMarca() {
        return marca;
    }

    public void setMarca(StringFilter marca) {
        this.marca = marca;
    }

    public StringFilter getModelo() {
        return modelo;
    }

    public void setModelo(StringFilter modelo) {
        this.modelo = modelo;
    }

    public StringFilter getVersion() {
        return version;
    }

    public void setVersion(StringFilter version) {
        this.version = version;
    }

    public BooleanFilter getCambio() {
        return cambio;
    }

    public void setCambio(BooleanFilter cambio) {
        this.cambio = cambio;
    }

    public ColorFilter getColor() {
        return color;
    }

    public void setColor(ColorFilter color) {
        this.color = color;
    }

    public IntegerFilter getKm() {
        return km;
    }

    public void setKm(IntegerFilter km) {
        this.km = km;
    }
}
