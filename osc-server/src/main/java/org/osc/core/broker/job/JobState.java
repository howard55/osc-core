/*******************************************************************************
 * Copyright (c) Intel Corporation
 * Copyright (c) 2017
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package org.osc.core.broker.job;

import org.osc.sdk.manager.element.JobStateElement;

/**

 *         JobState represent the execution states that a {@link Job} can be in.
 */
public enum JobState implements JobStateElement {
    NOT_RUNNING, QUEUED, RUNNING, COMPLETED;

    public boolean isTerminalState() {
        return this.equals(COMPLETED);
    }

    public boolean isRunning() {
        return this.equals(RUNNING);
    }

}