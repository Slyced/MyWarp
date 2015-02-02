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

package me.taylorkelly.mywarp.safety;

import me.taylorkelly.mywarp.LocalWorld;
import me.taylorkelly.mywarp.util.Vector3;

/**
 * Tests if a certain position is safe to stand on.
 */
public abstract class BlockSafety implements PositionSafety {

  @Override
  public boolean isPositionSafe(LocalWorld world, Vector3 position) {
    Vector3 upOne = position.add(0, 1, 0);
    Vector3 downOne = position.sub(0, 1, 0);

    if (!world.getBlock(position).isSafeToStandIn()) {
      return false;
    }
    if (!world.getBlock(upOne).isSafeToStandIn()) {
      return false;
    }
    if (!world.getBlock(downOne).isSafeToStandOn()) {
      return false;
    }
    return true;
  }
}
