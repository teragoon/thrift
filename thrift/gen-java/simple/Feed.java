/**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package simple;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Feed implements org.apache.thrift.TBase<Feed, Feed._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Feed");

  private static final org.apache.thrift.protocol.TField POST_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("postId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField UID_FIELD_DESC = new org.apache.thrift.protocol.TField("uid", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField NICK_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("nickName", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField TITLE_FIELD_DESC = new org.apache.thrift.protocol.TField("title", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField CONTENT_FIELD_DESC = new org.apache.thrift.protocol.TField("content", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField IMG_URL_FIELD_DESC = new org.apache.thrift.protocol.TField("imgUrl", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new FeedStandardSchemeFactory());
    schemes.put(TupleScheme.class, new FeedTupleSchemeFactory());
  }

  public int postId; // required
  public int uid; // required
  public String nickName; // required
  public String title; // required
  public String content; // required
  public String imgUrl; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    POST_ID((short)1, "postId"),
    UID((short)2, "uid"),
    NICK_NAME((short)3, "nickName"),
    TITLE((short)4, "title"),
    CONTENT((short)5, "content"),
    IMG_URL((short)6, "imgUrl");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // POST_ID
          return POST_ID;
        case 2: // UID
          return UID;
        case 3: // NICK_NAME
          return NICK_NAME;
        case 4: // TITLE
          return TITLE;
        case 5: // CONTENT
          return CONTENT;
        case 6: // IMG_URL
          return IMG_URL;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __POSTID_ISSET_ID = 0;
  private static final int __UID_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.POST_ID, new org.apache.thrift.meta_data.FieldMetaData("postId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.UID, new org.apache.thrift.meta_data.FieldMetaData("uid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.NICK_NAME, new org.apache.thrift.meta_data.FieldMetaData("nickName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TITLE, new org.apache.thrift.meta_data.FieldMetaData("title", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CONTENT, new org.apache.thrift.meta_data.FieldMetaData("content", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.IMG_URL, new org.apache.thrift.meta_data.FieldMetaData("imgUrl", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Feed.class, metaDataMap);
  }

  public Feed() {
  }

  public Feed(
    int postId,
    int uid,
    String nickName,
    String title,
    String content,
    String imgUrl)
  {
    this();
    this.postId = postId;
    setPostIdIsSet(true);
    this.uid = uid;
    setUidIsSet(true);
    this.nickName = nickName;
    this.title = title;
    this.content = content;
    this.imgUrl = imgUrl;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Feed(Feed other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.postId = other.postId;
    this.uid = other.uid;
    if (other.isSetNickName()) {
      this.nickName = other.nickName;
    }
    if (other.isSetTitle()) {
      this.title = other.title;
    }
    if (other.isSetContent()) {
      this.content = other.content;
    }
    if (other.isSetImgUrl()) {
      this.imgUrl = other.imgUrl;
    }
  }

  public Feed deepCopy() {
    return new Feed(this);
  }

  @Override
  public void clear() {
    setPostIdIsSet(false);
    this.postId = 0;
    setUidIsSet(false);
    this.uid = 0;
    this.nickName = null;
    this.title = null;
    this.content = null;
    this.imgUrl = null;
  }

  public int getPostId() {
    return this.postId;
  }

  public Feed setPostId(int postId) {
    this.postId = postId;
    setPostIdIsSet(true);
    return this;
  }

  public void unsetPostId() {
    __isset_bit_vector.clear(__POSTID_ISSET_ID);
  }

  /** Returns true if field postId is set (has been assigned a value) and false otherwise */
  public boolean isSetPostId() {
    return __isset_bit_vector.get(__POSTID_ISSET_ID);
  }

  public void setPostIdIsSet(boolean value) {
    __isset_bit_vector.set(__POSTID_ISSET_ID, value);
  }

  public int getUid() {
    return this.uid;
  }

  public Feed setUid(int uid) {
    this.uid = uid;
    setUidIsSet(true);
    return this;
  }

  public void unsetUid() {
    __isset_bit_vector.clear(__UID_ISSET_ID);
  }

  /** Returns true if field uid is set (has been assigned a value) and false otherwise */
  public boolean isSetUid() {
    return __isset_bit_vector.get(__UID_ISSET_ID);
  }

  public void setUidIsSet(boolean value) {
    __isset_bit_vector.set(__UID_ISSET_ID, value);
  }

  public String getNickName() {
    return this.nickName;
  }

  public Feed setNickName(String nickName) {
    this.nickName = nickName;
    return this;
  }

  public void unsetNickName() {
    this.nickName = null;
  }

  /** Returns true if field nickName is set (has been assigned a value) and false otherwise */
  public boolean isSetNickName() {
    return this.nickName != null;
  }

  public void setNickNameIsSet(boolean value) {
    if (!value) {
      this.nickName = null;
    }
  }

  public String getTitle() {
    return this.title;
  }

  public Feed setTitle(String title) {
    this.title = title;
    return this;
  }

  public void unsetTitle() {
    this.title = null;
  }

  /** Returns true if field title is set (has been assigned a value) and false otherwise */
  public boolean isSetTitle() {
    return this.title != null;
  }

  public void setTitleIsSet(boolean value) {
    if (!value) {
      this.title = null;
    }
  }

  public String getContent() {
    return this.content;
  }

  public Feed setContent(String content) {
    this.content = content;
    return this;
  }

  public void unsetContent() {
    this.content = null;
  }

  /** Returns true if field content is set (has been assigned a value) and false otherwise */
  public boolean isSetContent() {
    return this.content != null;
  }

  public void setContentIsSet(boolean value) {
    if (!value) {
      this.content = null;
    }
  }

  public String getImgUrl() {
    return this.imgUrl;
  }

  public Feed setImgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
    return this;
  }

  public void unsetImgUrl() {
    this.imgUrl = null;
  }

  /** Returns true if field imgUrl is set (has been assigned a value) and false otherwise */
  public boolean isSetImgUrl() {
    return this.imgUrl != null;
  }

  public void setImgUrlIsSet(boolean value) {
    if (!value) {
      this.imgUrl = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case POST_ID:
      if (value == null) {
        unsetPostId();
      } else {
        setPostId((Integer)value);
      }
      break;

    case UID:
      if (value == null) {
        unsetUid();
      } else {
        setUid((Integer)value);
      }
      break;

    case NICK_NAME:
      if (value == null) {
        unsetNickName();
      } else {
        setNickName((String)value);
      }
      break;

    case TITLE:
      if (value == null) {
        unsetTitle();
      } else {
        setTitle((String)value);
      }
      break;

    case CONTENT:
      if (value == null) {
        unsetContent();
      } else {
        setContent((String)value);
      }
      break;

    case IMG_URL:
      if (value == null) {
        unsetImgUrl();
      } else {
        setImgUrl((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case POST_ID:
      return Integer.valueOf(getPostId());

    case UID:
      return Integer.valueOf(getUid());

    case NICK_NAME:
      return getNickName();

    case TITLE:
      return getTitle();

    case CONTENT:
      return getContent();

    case IMG_URL:
      return getImgUrl();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case POST_ID:
      return isSetPostId();
    case UID:
      return isSetUid();
    case NICK_NAME:
      return isSetNickName();
    case TITLE:
      return isSetTitle();
    case CONTENT:
      return isSetContent();
    case IMG_URL:
      return isSetImgUrl();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Feed)
      return this.equals((Feed)that);
    return false;
  }

  public boolean equals(Feed that) {
    if (that == null)
      return false;

    boolean this_present_postId = true;
    boolean that_present_postId = true;
    if (this_present_postId || that_present_postId) {
      if (!(this_present_postId && that_present_postId))
        return false;
      if (this.postId != that.postId)
        return false;
    }

    boolean this_present_uid = true;
    boolean that_present_uid = true;
    if (this_present_uid || that_present_uid) {
      if (!(this_present_uid && that_present_uid))
        return false;
      if (this.uid != that.uid)
        return false;
    }

    boolean this_present_nickName = true && this.isSetNickName();
    boolean that_present_nickName = true && that.isSetNickName();
    if (this_present_nickName || that_present_nickName) {
      if (!(this_present_nickName && that_present_nickName))
        return false;
      if (!this.nickName.equals(that.nickName))
        return false;
    }

    boolean this_present_title = true && this.isSetTitle();
    boolean that_present_title = true && that.isSetTitle();
    if (this_present_title || that_present_title) {
      if (!(this_present_title && that_present_title))
        return false;
      if (!this.title.equals(that.title))
        return false;
    }

    boolean this_present_content = true && this.isSetContent();
    boolean that_present_content = true && that.isSetContent();
    if (this_present_content || that_present_content) {
      if (!(this_present_content && that_present_content))
        return false;
      if (!this.content.equals(that.content))
        return false;
    }

    boolean this_present_imgUrl = true && this.isSetImgUrl();
    boolean that_present_imgUrl = true && that.isSetImgUrl();
    if (this_present_imgUrl || that_present_imgUrl) {
      if (!(this_present_imgUrl && that_present_imgUrl))
        return false;
      if (!this.imgUrl.equals(that.imgUrl))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(Feed other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Feed typedOther = (Feed)other;

    lastComparison = Boolean.valueOf(isSetPostId()).compareTo(typedOther.isSetPostId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPostId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.postId, typedOther.postId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUid()).compareTo(typedOther.isSetUid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.uid, typedOther.uid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNickName()).compareTo(typedOther.isSetNickName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNickName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nickName, typedOther.nickName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTitle()).compareTo(typedOther.isSetTitle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTitle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.title, typedOther.title);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetContent()).compareTo(typedOther.isSetContent());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContent()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.content, typedOther.content);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetImgUrl()).compareTo(typedOther.isSetImgUrl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetImgUrl()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.imgUrl, typedOther.imgUrl);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Feed(");
    boolean first = true;

    sb.append("postId:");
    sb.append(this.postId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("uid:");
    sb.append(this.uid);
    first = false;
    if (!first) sb.append(", ");
    sb.append("nickName:");
    if (this.nickName == null) {
      sb.append("null");
    } else {
      sb.append(this.nickName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("title:");
    if (this.title == null) {
      sb.append("null");
    } else {
      sb.append(this.title);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("content:");
    if (this.content == null) {
      sb.append("null");
    } else {
      sb.append(this.content);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("imgUrl:");
    if (this.imgUrl == null) {
      sb.append("null");
    } else {
      sb.append(this.imgUrl);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class FeedStandardSchemeFactory implements SchemeFactory {
    public FeedStandardScheme getScheme() {
      return new FeedStandardScheme();
    }
  }

  private static class FeedStandardScheme extends StandardScheme<Feed> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Feed struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // POST_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.postId = iprot.readI32();
              struct.setPostIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // UID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.uid = iprot.readI32();
              struct.setUidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NICK_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.nickName = iprot.readString();
              struct.setNickNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TITLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.title = iprot.readString();
              struct.setTitleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // CONTENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.content = iprot.readString();
              struct.setContentIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // IMG_URL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.imgUrl = iprot.readString();
              struct.setImgUrlIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Feed struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(POST_ID_FIELD_DESC);
      oprot.writeI32(struct.postId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(UID_FIELD_DESC);
      oprot.writeI32(struct.uid);
      oprot.writeFieldEnd();
      if (struct.nickName != null) {
        oprot.writeFieldBegin(NICK_NAME_FIELD_DESC);
        oprot.writeString(struct.nickName);
        oprot.writeFieldEnd();
      }
      if (struct.title != null) {
        oprot.writeFieldBegin(TITLE_FIELD_DESC);
        oprot.writeString(struct.title);
        oprot.writeFieldEnd();
      }
      if (struct.content != null) {
        oprot.writeFieldBegin(CONTENT_FIELD_DESC);
        oprot.writeString(struct.content);
        oprot.writeFieldEnd();
      }
      if (struct.imgUrl != null) {
        oprot.writeFieldBegin(IMG_URL_FIELD_DESC);
        oprot.writeString(struct.imgUrl);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class FeedTupleSchemeFactory implements SchemeFactory {
    public FeedTupleScheme getScheme() {
      return new FeedTupleScheme();
    }
  }

  private static class FeedTupleScheme extends TupleScheme<Feed> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Feed struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetPostId()) {
        optionals.set(0);
      }
      if (struct.isSetUid()) {
        optionals.set(1);
      }
      if (struct.isSetNickName()) {
        optionals.set(2);
      }
      if (struct.isSetTitle()) {
        optionals.set(3);
      }
      if (struct.isSetContent()) {
        optionals.set(4);
      }
      if (struct.isSetImgUrl()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetPostId()) {
        oprot.writeI32(struct.postId);
      }
      if (struct.isSetUid()) {
        oprot.writeI32(struct.uid);
      }
      if (struct.isSetNickName()) {
        oprot.writeString(struct.nickName);
      }
      if (struct.isSetTitle()) {
        oprot.writeString(struct.title);
      }
      if (struct.isSetContent()) {
        oprot.writeString(struct.content);
      }
      if (struct.isSetImgUrl()) {
        oprot.writeString(struct.imgUrl);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Feed struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.postId = iprot.readI32();
        struct.setPostIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.uid = iprot.readI32();
        struct.setUidIsSet(true);
      }
      if (incoming.get(2)) {
        struct.nickName = iprot.readString();
        struct.setNickNameIsSet(true);
      }
      if (incoming.get(3)) {
        struct.title = iprot.readString();
        struct.setTitleIsSet(true);
      }
      if (incoming.get(4)) {
        struct.content = iprot.readString();
        struct.setContentIsSet(true);
      }
      if (incoming.get(5)) {
        struct.imgUrl = iprot.readString();
        struct.setImgUrlIsSet(true);
      }
    }
  }

}
