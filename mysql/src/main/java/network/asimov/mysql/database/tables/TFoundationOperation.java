/*
 * This file is generated by jOOQ.
 */
package network.asimov.mysql.database.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import network.asimov.mysql.database.AsimovServer;
import network.asimov.mysql.database.Indexes;
import network.asimov.mysql.database.Keys;
import network.asimov.mysql.database.tables.records.TFoundationOperationRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class TFoundationOperation extends TableImpl<TFoundationOperationRecord> {

    private static final long serialVersionUID = -987813011;

    /**
     * The reference instance of <code>asimov_server.t_foundation_operation</code>
     */
    public static final TFoundationOperation T_FOUNDATION_OPERATION = new TFoundationOperation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TFoundationOperationRecord> getRecordType() {
        return TFoundationOperationRecord.class;
    }

    /**
     * The column <code>asimov_server.t_foundation_operation.id</code>. 主键
     */
    public final TableField<TFoundationOperationRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "主键");

    /**
     * The column <code>asimov_server.t_foundation_operation.tx_hash</code>. 交易Hash
     */
    public final TableField<TFoundationOperationRecord, String> TX_HASH = createField("tx_hash", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "交易Hash");

    /**
     * The column <code>asimov_server.t_foundation_operation.operation_type</code>. 操作类型：1、发起提议 2、提议投票 3、捐赠
     */
    public final TableField<TFoundationOperationRecord, Byte> OPERATION_TYPE = createField("operation_type", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "操作类型：1、发起提议 2、提议投票 3、捐赠");

    /**
     * The column <code>asimov_server.t_foundation_operation.additional_info</code>. 附加信息(JSON字符串)
     */
    public final TableField<TFoundationOperationRecord, String> ADDITIONAL_INFO = createField("additional_info", org.jooq.impl.SQLDataType.VARCHAR(1024).nullable(false), this, "附加信息(JSON字符串)");

    /**
     * The column <code>asimov_server.t_foundation_operation.tx_status</code>. 交易状态，0-待确认，1-交易入块、合约执行成功，2-交易入块、合约执行失败
     */
    public final TableField<TFoundationOperationRecord, Byte> TX_STATUS = createField("tx_status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "交易状态，0-待确认，1-交易入块、合约执行成功，2-交易入块、合约执行失败");

    /**
     * The column <code>asimov_server.t_foundation_operation.operator</code>. 操作人地址
     */
    public final TableField<TFoundationOperationRecord, String> OPERATOR = createField("operator", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "操作人地址");

    /**
     * The column <code>asimov_server.t_foundation_operation.create_time</code>. 创建时间
     */
    public final TableField<TFoundationOperationRecord, Long> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "创建时间");

    /**
     * The column <code>asimov_server.t_foundation_operation.update_time</code>. 更新时间
     */
    public final TableField<TFoundationOperationRecord, Long> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "更新时间");

    /**
     * Create a <code>asimov_server.t_foundation_operation</code> table reference
     */
    public TFoundationOperation() {
        this(DSL.name("t_foundation_operation"), null);
    }

    /**
     * Create an aliased <code>asimov_server.t_foundation_operation</code> table reference
     */
    public TFoundationOperation(String alias) {
        this(DSL.name(alias), T_FOUNDATION_OPERATION);
    }

    /**
     * Create an aliased <code>asimov_server.t_foundation_operation</code> table reference
     */
    public TFoundationOperation(Name alias) {
        this(alias, T_FOUNDATION_OPERATION);
    }

    private TFoundationOperation(Name alias, Table<TFoundationOperationRecord> aliased) {
        this(alias, aliased, null);
    }

    private TFoundationOperation(Name alias, Table<TFoundationOperationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TFoundationOperation(Table<O> child, ForeignKey<O, TFoundationOperationRecord> key) {
        super(child, key, T_FOUNDATION_OPERATION);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return AsimovServer.ASIMOV_SERVER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.T_FOUNDATION_OPERATION_INDEX_OPERATION_TYPE, Indexes.T_FOUNDATION_OPERATION_INDEX_OPERATOR_TYPE, Indexes.T_FOUNDATION_OPERATION_INDEX_TX_HASH_UNIQUE, Indexes.T_FOUNDATION_OPERATION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TFoundationOperationRecord> getPrimaryKey() {
        return Keys.KEY_T_FOUNDATION_OPERATION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TFoundationOperationRecord>> getKeys() {
        return Arrays.<UniqueKey<TFoundationOperationRecord>>asList(Keys.KEY_T_FOUNDATION_OPERATION_PRIMARY, Keys.KEY_T_FOUNDATION_OPERATION_INDEX_TX_HASH_UNIQUE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TFoundationOperation as(String alias) {
        return new TFoundationOperation(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TFoundationOperation as(Name alias) {
        return new TFoundationOperation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TFoundationOperation rename(String name) {
        return new TFoundationOperation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TFoundationOperation rename(Name name) {
        return new TFoundationOperation(name, null);
    }
}
