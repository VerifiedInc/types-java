package id.unum.types;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class PublicKeyInfo {
    String id;
    String publicKey;
    String encoding;
    String type;
    String status;
    String createdAt;
    String updatedAt;
}
