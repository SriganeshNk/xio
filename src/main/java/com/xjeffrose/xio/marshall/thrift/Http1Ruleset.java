/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xjeffrose.xio.marshall.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-07-21")
public class Http1Ruleset implements org.apache.thrift.TBase<Http1Ruleset, Http1Ruleset._Fields>, java.io.Serializable, Cloneable, Comparable<Http1Ruleset> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Http1Ruleset");

  private static final org.apache.thrift.protocol.TField BLACKLIST_RULES_FIELD_DESC = new org.apache.thrift.protocol.TField("blacklistRules", org.apache.thrift.protocol.TType.SET, (short)1);
  private static final org.apache.thrift.protocol.TField WHITELIST_RULES_FIELD_DESC = new org.apache.thrift.protocol.TField("whitelistRules", org.apache.thrift.protocol.TType.SET, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new Http1RulesetStandardSchemeFactory());
    schemes.put(TupleScheme.class, new Http1RulesetTupleSchemeFactory());
  }

  public Set<Http1Rule> blacklistRules; // required
  public Set<Http1Rule> whitelistRules; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BLACKLIST_RULES((short)1, "blacklistRules"),
    WHITELIST_RULES((short)2, "whitelistRules");

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
        case 1: // BLACKLIST_RULES
          return BLACKLIST_RULES;
        case 2: // WHITELIST_RULES
          return WHITELIST_RULES;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BLACKLIST_RULES, new org.apache.thrift.meta_data.FieldMetaData("blacklistRules", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Http1Rule.class))));
    tmpMap.put(_Fields.WHITELIST_RULES, new org.apache.thrift.meta_data.FieldMetaData("whitelistRules", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Http1Rule.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Http1Ruleset.class, metaDataMap);
  }

  public Http1Ruleset() {
  }

  public Http1Ruleset(
    Set<Http1Rule> blacklistRules,
    Set<Http1Rule> whitelistRules)
  {
    this();
    this.blacklistRules = blacklistRules;
    this.whitelistRules = whitelistRules;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Http1Ruleset(Http1Ruleset other) {
    if (other.isSetBlacklistRules()) {
      Set<Http1Rule> __this__blacklistRules = new HashSet<Http1Rule>(other.blacklistRules.size());
      for (Http1Rule other_element : other.blacklistRules) {
        __this__blacklistRules.add(new Http1Rule(other_element));
      }
      this.blacklistRules = __this__blacklistRules;
    }
    if (other.isSetWhitelistRules()) {
      Set<Http1Rule> __this__whitelistRules = new HashSet<Http1Rule>(other.whitelistRules.size());
      for (Http1Rule other_element : other.whitelistRules) {
        __this__whitelistRules.add(new Http1Rule(other_element));
      }
      this.whitelistRules = __this__whitelistRules;
    }
  }

  public Http1Ruleset deepCopy() {
    return new Http1Ruleset(this);
  }

  @Override
  public void clear() {
    this.blacklistRules = null;
    this.whitelistRules = null;
  }

  public int getBlacklistRulesSize() {
    return (this.blacklistRules == null) ? 0 : this.blacklistRules.size();
  }

  public java.util.Iterator<Http1Rule> getBlacklistRulesIterator() {
    return (this.blacklistRules == null) ? null : this.blacklistRules.iterator();
  }

  public void addToBlacklistRules(Http1Rule elem) {
    if (this.blacklistRules == null) {
      this.blacklistRules = new HashSet<Http1Rule>();
    }
    this.blacklistRules.add(elem);
  }

  public Set<Http1Rule> getBlacklistRules() {
    return this.blacklistRules;
  }

  public Http1Ruleset setBlacklistRules(Set<Http1Rule> blacklistRules) {
    this.blacklistRules = blacklistRules;
    return this;
  }

  public void unsetBlacklistRules() {
    this.blacklistRules = null;
  }

  /** Returns true if field blacklistRules is set (has been assigned a value) and false otherwise */
  public boolean isSetBlacklistRules() {
    return this.blacklistRules != null;
  }

  public void setBlacklistRulesIsSet(boolean value) {
    if (!value) {
      this.blacklistRules = null;
    }
  }

  public int getWhitelistRulesSize() {
    return (this.whitelistRules == null) ? 0 : this.whitelistRules.size();
  }

  public java.util.Iterator<Http1Rule> getWhitelistRulesIterator() {
    return (this.whitelistRules == null) ? null : this.whitelistRules.iterator();
  }

  public void addToWhitelistRules(Http1Rule elem) {
    if (this.whitelistRules == null) {
      this.whitelistRules = new HashSet<Http1Rule>();
    }
    this.whitelistRules.add(elem);
  }

  public Set<Http1Rule> getWhitelistRules() {
    return this.whitelistRules;
  }

  public Http1Ruleset setWhitelistRules(Set<Http1Rule> whitelistRules) {
    this.whitelistRules = whitelistRules;
    return this;
  }

  public void unsetWhitelistRules() {
    this.whitelistRules = null;
  }

  /** Returns true if field whitelistRules is set (has been assigned a value) and false otherwise */
  public boolean isSetWhitelistRules() {
    return this.whitelistRules != null;
  }

  public void setWhitelistRulesIsSet(boolean value) {
    if (!value) {
      this.whitelistRules = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case BLACKLIST_RULES:
      if (value == null) {
        unsetBlacklistRules();
      } else {
        setBlacklistRules((Set<Http1Rule>)value);
      }
      break;

    case WHITELIST_RULES:
      if (value == null) {
        unsetWhitelistRules();
      } else {
        setWhitelistRules((Set<Http1Rule>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BLACKLIST_RULES:
      return getBlacklistRules();

    case WHITELIST_RULES:
      return getWhitelistRules();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case BLACKLIST_RULES:
      return isSetBlacklistRules();
    case WHITELIST_RULES:
      return isSetWhitelistRules();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Http1Ruleset)
      return this.equals((Http1Ruleset)that);
    return false;
  }

  public boolean equals(Http1Ruleset that) {
    if (that == null)
      return false;

    boolean this_present_blacklistRules = true && this.isSetBlacklistRules();
    boolean that_present_blacklistRules = true && that.isSetBlacklistRules();
    if (this_present_blacklistRules || that_present_blacklistRules) {
      if (!(this_present_blacklistRules && that_present_blacklistRules))
        return false;
      if (!this.blacklistRules.equals(that.blacklistRules))
        return false;
    }

    boolean this_present_whitelistRules = true && this.isSetWhitelistRules();
    boolean that_present_whitelistRules = true && that.isSetWhitelistRules();
    if (this_present_whitelistRules || that_present_whitelistRules) {
      if (!(this_present_whitelistRules && that_present_whitelistRules))
        return false;
      if (!this.whitelistRules.equals(that.whitelistRules))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_blacklistRules = true && (isSetBlacklistRules());
    list.add(present_blacklistRules);
    if (present_blacklistRules)
      list.add(blacklistRules);

    boolean present_whitelistRules = true && (isSetWhitelistRules());
    list.add(present_whitelistRules);
    if (present_whitelistRules)
      list.add(whitelistRules);

    return list.hashCode();
  }

  @Override
  public int compareTo(Http1Ruleset other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetBlacklistRules()).compareTo(other.isSetBlacklistRules());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBlacklistRules()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.blacklistRules, other.blacklistRules);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWhitelistRules()).compareTo(other.isSetWhitelistRules());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWhitelistRules()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.whitelistRules, other.whitelistRules);
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
    StringBuilder sb = new StringBuilder("Http1Ruleset(");
    boolean first = true;

    sb.append("blacklistRules:");
    if (this.blacklistRules == null) {
      sb.append("null");
    } else {
      sb.append(this.blacklistRules);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("whitelistRules:");
    if (this.whitelistRules == null) {
      sb.append("null");
    } else {
      sb.append(this.whitelistRules);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (blacklistRules == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'blacklistRules' was not present! Struct: " + toString());
    }
    if (whitelistRules == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'whitelistRules' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class Http1RulesetStandardSchemeFactory implements SchemeFactory {
    public Http1RulesetStandardScheme getScheme() {
      return new Http1RulesetStandardScheme();
    }
  }

  private static class Http1RulesetStandardScheme extends StandardScheme<Http1Ruleset> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Http1Ruleset struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BLACKLIST_RULES
            if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
              {
                org.apache.thrift.protocol.TSet _set8 = iprot.readSetBegin();
                struct.blacklistRules = new HashSet<Http1Rule>(2*_set8.size);
                Http1Rule _elem9;
                for (int _i10 = 0; _i10 < _set8.size; ++_i10)
                {
                  _elem9 = new Http1Rule();
                  _elem9.read(iprot);
                  struct.blacklistRules.add(_elem9);
                }
                iprot.readSetEnd();
              }
              struct.setBlacklistRulesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // WHITELIST_RULES
            if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
              {
                org.apache.thrift.protocol.TSet _set11 = iprot.readSetBegin();
                struct.whitelistRules = new HashSet<Http1Rule>(2*_set11.size);
                Http1Rule _elem12;
                for (int _i13 = 0; _i13 < _set11.size; ++_i13)
                {
                  _elem12 = new Http1Rule();
                  _elem12.read(iprot);
                  struct.whitelistRules.add(_elem12);
                }
                iprot.readSetEnd();
              }
              struct.setWhitelistRulesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Http1Ruleset struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.blacklistRules != null) {
        oprot.writeFieldBegin(BLACKLIST_RULES_FIELD_DESC);
        {
          oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, struct.blacklistRules.size()));
          for (Http1Rule _iter14 : struct.blacklistRules)
          {
            _iter14.write(oprot);
          }
          oprot.writeSetEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.whitelistRules != null) {
        oprot.writeFieldBegin(WHITELIST_RULES_FIELD_DESC);
        {
          oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, struct.whitelistRules.size()));
          for (Http1Rule _iter15 : struct.whitelistRules)
          {
            _iter15.write(oprot);
          }
          oprot.writeSetEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class Http1RulesetTupleSchemeFactory implements SchemeFactory {
    public Http1RulesetTupleScheme getScheme() {
      return new Http1RulesetTupleScheme();
    }
  }

  private static class Http1RulesetTupleScheme extends TupleScheme<Http1Ruleset> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Http1Ruleset struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.blacklistRules.size());
        for (Http1Rule _iter16 : struct.blacklistRules)
        {
          _iter16.write(oprot);
        }
      }
      {
        oprot.writeI32(struct.whitelistRules.size());
        for (Http1Rule _iter17 : struct.whitelistRules)
        {
          _iter17.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Http1Ruleset struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TSet _set18 = new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.blacklistRules = new HashSet<Http1Rule>(2*_set18.size);
        Http1Rule _elem19;
        for (int _i20 = 0; _i20 < _set18.size; ++_i20)
        {
          _elem19 = new Http1Rule();
          _elem19.read(iprot);
          struct.blacklistRules.add(_elem19);
        }
      }
      struct.setBlacklistRulesIsSet(true);
      {
        org.apache.thrift.protocol.TSet _set21 = new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.whitelistRules = new HashSet<Http1Rule>(2*_set21.size);
        Http1Rule _elem22;
        for (int _i23 = 0; _i23 < _set21.size; ++_i23)
        {
          _elem22 = new Http1Rule();
          _elem22.read(iprot);
          struct.whitelistRules.add(_elem22);
        }
      }
      struct.setWhitelistRulesIsSet(true);
    }
  }

}

