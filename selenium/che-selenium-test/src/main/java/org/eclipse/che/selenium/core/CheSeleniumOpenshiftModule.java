/*
 * Copyright (c) 2012-2018 Red Hat, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */
package org.eclipse.che.selenium.core;

import com.google.inject.AbstractModule;
import org.eclipse.che.selenium.core.workspace.CheTestOpenshiftWorkspaceLogsGrabber;
import org.eclipse.che.selenium.core.workspace.TestWorkspaceLogsGrabber;

/** @author Dmytro Nochevnov */
public class CheSeleniumOpenshiftModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(TestWorkspaceLogsGrabber.class).to(CheTestOpenshiftWorkspaceLogsGrabber.class);
  }
}
