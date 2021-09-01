package id.unum.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum CredentialStatusOptions {
    valid("valid"),
    revoked("revoked");

    @Getter
    private String value;
}
