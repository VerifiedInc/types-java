package id.unum.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum PresentationTypes {
    VerifiablePresentation("VerifiablePresentation"),
    DeclinedPresentation("DeclinedPresentation");

    @Getter
    private String value;
}
