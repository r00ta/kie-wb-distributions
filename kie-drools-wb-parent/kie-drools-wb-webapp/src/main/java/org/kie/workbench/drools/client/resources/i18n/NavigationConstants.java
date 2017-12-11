/*
 * Copyright 2017 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kie.workbench.drools.client.resources.i18n;

import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.Messages;

public interface NavigationConstants
        extends
        Messages {

    NavigationConstants INSTANCE = GWT.create(NavigationConstants.class);

    String navTreeWorkbenchName();

    String navTreeHomeName();

    String navTreeDesignName();

    String navTreeProjectsName();

    String navTreePageAuthoringName();

    String navTreeDevOpsName();

    String navTreeDeploymentsName();

    String navTreeExecutionServersName();

    String navTreeTrackName();

    String navTreeWorkbenchDescr();

    String navTreeHomeDescr();

    String navTreeDesignDescr();

    String navTreeProjectsDescr();

    String navTreePageAuthoringDescr();

    String navTreeDevOpsDescr();

    String navTreeDeploymentsDescr();

    String navTreeExecutionServersDescr();

    String navTreeTrackDescr();
}
