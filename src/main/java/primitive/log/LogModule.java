/*
 * Copyright 2018 Eray Erdin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package primitive.log;

import com.google.inject.AbstractModule;
import org.apache.commons.logging.Log;
import primitive.log.LogProvider;

public class LogModule extends AbstractModule {
    private volatile Log log;

    @Override
    public void configure() {
        bind(Log.class).toProvider(LogProvider.class);
    }
}