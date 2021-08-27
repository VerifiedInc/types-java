// Code generated by Wire protocol buffer compiler, do not edit.
// Source: crypto.v1.KeyPair in crypto.proto
package id.unum.protos.crypto.v1;

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
 * Object to encapsulate a key pair
 */
public final class KeyPair extends Message<KeyPair, KeyPair.Builder> {
  public static final ProtoAdapter<KeyPair> ADAPTER = new ProtoAdapter_KeyPair();

  private static final long serialVersionUID = 0L;

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      label = WireField.Label.OMIT_IDENTITY
  )
  public final String privateKey;

  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      label = WireField.Label.OMIT_IDENTITY
  )
  public final String publicKey;

  public KeyPair(String privateKey, String publicKey) {
    this(privateKey, publicKey, ByteString.EMPTY);
  }

  public KeyPair(String privateKey, String publicKey, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    if (privateKey == null) {
      throw new IllegalArgumentException("privateKey == null");
    }
    this.privateKey = privateKey;
    if (publicKey == null) {
      throw new IllegalArgumentException("publicKey == null");
    }
    this.publicKey = publicKey;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.privateKey = privateKey;
    builder.publicKey = publicKey;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof KeyPair)) return false;
    KeyPair o = (KeyPair) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(privateKey, o.privateKey)
        && Internal.equals(publicKey, o.publicKey);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (privateKey != null ? privateKey.hashCode() : 0);
      result = result * 37 + (publicKey != null ? publicKey.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (privateKey != null) builder.append(", privateKey=").append(Internal.sanitize(privateKey));
    if (publicKey != null) builder.append(", publicKey=").append(Internal.sanitize(publicKey));
    return builder.replace(0, 2, "KeyPair{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<KeyPair, Builder> {
    public String privateKey;

    public String publicKey;

    public Builder() {
      privateKey = "";
      publicKey = "";
    }

    public Builder privateKey(String privateKey) {
      this.privateKey = privateKey;
      return this;
    }

    public Builder publicKey(String publicKey) {
      this.publicKey = publicKey;
      return this;
    }

    @Override
    public KeyPair build() {
      return new KeyPair(privateKey, publicKey, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_KeyPair extends ProtoAdapter<KeyPair> {
    public ProtoAdapter_KeyPair() {
      super(FieldEncoding.LENGTH_DELIMITED, KeyPair.class, "type.googleapis.com/crypto.v1.KeyPair", Syntax.PROTO_3, null);
    }

    @Override
    public int encodedSize(KeyPair value) {
      int result = 0;
      if (!Objects.equals(value.privateKey, "")) {
        result += ProtoAdapter.STRING.encodedSizeWithTag(1, value.privateKey);
      }
      if (!Objects.equals(value.publicKey, "")) {
        result += ProtoAdapter.STRING.encodedSizeWithTag(2, value.publicKey);
      }
      result += value.unknownFields().size();
      return result;
    }

    @Override
    public void encode(ProtoWriter writer, KeyPair value) throws IOException {
      if (!Objects.equals(value.privateKey, "")) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.privateKey);
      if (!Objects.equals(value.publicKey, "")) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.publicKey);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public void encode(ReverseProtoWriter writer, KeyPair value) throws IOException {
      writer.writeBytes(value.unknownFields());
      if (!Objects.equals(value.publicKey, "")) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.publicKey);
      if (!Objects.equals(value.privateKey, "")) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.privateKey);
    }

    @Override
    public KeyPair decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.privateKey(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.publicKey(ProtoAdapter.STRING.decode(reader)); break;
          default: {
            reader.readUnknownField(tag);
          }
        }
      }
      builder.addUnknownFields(reader.endMessageAndGetUnknownFields(token));
      return builder.build();
    }

    @Override
    public KeyPair redact(KeyPair value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
