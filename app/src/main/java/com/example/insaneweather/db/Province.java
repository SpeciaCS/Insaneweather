package com.example.insaneweather.db;

import org.litepal.exceptions.DataSupportException;

public class Province extends DataSupportException {

    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public Province(String errorMessage, Throwable throwable) {
        super(errorMessage, throwable);
    }
}
