package id.unum.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum CredentialStatusOptions {
    /**
     * Note opting to go against convention here and use lowercase for the sake of native json conversion which is
     * all lowercase values.
     */
    valid("valid"),
    revoked("revoked");

    @Getter
    private String value;
}
