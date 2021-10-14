package id.unum.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum PresentationReplyTypes {
    /**
     * Note opting to go against convention here and use lowercase for the sake of native json conversion which is
     * all lowercase values.
     */
    approved("approved"),
    flagged("flagged"),
    declined("declined");

    @Getter
    private String value;
}
