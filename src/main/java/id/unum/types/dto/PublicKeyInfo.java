package id.unum.types.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class PublicKeyInfo {
    String id;
    String publicKey;
    String encoding;
    String type;
    String status;
    Date createdAt;
    Date updatedAt;
}
