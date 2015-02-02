/*
 * Copyright (C) 2011 - 2015, MyWarp team and contributors
 *
 * This file is part of MyWarp.
 *
 * MyWarp is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * MyWarp is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with MyWarp. If not, see <http://www.gnu.org/licenses/>.
 */

/**
 * This class is generated by jOOQ
 */
package me.taylorkelly.mywarp.dataconnections.generated.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value = {"http://www.jooq.org",
                                     "jOOQ version:3.5.1"}, comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Warp extends
                  org.jooq.impl.TableImpl<me.taylorkelly.mywarp.dataconnections.generated.tables.records.WarpRecord> {

  private static final long serialVersionUID = -1893733018;

  /**
   * The reference instance of <code>mywarp.warp</code>
   */
  public static final me.taylorkelly.mywarp.dataconnections.generated.tables.Warp
      WARP =
      new me.taylorkelly.mywarp.dataconnections.generated.tables.Warp();

  /**
   * The class holding records for this type
   */
  @Override
  public java.lang.Class<me.taylorkelly.mywarp.dataconnections.generated.tables.records.WarpRecord> getRecordType() {
    return me.taylorkelly.mywarp.dataconnections.generated.tables.records.WarpRecord.class;
  }

  /**
   * The column <code>mywarp.warp.warp_id</code>.
   */
  public final org.jooq.TableField<me.taylorkelly.mywarp.dataconnections.generated.tables.records.WarpRecord, org.jooq.types.UInteger>
      WARP_ID =
      createField(
          "warp_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

  /**
   * The column <code>mywarp.warp.name</code>.
   */
  public final org.jooq.TableField<me.taylorkelly.mywarp.dataconnections.generated.tables.records.WarpRecord, java.lang.String>
      NAME =
      createField(
          "name", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this, "");

  /**
   * The column <code>mywarp.warp.player_id</code>.
   */
  public final org.jooq.TableField<me.taylorkelly.mywarp.dataconnections.generated.tables.records.WarpRecord, org.jooq.types.UInteger>
      PLAYER_ID =
      createField(
          "player_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

  /**
   * The column <code>mywarp.warp.x</code>.
   */
  public final org.jooq.TableField<me.taylorkelly.mywarp.dataconnections.generated.tables.records.WarpRecord, java.lang.Double>
      X =
      createField(
          "x", org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

  /**
   * The column <code>mywarp.warp.y</code>.
   */
  public final org.jooq.TableField<me.taylorkelly.mywarp.dataconnections.generated.tables.records.WarpRecord, java.lang.Double>
      Y =
      createField(
          "y", org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

  /**
   * The column <code>mywarp.warp.z</code>.
   */
  public final org.jooq.TableField<me.taylorkelly.mywarp.dataconnections.generated.tables.records.WarpRecord, java.lang.Double>
      Z =
      createField(
          "z", org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

  /**
   * The column <code>mywarp.warp.pitch</code>.
   */
  public final org.jooq.TableField<me.taylorkelly.mywarp.dataconnections.generated.tables.records.WarpRecord, java.lang.Float>
      PITCH =
      createField(
          "pitch", org.jooq.impl.SQLDataType.REAL.nullable(false), this, "");

  /**
   * The column <code>mywarp.warp.yaw</code>.
   */
  public final org.jooq.TableField<me.taylorkelly.mywarp.dataconnections.generated.tables.records.WarpRecord, java.lang.Float>
      YAW =
      createField(
          "yaw", org.jooq.impl.SQLDataType.REAL.nullable(false), this, "");

  /**
   * The column <code>mywarp.warp.world_id</code>.
   */
  public final org.jooq.TableField<me.taylorkelly.mywarp.dataconnections.generated.tables.records.WarpRecord, org.jooq.types.UInteger>
      WORLD_ID =
      createField(
          "world_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

  /**
   * The column <code>mywarp.warp.creation_date</code>.
   */
  public final org.jooq.TableField<me.taylorkelly.mywarp.dataconnections.generated.tables.records.WarpRecord, java.util.Date>
      CREATION_DATE =
      createField(
          "creation_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "",
          new me.taylorkelly.mywarp.dataconnections.converter.DateTimestampConverter());

  /**
   * The column <code>mywarp.warp.type</code>.
   */
  public final org.jooq.TableField<me.taylorkelly.mywarp.dataconnections.generated.tables.records.WarpRecord, me.taylorkelly.mywarp.warp.Warp.Type>
      TYPE =
      createField(
          "type", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "",
          new me.taylorkelly.mywarp.dataconnections.converter.TypeConverter());

  /**
   * The column <code>mywarp.warp.visits</code>.
   */
  public final org.jooq.TableField<me.taylorkelly.mywarp.dataconnections.generated.tables.records.WarpRecord, org.jooq.types.UInteger>
      VISITS =
      createField(
          "visits", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaulted(true), this,
          "");

  /**
   * The column <code>mywarp.warp.welcome_message</code>.
   */
  public final org.jooq.TableField<me.taylorkelly.mywarp.dataconnections.generated.tables.records.WarpRecord, java.lang.String>
      WELCOME_MESSAGE =
      createField(
          "welcome_message", org.jooq.impl.SQLDataType.CLOB.length(255), this, "");

  /**
   * Create a <code>mywarp.warp</code> table reference
   */
  public Warp() {
    this("warp", null);
  }

  /**
   * Create an aliased <code>mywarp.warp</code> table reference
   */
  public Warp(java.lang.String alias) {
    this(alias, me.taylorkelly.mywarp.dataconnections.generated.tables.Warp.WARP);
  }

  private Warp(java.lang.String alias,
               org.jooq.Table<me.taylorkelly.mywarp.dataconnections.generated.tables.records.WarpRecord> aliased) {
    this(alias, aliased, null);
  }

  private Warp(
      java.lang.String alias,
      org.jooq.Table<me.taylorkelly.mywarp.dataconnections.generated.tables.records.WarpRecord> aliased,
      org.jooq.Field<?>[] parameters) {
    super(alias, me.taylorkelly.mywarp.dataconnections.generated.Mywarp.MYWARP, aliased, parameters,
          "");
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public org.jooq.Identity<me.taylorkelly.mywarp.dataconnections.generated.tables.records.WarpRecord, org.jooq.types.UInteger> getIdentity() {
    return me.taylorkelly.mywarp.dataconnections.generated.Keys.IDENTITY_WARP;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public org.jooq.UniqueKey<me.taylorkelly.mywarp.dataconnections.generated.tables.records.WarpRecord> getPrimaryKey() {
    return me.taylorkelly.mywarp.dataconnections.generated.Keys.KEY_WARP_PRIMARY;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public java.util.List<org.jooq.UniqueKey<me.taylorkelly.mywarp.dataconnections.generated.tables.records.WarpRecord>> getKeys() {
    return java.util.Arrays
        .<org.jooq.UniqueKey<me.taylorkelly.mywarp.dataconnections.generated.tables.records.WarpRecord>>asList(
            me.taylorkelly.mywarp.dataconnections.generated.Keys.KEY_WARP_PRIMARY,
            me.taylorkelly.mywarp.dataconnections.generated.Keys.KEY_WARP_WARP_NAME_UQ);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public java.util.List<org.jooq.ForeignKey<me.taylorkelly.mywarp.dataconnections.generated.tables.records.WarpRecord, ?>> getReferences() {
    return java.util.Arrays
        .<org.jooq.ForeignKey<me.taylorkelly.mywarp.dataconnections.generated.tables.records.WarpRecord, ?>>asList(
            me.taylorkelly.mywarp.dataconnections.generated.Keys.WARP_PLAYER_ID_FK,
            me.taylorkelly.mywarp.dataconnections.generated.Keys.WARP_WORLD_ID_FK);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public me.taylorkelly.mywarp.dataconnections.generated.tables.Warp as(java.lang.String alias) {
    return new me.taylorkelly.mywarp.dataconnections.generated.tables.Warp(alias, this);
  }

  /**
   * Rename this table
   */
  public me.taylorkelly.mywarp.dataconnections.generated.tables.Warp rename(java.lang.String name) {
    return new me.taylorkelly.mywarp.dataconnections.generated.tables.Warp(name, null);
  }
}
