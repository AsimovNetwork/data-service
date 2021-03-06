/*
 * This file is generated by jOOQ.
 */
package network.asimov.mysql.database.tables.records;


import javax.annotation.Generated;

import network.asimov.mysql.database.tables.TDaoOrganization;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.12"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TDaoOrganizationRecord extends UpdatableRecordImpl<TDaoOrganizationRecord> implements Record10<Long, String, String, String, String, String, String, Byte, Long, Long> {

    private static final long serialVersionUID = 858206745;

    /**
     * Setter for <code>asimov_server.t_dao_organization.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>asimov_server.t_dao_organization.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>asimov_server.t_dao_organization.tx_hash</code>. 交易Hash
     */
    public void setTxHash(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>asimov_server.t_dao_organization.tx_hash</code>. 交易Hash
     */
    public String getTxHash() {
        return (String) get(1);
    }

    /**
     * Setter for <code>asimov_server.t_dao_organization.contract_address</code>. 组织合约地址
     */
    public void setContractAddress(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>asimov_server.t_dao_organization.contract_address</code>. 组织合约地址
     */
    public String getContractAddress() {
        return (String) get(2);
    }

    /**
     * Setter for <code>asimov_server.t_dao_organization.vote_contract_address</code>. 投票合约地址
     */
    public void setVoteContractAddress(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>asimov_server.t_dao_organization.vote_contract_address</code>. 投票合约地址
     */
    public String getVoteContractAddress() {
        return (String) get(3);
    }

    /**
     * Setter for <code>asimov_server.t_dao_organization.creator_address</code>. 创建人地址
     */
    public void setCreatorAddress(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>asimov_server.t_dao_organization.creator_address</code>. 创建人地址
     */
    public String getCreatorAddress() {
        return (String) get(4);
    }

    /**
     * Setter for <code>asimov_server.t_dao_organization.org_name</code>. 组织名称
     */
    public void setOrgName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>asimov_server.t_dao_organization.org_name</code>. 组织名称
     */
    public String getOrgName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>asimov_server.t_dao_organization.org_logo</code>. 组织logo
     */
    public void setOrgLogo(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>asimov_server.t_dao_organization.org_logo</code>. 组织logo
     */
    public String getOrgLogo() {
        return (String) get(6);
    }

    /**
     * Setter for <code>asimov_server.t_dao_organization.state</code>. 组织状态：0-正常，1-被关闭，2-初始化，尚未上链
     */
    public void setState(Byte value) {
        set(7, value);
    }

    /**
     * Getter for <code>asimov_server.t_dao_organization.state</code>. 组织状态：0-正常，1-被关闭，2-初始化，尚未上链
     */
    public Byte getState() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>asimov_server.t_dao_organization.create_time</code>. 创建时间
     */
    public void setCreateTime(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>asimov_server.t_dao_organization.create_time</code>. 创建时间
     */
    public Long getCreateTime() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>asimov_server.t_dao_organization.update_time</code>. 修改时间
     */
    public void setUpdateTime(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>asimov_server.t_dao_organization.update_time</code>. 修改时间
     */
    public Long getUpdateTime() {
        return (Long) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Long, String, String, String, String, String, String, Byte, Long, Long> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Long, String, String, String, String, String, String, Byte, Long, Long> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TDaoOrganization.T_DAO_ORGANIZATION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TDaoOrganization.T_DAO_ORGANIZATION.TX_HASH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TDaoOrganization.T_DAO_ORGANIZATION.CONTRACT_ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TDaoOrganization.T_DAO_ORGANIZATION.VOTE_CONTRACT_ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TDaoOrganization.T_DAO_ORGANIZATION.CREATOR_ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TDaoOrganization.T_DAO_ORGANIZATION.ORG_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TDaoOrganization.T_DAO_ORGANIZATION.ORG_LOGO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field8() {
        return TDaoOrganization.T_DAO_ORGANIZATION.STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field9() {
        return TDaoOrganization.T_DAO_ORGANIZATION.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field10() {
        return TDaoOrganization.T_DAO_ORGANIZATION.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getTxHash();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getContractAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getVoteContractAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getCreatorAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getOrgName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getOrgLogo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component8() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component9() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component10() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTxHash();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getContractAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getVoteContractAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCreatorAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getOrgName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getOrgLogo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value8() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value9() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value10() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDaoOrganizationRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDaoOrganizationRecord value2(String value) {
        setTxHash(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDaoOrganizationRecord value3(String value) {
        setContractAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDaoOrganizationRecord value4(String value) {
        setVoteContractAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDaoOrganizationRecord value5(String value) {
        setCreatorAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDaoOrganizationRecord value6(String value) {
        setOrgName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDaoOrganizationRecord value7(String value) {
        setOrgLogo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDaoOrganizationRecord value8(Byte value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDaoOrganizationRecord value9(Long value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDaoOrganizationRecord value10(Long value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDaoOrganizationRecord values(Long value1, String value2, String value3, String value4, String value5, String value6, String value7, Byte value8, Long value9, Long value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TDaoOrganizationRecord
     */
    public TDaoOrganizationRecord() {
        super(TDaoOrganization.T_DAO_ORGANIZATION);
    }

    /**
     * Create a detached, initialised TDaoOrganizationRecord
     */
    public TDaoOrganizationRecord(Long id, String txHash, String contractAddress, String voteContractAddress, String creatorAddress, String orgName, String orgLogo, Byte state, Long createTime, Long updateTime) {
        super(TDaoOrganization.T_DAO_ORGANIZATION);

        set(0, id);
        set(1, txHash);
        set(2, contractAddress);
        set(3, voteContractAddress);
        set(4, creatorAddress);
        set(5, orgName);
        set(6, orgLogo);
        set(7, state);
        set(8, createTime);
        set(9, updateTime);
    }
}
