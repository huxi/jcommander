/**
 * Copyright (C) 2010 the original author or authors.
 * See the notice.md file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.beust.jcommander.internal;

import com.beust.jcommander.IPasswordReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java5PasswordReader
    implements IPasswordReader {

  public String readPassword() {
    try {
      BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
      // don't close the reader!!
      return r.readLine();
    }
    catch (IOException ex) {
      return null;
    }
  }
}
