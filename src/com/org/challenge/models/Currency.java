package com.org.challenge.models;

//TODO: agrega función para calcular la conversión?

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Currency {
    private String baseCode;
    private String targetCode;
    private String conversionRate;
    private int amount;
    private Double conversionResult;
    private LocalDateTime createAt;

    public Currency(CurrencyDTO currencyDTO, int amount) {
        this.baseCode = currencyDTO.base_code();
        this.targetCode = currencyDTO.target_code();
        this.conversionRate = currencyDTO.conversion_rate();
        this.amount = amount;
        this.conversionResult = Double.parseDouble(currencyDTO.conversion_result());
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

    public String getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(String conversionRate) {
        this.conversionRate = conversionRate;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Double getConversionResult() {
        return conversionResult;
    }

    public void setConversionResult(Double conversionResult) {
        this.conversionResult = conversionResult;
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
        return "(" +
                "baseCode='" + baseCode + '\'' +
                ", targetCode='" + targetCode + '\'' +
                ", conversionRate='" + conversionRate + '\'' +
                ", amount=" + amount +
                ", conversionResult=" + conversionResult +
                ", createAt=" + this.getCreateAt() +
                ")\n";
    }
}
