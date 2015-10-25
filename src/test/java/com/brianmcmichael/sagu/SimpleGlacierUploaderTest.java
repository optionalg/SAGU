/*
 * Simple Amazon Glacier Uploader - GUI upload and log for Amazon Glacier
 * Copyright (C) 2012 Brian L. McMichael <brian@brianmcmichael.com>
 */

package com.brianmcmichael.sagu;

import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SimpleGlacierUploaderTest {

    @Test
    public void shouldUseWorkingDirForPropertiesAsDefault() throws Exception {
        String saguHomeDir = System.getProperty("user.home") + System.getProperty("file.separator") + ".sagu";
        SimpleGlacierUploader.main(null);
        assertThat(SimpleGlacierUploader.sagu.getAppProperties().getDir(), is(saguHomeDir));
    }
}