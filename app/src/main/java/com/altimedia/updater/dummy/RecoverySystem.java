package com.altimedia.updater.dummy;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class RecoverySystem {
    public static boolean verifyPackageCompatibility(File compatibilityFile) throws IOException {
        try (InputStream inputStream = new FileInputStream(compatibilityFile)) {
            return true;
        }
    }
}
