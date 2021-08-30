package id.unum.types;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Proof {
    String created;
    String signatureValue;
    String type;
    String verificationMethod;
    String proofPurpose;
}
