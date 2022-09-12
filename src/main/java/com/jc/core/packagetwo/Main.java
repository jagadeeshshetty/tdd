package com.jc.core.packagetwo;

import com.jc.core.packageone.PackageOne;

public class Main {
  public static void main(String[] args) {
    PackageOne p1 = new PackageOne();
    // p1.noAccessModifierPackageOne();
    p1.publicAccessModifierPackageOne();
  }
}
