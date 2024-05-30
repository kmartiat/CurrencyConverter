package com.org.challenge.models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Currency {
    private String baseCode;
    private String targetCode;
    private Double conversionRate;
    private Float amount;
    private Double conversionResult;
    private LocalDateTime createAt;

    public Currency(CurrencyDTO currencyDTO, Float amount) {
        this.baseCode = currencyDTO.base_code();
        this.targetCode = currencyDTO.target_code();
        this.conversionRate = Double.parseDouble(currencyDTO.conversion_rate());
        this.amount = amount;
        this.setConversionResult();
        this.createAt = LocalDateTime.now();
    }

    public String getBaseCode() {
        return baseCode;
    }

    public void setBaseCode(String baseCode) {
        this.baseCode = baseCode;
    }

    public String getTargetCode() {
        return targetCode;
    }

    public void setTargetCode(String targetCode) {
        this.targetCode = targetCode;
    }

    public Double getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(Double conversionRate) {
        this.conversionRate = conversionRate;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Double getConversionResult() {
        return conversionResult;
    }

    public void setConversionResult() {
        this.conversionResult = this.amount * this.conversionRate;
    }

    public String getCreateAt() {
        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm:ss");
        return createAt.format(customFormatter);
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    @Override
    public String toString() {
        return this.getCreateAt() + " | " +
                conversionRate + " | " +
                amount + " " + baseCode + " | " +
                conversionResult + " " + targetCode;
    }
}
