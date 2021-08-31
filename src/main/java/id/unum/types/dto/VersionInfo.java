package id.unum.types.dto;

import id.unum.types.TargetInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class VersionInfo {
    String sdkVersion;
    TargetInfo target;
}
