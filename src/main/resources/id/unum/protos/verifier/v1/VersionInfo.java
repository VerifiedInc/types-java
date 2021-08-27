// Code generated by Wire protocol buffer compiler, do not edit.
// Source: verifier.v1.VersionInfo in verifier.proto
package id.unum.protos.verifier.v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.Objects;
import okio.ByteString;

/**
 * Object to encapsulate Version information.
 */
public final class VersionInfo extends Message<VersionInfo, VersionInfo.Builder> {
  public static final ProtoAdapter<VersionInfo> ADAPTER = new ProtoAdapter_VersionInfo();

  private static final long serialVersionUID = 0L;

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      label = WireField.Label.OMIT_IDENTITY,
      jsonName = "sdkVersion"
  )
  public final String sdk_version;

  @WireField(
      tag = 2,
      adapter = "id.unum.protos.verifier.v1.TargetInfo#ADAPTER",
      label = WireField.Label.OMIT_IDENTITY
  )
  public final TargetInfo url;

  public VersionInfo(String sdk_version, TargetInfo url) {
    this(sdk_version, url, ByteString.EMPTY);
  }

  public VersionInfo(String sdk_version, TargetInfo url, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    if (sdk_version == null) {
      throw new IllegalArgumentException("sdk_version == null");
    }
    this.sdk_version = sdk_version;
    this.url = url;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.sdk_version = sdk_version;
    builder.url = url;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof VersionInfo)) return false;
    VersionInfo o = (VersionInfo) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(sdk_version, o.sdk_version)
        && Internal.equals(url, o.url);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (sdk_version != null ? sdk_version.hashCode() : 0);
      result = result * 37 + (url != null ? url.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (sdk_version != null) builder.append(", sdk_version=").append(Internal.sanitize(sdk_version));
    if (url != null) builder.append(", url=").append(url);
    return builder.replace(0, 2, "VersionInfo{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<VersionInfo, Builder> {
    public String sdk_version;

    public TargetInfo url;

    public Builder() {
      sdk_version = "";
    }

    public Builder sdk_version(String sdk_version) {
      this.sdk_version = sdk_version;
      return this;
    }

    public Builder url(TargetInfo url) {
      this.url = url;
      return this;
    }

    @Override
    public VersionInfo build() {
      return new VersionInfo(sdk_version, url, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_VersionInfo extends ProtoAdapter<VersionInfo> {
    public ProtoAdapter_VersionInfo() {
      super(FieldEncoding.LENGTH_DELIMITED, VersionInfo.class, "type.googleapis.com/verifier.v1.VersionInfo", Syntax.PROTO_3, null);
    }

    @Override
    public int encodedSize(VersionInfo value) {
      int result = 0;
      if (!Objects.equals(value.sdk_version, "")) {
        result += ProtoAdapter.STRING.encodedSizeWithTag(1, value.sdk_version);
      }
      if (!Objects.equals(value.url, null)) {
        result += TargetInfo.ADAPTER.encodedSizeWithTag(2, value.url);
      }
      result += value.unknownFields().size();
      return result;
    }

    @Override
    public void encode(ProtoWriter writer, VersionInfo value) throws IOException {
      if (!Objects.equals(value.sdk_version, "")) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.sdk_version);
      if (!Objects.equals(value.url, null)) TargetInfo.ADAPTER.encodeWithTag(writer, 2, value.url);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public void encode(ReverseProtoWriter writer, VersionInfo value) throws IOException {
      writer.writeBytes(value.unknownFields());
      if (!Objects.equals(value.url, null)) TargetInfo.ADAPTER.encodeWithTag(writer, 2, value.url);
      if (!Objects.equals(value.sdk_version, "")) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.sdk_version);
    }

    @Override
    public VersionInfo decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.sdk_version(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.url(TargetInfo.ADAPTER.decode(reader)); break;
          default: {
            reader.readUnknownField(tag);
          }
        }
      }
      builder.addUnknownFields(reader.endMessageAndGetUnknownFields(token));
      return builder.build();
    }

    @Override
    public VersionInfo redact(VersionInfo value) {
      Builder builder = value.newBuilder();
      if (builder.url != null) builder.url = TargetInfo.ADAPTER.redact(builder.url);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
