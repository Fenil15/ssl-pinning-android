/*
 * Copyright 2018 Wultra s.r.o.
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
 * See the License for the specific language governing permissions
 * and limitations under the License.
 */

package com.wultra.android.sslpinning.service

import android.support.annotation.WorkerThread
import com.wultra.android.sslpinning.interfaces.ResultCallback

/**
 * @author Tomas Kypta, tomas.kypta@wultra.com
 */
interface RemoteDataProvider {

    @WorkerThread
    fun getFingerprints(): ByteArray
}