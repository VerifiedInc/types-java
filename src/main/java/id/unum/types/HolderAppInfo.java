package id.unum.types;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HolderAppInfo {
    String name;
    String deeplinkButtonImg; // base64 image string
    String appStoreUrl;
    String playStoreUrl;
}
