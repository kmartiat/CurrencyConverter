package com.org.challenge.models;

//TODO: nueva clase currency, para agregar monto y marcas de tiempo. Currency?

public class Currency {
    private String baseCode;
    private String targetCode;
    private String conversionRate;
    private int amount;
    private Double conversionResult;

    public Currency(CurrencyDTO currencyDTO, int amount) {
        this.baseCode = currencyDTO.base_code();
        this.targetCode = currencyDTO.target_code();
        this.conversionRate = currencyDTO.conversion_rate();
        this.amount = amount;
        this.conversionResult = Double.parseDouble(currencyDTO.conversion_result());
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
}
