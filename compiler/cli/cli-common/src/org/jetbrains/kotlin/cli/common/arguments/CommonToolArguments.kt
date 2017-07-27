/*
 * Copyright 2010-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.cli.common.arguments

import org.jetbrains.kotlin.utils.SmartList
import java.io.Serializable

abstract class CommonToolArguments : Serializable, Freezable {
    companion object {
        @JvmStatic private val serialVersionUID = 0L
    }

    var freeArgs: MutableList<String> = SmartList()

    @Transient var errors: ArgumentParseErrors = ArgumentParseErrors()

    @Argument(value = "-help", shortName = "-h", description = "Print a synopsis of standard options")
    var help: Boolean = false

    @Argument(value = "-X", description = "Print a synopsis of advanced options")
    var extraHelp: Boolean = false

    @Argument(value = "-version", description = "Display compiler version")
    var version: Boolean = false

    @GradleOption(DefaultValues.BooleanFalseDefault::class)
    @Argument(value = "-verbose", description = "Enable verbose logging output")
    var verbose: Boolean = false

    @GradleOption(DefaultValues.BooleanFalseDefault::class)
    @Argument(value = "-nowarn", description = "Generate no warnings")
    var suppressWarnings: Boolean = false

    override fun freeze(): Freezable {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun unfreeze(): Freezable {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
