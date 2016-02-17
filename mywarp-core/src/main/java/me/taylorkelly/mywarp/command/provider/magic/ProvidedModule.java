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

package me.taylorkelly.mywarp.command.provider.magic;

import com.sk89q.intake.parametric.AbstractModule;

import me.taylorkelly.mywarp.Actor;
import me.taylorkelly.mywarp.LocalPlayer;
import me.taylorkelly.mywarp.command.annotation.Sender;

/**
 * Provides 'magic' bindings, not taken from the arguments given by the user.
 */
public class ProvidedModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(Actor.class).toProvider(new ActorProvider());
    bind(LocalPlayer.class).annotatedWith(Sender.class).toProvider(new PlayerSenderProvider());
  }
}
