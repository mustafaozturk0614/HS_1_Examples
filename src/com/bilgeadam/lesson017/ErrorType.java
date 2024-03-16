package com.bilgeadam.lesson017;

public enum ErrorType {

    DOLU_YER_SECIMI(101, "Sectiğiniz alan doludur lutfen başka bir alan seçiniz"),
    ARALIK_DISI(102, "Lütfen gecerli bir yuk yeri giriniz"),
    YETERSIZ_AGIRLIK(103, "250 kilonun altında yuk kabulu yapılamaz!!!!"),
    GECERSIZ_KABUL_TARIHI(104, "kabul tarihi geçmiştir lutfen gunumuz veya ileri bir tarih giriniz"),
    YETERSIZ_ALAN_SAYISI(105, "yuk yerleştilecek alan kalmamıstır");
//    HATA_1(1001, "Hata-1"),
//    HATA_2(1002, "Hata-2");

    private int code;
    private String message;

    ErrorType(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ErrorType{");
        sb.append("code=").append(code);
        sb.append(", message='").append(message).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
