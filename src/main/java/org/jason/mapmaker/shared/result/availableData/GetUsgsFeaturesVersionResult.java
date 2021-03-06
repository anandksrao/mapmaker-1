/**
 * Copyright 2011 Jason Ferguson.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.jason.mapmaker.shared.result.availableData;

import com.gwtplatform.dispatch.shared.Result;

/**
 * GWTP Result class for returning the current version of the USGS features
 *
 * @since 0.4.2
 * @author Jason Ferguson
 */
public class GetUsgsFeaturesVersionResult implements Result {

    private String version;

    public GetUsgsFeaturesVersionResult() {
    }

    public GetUsgsFeaturesVersionResult(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }
}
