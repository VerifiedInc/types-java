package id.unum.types.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class VersionInfo {
    String sdkVersion;
    TargetInfo target;
}
