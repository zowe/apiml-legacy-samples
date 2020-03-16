/*
 * This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-v20.html
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Copyright Contributors to the Zowe Project.
 */
package com.ca.mfaas.hellospring.model;

import java.util.Date;

public class Greeting {
    private final Date date;
    private final String content;

    public Greeting(Date date, String content) {
        this.date = date;
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public String getContent() {
        return content;
    }
}
