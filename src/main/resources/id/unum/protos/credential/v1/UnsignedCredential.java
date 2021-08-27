// Code generated by Wire protocol buffer compiler, do not edit.
// Source: credential.v1.UnsignedCredential in credential.proto
package id.unum.protos.credential.v1;

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
import java.time.Instant;
import java.util.List;
import java.util.Objects;
import okio.ByteString;

/**
 * Object to encapsulate relevant credential information.
 */
public final class UnsignedCredential extends Message<UnsignedCredential, UnsignedCredential.Builder> {
  public static final ProtoAdapter<UnsignedCredential> ADAPTER = new ProtoAdapter_UnsignedCredential();

  private static final long serialVersionUID = 0L;

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      label = WireField.Label.REPEATED
  )
  public final List<String> context;

  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      label = WireField.Label.OMIT_IDENTITY,
      jsonName = "credentialSubject"
  )
  public final String credential_subject;

  @WireField(
      tag = 3,
      adapter = "id.unum.protos.credential.v1.CredentialStatus#ADAPTER",
      label = WireField.Label.OMIT_IDENTITY,
      jsonName = "credentialStatus"
  )
  public final CredentialStatus credential_status;

  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      label = WireField.Label.OMIT_IDENTITY
  )
  public final String issuer;

  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      label = WireField.Label.REPEATED
  )
  public final List<String> type;

  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      label = WireField.Label.OMIT_IDENTITY
  )
  public final String id;

  @WireField(
      tag = 7,
      adapter = "com.squareup.wire.ProtoAdapter#INSTANT",
      label = WireField.Label.OMIT_IDENTITY,
      jsonName = "issuanceDate"
  )
  public final Instant issuance_date;

  /**
   * optional in the ts types
   */
  @WireField(
      tag = 16,
      adapter = "com.squareup.wire.ProtoAdapter#INSTANT",
      label = WireField.Label.OMIT_IDENTITY,
      jsonName = "expirationDate"
  )
  public final Instant expiration_date;

  public UnsignedCredential(List<String> context, String credential_subject,
      CredentialStatus credential_status, String issuer, List<String> type, String id,
      Instant issuance_date, Instant expiration_date) {
    this(context, credential_subject, credential_status, issuer, type, id, issuance_date, expiration_date, ByteString.EMPTY);
  }

  public UnsignedCredential(List<String> context, String credential_subject,
      CredentialStatus credential_status, String issuer, List<String> type, String id,
      Instant issuance_date, Instant expiration_date, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.context = Internal.immutableCopyOf("context", context);
    if (credential_subject == null) {
      throw new IllegalArgumentException("credential_subject == null");
    }
    this.credential_subject = credential_subject;
    this.credential_status = credential_status;
    if (issuer == null) {
      throw new IllegalArgumentException("issuer == null");
    }
    this.issuer = issuer;
    this.type = Internal.immutableCopyOf("type", type);
    if (id == null) {
      throw new IllegalArgumentException("id == null");
    }
    this.id = id;
    this.issuance_date = issuance_date;
    this.expiration_date = expiration_date;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.context = Internal.copyOf(context);
    builder.credential_subject = credential_subject;
    builder.credential_status = credential_status;
    builder.issuer = issuer;
    builder.type = Internal.copyOf(type);
    builder.id = id;
    builder.issuance_date = issuance_date;
    builder.expiration_date = expiration_date;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof UnsignedCredential)) return false;
    UnsignedCredential o = (UnsignedCredential) other;
    return unknownFields().equals(o.unknownFields())
        && context.equals(o.context)
        && Internal.equals(credential_subject, o.credential_subject)
        && Internal.equals(credential_status, o.credential_status)
        && Internal.equals(issuer, o.issuer)
        && type.equals(o.type)
        && Internal.equals(id, o.id)
        && Internal.equals(issuance_date, o.issuance_date)
        && Internal.equals(expiration_date, o.expiration_date);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + context.hashCode();
      result = result * 37 + (credential_subject != null ? credential_subject.hashCode() : 0);
      result = result * 37 + (credential_status != null ? credential_status.hashCode() : 0);
      result = result * 37 + (issuer != null ? issuer.hashCode() : 0);
      result = result * 37 + type.hashCode();
      result = result * 37 + (id != null ? id.hashCode() : 0);
      result = result * 37 + (issuance_date != null ? issuance_date.hashCode() : 0);
      result = result * 37 + (expiration_date != null ? expiration_date.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (!context.isEmpty()) builder.append(", context=").append(Internal.sanitize(context));
    if (credential_subject != null) builder.append(", credential_subject=").append(Internal.sanitize(credential_subject));
    if (credential_status != null) builder.append(", credential_status=").append(credential_status);
    if (issuer != null) builder.append(", issuer=").append(Internal.sanitize(issuer));
    if (!type.isEmpty()) builder.append(", type=").append(Internal.sanitize(type));
    if (id != null) builder.append(", id=").append(Internal.sanitize(id));
    if (issuance_date != null) builder.append(", issuance_date=").append(issuance_date);
    if (expiration_date != null) builder.append(", expiration_date=").append(expiration_date);
    return builder.replace(0, 2, "UnsignedCredential{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<UnsignedCredential, Builder> {
    public List<String> context;

    public String credential_subject;

    public CredentialStatus credential_status;

    public String issuer;

    public List<String> type;

    public String id;

    public Instant issuance_date;

    public Instant expiration_date;

    public Builder() {
      context = Internal.newMutableList();
      credential_subject = "";
      issuer = "";
      type = Internal.newMutableList();
      id = "";
    }

    public Builder context(List<String> context) {
      Internal.checkElementsNotNull(context);
      this.context = context;
      return this;
    }

    public Builder credential_subject(String credential_subject) {
      this.credential_subject = credential_subject;
      return this;
    }

    public Builder credential_status(CredentialStatus credential_status) {
      this.credential_status = credential_status;
      return this;
    }

    public Builder issuer(String issuer) {
      this.issuer = issuer;
      return this;
    }

    public Builder type(List<String> type) {
      Internal.checkElementsNotNull(type);
      this.type = type;
      return this;
    }

    public Builder id(String id) {
      this.id = id;
      return this;
    }

    public Builder issuance_date(Instant issuance_date) {
      this.issuance_date = issuance_date;
      return this;
    }

    /**
     * optional in the ts types
     */
    public Builder expiration_date(Instant expiration_date) {
      this.expiration_date = expiration_date;
      return this;
    }

    @Override
    public UnsignedCredential build() {
      return new UnsignedCredential(context, credential_subject, credential_status, issuer, type, id, issuance_date, expiration_date, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_UnsignedCredential extends ProtoAdapter<UnsignedCredential> {
    public ProtoAdapter_UnsignedCredential() {
      super(FieldEncoding.LENGTH_DELIMITED, UnsignedCredential.class, "type.googleapis.com/credential.v1.UnsignedCredential", Syntax.PROTO_3, null);
    }

    @Override
    public int encodedSize(UnsignedCredential value) {
      int result = 0;
      result += ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, value.context);
      if (!Objects.equals(value.credential_subject, "")) {
        result += ProtoAdapter.STRING.encodedSizeWithTag(2, value.credential_subject);
      }
      if (!Objects.equals(value.credential_status, null)) {
        result += CredentialStatus.ADAPTER.encodedSizeWithTag(3, value.credential_status);
      }
      if (!Objects.equals(value.issuer, "")) {
        result += ProtoAdapter.STRING.encodedSizeWithTag(4, value.issuer);
      }
      result += ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(5, value.type);
      if (!Objects.equals(value.id, "")) {
        result += ProtoAdapter.STRING.encodedSizeWithTag(6, value.id);
      }
      if (!Objects.equals(value.issuance_date, null)) {
        result += ProtoAdapter.INSTANT.encodedSizeWithTag(7, value.issuance_date);
      }
      if (!Objects.equals(value.expiration_date, null)) {
        result += ProtoAdapter.INSTANT.encodedSizeWithTag(16, value.expiration_date);
      }
      result += value.unknownFields().size();
      return result;
    }

    @Override
    public void encode(ProtoWriter writer, UnsignedCredential value) throws IOException {
      ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 1, value.context);
      if (!Objects.equals(value.credential_subject, "")) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.credential_subject);
      if (!Objects.equals(value.credential_status, null)) CredentialStatus.ADAPTER.encodeWithTag(writer, 3, value.credential_status);
      if (!Objects.equals(value.issuer, "")) ProtoAdapter.STRING.encodeWithTag(writer, 4, value.issuer);
      ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 5, value.type);
      if (!Objects.equals(value.id, "")) ProtoAdapter.STRING.encodeWithTag(writer, 6, value.id);
      if (!Objects.equals(value.issuance_date, null)) ProtoAdapter.INSTANT.encodeWithTag(writer, 7, value.issuance_date);
      if (!Objects.equals(value.expiration_date, null)) ProtoAdapter.INSTANT.encodeWithTag(writer, 16, value.expiration_date);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public void encode(ReverseProtoWriter writer, UnsignedCredential value) throws IOException {
      writer.writeBytes(value.unknownFields());
      if (!Objects.equals(value.expiration_date, null)) ProtoAdapter.INSTANT.encodeWithTag(writer, 16, value.expiration_date);
      if (!Objects.equals(value.issuance_date, null)) ProtoAdapter.INSTANT.encodeWithTag(writer, 7, value.issuance_date);
      if (!Objects.equals(value.id, "")) ProtoAdapter.STRING.encodeWithTag(writer, 6, value.id);
      ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 5, value.type);
      if (!Objects.equals(value.issuer, "")) ProtoAdapter.STRING.encodeWithTag(writer, 4, value.issuer);
      if (!Objects.equals(value.credential_status, null)) CredentialStatus.ADAPTER.encodeWithTag(writer, 3, value.credential_status);
      if (!Objects.equals(value.credential_subject, "")) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.credential_subject);
      ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 1, value.context);
    }

    @Override
    public UnsignedCredential decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.context.add(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.credential_subject(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.credential_status(CredentialStatus.ADAPTER.decode(reader)); break;
          case 4: builder.issuer(ProtoAdapter.STRING.decode(reader)); break;
          case 5: builder.type.add(ProtoAdapter.STRING.decode(reader)); break;
          case 6: builder.id(ProtoAdapter.STRING.decode(reader)); break;
          case 7: builder.issuance_date(ProtoAdapter.INSTANT.decode(reader)); break;
          case 16: builder.expiration_date(ProtoAdapter.INSTANT.decode(reader)); break;
          default: {
            reader.readUnknownField(tag);
          }
        }
      }
      builder.addUnknownFields(reader.endMessageAndGetUnknownFields(token));
      return builder.build();
    }

    @Override
    public UnsignedCredential redact(UnsignedCredential value) {
      Builder builder = value.newBuilder();
      if (builder.credential_status != null) builder.credential_status = CredentialStatus.ADAPTER.redact(builder.credential_status);
      if (builder.issuance_date != null) builder.issuance_date = ProtoAdapter.INSTANT.redact(builder.issuance_date);
      if (builder.expiration_date != null) builder.expiration_date = ProtoAdapter.INSTANT.redact(builder.expiration_date);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
