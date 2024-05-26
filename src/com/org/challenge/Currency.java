package com.org.challenge;

public record Currency(String base_code, String target_code, String conversion_rate, String conversion_result) {
    @Override
    public String toString() {
        return "base_code='" + base_code + '\'' +
                ", target_code='" + target_code + '\'' +
                ", conversion_rate='" + conversion_rate + '\'' +
                ", conversion_result='" + conversion_result + '\'';
    }
}
