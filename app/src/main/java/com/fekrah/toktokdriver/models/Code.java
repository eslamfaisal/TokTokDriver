package com.fekrah.toktokdriver.models;

public class Code {
    private String code_key;
    private String code_price;
    private double generated_code;

    public Code() {
    }

    public Code(String code_key, String code_price, double generated_code) {
        this.code_key = code_key;
        this.code_price = code_price;
        this.generated_code = generated_code;
    }

    public String getCode_key() {
        return code_key;
    }

    public void setCode_key(String code_key) {
        this.code_key = code_key;
    }

    public String getCode_price() {
        return code_price;
    }

    public void setCode_price(String code_price) {
        this.code_price = code_price;
    }

    public double getGenerated_code() {
        return generated_code;
    }

    public void setGenerated_code(double generated_code) {
        this.generated_code = generated_code;
    }
}
