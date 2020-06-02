/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package cn.piao888.cg.thriftAPI;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2020-03-21")
public class MMainPlan implements org.apache.thrift.TBase<MMainPlan, MMainPlan._Fields>, java.io.Serializable, Cloneable, Comparable<MMainPlan> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MMainPlan");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField P__BASE_INFO__ID_FIELD_DESC = new org.apache.thrift.protocol.TField("P_BaseInfo_Id", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField PLAN_TITLE_FIELD_DESC = new org.apache.thrift.protocol.TField("PlanTitle", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("State", org.apache.thrift.protocol.TType.BYTE, (short)4);
  private static final org.apache.thrift.protocol.TField REMARK_FIELD_DESC = new org.apache.thrift.protocol.TField("Remark", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField IS_CHANGE_PLAN_FIELD_DESC = new org.apache.thrift.protocol.TField("IsChangePlan", org.apache.thrift.protocol.TType.BOOL, (short)6);
  private static final org.apache.thrift.protocol.TField USER_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("userInfo", org.apache.thrift.protocol.TType.STRUCT, (short)7);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new MMainPlanStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new MMainPlanTupleSchemeFactory();

  public long id; // required
  public int P_BaseInfo_Id; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String PlanTitle; // required
  public byte State; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String Remark; // required
  public boolean IsChangePlan; // required
  public @org.apache.thrift.annotation.Nullable UserInfo userInfo; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    P__BASE_INFO__ID((short)2, "P_BaseInfo_Id"),
    PLAN_TITLE((short)3, "PlanTitle"),
    STATE((short)4, "State"),
    REMARK((short)5, "Remark"),
    IS_CHANGE_PLAN((short)6, "IsChangePlan"),
    USER_INFO((short)7, "userInfo");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ID
          return ID;
        case 2: // P__BASE_INFO__ID
          return P__BASE_INFO__ID;
        case 3: // PLAN_TITLE
          return PLAN_TITLE;
        case 4: // STATE
          return STATE;
        case 5: // REMARK
          return REMARK;
        case 6: // IS_CHANGE_PLAN
          return IS_CHANGE_PLAN;
        case 7: // USER_INFO
          return USER_INFO;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ID_ISSET_ID = 0;
  private static final int __P_BASEINFO_ID_ISSET_ID = 1;
  private static final int __STATE_ISSET_ID = 2;
  private static final int __ISCHANGEPLAN_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.P__BASE_INFO__ID, new org.apache.thrift.meta_data.FieldMetaData("P_BaseInfo_Id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PLAN_TITLE, new org.apache.thrift.meta_data.FieldMetaData("PlanTitle", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.STATE, new org.apache.thrift.meta_data.FieldMetaData("State", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.REMARK, new org.apache.thrift.meta_data.FieldMetaData("Remark", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.IS_CHANGE_PLAN, new org.apache.thrift.meta_data.FieldMetaData("IsChangePlan", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.USER_INFO, new org.apache.thrift.meta_data.FieldMetaData("userInfo", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, UserInfo.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MMainPlan.class, metaDataMap);
  }

  public MMainPlan() {
  }

  public MMainPlan(
    long id,
    int P_BaseInfo_Id,
    java.lang.String PlanTitle,
    byte State,
    java.lang.String Remark,
    boolean IsChangePlan,
    UserInfo userInfo)
  {
    this();
    this.id = id;
    setIdIsSet(true);
    this.P_BaseInfo_Id = P_BaseInfo_Id;
    setP_BaseInfo_IdIsSet(true);
    this.PlanTitle = PlanTitle;
    this.State = State;
    setStateIsSet(true);
    this.Remark = Remark;
    this.IsChangePlan = IsChangePlan;
    setIsChangePlanIsSet(true);
    this.userInfo = userInfo;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MMainPlan(MMainPlan other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    this.P_BaseInfo_Id = other.P_BaseInfo_Id;
    if (other.isSetPlanTitle()) {
      this.PlanTitle = other.PlanTitle;
    }
    this.State = other.State;
    if (other.isSetRemark()) {
      this.Remark = other.Remark;
    }
    this.IsChangePlan = other.IsChangePlan;
    if (other.isSetUserInfo()) {
      this.userInfo = new UserInfo(other.userInfo);
    }
  }

  public MMainPlan deepCopy() {
    return new MMainPlan(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    setP_BaseInfo_IdIsSet(false);
    this.P_BaseInfo_Id = 0;
    this.PlanTitle = null;
    setStateIsSet(false);
    this.State = 0;
    this.Remark = null;
    setIsChangePlanIsSet(false);
    this.IsChangePlan = false;
    this.userInfo = null;
  }

  public long getId() {
    return this.id;
  }

  public MMainPlan setId(long id) {
    this.id = id;
    setIdIsSet(true);
    return this;
  }

  public void unsetId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
  }

  public int getP_BaseInfo_Id() {
    return this.P_BaseInfo_Id;
  }

  public MMainPlan setP_BaseInfo_Id(int P_BaseInfo_Id) {
    this.P_BaseInfo_Id = P_BaseInfo_Id;
    setP_BaseInfo_IdIsSet(true);
    return this;
  }

  public void unsetP_BaseInfo_Id() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __P_BASEINFO_ID_ISSET_ID);
  }

  /** Returns true if field P_BaseInfo_Id is set (has been assigned a value) and false otherwise */
  public boolean isSetP_BaseInfo_Id() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __P_BASEINFO_ID_ISSET_ID);
  }

  public void setP_BaseInfo_IdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __P_BASEINFO_ID_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getPlanTitle() {
    return this.PlanTitle;
  }

  public MMainPlan setPlanTitle(@org.apache.thrift.annotation.Nullable java.lang.String PlanTitle) {
    this.PlanTitle = PlanTitle;
    return this;
  }

  public void unsetPlanTitle() {
    this.PlanTitle = null;
  }

  /** Returns true if field PlanTitle is set (has been assigned a value) and false otherwise */
  public boolean isSetPlanTitle() {
    return this.PlanTitle != null;
  }

  public void setPlanTitleIsSet(boolean value) {
    if (!value) {
      this.PlanTitle = null;
    }
  }

  public byte getState() {
    return this.State;
  }

  public MMainPlan setState(byte State) {
    this.State = State;
    setStateIsSet(true);
    return this;
  }

  public void unsetState() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __STATE_ISSET_ID);
  }

  /** Returns true if field State is set (has been assigned a value) and false otherwise */
  public boolean isSetState() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __STATE_ISSET_ID);
  }

  public void setStateIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __STATE_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getRemark() {
    return this.Remark;
  }

  public MMainPlan setRemark(@org.apache.thrift.annotation.Nullable java.lang.String Remark) {
    this.Remark = Remark;
    return this;
  }

  public void unsetRemark() {
    this.Remark = null;
  }

  /** Returns true if field Remark is set (has been assigned a value) and false otherwise */
  public boolean isSetRemark() {
    return this.Remark != null;
  }

  public void setRemarkIsSet(boolean value) {
    if (!value) {
      this.Remark = null;
    }
  }

  public boolean isIsChangePlan() {
    return this.IsChangePlan;
  }

  public MMainPlan setIsChangePlan(boolean IsChangePlan) {
    this.IsChangePlan = IsChangePlan;
    setIsChangePlanIsSet(true);
    return this;
  }

  public void unsetIsChangePlan() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ISCHANGEPLAN_ISSET_ID);
  }

  /** Returns true if field IsChangePlan is set (has been assigned a value) and false otherwise */
  public boolean isSetIsChangePlan() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ISCHANGEPLAN_ISSET_ID);
  }

  public void setIsChangePlanIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ISCHANGEPLAN_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public UserInfo getUserInfo() {
    return this.userInfo;
  }

  public MMainPlan setUserInfo(@org.apache.thrift.annotation.Nullable UserInfo userInfo) {
    this.userInfo = userInfo;
    return this;
  }

  public void unsetUserInfo() {
    this.userInfo = null;
  }

  /** Returns true if field userInfo is set (has been assigned a value) and false otherwise */
  public boolean isSetUserInfo() {
    return this.userInfo != null;
  }

  public void setUserInfoIsSet(boolean value) {
    if (!value) {
      this.userInfo = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((java.lang.Long)value);
      }
      break;

    case P__BASE_INFO__ID:
      if (value == null) {
        unsetP_BaseInfo_Id();
      } else {
        setP_BaseInfo_Id((java.lang.Integer)value);
      }
      break;

    case PLAN_TITLE:
      if (value == null) {
        unsetPlanTitle();
      } else {
        setPlanTitle((java.lang.String)value);
      }
      break;

    case STATE:
      if (value == null) {
        unsetState();
      } else {
        setState((java.lang.Byte)value);
      }
      break;

    case REMARK:
      if (value == null) {
        unsetRemark();
      } else {
        setRemark((java.lang.String)value);
      }
      break;

    case IS_CHANGE_PLAN:
      if (value == null) {
        unsetIsChangePlan();
      } else {
        setIsChangePlan((java.lang.Boolean)value);
      }
      break;

    case USER_INFO:
      if (value == null) {
        unsetUserInfo();
      } else {
        setUserInfo((UserInfo)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case P__BASE_INFO__ID:
      return getP_BaseInfo_Id();

    case PLAN_TITLE:
      return getPlanTitle();

    case STATE:
      return getState();

    case REMARK:
      return getRemark();

    case IS_CHANGE_PLAN:
      return isIsChangePlan();

    case USER_INFO:
      return getUserInfo();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case P__BASE_INFO__ID:
      return isSetP_BaseInfo_Id();
    case PLAN_TITLE:
      return isSetPlanTitle();
    case STATE:
      return isSetState();
    case REMARK:
      return isSetRemark();
    case IS_CHANGE_PLAN:
      return isSetIsChangePlan();
    case USER_INFO:
      return isSetUserInfo();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof MMainPlan)
      return this.equals((MMainPlan)that);
    return false;
  }

  public boolean equals(MMainPlan that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_id = true;
    boolean that_present_id = true;
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_P_BaseInfo_Id = true;
    boolean that_present_P_BaseInfo_Id = true;
    if (this_present_P_BaseInfo_Id || that_present_P_BaseInfo_Id) {
      if (!(this_present_P_BaseInfo_Id && that_present_P_BaseInfo_Id))
        return false;
      if (this.P_BaseInfo_Id != that.P_BaseInfo_Id)
        return false;
    }

    boolean this_present_PlanTitle = true && this.isSetPlanTitle();
    boolean that_present_PlanTitle = true && that.isSetPlanTitle();
    if (this_present_PlanTitle || that_present_PlanTitle) {
      if (!(this_present_PlanTitle && that_present_PlanTitle))
        return false;
      if (!this.PlanTitle.equals(that.PlanTitle))
        return false;
    }

    boolean this_present_State = true;
    boolean that_present_State = true;
    if (this_present_State || that_present_State) {
      if (!(this_present_State && that_present_State))
        return false;
      if (this.State != that.State)
        return false;
    }

    boolean this_present_Remark = true && this.isSetRemark();
    boolean that_present_Remark = true && that.isSetRemark();
    if (this_present_Remark || that_present_Remark) {
      if (!(this_present_Remark && that_present_Remark))
        return false;
      if (!this.Remark.equals(that.Remark))
        return false;
    }

    boolean this_present_IsChangePlan = true;
    boolean that_present_IsChangePlan = true;
    if (this_present_IsChangePlan || that_present_IsChangePlan) {
      if (!(this_present_IsChangePlan && that_present_IsChangePlan))
        return false;
      if (this.IsChangePlan != that.IsChangePlan)
        return false;
    }

    boolean this_present_userInfo = true && this.isSetUserInfo();
    boolean that_present_userInfo = true && that.isSetUserInfo();
    if (this_present_userInfo || that_present_userInfo) {
      if (!(this_present_userInfo && that_present_userInfo))
        return false;
      if (!this.userInfo.equals(that.userInfo))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(id);

    hashCode = hashCode * 8191 + P_BaseInfo_Id;

    hashCode = hashCode * 8191 + ((isSetPlanTitle()) ? 131071 : 524287);
    if (isSetPlanTitle())
      hashCode = hashCode * 8191 + PlanTitle.hashCode();

    hashCode = hashCode * 8191 + (int) (State);

    hashCode = hashCode * 8191 + ((isSetRemark()) ? 131071 : 524287);
    if (isSetRemark())
      hashCode = hashCode * 8191 + Remark.hashCode();

    hashCode = hashCode * 8191 + ((IsChangePlan) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetUserInfo()) ? 131071 : 524287);
    if (isSetUserInfo())
      hashCode = hashCode * 8191 + userInfo.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(MMainPlan other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetP_BaseInfo_Id()).compareTo(other.isSetP_BaseInfo_Id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetP_BaseInfo_Id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.P_BaseInfo_Id, other.P_BaseInfo_Id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPlanTitle()).compareTo(other.isSetPlanTitle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPlanTitle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.PlanTitle, other.PlanTitle);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetState()).compareTo(other.isSetState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetState()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.State, other.State);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRemark()).compareTo(other.isSetRemark());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRemark()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Remark, other.Remark);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetIsChangePlan()).compareTo(other.isSetIsChangePlan());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsChangePlan()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.IsChangePlan, other.IsChangePlan);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUserInfo()).compareTo(other.isSetUserInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userInfo, other.userInfo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("MMainPlan(");
    boolean first = true;

    sb.append("id:");
    sb.append(this.id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("P_BaseInfo_Id:");
    sb.append(this.P_BaseInfo_Id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("PlanTitle:");
    if (this.PlanTitle == null) {
      sb.append("null");
    } else {
      sb.append(this.PlanTitle);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("State:");
    sb.append(this.State);
    first = false;
    if (!first) sb.append(", ");
    sb.append("Remark:");
    if (this.Remark == null) {
      sb.append("null");
    } else {
      sb.append(this.Remark);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("IsChangePlan:");
    sb.append(this.IsChangePlan);
    first = false;
    if (!first) sb.append(", ");
    sb.append("userInfo:");
    if (this.userInfo == null) {
      sb.append("null");
    } else {
      sb.append(this.userInfo);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (userInfo != null) {
      userInfo.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class MMainPlanStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public MMainPlanStandardScheme getScheme() {
      return new MMainPlanStandardScheme();
    }
  }

  private static class MMainPlanStandardScheme extends org.apache.thrift.scheme.StandardScheme<MMainPlan> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, MMainPlan struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.id = iprot.readI64();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // P__BASE_INFO__ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.P_BaseInfo_Id = iprot.readI32();
              struct.setP_BaseInfo_IdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PLAN_TITLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.PlanTitle = iprot.readString();
              struct.setPlanTitleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // STATE
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.State = iprot.readByte();
              struct.setStateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // REMARK
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.Remark = iprot.readString();
              struct.setRemarkIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // IS_CHANGE_PLAN
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.IsChangePlan = iprot.readBool();
              struct.setIsChangePlanIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // USER_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.userInfo = new UserInfo();
              struct.userInfo.read(iprot);
              struct.setUserInfoIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, MMainPlan struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ID_FIELD_DESC);
      oprot.writeI64(struct.id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(P__BASE_INFO__ID_FIELD_DESC);
      oprot.writeI32(struct.P_BaseInfo_Id);
      oprot.writeFieldEnd();
      if (struct.PlanTitle != null) {
        oprot.writeFieldBegin(PLAN_TITLE_FIELD_DESC);
        oprot.writeString(struct.PlanTitle);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(STATE_FIELD_DESC);
      oprot.writeByte(struct.State);
      oprot.writeFieldEnd();
      if (struct.Remark != null) {
        oprot.writeFieldBegin(REMARK_FIELD_DESC);
        oprot.writeString(struct.Remark);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(IS_CHANGE_PLAN_FIELD_DESC);
      oprot.writeBool(struct.IsChangePlan);
      oprot.writeFieldEnd();
      if (struct.userInfo != null) {
        oprot.writeFieldBegin(USER_INFO_FIELD_DESC);
        struct.userInfo.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MMainPlanTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public MMainPlanTupleScheme getScheme() {
      return new MMainPlanTupleScheme();
    }
  }

  private static class MMainPlanTupleScheme extends org.apache.thrift.scheme.TupleScheme<MMainPlan> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, MMainPlan struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetP_BaseInfo_Id()) {
        optionals.set(1);
      }
      if (struct.isSetPlanTitle()) {
        optionals.set(2);
      }
      if (struct.isSetState()) {
        optionals.set(3);
      }
      if (struct.isSetRemark()) {
        optionals.set(4);
      }
      if (struct.isSetIsChangePlan()) {
        optionals.set(5);
      }
      if (struct.isSetUserInfo()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetId()) {
        oprot.writeI64(struct.id);
      }
      if (struct.isSetP_BaseInfo_Id()) {
        oprot.writeI32(struct.P_BaseInfo_Id);
      }
      if (struct.isSetPlanTitle()) {
        oprot.writeString(struct.PlanTitle);
      }
      if (struct.isSetState()) {
        oprot.writeByte(struct.State);
      }
      if (struct.isSetRemark()) {
        oprot.writeString(struct.Remark);
      }
      if (struct.isSetIsChangePlan()) {
        oprot.writeBool(struct.IsChangePlan);
      }
      if (struct.isSetUserInfo()) {
        struct.userInfo.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, MMainPlan struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.id = iprot.readI64();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.P_BaseInfo_Id = iprot.readI32();
        struct.setP_BaseInfo_IdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.PlanTitle = iprot.readString();
        struct.setPlanTitleIsSet(true);
      }
      if (incoming.get(3)) {
        struct.State = iprot.readByte();
        struct.setStateIsSet(true);
      }
      if (incoming.get(4)) {
        struct.Remark = iprot.readString();
        struct.setRemarkIsSet(true);
      }
      if (incoming.get(5)) {
        struct.IsChangePlan = iprot.readBool();
        struct.setIsChangePlanIsSet(true);
      }
      if (incoming.get(6)) {
        struct.userInfo = new UserInfo();
        struct.userInfo.read(iprot);
        struct.setUserInfoIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
