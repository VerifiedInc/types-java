package id.unum.types;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EncryptedData {
    String data;
    EncryptedKey key;
}
