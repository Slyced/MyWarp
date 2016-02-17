/*
 * Copyright (C) 2011 - 2016, MyWarp team and contributors
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

package me.taylorkelly.mywarp.command.provider;

import com.google.common.base.Optional;
import com.sk89q.intake.argument.ArgumentException;
import com.sk89q.intake.argument.CommandArgs;
import com.sk89q.intake.parametric.Provider;
import com.sk89q.intake.parametric.ProvisionException;

import me.taylorkelly.mywarp.Game;
import me.taylorkelly.mywarp.LocalPlayer;
import me.taylorkelly.mywarp.command.provider.exception.NoSuchPlayerException;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.List;

import javax.annotation.Nullable;

/**
 * Provides {@link LocalPlayer} instances.
 */
class PlayerProvider implements Provider<LocalPlayer> {

  private final Game game;

  /**
   * Creates an instance. Provided players will be resolved from the given {@code game}.
   *
   * @param game the game
   */
  public PlayerProvider(Game game) {
    this.game = game;
  }

  @Override
  public boolean isProvided() {
    return false;
  }

  @Nullable
  @Override
  public LocalPlayer get(CommandArgs arguments, List<? extends Annotation> modifiers)
      throws ArgumentException, ProvisionException {
    String query = arguments.next();
    Optional<LocalPlayer> playerOptional = game.getPlayer(query);

    if (!playerOptional.isPresent()) {
      throw new NoSuchPlayerException(query);
    }

    return playerOptional.get();
  }

  @Override
  public List<String> getSuggestions(String prefix) {
    //TODO implement
    return Collections.emptyList();
  }

}
