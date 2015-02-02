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
public class WarpPlayerMap
    extends
    org.jooq.impl.TableImpl<me.taylorkelly.mywarp.dataconnections.generated.tables.records.WarpPlayerMapRecord> {

  private static final long serialVersionUID = -1390479099;

  /**
   * The reference instance of <code>mywarp.warp_player_map</code>
   */
  public static final me.taylorkelly.mywarp.dataconnections.generated.tables.WarpPlayerMap
      WARP_PLAYER_MAP =
      new me.taylorkelly.mywarp.dataconnections.generated.tables.WarpPlayerMap();

  /**
   * The class holding records for this type
   */
  @Override
  public java.lang.Class<me.taylorkelly.mywarp.dataconnections.generated.tables.records.WarpPlayerMapRecord> getRecordType() {
    return me.taylorkelly.mywarp.dataconnections.generated.tables.records.WarpPlayerMapRecord.class;
  }

  /**
   * The column <code>mywarp.warp_player_map.warp_id</code>.
   */
  public final org.jooq.TableField<me.taylorkelly.mywarp.dataconnections.generated.tables.records.WarpPlayerMapRecord, org.jooq.types.UInteger>
      WARP_ID =
      createField(
          "warp_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

  /**
   * The column <code>mywarp.warp_player_map.player_id</code>.
   */
  public final org.jooq.TableField<me.taylorkelly.mywarp.dataconnections.generated.tables.records.WarpPlayerMapRecord, org.jooq.types.UInteger>
      PLAYER_ID =
      createField(
          "player_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

  /**
   * Create a <code>mywarp.warp_player_map</code> table reference
   */
  public WarpPlayerMap() {
    this("warp_player_map", null);
  }

  /**
   * Create an aliased <code>mywarp.warp_player_map</code> table reference
   */
  public WarpPlayerMap(java.lang.String alias) {
    this(alias,
         me.taylorkelly.mywarp.dataconnections.generated.tables.WarpPlayerMap.WARP_PLAYER_MAP);
  }

  private WarpPlayerMap(
      java.lang.String alias,
      org.jooq.Table<me.taylorkelly.mywarp.dataconnections.generated.tables.records.WarpPlayerMapRecord> aliased) {
    this(alias, aliased, null);
  }

  private WarpPlayerMap(
      java.lang.String alias,
      org.jooq.Table<me.taylorkelly.mywarp.dataconnections.generated.tables.records.WarpPlayerMapRecord> aliased,
      org.jooq.Field<?>[] parameters) {
    super(alias, me.taylorkelly.mywarp.dataconnections.generated.Mywarp.MYWARP, aliased, parameters,
          "");
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public org.jooq.UniqueKey<me.taylorkelly.mywarp.dataconnections.generated.tables.records.WarpPlayerMapRecord> getPrimaryKey() {
    return me.taylorkelly.mywarp.dataconnections.generated.Keys.KEY_WARP_PLAYER_MAP_PRIMARY;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public java.util.List<org.jooq.UniqueKey<me.taylorkelly.mywarp.dataconnections.generated.tables.records.WarpPlayerMapRecord>> getKeys() {
    return java.util.Arrays
        .<org.jooq.UniqueKey<me.taylorkelly.mywarp.dataconnections.generated.tables.records.WarpPlayerMapRecord>>asList(
            me.taylorkelly.mywarp.dataconnections.generated.Keys.KEY_WARP_PLAYER_MAP_PRIMARY);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public java.util.List<org.jooq.ForeignKey<me.taylorkelly.mywarp.dataconnections.generated.tables.records.WarpPlayerMapRecord, ?>> getReferences() {
    return java.util.Arrays
        .<org.jooq.ForeignKey<me.taylorkelly.mywarp.dataconnections.generated.tables.records.WarpPlayerMapRecord, ?>>asList(
            me.taylorkelly.mywarp.dataconnections.generated.Keys.WARP_PLAYER_MAP_WARP_ID_FK,
            me.taylorkelly.mywarp.dataconnections.generated.Keys.WARP_PLAYER_MAP_PLAYER_ID_FK);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public me.taylorkelly.mywarp.dataconnections.generated.tables.WarpPlayerMap as(
      java.lang.String alias) {
    return new me.taylorkelly.mywarp.dataconnections.generated.tables.WarpPlayerMap(alias, this);
  }

  /**
   * Rename this table
   */
  public me.taylorkelly.mywarp.dataconnections.generated.tables.WarpPlayerMap rename(
      java.lang.String name) {
    return new me.taylorkelly.mywarp.dataconnections.generated.tables.WarpPlayerMap(name, null);
  }
}
