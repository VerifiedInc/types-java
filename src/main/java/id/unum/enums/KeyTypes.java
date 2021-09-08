package id.unum.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum KeyTypes {
    secp256r1("secp256r1"),
    PEM("PEM");

    @Getter
    private String value;
}
