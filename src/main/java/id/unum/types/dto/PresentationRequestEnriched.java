package id.unum.types.dto;

import id.unum.types.HolderAppInfo;
import id.unum.types.IssuerInfo;
import id.unum.types.VerifierInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

// Note: equivalent to PresentationRequestPostDto in typescript types
@Data
@NoArgsConstructor
public class PresentationRequestEnriched {
    PresentationRequest presentationRequest;
    HolderAppInfo holderApp;
    VerifierInfo verifier;
    Map<String, IssuerInfo> issuers; // keyed on issuer did
    String deeplink;
    String qrCode;
}
