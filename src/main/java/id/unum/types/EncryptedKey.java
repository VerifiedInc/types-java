package id.unum.types;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EncryptedKey {
    String iv;
    String key;
    String algorithm;
    String did;
}
