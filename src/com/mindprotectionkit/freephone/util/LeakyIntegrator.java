/*
 * Copyright (C) 2011 Whisper Systems
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.mindprotectionkit.freephone.util;

/**
 * Integrates observations over time, but decays the sum exponentially with each observation.
 *
 * This is useful for producing a cheap approximation to 'sum over the last N observations'
 *
 * @author Stuart O. Anderson
 */
public class LeakyIntegrator {
  private float value;
  private float decayConstant;

  public LeakyIntegrator( int decayTimeInSamples ) {
    decayConstant = (float)(1 - 1.0/decayTimeInSamples);
  }

  public void observe( float x ) {
    value = value * decayConstant + x;
  }

  public float get() {
    return value;
  }

  public void reset() {
    value = 0;
  }

  public void reset( float x ) {
    value = x;
  }
}