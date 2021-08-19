package id.unum.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum CredentialStatusOptions {
    VALID("VALID"),
    REVOKED("REVOKED");

    @Getter
    private String value;
}
