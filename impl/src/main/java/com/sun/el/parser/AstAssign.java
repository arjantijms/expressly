/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package com.sun.el.parser;

import javax.el.ELException;
import javax.el.VariableMapper;
import com.sun.el.ValueExpressionImpl;
import com.sun.el.lang.EvaluationContext;

public
class AstAssign extends SimpleNode {
    public AstAssign(int id) {
        super(id);
    }

    public Object getValue(EvaluationContext ctx)
            throws ELException {

        Object value = children[1].getValue(ctx);
        children[0].setValue(ctx, value);
        return value;
    }
}
