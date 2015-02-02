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
public class Player extends
                    org.jooq.impl.TableImpl<me.taylorkelly.mywarp.dataconnections.generated.tables.records.PlayerRecord> {

  private static final long serialVersionUID = 1759513486;

  /**
   * The reference instance of <code>mywarp.player</code>
   */
  public static final me.taylorkelly.mywarp.dataconnections.generated.tables.Player
      PLAYER =
      new me.taylorkelly.mywarp.dataconnections.generated.tables.Player();

  /**
   * The class holding records for this type
   */
  @Override
  public java.lang.Class<me.taylorkelly.mywarp.dataconnections.generated.tables.records.PlayerRecord> getRecordType() {
    return me.taylorkelly.mywarp.dataconnections.generated.tables.records.PlayerRecord.class;
  }

  /**
   * The column <code>mywarp.player.player_id</code>.
   */
  public final org.jooq.TableField<me.taylorkelly.mywarp.dataconnections.generated.tables.records.PlayerRecord, org.jooq.types.UInteger>
      PLAYER_ID =
      createField(
          "player_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

  /**
   * The column <code>mywarp.player.uuid</code>.
   */
  public final org.jooq.TableField<me.taylorkelly.mywarp.dataconnections.generated.tables.records.PlayerRecord, me.taylorkelly.mywarp.util.profile.Profile>
      UUID =
      createField(
          "uuid", org.jooq.impl.SQLDataType.BINARY.length(16).nullable(false), this, "",
          new me.taylorkelly.mywarp.dataconnections.converter.ProfileBinaryConverter());

  /**
   * Create a <code>mywarp.player</code> table reference
   */
  public Player() {
    this("player", null);
  }

  /**
   * Create an aliased <code>mywarp.player</code> table reference
   */
  public Player(java.lang.String alias) {
    this(alias, me.taylorkelly.mywarp.dataconnections.generated.tables.Player.PLAYER);
  }

  private Player(
      java.lang.String alias,
      org.jooq.Table<me.taylorkelly.mywarp.dataconnections.generated.tables.records.PlayerRecord> aliased) {
    this(alias, aliased, null);
  }

  private Player(
      java.lang.String alias,
      org.jooq.Table<me.taylorkelly.mywarp.dataconnections.generated.tables.records.PlayerRecord> aliased,
      org.jooq.Field<?>[] parameters) {
    super(alias, me.taylorkelly.mywarp.dataconnections.generated.Mywarp.MYWARP, aliased, parameters,
          "");
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public org.jooq.Identity<me.taylorkelly.mywarp.dataconnections.generated.tables.records.PlayerRecord, org.jooq.types.UInteger> getIdentity() {
    return me.taylorkelly.mywarp.dataconnections.generated.Keys.IDENTITY_PLAYER;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public org.jooq.UniqueKey<me.taylorkelly.mywarp.dataconnections.generated.tables.records.PlayerRecord> getPrimaryKey() {
    return me.taylorkelly.mywarp.dataconnections.generated.Keys.KEY_PLAYER_PRIMARY;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public java.util.List<org.jooq.UniqueKey<me.taylorkelly.mywarp.dataconnections.generated.tables.records.PlayerRecord>> getKeys() {
    return java.util.Arrays
        .<org.jooq.UniqueKey<me.taylorkelly.mywarp.dataconnections.generated.tables.records.PlayerRecord>>asList(
            me.taylorkelly.mywarp.dataconnections.generated.Keys.KEY_PLAYER_PRIMARY,
            me.taylorkelly.mywarp.dataconnections.generated.Keys.KEY_PLAYER_PLAYER_UUID_UQ);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public me.taylorkelly.mywarp.dataconnections.generated.tables.Player as(java.lang.String alias) {
    return new me.taylorkelly.mywarp.dataconnections.generated.tables.Player(alias, this);
  }

  /**
   * Rename this table
   */
  public me.taylorkelly.mywarp.dataconnections.generated.tables.Player rename(
      java.lang.String name) {
    return new me.taylorkelly.mywarp.dataconnections.generated.tables.Player(name, null);
  }
}
