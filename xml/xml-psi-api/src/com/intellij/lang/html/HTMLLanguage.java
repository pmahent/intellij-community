// Copyright 2000-2020 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.intellij.lang.html;

import com.intellij.lang.Language;
import com.intellij.lang.xml.XMLLanguage;
import org.jetbrains.annotations.NonNls;

public class HTMLLanguage extends XMLLanguage {

  public static final HTMLLanguage INSTANCE = new HTMLLanguage();

  private HTMLLanguage() {
    super(XMLLanguage.INSTANCE, "HTML", "text/html", "text/htmlh");
  }

  protected HTMLLanguage(Language baseLanguage, @NonNls String name, @NonNls String... mime) {
    super(baseLanguage, name, mime);
  }
}
